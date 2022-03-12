package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Não recebe nada e retorna algo
public class FornecedorSupplier {

	public static void main(String[] args) {
		
//Como essa interface não recebe nenhum parâmetro, somos obrigados a colocar os parênteses
	Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
	System.out.println(umLista.get());
	
	}
}
