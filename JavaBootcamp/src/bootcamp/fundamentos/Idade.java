package bootcamp.fundamentos;

import java.time.OffsetDateTime;

public class Idade {
	Idade(String nome, int anoNascimento) {
		int anoAtual = OffsetDateTime.now().getYear();
		if (anoNascimento > anoAtual) {
			System.out.printf("Olá %s, seu ano de nascimento é inválido!\n", nome);
			return;
		}
		
		int idade = anoAtual - anoNascimento;
		System.out.printf("Olá %s, você tem %s anos.\n", nome, idade);
	}

}
