package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	String barra1;
	String barra2;
	// M�TODO IDEAL PARA RETORNAR
	String obterDataFormatada () {
		final String formato = "%d/%d/%d";// tanto os par�metros quanto os m�todos criados
		//dentro de um m�todo, ele � local e n�o poder� ser usado em outro lugar, para usar
		//em qualquer lugar, a vari�vel, m�todo ou par�metro deve ser criada na classe.
		return String.format(formato, this.dia, mes, ano);
		
		//return (dia + "/" + mes + "/" + ano); MINHA RESPOSTA EST� CERTA
	}
	Data () {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);//Essa � a forma como a partir de um construtor podemos chamar outro construtor
		//usando "this" como m�todo, o que vai definir qual construtor ser� chamado � a quantidade de 
		//par�metro e a ordem de par�metro.
		//Sempre que estiver usando this como m�todo, estaremos chamando um construtor.
		
	}
	// MINHA RESPOSTA - Nesse caso estamos usando o "this" para diferenciar os par�metros (entre parenteses)
	// dos atributos abaixo.
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
			 
	}
	
	// M�TODOS ABAIXO S� FUNCIONA NO TERMINAL, N�O FUNCIONA NA WEB, PARA USU�RIO, LUGAR NENHUM
//	void obterDataFormatada () { //forma de imprimir na tela de caracter�sticas com VOID
//		System.out.printf("%d/%d/%d", dia, mes, ano);
//	} 
	
	void imprimirDataFormatada () { //forma de imprimir na tela de caracter�sticas com VOID
	System.out.println(obterDataFormatada()); //outra forma usando j� a formata��o anterior
	} 
}
