package bootcamp.exercicios4.questao3;

public non-sealed class RelogioBrasileiro extends Relogio {
	@Override
	public String getHorario() {
		return super.getHora() + ":" + super.getMinuto() + ":" + super.getSegundo();
	}

	@Override
	public boolean setHorario(Relogio relogio) {
		super.setHora(relogio.getHora());
		super.setMinuto(relogio.getMinuto());
		super.setSegundo(relogio.getSegundo());
		return false;
	}
}
