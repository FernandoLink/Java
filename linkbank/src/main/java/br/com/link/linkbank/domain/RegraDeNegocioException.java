package br.com.link.linkbank.domain;

public class RegraDeNegocioException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegraDeNegocioException(String mensagem) {
		super(mensagem);
	}
}
