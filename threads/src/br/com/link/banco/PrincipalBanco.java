package br.com.link.banco;

public class PrincipalBanco {

	public static void main(String[] args) throws InterruptedException {
		GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
		PoolDeConexao pool = new PoolDeConexao();

		new Thread(new TarefaAcessarBanco(pool, tx)).start();
		new Thread(new TarefaAcessarBancoProcedimento(pool, tx)).start();
	}
}
