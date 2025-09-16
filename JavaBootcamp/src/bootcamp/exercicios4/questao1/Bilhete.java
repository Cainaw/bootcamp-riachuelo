package bootcamp.exercicios4.questao1;

public sealed class Bilhete permits BilheteMeiaEntrada, BilheteFamilia {
	private double valor;
	private String filme;
	private boolean isDublado;
	
	public Bilhete(double valor, String filme, boolean isDublado) {
		this.valor= valor;
		this.filme = filme;
		this.isDublado = isDublado;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getFilme() {
		return this.filme;
	}
	
	public boolean isDublado() {
		return this.isDublado;
	}
}
