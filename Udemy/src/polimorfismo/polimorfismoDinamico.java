package polimorfismo;

public class polimorfismoDinamico {

	public static void main(String[] args) {
		carro c = new ferrari();
		c = new civic();
		c.escrever();
	}

}
