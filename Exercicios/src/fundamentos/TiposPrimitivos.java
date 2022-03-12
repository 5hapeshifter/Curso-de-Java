package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informacoes do funcionario
		
		//Tipos numericos inteiros - a grande diferenca e a capacidade de armazenamento de cada um
		//valor LITERAL e um valor que voce coloca direto no codigo, nao foi entrada do usuario
		byte anosDeEmpresa = 23; // vai ate 127
		short numeroDeVoos = 542; //vai ate 32767
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //pode separar os numeros com underline/para dizer ao java que o numero e do tipo Long, devemmos adicionar "L" ao final do numero.
		
		//Tipos numericos reais
		float salario = 11_445.44F;// qualquer numero com ponto flutuante e um double
		double vendasAcumuladas = 2_991_797_103.01;	
		
		//Tipo Booleano
		boolean estaDeFerias = false; //true - em java nao e permitido colocar zero
		
		//Tipo caractere
		char status = 'A';//ativo - so aceita uma letra, aceita caracteres da tabela unicode tambem como '\u0010'
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		
		System.out.println(numeroDeVoos / 2);
	
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//ID + salario
		System.out.println(id + " ganha ->" + salario);
		
		//Func de ferias
		System.out.println("Ferias? " + estaDeFerias);
		
		//Status
		
		System.out.println("Status: " + status);
		
	}
}
