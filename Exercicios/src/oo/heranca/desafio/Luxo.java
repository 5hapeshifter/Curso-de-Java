package oo.heranca.desafio;

public interface Luxo {

	public void ligarAr();// toda interface criada é pública por padrão
	abstract void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}
// em todos métodos que estão em interface está implícito que eles são public e abstract.
// e mesmo assim vc pode dar uma implementação padrão, o que torna não obrigatória a implementação do método.
	
}
