package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro Civic = new Civic();// Sempre alterar o construtor para chamar a classe usando os atributos e métodos como herança
		
		Civic.acelerar(Civic);
		System.out.println(Civic);
		
		Civic.acelerar(Civic);
		System.out.println(Civic);
		
		Civic.acelerar(Civic);
		System.out.println(Civic);

		Ferrari Ferrari = new Ferrari(400);
		Ferrari.ligarTurbo();
		Ferrari.ligarAr();
		Ferrari.desligarAr();
		
		System.out.println(Ferrari.velocidadeDoAr());
		
		Ferrari.acelerar(Ferrari);
		Ferrari.frear(Ferrari);
		System.out.println(Ferrari);
		
		Ferrari.acelerar(Ferrari);
		Ferrari.frear(Ferrari);
		System.out.println(Ferrari);
		
		Ferrari.acelerar(Ferrari);
		System.out.println(Ferrari);
	}
}
