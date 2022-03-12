package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
	try {
		geraErro1();
	} catch (RuntimeException e) {//no catch sempre vai o tipo de erro/exce��o que queremos capturar
		System.out.println(e.getMessage());;
	}
	try {
		geraErro2();
	} catch (Exception e) {//podemos colocar Throwable no lugar de exception para ficar ainda mais gen�rico
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	System.out.println("Fim!");
	}
	// EXCE��O  N�O VERIFICADA
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		// n�o basta criar o erro para test�-lo, temos que lan�ar o erro usando "throw"
		// s� podemos lan�ar erro de algo que herda de Trowable
		//quando lan�amos algo em RuntimeException, siginifica que � um erro n�o checado/tratado
		//toda classe que termina com Exception, � filha de Exception
	}
	// EXCE��O VERIFICADA 
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
		//quando uma exce��o � checada, precisamos deixar expl�cito na assinatura do m�todo com "throws"
		//quando lan�amos algo em Exception, siginifica que � um erro tratado/checado
	}	
}
