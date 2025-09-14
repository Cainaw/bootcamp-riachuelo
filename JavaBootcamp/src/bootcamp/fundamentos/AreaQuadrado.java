package bootcamp.fundamentos;

public class AreaQuadrado {
	AreaQuadrado(double lado) {
		if (lado <= 0) {
			System.out.println("Lado inválido!");
			return;
		}
		double area = Math.pow(lado, 2);
		System.out.printf("Área do quadrado: %s\n", area);
	}
}
