package lambdas;

import java.util.function.Function;

//recebe o dado de um tipo e devolve de outro

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0? "Par" : "�mpar";
		
		Function<String, String> resultado = valor -> "O resultado �: " + valor;
	
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";
		
// Podemos encadear v�rias fun��es de pequenas tarefas e assim reaproveit�-las em
// outras partes do c�digo		
		String resultadoFinal1 = parOuImpar
				.andThen(resultado)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar
				.andThen(resultado)
				.andThen(duvida)
				.apply(33);
		System.out.println(resultadoFinal2);
		
		System.out.println(parOuImpar.apply(32));
	}
}
