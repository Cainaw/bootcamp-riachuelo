package bootcamp.classes.petshop;

public class Pet {
	private String nome;
	private boolean isLimpo;
	
	public Pet(String nome) {
		this.nome = nome;
		this.isLimpo = false;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean isPetLimpo() {
		return this.isLimpo;
	}
	
	public boolean setLimpeza(boolean isLimpo) {
		if (this.isLimpo == isLimpo) {
			return false;
		} this.isLimpo = isLimpo;
		return true;
	}
}
