package bootcamp.exercicios4.questao1;

public non-sealed class BilheteFamilia extends Bilhete {
	@SuppressWarnings("preview")
	public BilheteFamilia(int pessoas, double valor, String filme, boolean isDublado) {
		if (pessoas > 3)
			valor *= 0.05;
		super(valor, filme, isDublado);
	}

}
