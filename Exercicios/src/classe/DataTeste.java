package classe;

public class DataTeste {

	public static void main(String[] args) {
		
//		Data data1 = new Data();// tipo da variável depois nome da variável = new e depois o construtor
//		Data data2 = new Data();
		//var data2 = new Data(): essa é a forma de fazer pela inferência do Java
		
		
		Data data1 = new Data ();
		data1.ano = 2021;//alteração de ano de saída
		//data1.dia = 9;
		//data1.mes = 9;
		//data1.ano = 1988;

//		MINHA RESPOSTA
		var data2 = new Data (31, 12, 2020);
		data2.dia = 1;
		data2.mes = 1;
		data2.ano = 1970;
		
		//System.out.printf("%d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		//System.out.printf("%d/%d/%d\n", data2.dia, data2.mes, data2.ano);
		//System.out.println("Primeira data " + data1.dia + "/" + data1.mes + "/" + data1.ano);
		//System.out.println("Primeira data " + data2.dia + "/" + data2.mes + "/" + data2.ano);
		
		String dataFormatada = data1.obterDataFormatada();
		System.out.println(dataFormatada);
		System.out.println(data2.obterDataFormatada());
		
		data1.imprimirDataFormatada();// um método usando outro
		data2.imprimirDataFormatada();// um método usando outro
	}	
	
}
