package bootcamp.exercicios4.questao3;

public non-sealed class RelogioAmericano extends Relogio {
	private boolean isPM;
	
	public RelogioAmericano() {
		this.isPM = false;
	}
	
	@Override
	public String getHorario() {
		String meridiano = (this.isPM) ? " PM" : " AM";
		return super.getHora() + ":" + super.getMinuto() + ":" + super.getSegundo() + meridiano;
	}

	@Override
	public boolean setHorario(Relogio relogio) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void setHora(int hora) {
		super.setHora(hora);
		this.isPM = (hora > 12) ? true : false;
	}
	
	public boolean getIsPM() {
		return this.isPM;
	}
}
