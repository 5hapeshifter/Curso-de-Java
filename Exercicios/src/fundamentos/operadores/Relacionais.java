package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);//== ele compara se as variaveis sao iguais
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);//sempre colocar o simbolo de maior ou menor antes do =
		System.out.println(3 < 7); 
		System.out.println(30 <= 7);
		System.out.println(30 != 7);//simbolo de diferente
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}
}
