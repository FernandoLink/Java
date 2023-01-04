package br.com.link.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.link.jdbc.dao.CategoriaDAO;
import br.com.link.jdbc.dao.ProdutoDAO;
import br.com.link.jdbc.factory.ConnectionFactory;
import br.com.link.jdbc.modelo.Categoria;
import br.com.link.jdbc.modelo.Produto;

public class TestaListagemCategorias {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionFactory().getConnection()) {
			CategoriaDAO categoriaDao = new CategoriaDAO(connection);
			List<Categoria> categorias = categoriaDao.listarComProdutos();
			categorias.stream().forEach(ct -> {
				System.out.println(ct.getNome());
				for (Produto produto : ct.getProdutos()) {
					System.out.println(ct.getNome() + " - " + produto.getNome());
				}
			});
		}
	}
}
