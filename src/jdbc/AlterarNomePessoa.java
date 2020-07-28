package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.print("Informe o c�digo da pessoa: ");
		int codigo = entrada.nextInt();
		
		String select = "SELECT * FROM pessoas WHERE codigo = ?";
		String update ="UPDATE pessoas SET nome = ? WHERE codigo = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt =conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			Pessoa p= new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O meu nome atual �: " + p.getNome());
			entrada.nextLine();
			
			System.out.print("Informe o novo nome: ");
			String novoNome =entrada.nextLine();
			
			
			
			stmt.close();
			stmt =conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
			
		}else {
			System.out.println("Pessoa n�o encontrada!");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
