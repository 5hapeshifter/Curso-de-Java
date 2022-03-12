package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // converte automaticamente, pelo autobox, double -> Double de primitivo para wrapper Double
	
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
	

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ol�");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
//		Testando a adi��o de objetos de diversos tipos em uma lista gen�rica
//		List <Object> lista = new ArrayList();
//		
//		lista.add(coisaB);
//		lista.add(coisaA);
//		
//		System.out.println(lista.toString());
		
	}
}
