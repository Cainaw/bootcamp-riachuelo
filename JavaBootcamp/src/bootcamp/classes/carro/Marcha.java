package bootcamp.classes.carro;

public class Marcha {
	private int marchaAtual;
	
	public Marcha() {
		this.marchaAtual = 0;
	}
	
	public int getMarcha() {
		return this.marchaAtual;
	}
	
	public boolean setMarcha(boolean subirMarcha) { 
		if (subirMarcha && this.marchaAtual < 6) {
			System.out.println("A marcha mudou para: " + ++this.marchaAtual);
			return true;
		}
		else if (!subirMarcha && this.marchaAtual > 0) {
			System.out.println("A marcha mudou para: " + --this.marchaAtual);
			return true;
		} System.out.println("A marcha não pode fazer essa mudança.");
		return false;
	}
	
	public boolean permitirAceleracao(int velocidade) {
		return  (this.marchaAtual == 0) ? false :
					(velocidade < 20 && this.marchaAtual == 1) ? true :
						(velocidade < 40 && this.marchaAtual == 2) ? true :
							(velocidade < 60 && this.marchaAtual == 3) ? true :
								(velocidade < 80 && this.marchaAtual == 4) ? true :
									(velocidade < 100 && this.marchaAtual == 5) ? true :
										(velocidade < 120 && this.marchaAtual == 6) ? true : false;
	}
}
