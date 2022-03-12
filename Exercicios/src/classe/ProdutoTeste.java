package classe;

public class ProdutoTeste {
// como essa classe que criamos "Produto teste" está dentro do mesmo pacote que a outra classe
// "Produto" não precisamos importar nada que formos usar.
  
 	public static void main(String[] args) {//método main serve para a entrada de dados.
		
//	int a = 3;
//	Scanner entrada = new Scanner (System.in); esse new é a palavra reservada da linguagem
//	Java responsável por chamar um construtor e o nome do construtor será exatamente o mesmo
//	nome da classe, então se eu quero uma classe com nome de produto, tenho que chamar o construtor de produto. 
 		Produto p1 = new Produto("Notebook", 4356.89);
 		//p1.nome = "Notebook";
 		//p1.preco = 4356.89;
 		//p1.desconto = 0.25;
 		
 		var p2 = new Produto();// o java já indentificou pela INFERÊNCIA que p2 é um tipo produto
 		p2.nome = "Caneta preta2";
 		p2.preco = 12.56;
 		Produto.desconto = 0.50;//ALTERAÇÃO DO VALOR DO DESCONTO DOS PRODUTOS
 		 		
 		System.out.println(p1.nome + " " + p1.precoComDesconto());//System é uma classe, out é um atributo senão ele teria parenteses ao lado dele, e println é um método.
 		System.out.println(p2.nome + " " + p2.precoComDesconto());
 		
 		double precoFinal1 = p1.precoComDesconto();
 		double precoFinal2 = p2.precoComDesconto(0.10);
 		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
 		
 		System.out.printf("Média do carrinho = R$%.2f\n", mediaCarrinho);
 		
	}
}
