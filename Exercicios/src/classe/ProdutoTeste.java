package classe;

public class ProdutoTeste {
// como essa classe que criamos "Produto teste" est� dentro do mesmo pacote que a outra classe
// "Produto" n�o precisamos importar nada que formos usar.
  
 	public static void main(String[] args) {//m�todo main serve para a entrada de dados.
		
//	int a = 3;
//	Scanner entrada = new Scanner (System.in); esse new � a palavra reservada da linguagem
//	Java respons�vel por chamar um construtor e o nome do construtor ser� exatamente o mesmo
//	nome da classe, ent�o se eu quero uma classe com nome de produto, tenho que chamar o construtor de produto. 
 		Produto p1 = new Produto("Notebook", 4356.89);
 		//p1.nome = "Notebook";
 		//p1.preco = 4356.89;
 		//p1.desconto = 0.25;
 		
 		var p2 = new Produto();// o java j� indentificou pela INFER�NCIA que p2 � um tipo produto
 		p2.nome = "Caneta preta2";
 		p2.preco = 12.56;
 		Produto.desconto = 0.50;//ALTERA��O DO VALOR DO DESCONTO DOS PRODUTOS
 		 		
 		System.out.println(p1.nome + " " + p1.precoComDesconto());//System � uma classe, out � um atributo sen�o ele teria parenteses ao lado dele, e println � um m�todo.
 		System.out.println(p2.nome + " " + p2.precoComDesconto());
 		
 		double precoFinal1 = p1.precoComDesconto();
 		double precoFinal2 = p2.precoComDesconto(0.10);
 		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
 		
 		System.out.printf("M�dia do carrinho = R$%.2f\n", mediaCarrinho);
 		
	}
}
