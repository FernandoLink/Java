package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.link.jdbc.dao.ProdutoDAO;
import br.com.link.jdbc.factory.ConnectionFactory;
import br.com.link.jdbc.modelo.Produto;

public class TestaInsertComDAO {
	public static void main(String[] args) throws SQLException {
		Produto comoda = new Produto("COMODA", "COMODA VERTICAL");

		try (Connection connection = new ConnectionFactory().getConnection()) {
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			produtoDao.salvar(comoda);
		}
		System.out.println(comoda);
	}
}
