package bootcamp.exercicios5.questao3;

public record Triangulo(double altura, double base) implements FormaGeometrica {
	@Override
	public double getArea() {
		return altura * base / 2.0;
	}

}
