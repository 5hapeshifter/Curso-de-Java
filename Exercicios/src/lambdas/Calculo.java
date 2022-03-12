package lambdas;

@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b); //public abstract n�o precisam ser colocados, j� est�o por padr�o 
	
	default String legal() { return "Legal"; }

	static String muitoLegal() {
		return "Muito legal";
	}
	
}
