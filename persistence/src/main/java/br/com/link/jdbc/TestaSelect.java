package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.link.jdbc.factory.ConnectionFactory;

public class TestaSelect {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.getConnection();

		Statement stm = con.createStatement();
		stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

		ResultSet rst = stm.getResultSet();
		while (rst.next()) {
			System.out.println(rst.getInt("ID") + " - " + rst.getString(2) + " - " + rst.getString("DESCRICAO"));
		}

		con.close();
	}
}
