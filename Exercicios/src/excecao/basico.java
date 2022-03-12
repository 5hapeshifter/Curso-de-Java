package excecao;

public class basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
		imprimirAluno(a1);
		} catch(Exception excecao) {//o catch vai captar o erro e exibir a msg
			//Usar exception � uma forma gen�rica de tratar o erro, o ideal � tratar de forma espec�fica
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usu�rio.");
		}
		//thread s�o linhas de execu��o, vc pode executar o programa em diversas linhas de execu��o
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			//e.printStackTrace();// esse m�todo imprimi a pilha de execu��o, mostrando onde o erro foi lan�ado
			System.out.println("Ocorreu o erro: " + e.getMessage());;//esse m�todo exibe a msg do erro, se tiver
		} //Exception in thread "main" java.lang.ArithmeticException: / by zero
							// O problema ocorreu na  linha 7 "at excecao.basico.main(basico.java:7)"
		//quando o erro apresenta uma msg, ela vem depois dos dois pontos.
		System.out.println("Fim");
	}
	
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
