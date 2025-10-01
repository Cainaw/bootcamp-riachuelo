package bootcamp.classes;

import bootcamp.classes.carro.Carro;
import bootcamp.classes.carro.Motorista;
import bootcamp.classes.conta_bancaria.*;
import bootcamp.classes.petshop.PetShop;

public class Main {

	public static void main(String[] args) {
		/*
		Teste do banco
		
		Banco banco = new Banco();
		banco.criarConta("caina", 2000);
		banco.criarConta("gaby", 2000);
		
		banco.rodarInterface();
		*/
		
		/*
		Motorista caina = new Motorista();
		caina.rodarCarro();
		*/
		
		PetShop loja = new PetShop();
		loja.abrirLoja();
	}

}
