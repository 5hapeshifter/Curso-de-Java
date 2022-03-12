package classe;

public class DesafioClasseMetodoComida {
//Aqui deve ter o peso e o nome da comida
	double arroz;
	double feijao;
	double salada;
	double proteina;
	double pesoPrato;

	
	String alimentar () {
		return String.format("%sgr de arroz, %sgr de feijao, %sgr de salada e \n%sgr de proteina,"
				+ " peso final do prato %sgr!",	arroz, feijao, salada, proteina, pesoPrato);
	}
			
}
