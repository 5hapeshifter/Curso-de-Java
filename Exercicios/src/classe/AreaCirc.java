package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415;//agora a variável pertence a classe e tera esse valor para todos objetos
	//final defini uma constante, ou seja o valor nunca poderá ser alterado
	//Pi em maiúsculo pq é uma constante, por convenção essa é a forma de usar
	AreaCirc(double raioInicial) {
		raio = raioInicial;
		}
	
	double area() {//MÉTODO
		return raio * raio * PI;// return pi * Math.pow(raio, 2); estamos fazendo raio elevado a 2 e vezes pi
	}
	
	static double area(double raio) {//MÉTODO ESTÁTICO
		return raio * raio * PI;
	}
}
