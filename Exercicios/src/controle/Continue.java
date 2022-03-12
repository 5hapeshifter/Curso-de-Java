package controle;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;// sempre que o continue for encontrado ele vai interromper apenas a repetição que ele estiver
			}
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;// sempre que o continue for encontrado ele vai pular apenas a repetição que ele estiver
			}
			System.out.println(i);
		}
	}
}
