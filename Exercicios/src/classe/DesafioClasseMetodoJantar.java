package classe;

public class DesafioClasseMetodoJantar {
//deve ter duas comidas, fazer a pessoa comer a comida, e 
//mostrar o peso antes e depois de comer.
	
	public static void main(String[] args) {
		
		DesafioClasseMetodoPessoa Joao = new DesafioClasseMetodoPessoa();
		Joao.nome = "Joao";
		Joao.peso = 64.5;
	
		
		DesafioClasseMetodoComida comida1 = new DesafioClasseMetodoComida();
		comida1.arroz = 100;
		comida1.feijao = 50;
		comida1.salada = 50;
		comida1.proteina = 100;
		comida1.pesoPrato = comida1.arroz + comida1.feijao + comida1.salada +
								comida1.proteina;

		double pesoFinal = Joao.peso + (comida1.pesoPrato/1000);
		
		
		System.out.println(Joao.nomePeso()+comida1.alimentar()+" O peso final é de "+ pesoFinal);
	
		DesafioClasseMetodoComida comida2 = new DesafioClasseMetodoComida();
		comida2.arroz = 200;
		comida2.feijao = 50;
		comida2.salada = 50;
		comida2.proteina = 100;
		comida2.pesoPrato = comida2.arroz + comida2.feijao + comida2.salada +
								comida2.proteina;
		
		double pesoFinal2 = pesoFinal + (comida2.pesoPrato/1000);
		
		System.out.println(Joao.nomePeso()+comida2.alimentar()+" O peso final é de "+ pesoFinal2);
	
	}
	
}
