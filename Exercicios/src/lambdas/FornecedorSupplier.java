package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//N�o recebe nada e retorna algo
public class FornecedorSupplier {

	public static void main(String[] args) {
		
//Como essa interface n�o recebe nenhum par�metro, somos obrigados a colocar os par�nteses
	Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
	System.out.println(umLista.get());
	
	}
}
