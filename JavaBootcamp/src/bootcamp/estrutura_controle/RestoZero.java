package bootcamp.estrutura_controle;

import java.util.Scanner;

public class RestoZero {
	RestoZero(int divisor) {
		try (Scanner sc = new Scanner(System.in)) {
			int numero = divisor;
			while(numero % divisor == 0) {
				System.out.print("Digite um valor: "); 
				numero = sc.nextInt();
				if (numero < divisor) { 
					numero = divisor;
					System.out.println("O numero deve ser maior que o inicial");
					continue;
				} System.out.printf("%s %% %s = %s\n", numero, divisor, numero % divisor);
			} 
		}
	}
}
