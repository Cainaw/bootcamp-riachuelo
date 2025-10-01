package bootcamp.exercicios4.questao1;

import java.util.ArrayList;

public class Bilheteria {
	private ArrayList<Filme> filmesCartaz = new ArrayList<Filme>();
	
	// bilhete padrão
	public Bilhete comprarBilhete(int indexFilme, boolean isDublado, double valor) {
		Filme filme = this.filmesCartaz.get(indexFilme);
		if (filme != null) {
			if (valor >= filme.getValor()) {
				Bilhete bilhete = new Bilhete(filme.getValor(), filme.getNome(), isDublado);
				return bilhete;
			}
		} return null;
	}
	
	// bilhete de meia entrada
	public Bilhete comprarBilhete(boolean meiaEntrada, int indexFilme, boolean isDublado, double valor) {
		Filme filme = this.filmesCartaz.get(indexFilme);
		if (filme != null) {
			if (valor >= filme.getValor() / 2.0) {
				Bilhete bilhete = new BilheteMeiaEntrada(filme.getValor(), filme.getNome(), isDublado);
				return bilhete;
			}
		} return null;
	}
	
	// bilhete de familia
	public Bilhete comprarBilhete(int pessoas, int indexFilme, boolean isDublado, double valor) {
		Filme filme = this.filmesCartaz.get(indexFilme);
		if (filme != null) {
			if (valor >= filme.getValor() / 2.0) {
				Bilhete bilhete = new BilheteFamilia(pessoas, filme.getValor(), filme.getNome(), isDublado);
				return bilhete;
			}
		} return null;
	}
	
	public ArrayList<Filme> getFilmes() {
		return this.filmesCartaz;
	}
	
	public Filme getFilme(int index) {
		return this.filmesCartaz.get(index);
	}
	
	public boolean addFilme(Filme filme) {
		if (filme != null) {
			this.filmesCartaz.add(filme);
			return true;
		} return false;
	}
}
