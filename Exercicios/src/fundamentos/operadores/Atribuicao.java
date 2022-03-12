package fundamentos.operadores;

public class Atribuicao {
	//formas diferentes de atribuir uma variavel a outra.
	
		public static void main(String[] args) {
			
			int a = 3;
			int b = a;
			int c = a + b;
			
			c += b; //c = c + b;
			c -= b; //c = c - b;
			c *= b; //c = c * b;
			c /= b; //c = c / b;
			
			System.out.println(c);
			
			c %= 2; // c = c % 2; 0 ou 1 se o resultado for 0 significa que o numero é par, e se der 1 significa que o numero é impar.
			
			System.out.println(c);
		}	
}
