package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.link.jdbc.dao.ProdutoDAO;
import br.com.link.jdbc.factory.ConnectionFactory;
import br.com.link.jdbc.modelo.Produto;

public class TestaSelectComDAO {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionFactory().getConnection()) {
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			List<Produto> listaProdutos = produtoDao.listar();
			listaProdutos.stream().forEach(lp -> System.out.println(lp));
		}
	}
}
