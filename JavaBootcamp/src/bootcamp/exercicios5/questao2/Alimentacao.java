package bootcamp.exercicios5.questao2;

public record Alimentacao() implements Tributacao {
	@Override
	public double getImposto() {
		return 0.01;
	}

}
