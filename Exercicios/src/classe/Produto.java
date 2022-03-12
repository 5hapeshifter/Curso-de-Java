package classe;

public class Produto {
//TABELA QUE CONT�M TODOS ATRIBUTOS QUE OS PRODUTOS PRECISAM: NOME, DESCONTO, PRE�O, PESO, DIMENS�ES E ETC
	String nome;
	double preco;
	static double desconto = 0.25;//desconto estar� entre 0 e 1, ou seja 0,1 10% de desconto, 0,3 30% de desconto


	
	Produto() {
		
	}
	
	Produto (String nomeInicial, double precoInicial) {// construtor padr�o definido de forma expl�cita
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial; UMA vez que definimos o desconto como est�tico, n�o faz sentido deixar no construtor, pois pode gerar confus�o.
	}
	
	double precoComDesconto () {// nesse caso n�o precisamos inserir os par�metros, pq j� est�o dentro do objeto
		return preco * (1 - desconto);// essa � uma das grandes vantagens da orienta��o a objeto, o fato de voc� ter o dado pr�ximo ao comportamento.
		
	}
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	
	
	}
}
