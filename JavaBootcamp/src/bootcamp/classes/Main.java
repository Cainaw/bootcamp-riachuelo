package bootcamp.classes;

import bootcamp.classes.carro.Carro;
import bootcamp.classes.carro.Motorista;
import bootcamp.classes.conta_bancaria.*;

public class Main {

	public static void main(String[] args) {
		/*
		Teste do banco
		
		Banco banco = new Banco();
		banco.criarConta("caina", 2000);
		banco.criarConta("gaby", 2000);
		
		banco.rodarInterface();
		*/
		
		Motorista caina = new Motorista();
		caina.getCarro().ligar();
		/*
		for (int i = 0; i < 6; i++)
			caina.getCarro().trocarMarcha(true);
		for (int i = 0; i < 120; i++)
			caina.getCarro().acelerar();
		*/
		caina.rodarCarro();
	}

}
