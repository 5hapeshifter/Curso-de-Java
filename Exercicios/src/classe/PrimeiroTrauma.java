package classe;

public class PrimeiroTrauma {
	
	int a = 3; // n�o pode mexer aqui!
	static int b = 4;
	
	public static void main(String[] args) {
// Nesse caso tivemos que criar a inst�ncia/objeto "p" para conseguir acessar o atributo "a"
// Ou seja, mesmo estando na mesma classe, s� conseguimos acessar o membro de inst�ncia/objeto 
// a partir de um m�todo est�tico se criarmos outra inst�ncia/objeto.
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
// Nesse caso transformamos o atributo "b" em est�tico, 
		System.out.println(b);
	}
	
	
}
