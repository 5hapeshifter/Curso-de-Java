package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {

//		System.out.println(mae.segredo);
//		System.out.println(mae.facoDentroDeCasa); n�o consigo acessar pq esta em outro pacote, ou seja, a visibilidade pacote n�o � transmitido por heran�a quando est� em outro pacote
		System.out.println(formaDeFalar);// nesse caso s� conseguimos acessar via heran�a o atributo protected
		System.out.println(todosSabem);
		
	}
}
