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
	
	public Funcionario procurarFuncionario(Funcionario funcionario) {
		return null;
	}
}
