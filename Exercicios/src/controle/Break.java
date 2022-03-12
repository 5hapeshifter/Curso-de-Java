package controle;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;// break pode ser usado em while, for, if, mas é muito melhor utilizado em laços de repetição
			}// break encerra a execução do lugar onde ele for inserido.
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
