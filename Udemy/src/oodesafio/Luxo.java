package oodesafio;

public interface Luxo {
	public abstract void ligarAr(); //public abstract -> padr�o
	void desligarAr();
	
	
	default int nivelDoAr() {
		return 1;
	}
}
