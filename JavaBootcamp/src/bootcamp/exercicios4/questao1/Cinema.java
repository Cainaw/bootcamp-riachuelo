package bootcamp.exercicios4.questao1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
	public static void main(String[] args) {
		final Bilheteria bilheteria = new Bilheteria();
		adicionarFilmes(bilheteria);
		final ArrayList<Filme> filmes = bilheteria.getFilmes();
		
		Scanner teclado = new Scanner(System.in);
		while (true) {
			filmesAdicionados(bilheteria);
			System.out.printf("%s - Sair\n\nDigite: ", filmesTamanho(bilheteria));
			int opcao = teclado.nextInt();
			pularAnuncios();
			if (opcao == filmesTamanho(bilheteria)) {
				teclado.close();
				return;
			}
			else if (opcao < filmesTamanho(bilheteria) && filmes.contains(filmes.get(opcao))) {
				Filme filme = filmes.get(opcao);
				especificacoesFilme(filme);
				System.out.print("\nDigite: ");
				opcao = teclado.nextInt();
				pularAnuncios();
				if (opcao == 1) {
					int audio;
					while (true) {
						System.out.println("Opcão de audio:");
						System.out.println("1 - Dublado");
						System.out.println("2 - Legendado\n");
						System.out.print("Digite: ");
						audio = teclado.nextInt();
						pularAnuncios();
						if (audio == 1 || audio == 2)
							break;
					}
					boolean isDublado = (audio == 1) ? true : false;
					tiposBilhete();
					System.out.print("\nDigite: ");
					opcao = teclado.nextInt();
					pularAnuncios();
					Bilhete bilhete;
					switch (opcao) {
						case 1 -> {
							bilhete = bilheteria.comprarBilhete(filmes.indexOf(filme), isDublado, filme.getValor());
							if (bilhete != null)
								System.out.println("O bilhete padrão foi comprado.");
							else
								System.out.println("Erro ao comprar bilhete.");
						}
						case 2 -> {
							bilhete = bilheteria.comprarBilhete(filmes.indexOf(filme), isDublado, filme.getValor());
							if (bilhete != null)
								System.out.println("O bilhete de meia entrada foi comprado.");
							else
								System.out.println("Erro ao comprar bilhete.");
						}
						case 3 -> {
							System.out.print("Total de pessoas: ");
							int total = teclado.nextInt();
							bilhete = bilheteria.comprarBilhete(total, filmes.indexOf(filme), isDublado, filme.getValor());
							if (bilhete != null)
								System.out.println("O bilhete de familia foi comprado.");
							else
								System.out.println("Erro ao comprar bilhete.");
						} 
					} System.out.println();
				}
			}
		}
	}
	
	public static void adicionarFilmes(Bilheteria bilheteria) {
		bilheteria.addFilme(new Filme("1917", 40));
		bilheteria.addFilme(new Filme("Alita - Anjo de Combate", 35));
		bilheteria.addFilme(new Filme("Coraline", 40));
		bilheteria.addFilme(new Filme("Vingadores - Guerra Infinita", 50));
		bilheteria.addFilme(new Filme("Atividade Paranormal", 30));
		bilheteria.addFilme(new Filme("Guerra Mundial Z", 30));
		bilheteria.addFilme(new Filme("Rec", 20));
	}
	
	public static void filmesAdicionados(Bilheteria bilheteria) {
		ArrayList<Filme> filmes = bilheteria.getFilmes();
		for (Filme filme : filmes) {
			System.out.printf("%s - %s\n", filmes.indexOf(filme), filme.getNome());
		}
	}
	
	public static int filmesTamanho(Bilheteria bilheteria) {
		ArrayList<Filme> filmes = bilheteria.getFilmes();
		Filme filme = filmes.getLast();
		return filmes.indexOf(filme) + 1;
	}
	
	public static void especificacoesFilme(Filme filme) {
		System.out.println("Nome: " + filme.getNome());
		System.out.println("Valor: " + filme.getValor());
		System.out.println("\n1 - Comprar\n2 - Voltar");
	}
	
	public static void tiposBilhete() {
		System.out.println("Escolha o tipo de Bilhete:\n");
		System.out.println("1 - Bilhete Padrão");
		System.out.println("2 - Bilhete de Meia Entrada");
		System.out.println("3 - Bilhete Família");
	}
	
	public static void pularAnuncios() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
