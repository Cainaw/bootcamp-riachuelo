package bootcamp.exercicios4.questao2;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		sistema.cadastrarFuncionario(new Gerente("caina gerente", "caina_g@gmail.com", "gerente"));
		sistema.cadastrarFuncionario(new Vendedor("caina vendedor", "caina_v@gmail.com", "gerente"));
		sistema.cadastrarFuncionario(new Atendente("caina atendente", "caina_a@gmail.com", "gerente"));
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		while (true) {
			System.out.println("=-= MENU PRINCIPAL =-=\n");
			System.out.println("1 - Login");
			System.out.println("2 - Sair");
			System.out.print("\nDigite: ");
			opcao = teclado.nextInt();
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			
			switch (opcao) {
				case 1 -> {
					/*
					System.out.println("=-= DEPARTAMENTO =-=\n");
					System.out.println("1 - Gerência");
					System.out.println("2 - Vendas");
					System.out.println("3 - Atendimento");
					System.out.print("\nDigite: ");
					int departamento = teclado.nextInt();
					*/
					System.out.println("\n=-= ÁREA DE LOGIN =-=\n");
					System.out.print("Email: ");
					String email = teclado.next();
					
					System.out.print("Senha: ");
					String senha = teclado.next();
					
					Funcionario usuario = sistema.procurarFuncionario(email);
					if (usuario != null && usuario.fazerLogin(senha)) {
						switch (usuario) {
							case Gerente gerente -> {
								opcoesGerente();
							}
							case Vendedor vendedor -> {
								opcoesVendedor();
							}
							case Atendente atendente -> {
								opcoesAtendente();
							}
							default -> {
								
							}
						}
					}
				}
			}
			
			
			
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			
			
		}
	}
	public static void opcoesGerente() {
		System.out.println("1 - Gerar Relatório Financeiro");
		System.out.println("2 - Consultar Vendas");
		System.out.println("3 - Alterar Dados");
		System.out.println("4 - Alterar Senha");
		System.out.println("5 - Logoff");
	}
	
	public static void opcoesVendedor() {
		System.out.println("1 - Realizar Venda");
		System.out.println("2 - Consultar Vendas");
		System.out.println("3 - Alterar Dados");
		System.out.println("4 - Alterar Senha");
		System.out.println("5 - Logoff");
	}
	
	public static void opcoesAtendente() {
		System.out.println("1 - Receber Pagamento");
		System.out.println("2 - Fechar Caixa");
		System.out.println("3 - Alterar Dados");
		System.out.println("4 - Alterar Senha");
		System.out.println("5 - Logoff");
	}
}
