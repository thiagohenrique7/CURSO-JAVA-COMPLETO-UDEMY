package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost:3306/curso_java";
			final String usuario = "root";
			final String senha = "santoss710";
			
			return DriverManager.getConnection
					(url,usuario,senha);
		} catch (SQLException e) {
			throw new RuntimeException (e);
		}
	}

}
