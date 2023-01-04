package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.link.jdbc.factory.ConnectionFactory;

public class TestaDelete {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.getConnection();

		Statement stm = con.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID >= 26");

		System.out.println(stm.getUpdateCount());

		con.close();
	}
}
