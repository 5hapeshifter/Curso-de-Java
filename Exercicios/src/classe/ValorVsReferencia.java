package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;// atribuição por valor (trabalhando com tipo primitivo)
		
		a++;
		b--;
		System.out.println(a+ " " +b);
		
		Data d1 = new Data (1, 6, 2022);
		Data d2 = d1;// atribuição por referência (trabalhando com objeto)
		
		d1.dia = 31;
		d2.mes = 12;//repare que mesmo alterando o mês em d2, ele também é alterado em d1
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada()); //String usada em outra classe
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada()); //String usada em outra classe
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) { //o método "static" só acessa outro método "static" de classe para classe, nunca de classe para objeto
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo (int a) {
		a++;
	}
}
