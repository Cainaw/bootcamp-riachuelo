package bootcamp.estrutura_controle;

public class Tabuada {
	Tabuada(int numero) {
		for (int linha = 1; linha <= 10; linha++) {
			System.out.printf("%s x %s = %s\n", numero, linha, numero * linha);		
		}
	}
}
