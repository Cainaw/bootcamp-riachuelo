package bootcamp.estrutura_controle;

public class IMC {
	IMC(double altura, double massa) {
		if (altura <= 0 || massa <= 0) {
			System.out.println("Todos os dados devem ser válidos.");
			return;
		}
		double resultado = massa / Math.pow(altura, 2);
		String mensagem = (resultado <= 18.5) ?
			"Abaixo do peso." :
			(resultado < 25.0) ?
				"Peso ideal." :
				(resultado < 30.0) ?
					"Levemente acima do peso." :
					(resultado < 35.0) ?
						"Obesidade Grau I." :
						(resultado < 40.0) ?
							"Obesidade Grau II (Severa)." :
							"Obesidade Grau III (Mórbida)";
		System.out.println(mensagem);
	}
}
