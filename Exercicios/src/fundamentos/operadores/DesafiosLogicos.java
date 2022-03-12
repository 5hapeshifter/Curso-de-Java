package fundamentos.operadores;

public class DesafiosLogicos {

public static void main(String[] args) {
		
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		/*
		 * Se o trabalho de terça ou quinta derem certo = comprar TV de 50 pol;
		 * Se so o trabalho de um dos dias der certo, comprar TV de 32 pol;
		 * Se comprar qualquer TV, tomar sorvete.
		 * Se nenhum trabalho der certo nao tomar sorvete, ficarao com fome ou saudaveis.		 * 
		 */
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV de 50\"? " + comprouTV50); // Colocar barra invertida na frente das aspas para o Java entender que é valor literal.
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Comprou TV de 32\" e sorvete ? " + comprouSorvete);
		System.out.println("Mais Saudavel? " + maisSaudavel);
		
		System.out.println();
		
	}
}
