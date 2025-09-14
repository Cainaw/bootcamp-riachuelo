package bootcamp.fundamentos;

public class Comparador {
	Comparador(String nome1, int idade1, String nome2, int idade2) {
		if (idade1 < 0 || idade2 < 0) {
			System.out.println("Ambas as idades devem ser válidas!");
			return;
		}
		int diferenca = idade1 - idade2;
		if (diferenca < 0)
			diferenca *= -1;
		System.out.printf("A diferença entre %s e %s é de %s anos.\n", nome1, nome2, diferenca);
	}
}
