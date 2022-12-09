package br.com.link.banco;

public class TarefaAcessarBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessarBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("comecando a tx");
			pool.getConnection();
			
			synchronized (tx) {
				tx.begin();
				System.out.println("pegue a conexao");
			}
		}
	}

}
