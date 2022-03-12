package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -45);
		p1.setIdade(230);// alteramos o valor da variável
		
		System.out.println(p1.getIdade()); // aqui podemos ler o valor da variável
		System.out.println(p1); // aqui ele tá puxando o toString
		System.out.println(p1.getNomeCompleto());
	}
	
}
