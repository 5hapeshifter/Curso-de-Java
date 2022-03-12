package fundamentos.operadores;

public class Unarios {

public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;// significa que a recebe o valor de a+1 (forma pos fixada)
		a--;// significa que a subtrai o valor de a-1 (forma pre fixada)
		
		++b;// significa que a recebe o valor de b+1 (forma pos  préfixada)  
		--b;// significa que a subtrai o valor de b-1 (forma pre préfixada) 
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");	
		System.out.println(++a == b--);//nesse caso deu verdadeiro porque a ordem dos sinais
		//esta errada, o -- depois do b nao tem preferencia na execução antes da comparação =,
		// ou seja, ++a está sendo compara só com b. 
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		//UMA DAS MAIORES VIRTUDES DO PROGRAMADOR É ESCREVER CÓDIGOS DE FÁCIL COMPREENSÃO!
		
	}
}
