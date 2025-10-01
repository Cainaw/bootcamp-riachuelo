package bootcamp.classes.conta_bancaria;

import java.util.ArrayList;

public class Conta {
	private String usuario;
	private double saldo;
	private double chequeEspecial;
	private double ultimoChequeEspecial;
	private double limiteChequeEspecial;
	private double valorTaxa = 0.0;
	private ArrayList<Boleto> boletos = new ArrayList<Boleto>();
	
	public Conta(String usuario, double depositoInicial) {
		this.usuario = usuario;
		this.saldo = depositoInicial;
		if (depositoInicial < 0.0) {
			this.saldo = 0.0;
		}
		if (this.saldo <= 500.0) {
			this.chequeEspecial = 50.0;
		}
		else {
			this.chequeEspecial = this.saldo * 0.5;
		}
		
		this.limiteChequeEspecial = this.chequeEspecial;
	}
	
	public String getNomeUsuario() {
		System.out.println("O nome de usuario é: " + this.usuario);
		return this.usuario;
	}
	
	public Conta getUsuario() {
		return this;
	}
	
	public double getSaldo() {
		System.out.println("O saldo é de: " + this.saldo);
		return this.saldo;
	}
	
	public double getTaxa() {
		System.out.println("A taxa é de: " + this.valorTaxa);
		return this.valorTaxa;
	}
	
	public double getChequeEspecial() {
		System.out.println("O cheque especial é de: " + this.chequeEspecial);
		return this.chequeEspecial;
	}
	
	public boolean depositar(double valor) {
		if (valor > 0.0) {
			this.saldo += valor;
			if (this.chequeEspecialAtivo()) {
				if (this.saldo >= this.valorTaxa && this.valorTaxa != 0.0) {
					this.saldo -= this.valorTaxa;
					this.valorTaxa = 0.0;
					System.out.println("A taxa do cheque especial foi paga.");
				}
				else if (this.valorTaxa > this.saldo) {
					this.valorTaxa -= this.saldo;
					this.saldo = 0.0;
					System.out.println("Uma parte da taxa do cheque especial foi paga.");
					return true;
				}
				double divida = this.limiteChequeEspecial - this.chequeEspecial;
				if (divida <= this.saldo) {
					this.saldo -= divida;
					this.chequeEspecial += divida;
					System.out.println("O cheque especial foi pago.");
				}
				else if (this.saldo != 0.0) {
					this.chequeEspecial += this.saldo;
					this.saldo = 0.0;
					System.out.println("Uma parte do cheque especial foi paga.");
				}
			} return true;
		} return false;
	}
	
	public boolean sacar(double valor) {
		if (valor <= this.saldo + this.chequeEspecial) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
			}
			else {
				valor -= this.saldo;
				this.saldo = 0.0;
				this.ultimoChequeEspecial = this.chequeEspecial;
				this.chequeEspecial -= valor;
				this.valorTaxa += (this.ultimoChequeEspecial - this.chequeEspecial) * 0.2;
				this.ultimoChequeEspecial = this.chequeEspecial;
			} System.out.println("O saque foi efetuado.");
			return true;
		} System.out.println("Erro, o valor é maior que o saldo disponível.");
		return false;
	}
	
	public Boleto gerarBoleto(String pagador, double valorBoleto) {
		return Banco.gerarBoleto(this, pagador, valorBoleto);
	}
	
	public boolean adicionarBoleto(Boleto boleto) {
		if (boleto != null) {
			boletos.add(boleto);
			return true;
		} return false;
	}
	
	public boolean pagarBoleto(Boleto boleto) {
		if (boleto != null) {
			double valor = boleto.getValor();
			if (boleto.getPagador().sacar(valor)) {
				boleto.getRecebedor().depositar(valor);
				return true;
			}
		} return false;
	}
	
	public Boleto procurarBoleto(String usuario) {
		for (Boleto boleto : boletos) {
			if (boleto.getRecebedor().equals(usuario))
				return boleto;
		} return null;
	}
	
	public boolean verBoletos() {
		if (boletos.isEmpty())
			return false;
		for (Boleto boleto : boletos) {
			System.out.println("Usuario: " + boleto.getRecebedor());
			System.out.println("Valor: " + boleto.getValor() + "\n");
		} return true;
	}
	
	public boolean chequeEspecialAtivo() {
		return this.chequeEspecial < this.limiteChequeEspecial;
	}
}
