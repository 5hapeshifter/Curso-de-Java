package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		//No switch sem break, quando a regra achar a colocação, todas as regras subsequentes serão executadas.
		String faixa = "verde";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde": 
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
//		default:// se colocar o resultado antes dessas opções, ele influenciará totalmente no resultado.
//			System.out.println("Não sei nada");
			break;//QUANDO o switch encontra o break ele sai da regra, ou seja, pula o default e sai do switch
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim!");
		
		
		int idade = 2;
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
			
		}
	}
}

