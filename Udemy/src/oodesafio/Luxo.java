package oodesafio;

public interface Luxo {
	public abstract void ligarAr(); //public abstract -> padrão
	void desligarAr();
	
	
	default int nivelDoAr() {
		return 1;
	}
}
