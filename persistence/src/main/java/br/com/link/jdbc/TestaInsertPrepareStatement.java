package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.link.jdbc.factory.ConnectionFactory;

public class TestaInsertPrepareStatement {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		try (Connection con = factory.getConnection()) {
			con.setAutoCommit(false);

			try (PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (NOME, DESCRICAO) VALUE (?, ?)",
					Statement.RETURN_GENERATED_KEYS)) {
				addVariable("SPEAKER", "SPEAKER EDIFIER", stm);
				addVariable("CPU", "CPU INTEL", stm);
				addVariable("GPU", "GPU NVIDIA", stm);
				con.commit();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXEXCUTADO");
				con.rollback();
			}
		}
	}

	private static void addVariable(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {
			while (rst.next()) {
				System.out.println(rst.getInt(1));
			}
		}
	}
}
