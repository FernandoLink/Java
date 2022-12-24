package br.com.link.pacote.java.more;

import br.com.link.pacote.java.Pessoa;
import java.util.Date;
import java.sql.*;

public class Financeiro {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		br.com.link.pacote.java.Endereco e = new br.com.link.pacote.java.Endereco(); // FQN
		Date data = new Date(); // vai usar o java.util.Date mesmo tendo no java.sql.Date 
		System.out.println(data);
	}

}
