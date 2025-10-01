package bootcamp.exercicios4.questao2;

import java.util.ArrayList;

public class Sistema {
	private final ArrayList<Funcionario> funcionarios;
	private double lucro;
	
	public Sistema() {
		this.funcionarios = new ArrayList<Funcionario>();
		this.lucro = 0;
	}
	
	public boolean cadastrarFuncionario(Funcionario funcinario) {
		return true;
	}
	
	public boolean desligarFuncionario(Funcionario funcionario) {
		return true;
	}
	
	public Funcionario procurarFuncionario(String email) {
		for (Funcionario funcionario : this.funcionarios) {
			if (funcionario.getEmail().equals(email))
				return funcionario;
		} return null;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	
	public double getLucro() {
		return this.lucro;
	}
}
