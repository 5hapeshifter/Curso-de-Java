package excecao;

public class basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
		imprimirAluno(a1);
		} catch(Exception excecao) {//o catch vai captar o erro e exibir a msg
			//Usar exception é uma forma genérica de tratar o erro, o ideal é tratar de forma específica
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário.");
		}
		//thread são linhas de execução, vc pode executar o programa em diversas linhas de execução
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			//e.printStackTrace();// esse método imprimi a pilha de execução, mostrando onde o erro foi lançado
			System.out.println("Ocorreu o erro: " + e.getMessage());;//esse método exibe a msg do erro, se tiver
		} //Exception in thread "main" java.lang.ArithmeticException: / by zero
							// O problema ocorreu na  linha 7 "at excecao.basico.main(basico.java:7)"
		//quando o erro apresenta uma msg, ela vem depois dos dois pontos.
		System.out.println("Fim");
	}
	
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
