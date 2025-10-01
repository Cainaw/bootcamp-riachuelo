package bootcamp.exercicios4.questao1;

public non-sealed class BilheteMeiaEntrada extends Bilhete {
	public BilheteMeiaEntrada(double valor, String filme, boolean isDublado) {
		super(valor * 0.5, filme, isDublado);
	}

}
