package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o nome");
		String nome = entrada.nextLine();
		
		String sql = "INSERT INTO pessoas (nome) VALUES(?)"
				+ "";
		
		Connection conexao = FabricaConexao.getConexao();
		
		PreparedStatement stmt = conexao.prepareStatement(sql); 
		stmt.setString(1, nome);
//		stmt.setInt(2, 100);
		
		stmt.execute();
		
		System.out.println("Pesoa incluída com sucesso");
		
		entrada.close();
		
		
	}

}
