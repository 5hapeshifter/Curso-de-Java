package controle;

public class DesafioFor {

	public static void main(String[] args) {
	
	// Desafio: não pode usar valor numérico para controlar o laço.	
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
