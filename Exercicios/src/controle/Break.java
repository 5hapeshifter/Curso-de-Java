package controle;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;// break pode ser usado em while, for, if, mas � muito melhor utilizado em la�os de repeti��o
			}// break encerra a execu��o do lugar onde ele for inserido.
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
