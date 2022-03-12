package treino.ObejtosMetodosAtributos;

public class Produtos {

	String nome;
	double preco;
	int qtde;
	
	int velAtual = 0;
	
	public int acelerar () {
		velAtual = velAtual + 5;
		return velAtual;
	}
	
	public int frear () {
		if (velAtual > 5) {
		velAtual = velAtual -5;
		}
		return velAtual;
			
	}
	
	
	public double venda() {
	return preco * qtde;
	} 
	
}
