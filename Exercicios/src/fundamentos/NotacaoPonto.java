package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X"; //String sempre com S maiusculo
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");		
		
		System.out.println(s);

		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");//podemos concatenar varias strings em sequencia do ponto como esse exemplo
		System.out.println(y);
		
		//Tipos primitivos nao permitem o operador "." pois armazenam apenas o valor, nao comportamentos e atributos
		//todo restante permite tipo o ".".
		
	}
}
