package bootcamp.exercicios4.questao3;

public sealed abstract class Relogio permits RelogioBrasileiro, RelogioAmericano {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio() {
		hora = 0;
		minuto = 0;
		segundo = 0;
	}
	
	public abstract String getHorario();
	
	public abstract boolean setHorario(Relogio relogio);
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	
}
