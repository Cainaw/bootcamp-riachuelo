package bootcamp.exercicios4.questao2;

public sealed class Funcionario permits Gerente, Vendedor, Atendente {
	private String nome;
	private String email;
	private String senha;
	private boolean isAdministrador;
	private boolean isLogado;
	
	public Funcionario(String nome, String email, String senha, boolean isAdministrador) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.isAdministrador = isAdministrador;
		this.isLogado = false;
	}
	
	public boolean fazerLogin(String senha) {
		return this.isLogado = (senha.equals(this.senha)) ? true : false; 
	}
	
	public boolean fazerLogoff() {
		if (this.isLogado) {
			this.isLogado = false;
			return true;
		} return false;
	}
	
	public boolean alterarDados(String novosDados) {
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public boolean isAdministrador() {
		return isAdministrador;
	}
	
	
}
