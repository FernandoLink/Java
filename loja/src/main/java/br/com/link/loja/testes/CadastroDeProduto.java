package br.com.link.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.link.loja.dao.CategoriaDao;
import br.com.link.loja.dao.ProdutoDao;
import br.com.link.loja.modelo.Categoria;
import br.com.link.loja.modelo.Produto;
import br.com.link.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		cadastrarProduto();

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		Produto p = produtoDao.buscarPorId(1l);
		System.out.println(p.getPreco());

		List<Produto> todos = produtoDao.buscarTodos();
		todos.forEach(p1 -> System.out.println(p.getNome() + "-" + p.getDescricao()));

		List<Produto> nome = produtoDao.buscarPorNome("Xiaomi Redmi");
		nome.forEach(p1 -> System.out.println(p.getNome()));

		List<Produto> descricao = produtoDao.buscarPorDescricao("Muito legal");
		descricao.forEach(p1 -> System.out.println(p.getDescricao()));

		List<Produto> categoria = produtoDao.buscarPorNomeDaCategoria("CELULARES");
		categoria.forEach(p1 -> System.out.println(p.getDataCadastro()));

		BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
		System.out.println(precoDoProduto);
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);

		EntityManager em = JPAUtil.getEntityManager();
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ProdutoDao produtoDao = new ProdutoDao(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}

}
