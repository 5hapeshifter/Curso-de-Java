package controle;

public class ContinueRotulado {

	public static void main(String[] args) {
		
		externo: 
			for (int i = 0; i < 3; i++) {//atribuimos ao primeiro for o nome externo 
				for (int j = 0; j < 3; j++) {
					if(i == 1) {
						continue externo;// aqui estamos dizendo que queremos que o break seja executado no laço externo
					}
					System.out.printf("[%d %d] ", i,j);
				}
				System.out.println();
			}
			System.out.println("Fim!");
	}
}
