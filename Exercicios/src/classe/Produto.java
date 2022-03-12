package classe;

public class Produto {
//TABELA QUE CONTÉM TODOS ATRIBUTOS QUE OS PRODUTOS PRECISAM: NOME, DESCONTO, PREÇO, PESO, DIMENSÕES E ETC
	String nome;
	double preco;
	static double desconto = 0.25;//desconto estará entre 0 e 1, ou seja 0,1 10% de desconto, 0,3 30% de desconto


	
	Produto() {
		
	}
	
	Produto (String nomeInicial, double precoInicial) {// construtor padrão definido de forma explícita
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial; UMA vez que definimos o desconto como estático, não faz sentido deixar no construtor, pois pode gerar confusão.
	}
	
	double precoComDesconto () {// nesse caso não precisamos inserir os parâmetros, pq já estão dentro do objeto
		return preco * (1 - desconto);// essa é uma das grandes vantagens da orientação a objeto, o fato de você ter o dado próximo ao comportamento.
		
	}
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	
	
	}
}
