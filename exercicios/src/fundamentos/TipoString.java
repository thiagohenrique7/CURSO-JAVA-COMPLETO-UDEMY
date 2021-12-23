package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		String s = "Boa Tarde";
		System.out.println(s.charAt(0));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		var nome = "Thiago";
		var sobrenome = "Henrique";
		var idade = 33;
		var salario = 12345.987;
//		System.out.printf("Nome: %s %s",nome,sobrenome);
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f"
				,nome,sobrenome,idade,salario);
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f"
				,nome,sobrenome,idade,salario);
		System.out.println(frase);
		
		
		
	}

}
