package br.com.link.jdbc;

import java.sql.SQLException;

import br.com.link.jdbc.factory.ConnectionFactory;

public class TestaPoolConexoes {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();

		for (int i = 0; i < 20; i++) {
			connectionFactory.getConnection();
			System.out.println("Conexão número " + i);
		}
	}
}
