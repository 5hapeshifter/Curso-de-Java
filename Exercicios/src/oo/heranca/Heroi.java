package oo.heranca;

public class Heroi extends Jogador{// aqui estou definindo que Heroi está recebendo por herança
	// e reutilizando as características, atributos e métodos, de jogador. 
	
	public Heroi(int x, int y){
		super(x,y);
	}
	
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);// aqui estamos chamando o método da super classe e reutilizando-o
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
