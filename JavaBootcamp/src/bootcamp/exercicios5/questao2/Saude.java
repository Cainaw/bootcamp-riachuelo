package bootcamp.exercicios5.questao2;

public record Saude() implements Tributacao {
	@Override
	public double getImposto() {
		return 0.015;
	}

}
