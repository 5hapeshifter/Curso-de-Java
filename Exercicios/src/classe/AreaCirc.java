package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415;//agora a vari�vel pertence a classe e tera esse valor para todos objetos
	//final defini uma constante, ou seja o valor nunca poder� ser alterado
	//Pi em mai�sculo pq � uma constante, por conven��o essa � a forma de usar
	AreaCirc(double raioInicial) {
		raio = raioInicial;
		}
	
	double area() {//M�TODO
		return raio * raio * PI;// return pi * Math.pow(raio, 2); estamos fazendo raio elevado a 2 e vezes pi
	}
	
	static double area(double raio) {//M�TODO EST�TICO
		return raio * raio * PI;
	}
}
