package fundamentos.operadores;

public class Unarios {

public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;// significa que a recebe o valor de a+1 (forma pos fixada)
		a--;// significa que a subtrai o valor de a-1 (forma pre fixada)
		
		++b;// significa que a recebe o valor de b+1 (forma pos  pr�fixada)  
		--b;// significa que a subtrai o valor de b-1 (forma pre pr�fixada) 
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");	
		System.out.println(++a == b--);//nesse caso deu verdadeiro porque a ordem dos sinais
		//esta errada, o -- depois do b nao tem preferencia na execu��o antes da compara��o =,
		// ou seja, ++a est� sendo compara s� com b. 
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		//UMA DAS MAIORES VIRTUDES DO PROGRAMADOR � ESCREVER C�DIGOS DE F�CIL COMPREENS�O!
		
	}
}
