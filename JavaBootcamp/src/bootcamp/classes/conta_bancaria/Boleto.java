package bootcamp.classes.conta_bancaria;

public class Boleto {
	private final Conta recebedor;
	private final Conta pagador;
	private double valor;
	
	Boleto(Conta recebedor, Conta pagador, double valor) {
		if (valor > 0) {
			this.recebedor = recebedor;
			this.pagador = pagador;
			this.valor = valor;
			return;
		}
		this.recebedor = null;
		this.pagador = null;
		System.out.println("Erro ao criar boleto");
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public Conta getPagador() {
		return this.pagador;
	}
	
	public Conta getRecebedor() {
		return this.recebedor;
	}
}
