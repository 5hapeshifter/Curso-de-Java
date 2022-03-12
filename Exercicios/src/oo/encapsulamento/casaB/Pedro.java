package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {

//		System.out.println(mae.segredo);
//		System.out.println(mae.facoDentroDeCasa); não consigo acessar pq esta em outro pacote, ou seja, a visibilidade pacote não é transmitido por herança quando está em outro pacote
		System.out.println(formaDeFalar);// nesse caso só conseguimos acessar via herança o atributo protected
		System.out.println(todosSabem);
		
	}
}
