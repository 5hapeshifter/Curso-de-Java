package fundamentos;

public class PrimitivosVsObjetos {

	public static void main(String[] args) {
		
		String s = new String ("texto");
		s.toUpperCase();
		
		
		//Wrappers sao a versao objeto dos tipos primitivos
		//td em Java eh objeto, menos os tipos primitivos.
	
		int a = 123;
		System.out.println(a);
	
	}
}
