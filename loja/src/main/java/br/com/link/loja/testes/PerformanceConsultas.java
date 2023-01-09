package br.com.link.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.link.loja.dao.CategoriaDao;
import br.com.link.loja.dao.ClienteDao;
import br.com.link.loja.dao.PedidoDao;
import br.com.link.loja.dao.ProdutoDao;
import br.com.link.loja.modelo.Categoria;
import br.com.link.loja.modelo.Cliente;
import br.com.link.loja.modelo.ItemPedido;
import br.com.link.loja.modelo.Pedido;
import br.com.link.loja.modelo.Produto;
import br.com.link.loja.util.JPAUtil;
import br.com.link.loja.vo.RelatorioDeVendasVo;

public class PerformanceConsultas {

	public static void main(String[] args) {

		popularBancoDeDados();
		EntityManager em = JPAUtil.getEntityManager();
	
		System.out.println(em.find(Pedido.class, 1l).getData());
		System.out.println(em.find(Pedido.class, 1l).getItens().size());
		
		em.close();

	}

	private static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videogames = new Categoria("VIDEOGAMES");
		Categoria informatica = new Categoria("INFORMATICA");

		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);
		Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("1800"), videogames);
		Produto macbook = new Produto("Macbook", "Macbook pro", new BigDecimal("2800"), informatica);

		Cliente cliente = new Cliente("Fernando Link", "12345678901");
		
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItem(new ItemPedido(10, pedido, celular));
		pedido.adicionarItem(new ItemPedido(40, pedido, videogame));

		Pedido pedido2 = new Pedido(cliente);
		pedido2.adicionarItem(new ItemPedido(2, pedido, macbook));


		EntityManager em = JPAUtil.getEntityManager();
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ProdutoDao produtoDao = new ProdutoDao(em);
		ClienteDao clienteDao = new ClienteDao(em);
		PedidoDao pedidoDao = new PedidoDao(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(videogames);
		categoriaDao.cadastrar(informatica);
		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(videogame);
		produtoDao.cadastrar(macbook);
		clienteDao.cadastrar(cliente);
		pedidoDao.cadastrar(pedido);
		pedidoDao.cadastrar(pedido2);
		em.getTransaction().commit();
		em.close();
	}
}
