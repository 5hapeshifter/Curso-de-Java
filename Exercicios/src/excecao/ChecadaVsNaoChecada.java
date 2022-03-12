package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
	try {
		geraErro1();
	} catch (RuntimeException e) {//no catch sempre vai o tipo de erro/exceção que queremos capturar
		System.out.println(e.getMessage());;
	}
	try {
		geraErro2();
	} catch (Exception e) {//podemos colocar Throwable no lugar de exception para ficar ainda mais genérico
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	System.out.println("Fim!");
	}
	// EXCEÇÃO  NÃO VERIFICADA
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		// não basta criar o erro para testá-lo, temos que lançar o erro usando "throw"
		// só podemos lançar erro de algo que herda de Trowable
		//quando lançamos algo em RuntimeException, siginifica que é um erro não checado/tratado
		//toda classe que termina com Exception, é filha de Exception
	}
	// EXCEÇÃO VERIFICADA 
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
		//quando uma exceção é checada, precisamos deixar explícito na assinatura do método com "throws"
		//quando lançamos algo em Exception, siginifica que é um erro tratado/checado
	}	
}
