package bootcamp.exercicios5.questao3;

public record Quadrado(double lado) implements FormaGeometrica {
	@Override
	public double getArea() {
		return Math.pow(2, lado);
	}

}
