package bootcamp.classes.petshop;

public class MaquinaBanho {
	private Pet pet;
	private int agua;
	private int shampoo;
	private boolean isLimpa;
	final private int limiteAgua;
	final private int limiteShampoo;
	
	public MaquinaBanho() {
		this.pet = null;
		this.isLimpa = true;
		this.agua = 30;
		this.limiteAgua = 30;
		this.shampoo = 10;
		this.limiteShampoo = 10;
	}
	
	public Pet getPet() {
		return this.pet;
	}
	
	public boolean hasPet() {
		return this.pet != null;
	}
	
	public int banharPet() {
		if (this.hasPet()) {
			if (this.isLimpa == true) {
				if (this.agua >= 10) {
					if (this.shampoo >= 2) {
						if (this.pet.setLimpeza(true)) {
							this.agua -= 10;
							this.shampoo -= 2;
							return 1;
						} return -5;
					} return -4;
				} return -3;
			} return -2;
		} return -1;
	}
	
	public boolean abastecerAgua() {
		if (this.agua <= this.limiteAgua - 2) {
			this.agua += 2;
			return true;
		} return false;
	}
	
	public boolean abastecerShampoo() {
		if (this.shampoo <= this.limiteShampoo - 2) {
			this.shampoo += 2;
			return true;
		} return false;
	}
	
	public int verificarAgua() {
		return this.agua;
	}
	
	public int verificarShampoo() {
		return this.shampoo;
	}
	
	public boolean verificarMaquina() {
		return this.isLimpa;
	}
	
	public int adicionarPet(Pet pet) {
		if (this.isLimpa) {
			if (this.pet == null) {
				this.pet = pet;
				return 1;
			} return -2;
		} return -1;
	}
	
	public boolean retirarPet() {
		if (this.pet != null) {
			if (!this.pet.isPetLimpo())
				this.isLimpa = false;
			this.pet = null;
			return true;
		} return false;
	}
	
	public int limparMaquina() {
		if (!this.hasPet()) {
			if (!this.isLimpa) {
				if (this.agua >= 3) {
					if (this.shampoo >= 1) {
						this.agua -= 3;
						this.shampoo -= 1;
						this.isLimpa = true;
						return 1;
					} return -4;
				} return -3;
			} return -2;
		} return -1;
	}
}
