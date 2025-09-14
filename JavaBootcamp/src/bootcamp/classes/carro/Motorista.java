package bootcamp.classes.carro;

import java.util.Scanner;
import java.io.IOException;

public class Motorista {
	public Carro carro;
	
	public Motorista() {
		this.carro = new Carro();
	}
	
	public Carro getCarro() {
		return this.carro;
	}
	
	public void LimparParabrisa() {
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
	
	public boolean rodarCarro() {
		Scanner teclado = new Scanner(System.in);
		int escolha;
		while (true) {
			System.out.print("""
				1 - Ligar carro
				2 - Desligar carro
				3 - Acelerar
				4 - Desacelerar
				5 - Virar p/ esquerda
				6 - Virar p/ direita
				7 - Ver velocidade
				8 - Trocar marcha
				9 - Ver marcha
				0 - Sair do carro
					
				Digite:  """);
			escolha = teclado.nextInt();
			this.LimparParabrisa();
			System.out.println();
			
			switch (escolha) {
				case 1:
					this.carro.ligar();
					break;
				case 2:
					this.carro.desligar();
					break;
				case 3:
					this.carro.acelerar();
					break;
				case 4:
					this.carro.desacelerar();
					break;
				case 5:
					this.carro.virarAEsquerda();
					break;
				case 6:
					this.carro.virarADireita();
					break;
				case 7:
					System.out.printf("A velocidade é de %sKm/h.\n", this.carro.getVelocidade());  
					break;
				case 8:
					System.out.print("""
						1 - Subir marcha
						2 - Descer marcha
						
						Digite: """);
					int resposta = teclado.nextInt();
					
					switch (resposta) {
						case 1:
							this.carro.trocarMarcha(true);
							break;
						case 2:
							this.carro.trocarMarcha(false);
							break;
						default:
							System.out.println("Valor digitado incorreto.");
					} break;
				case 9:
					this.carro.getMarcha();
					break;
				case 0:
					teclado.close();
					if (this.carro.getVelocidade() != 0)
						System.out.println("Você pulou do carro em movimento.");
					return true;
			} System.out.println();
		}
	}
}
