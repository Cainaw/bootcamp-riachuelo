package bootcamp.exercicios4.questao2;

public non-sealed class Vendedor extends Funcionario {
	private int contaVenda;
	public Vendedor(String nome, String email, String senha) {
		super(nome, email, senha, false);
		this.contaVenda = 0;
	}
	
	public void realizarVenda() {
		this.contaVenda++;
	}
	
	public int consultarVendas() {
		return this.contaVenda;
	}
}
