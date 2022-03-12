package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	String barra1;
	String barra2;
	// MÉTODO IDEAL PARA RETORNAR
	String obterDataFormatada () {
		final String formato = "%d/%d/%d";// tanto os parâmetros quanto os métodos criados
		//dentro de um método, ele é local e não poderá ser usado em outro lugar, para usar
		//em qualquer lugar, a variável, método ou parâmetro deve ser criada na classe.
		return String.format(formato, this.dia, mes, ano);
		
		//return (dia + "/" + mes + "/" + ano); MINHA RESPOSTA ESTÁ CERTA
	}
	Data () {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);//Essa é a forma como a partir de um construtor podemos chamar outro construtor
		//usando "this" como método, o que vai definir qual construtor será chamado é a quantidade de 
		//parâmetro e a ordem de parâmetro.
		//Sempre que estiver usando this como método, estaremos chamando um construtor.
		
	}
	// MINHA RESPOSTA - Nesse caso estamos usando o "this" para diferenciar os parâmetros (entre parenteses)
	// dos atributos abaixo.
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
			 
	}
	
	// MÉTODOS ABAIXO SÓ FUNCIONA NO TERMINAL, NÃO FUNCIONA NA WEB, PARA USUÁRIO, LUGAR NENHUM
//	void obterDataFormatada () { //forma de imprimir na tela de características com VOID
//		System.out.printf("%d/%d/%d", dia, mes, ano);
//	} 
	
	void imprimirDataFormatada () { //forma de imprimir na tela de características com VOID
	System.out.println(obterDataFormatada()); //outra forma usando já a formatação anterior
	} 
}
