package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsertParam {
	public static void main(String[] args) throws SQLException {

		String nome = "TECLADO";
		String descricao = "TECLADO KEYCHRON";

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.getConnection();

		Statement stm = con.createStatement();
		stm.execute("INSERT INTO PRODUTO (NOME, DESCRICAO) VALUE ('" + nome + "', '" + descricao + "')",
				Statement.RETURN_GENERATED_KEYS);

		ResultSet rst = stm.getGeneratedKeys();
		while (rst.next()) {
			System.out.println(rst.getInt(1));
		}

		con.close();

	}
}
