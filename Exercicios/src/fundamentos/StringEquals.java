package fundamentos;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
	
		System.out.println("2" == "2");
		// para comparar Strings o ideal � usar o comando .equals e n�o os operadores relacionais
		// porque os operadores n�o captam todas situa��es.
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); //o comando trim retira os espa�os que o usu�rio digitar
		//assim como o next no Scanner, j� o nextline n�o retira os espa�os.
		System.out.println("2".equals(s2.trim()));		
		
		entrada.close();
		
	}
}
