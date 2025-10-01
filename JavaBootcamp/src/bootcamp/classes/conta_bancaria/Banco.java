package bootcamp.classes.conta_bancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	private final static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static Boleto gerarBoleto(Conta recebedor, String usuario, double valor) {
		Conta pagador = null;
		for (Conta conta : contas) {
			if (conta.getUsuario().equals(usuario)) {
				pagador = conta;
				break;
			}
		}
		if (pagador != null && recebedor != null) {
			return new Boleto(recebedor, pagador, valor);
		} return null;
	}
	
	public boolean criarConta(String usuario, double deposito) {
		Conta conta = new Conta(usuario, deposito);
		if (contas.add(conta)) {
			return true;
		} return false;
	}
	
	public void limparTela() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public boolean rodarInterface() {
		Scanner teclado = new Scanner(System.in);
		while (true) {
			System.out.print(
			"""
			==================
			1 - Criar conta
			2 - Acessar conta
			3 - Sair
			==================
			Digite: """
			); 
			int resposta = teclado.nextInt();
			this.limparTela();
			
			if (resposta == 1) {
				System.out.print("Nome: ");
				String usuario = teclado.next();
				System.out.print("Deposito: ");
				double deposito = teclado.nextDouble();
				this.criarConta(usuario, deposito);
				this.limparTela();
			}
			
			else if (resposta == 2) {
				System.out.print("Usuario: ");
				String usuario = teclado.next();
				this.limparTela();
				
				for (Conta contaAtual : contas) {
					
					if (contaAtual.getNomeUsuario().equals(usuario)) {
						int opcao;
						boolean contaAtiva = true;
						
						while (contaAtiva) {
							// operação na conta
							System.out.print(
							"""
									
							1 - Consultar Saldo
							2 - Consultar Cheque Especial
							3 - Depositar
							4 - Sacar
							5 - Pagar boleto
							6 - Uso de Cheque Especial
							7 - Sair		
							
							Digite: """);
							
							opcao = teclado.nextInt();
							this.limparTela();
							switch (opcao) {
							case 1:
								contaAtual.getSaldo();
								break;
							case 2:
								contaAtual.getChequeEspecial();
								break;
							case 3:
								System.out.print("Valor do deposito: ");
								double deposito = teclado.nextDouble();
								contaAtual.depositar(deposito);
								break;
							case 4:
								System.out.print("Valor do saque: ");
								double saque = teclado.nextDouble();
								contaAtual.sacar(saque);
								break;
							case 5:
								if (contaAtual.verBoletos()) {
									System.out.print("Digite o usuario: ");
									String usuarioBoleto = teclado.next();
									Boleto boleto = contaAtual.procurarBoleto(usuarioBoleto);
									contaAtual.pagarBoleto(boleto);
								}
								else {
									System.out.println("Nenhum boleto encontrado");
								} break;
							case 6:
								String mensagem = (contaAtual.chequeEspecialAtivo()) ? "O cheque especial está ativo." : "O cheque especial não está ativo.";
								System.out.println(mensagem);
								break;
							case 7:
								contaAtiva = false;
							}
						}
						
					}
				} System.out.println("Conta não encontrada!");
				
			}
			else if (resposta == 3) {
				teclado.close();
				return true;
			}
		}
	}
}
