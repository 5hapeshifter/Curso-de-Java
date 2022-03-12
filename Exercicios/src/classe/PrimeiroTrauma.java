package classe;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui!
	static int b = 4;
	
	public static void main(String[] args) {
// Nesse caso tivemos que criar a instância/objeto "p" para conseguir acessar o atributo "a"
// Ou seja, mesmo estando na mesma classe, só conseguimos acessar o membro de instância/objeto 
// a partir de um método estático se criarmos outra instância/objeto.
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
// Nesse caso transformamos o atributo "b" em estático, 
		System.out.println(b);
	}
	
	
}
