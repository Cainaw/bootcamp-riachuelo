package bootcamp.classes.carro;

public class Carro {
	private boolean isLigado;
	private int velocidade;
	private Marcha marcha;
	
	public Carro() {
		this.isLigado = false;
		this.velocidade = 0;
		this.marcha = new Marcha();
	}
	
	public boolean ligar() {
		if (!this.isLigado) {
			this.isLigado = true;
			System.out.println("O carro foi ligado.");
			return true;
		} System.out.println("O carro já está ligado.");
		return false;
	}
	
	public boolean desligar() {
		if (!this.isLigado) {
			System.out.println("O carro já está desligado");
			return false;
		}
		else if (this.velocidade != 0) {
			System.out.println("O carro ainda está em movimento.");
			return false;
		}
		else if (this.marcha.getMarcha() != 0) {
			System.out.println("O carro já não está na marcha 0.");
			return false;
		}
		else {
			this.isLigado = false;
			System.out.println("O carro foi desligado.");
			return true;
		}
	}
	
	public boolean acelerar() {
		if (this.marcha.getMarcha() == 6 && this.velocidade == 120) {
			System.out.println("Velocidade maxima atingida.");
			return false;
		}
		else if (this.marcha.permitirAceleracao(this.velocidade)) {
			System.out.println("A velocidade aumentou para: " + ++this.velocidade);
			return true;
		} System.out.println("A marcha atual não permite acelerar.");
		return false;
	}
	
	public boolean desacelerar() {
		if (this.marcha.getMarcha() == 0 && this.velocidade == 0) {
			System.out.println("Velocidade minima atingida.");
			return false;
		}
		else if (!this.marcha.permitirAceleracao(this.velocidade)) {
			System.out.println("A velocidade diminuiu para: " + --this.velocidade);
			return true;
		} System.out.println("A marcha atual não permite desacelerar.");
		return false;
	}
	
	public void virarAEsquerda() {
		if (this.velocidade != 0)
			System.out.println("O carro virou para a esquerda.");
		else
			System.out.println("O carro está parado.");
	}
	
	public void virarADireita() {
		if (this.velocidade != 0)
			System.out.println("O carro virou para a direita.");
		else
			System.out.println("O carro está parado.");
	}
	
	public int getVelocidade() { 
		return this.velocidade;
	}
	
	public int getMarcha() {
		System.out.println("A marcha atual: " + this.marcha.getMarcha());
		return this.marcha.getMarcha();
	}
	
	public boolean trocarMarcha(boolean alteracao) {
		return this.marcha.setMarcha(alteracao);
	}
}
