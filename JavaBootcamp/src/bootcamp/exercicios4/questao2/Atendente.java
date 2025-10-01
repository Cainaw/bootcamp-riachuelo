package bootcamp.exercicios4.questao2;

public non-sealed class Atendente extends Funcionario {
	private double valorCaixa;
	private boolean caixaAberto;
	
	public Atendente(String nome, String email, String senha) {
		super(nome, email, senha, false);
		this.valorCaixa = 0;
		this.caixaAberto = false;
	}
	
	public boolean receberPagamento(double valor) {
		if (valor > 0) {
			this.valorCaixa += valor;
			return true;
		} return false;
	}
	
	public boolean fecharCaixa() {
		if (this.caixaAberto) {
			this.caixaAberto = false;
			return true;
		} return false;
	}
	
	public double retirarDinheiroCaixa() {
		return this.valorCaixa;
	}
}
