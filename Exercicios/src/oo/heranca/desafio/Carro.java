package oo.heranca.desafio;

public class Carro {
/*criar dois carros sendo um uma Ferrari
 *criar atributo "velocidade atual" e os métodos acelerar e frear, acrescentar ou subtrair de 5 em 5
 *quando acima de 0.
 *na Ferrari, a aceleração é de 15 em 15km por hora
 */
	public final int VELOCIDADE_MAXIMA;
	protected int velocidade = 0;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar(Carro acelerar) {
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += getDelta();
		}
		
//		if(velocidade >= 0 && velocidade <= 235) {
//			velocidade += 5;
//		} else {
//			velocidade = 0;
//		}
	}
	public void frear(Carro frear) {
		if(velocidade >=5 && velocidade <= 240) {
			velocidade -= 5;
		}
		else {
			velocidade = 0;
		}
	}
	public String toString() {
		return "Velocidade atual é " + velocidade + "km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
}
