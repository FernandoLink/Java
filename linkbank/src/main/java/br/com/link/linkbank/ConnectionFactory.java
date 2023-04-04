package br.com.link.linkbank;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {

	public Connection recuperarConexao() {
		try {
			return createDataSource().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private HikariDataSource createDataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mariadb://localhost:3306/link_bank");
		config.setUsername("root");
		config.setPassword("root");
		config.setMaximumPoolSize(10);

		return new HikariDataSource(config);
	}

}