package oo.heranca.desafio;

public interface Luxo {

	public void ligarAr();// toda interface criada � p�blica por padr�o
	abstract void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}
// em todos m�todos que est�o em interface est� impl�cito que eles s�o public e abstract.
// e mesmo assim vc pode dar uma implementa��o padr�o, o que torna n�o obrigat�ria a implementa��o do m�todo.
	
}
