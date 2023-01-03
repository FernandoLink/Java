package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.getConnection();

		System.out.println("Fechando conexao!!");
		con.close();
	}
}
