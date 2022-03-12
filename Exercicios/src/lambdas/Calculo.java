package lambdas;

@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b); //public abstract não precisam ser colocados, já estão por padrão 
	
	default String legal() { return "Legal"; }

	static String muitoLegal() {
		return "Muito legal";
	}
	
}
