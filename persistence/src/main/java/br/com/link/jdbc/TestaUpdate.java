package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.link.jdbc.factory.ConnectionFactory;

public class TestaUpdate {
	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.getConnection();

		Statement stm = con.createStatement();
		stm.execute("UPDATE PRODUTO SET DESCRICAO = 'GELADEIRA BRASTEMP' WHERE ID = 12");

		System.out.println(stm.getUpdateCount());

		con.close();
	}
}
