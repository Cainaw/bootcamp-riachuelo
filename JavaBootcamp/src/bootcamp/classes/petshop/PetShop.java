package bootcamp.classes.petshop;

import java.io.IOException;
import java.util.Scanner;

public class PetShop {
	final private MaquinaBanho maquina;
	
	public PetShop() {
		this.maquina = new MaquinaBanho();
	}
	
	public void limparLoja() {
		try {
            String sistema = System.getProperty("os.name").toLowerCase();
            if (sistema.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	public boolean abrirLoja() {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		while (true) {
			System.out.println("1 - Banhar pet");
			System.out.println("2 - Abastecer água");
			System.out.println("3 - Abastecer shampoo");
			System.out.println("4 - Ver nível de água");
			System.out.println("5 - Ver nível de shampoo");
			System.out.println("6 - Verificar pet na maquina");
			System.out.println("7 - Adicionar pet na maquina");
			System.out.println("8 - Retirar o pet da maquina");
			System.out.println("9 - Limpar maquina");
			System.out.println("0 - Fechar loja\n");
			System.out.print("Digite: ");
			opcao = teclado.nextInt();
			this.limparLoja();
			System.out.print(" ");
			
			switch (opcao) {
				case 0:
					teclado.close();
					System.out.println("A loja encerrou suas operações");
					return true;
				case 1:
					switch (this.maquina.banharPet()) {
					case -1:
						System.out.println("Sem pet na maquina.");
						break;
					case -2:
						System.out.println("A maquina está suja.");
						break;
					case -3:
						System.out.println("Quantidade de agua insuficiente.");
						break;
					case -4:
						System.out.println("Quantidade de shampoo insuficiente.");
						break;
					case -5:
						System.out.println("O " + this.maquina.getPet().getNome() + " já está limpo.");
						break;
					case 1:
						System.out.println("O " + this.maquina.getPet().getNome() + " foi limpo.");
				}
					break;
				case 2:
					if (this.maquina.abastecerAgua())
						System.out.println("A maquina foi abastecida com agua.");
					else
						System.out.println("A maquina já está muito cheia de agua.");
					break;
				case 3:
					if (this.maquina.abastecerShampoo())
						System.out.println("A maquina foi abastecida com shampoo.");
					else
						System.out.println("A maquina já está muito cheia de shampoo.");
					break;
				case 4:
					int nivelAgua = this.maquina.verificarAgua();
					System.out.println("Nível de agua: " + nivelAgua);
					break;
				case 5:
					int nivelShampoo = this.maquina.verificarShampoo();
					System.out.println("Nível de shampoo: " + nivelShampoo);
					break;
				case 6:
					String mensagem = (this.maquina.hasPet()) ? 
						"O " + this.maquina.getPet().getNome() + " está na maquina.\n" : 
						"Nenhum pet na maquina.";
					System.out.println(mensagem);
					break;
				case 7:
					if (this.maquina.verificarMaquina()) {
						if (!this.maquina.hasPet()) {
							System.out.print("Digite o nome do pet: ");
							String nomePet = teclado.next();
							this.maquina.adicionarPet(new Pet(nomePet));
							System.out.println("O " + this.maquina.getPet().getNome() + " está na maquina.");
							break;
						} System.out.println("Já tem um pet na maquina.");
						break;
					} System.out.println("A maquina está suja.");
					break;
				case 8:
					String nome = this.maquina.getPet().getNome();
					if (this.maquina.retirarPet())
						System.out.println("O" + nome + " foi retirado da maquina."); 
					else
						System.out.println("Nenhum pet na maquina.");
					break;
				case 9:
					switch (this.maquina.limparMaquina()) {
						case -1:
							System.out.println("Tem pet na maquina.");
							break;
						case -2:
							System.out.println("A maquina já está limpa.");
							break;
						case -3:
							System.out.println("Quantidade de agua insuficiente.");
							break;
						case -4:
							System.out.println("Quantidade de shampoo insuficiente.");
							break;
						case 1:
							System.out.println("A maquina foi limpa.");
					}
			}
		}
	}
}
