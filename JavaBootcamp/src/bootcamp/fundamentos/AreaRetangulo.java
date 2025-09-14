package bootcamp.fundamentos;

public class AreaRetangulo {
	AreaRetangulo(double largura, double altura) {
		if (largura <= 0 || altura <= 0) {
			System.out.println("Área inválida!");
			return;
		}
		
		double area = largura * altura;
		System.out.printf("Área do retângulo: %s\n", area);
	}
}
