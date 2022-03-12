package fundamentos;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
	
		System.out.println("2" == "2");
		// para comparar Strings o ideal é usar o comando .equals e não os operadores relacionais
		// porque os operadores não captam todas situações.
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); //o comando trim retira os espaços que o usuário digitar
		//assim como o next no Scanner, já o nextline não retira os espaços.
		System.out.println("2".equals(s2.trim()));		
		
		entrada.close();
		
	}
}
