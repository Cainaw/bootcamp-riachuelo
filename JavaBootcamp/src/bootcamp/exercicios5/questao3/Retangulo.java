package bootcamp.exercicios5.questao3;

public record Retangulo(double altura, double largura) implements FormaGeometrica {
	@Override
	public double getArea() {
		return altura * largura;
	}

}
