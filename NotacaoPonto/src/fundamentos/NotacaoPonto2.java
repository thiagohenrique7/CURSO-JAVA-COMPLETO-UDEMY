package fundamentos;

public class NotacaoPonto2 {

	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "SENHOR");
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Thiago"
				.concat(" Lindo"));
		
		String x = "Thiago".toUpperCase();
		System.out.println(x);

	}

}
