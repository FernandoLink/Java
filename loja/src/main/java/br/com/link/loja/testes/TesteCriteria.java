package br.com.link.loja.testes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.link.loja.dao.CategoriaDao;
import br.com.link.loja.dao.ProdutoDao;
import br.com.link.loja.modelo.Categoria;
import br.com.link.loja.modelo.Produto;
import br.com.link.loja.util.JPAUtil;

public class TesteCriteria {

	public static void main(String[] args) {
		popularBancoDeDados();
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);

		List<Produto> produto = produtoDao.buscarPorParametros("PS5", null, null);
		produto.forEach(p -> System.out.println(p.getNome()));

		produto = produtoDao.buscarPorParametros(null, new BigDecimal("2800"), null);
		produto.forEach(p -> System.out.println(p.getNome()));

		produto = produtoDao.buscarPorParametrosComCriteria(null, null, LocalDate.now());
		produto.forEach(p -> System.out.println(p.getNome()));
	}

	private static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videogames = new Categoria("VIDEOGAMES");
		Categoria informatica = new Categoria("INFORMATICA");

		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);
		Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("1800"), videogames);
		Produto macbook = new Produto("Macbook", "Macbook pro", new BigDecimal("2800"), informatica);

		EntityManager em = JPAUtil.getEntityManager();
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ProdutoDao produtoDao = new ProdutoDao(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(videogames);
		categoriaDao.cadastrar(informatica);
		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(videogame);
		produtoDao.cadastrar(macbook);
		em.getTransaction().commit();
		em.close();
	}
}
