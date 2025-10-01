package bootcamp.exercicios5.questao2;

public record Cultura() implements Tributacao {
	@Override
	public double getImposto() {
		return 0.04;
	}

}
