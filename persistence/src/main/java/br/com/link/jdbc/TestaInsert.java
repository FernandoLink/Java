package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.link.jdbc.factory.ConnectionFactory;

public class TestaInsert {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.getConnection();

		Statement stm = connection.createStatement();
		stm.execute("INSERT INTO PRODUTO (NOME, DESCRICAO) VALUE ('MOUSE', 'MOUSE LOGITECH')", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			System.out.println(rst.getInt(1));
		}
		
		connection.close();
		
	}
}
