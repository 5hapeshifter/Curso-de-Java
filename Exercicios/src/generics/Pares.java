package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {// aqui estamos definindo que C tem que ser um n�mero pois herda da classe Number, ou seja, 
	
	private final Set<Par<C, V>> itens = new LinkedHashSet<>(); // LinkedHashSet garante a ordena��o pela ordem de inclus�o

	public void adicionar (C chave, V valor) {
		if(chave == null) return; // aqui estamos fazendo a valida��o, se chave for nula o "return" indica que n�o ser� feito mais nada e o m�todo ser� terminado.
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}
