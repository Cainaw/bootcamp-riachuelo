package bootcamp.estrutura_controle;

import java.util.Scanner;

public class Numeros {
	Numeros(int num1, int num2) {
		if (num2 <= num1) {
			System.out.println("O segundo valor deve ser maior que o primeiro.");
			return;
		} System.out.print("Impar ou Par (I / P): ");
		Scanner sc = new Scanner(System.in);
		String escolha = sc.next();
		String mensagem = "";
		switch (escolha) {
			case "I":
			case "i":
				if (num2 % 2 == 1)
					mensagem += " - " + num2;
				if (num1 % 2 == 1)
					mensagem += " - " + num1;
				break;
			case "P":
			case "p":
				if (num2 % 2 == 0)
					mensagem += " - " + num2;
				if (num1 % 2 == 0)
					mensagem += " - " + num1;
		} if (mensagem.equals("")) {
			System.out.println("Nenhum valor correspondente.");
			return;
		} System.out.println(mensagem);
	}
}
