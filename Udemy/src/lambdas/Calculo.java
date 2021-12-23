package lambdas;
@FunctionalInterface //INTERFACE FUNCIONAL -> PODE TER APENAS UM M�TODO ABSTRATO
public interface Calculo {
	double executar(double a,double b);
	
	default String legal() {
		return "legal";
	}
	static String muitoLegal() {
		return"Muito Legal";
	}
}
