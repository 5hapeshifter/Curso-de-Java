package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // converte automaticamente, pelo autobox, double -> Double de primitivo para wrapper Double
	
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
	

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
//		Testando a adição de objetos de diversos tipos em uma lista genérica
//		List <Object> lista = new ArrayList();
//		
//		lista.add(coisaB);
//		lista.add(coisaA);
//		
//		System.out.println(lista.toString());
		
	}
}
