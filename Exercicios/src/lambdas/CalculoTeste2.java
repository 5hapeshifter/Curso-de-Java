package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {	return x + y;	};
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x - y; // podemos notar o polimorfismo
		System.out.println(calc.executar(4, 4));
		
		Calculo calc1 = (x , y) -> x * y;
		System.out.println(calc1.executar(3, 3));
		
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
