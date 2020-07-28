package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		final String url ="jdbc:mysql://localhost?verifyServerCerficate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conex�o efetuada com sucesso.");
		
		conexao.close();
	}
}
