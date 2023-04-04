package br.com.link.linkbank.domain.conta;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import br.com.link.linkbank.domain.cliente.Cliente;
import br.com.link.linkbank.domain.cliente.DadosCadastroCliente;

public class ContaDAO {

	private Connection conn;

	ContaDAO(Connection connection) {
		this.conn = connection;
	}

	public void salvar(DadosAberturaConta dadosDaConta) {
		var cliente = new Cliente(dadosDaConta.dadosCliente());
		var conta = new Conta(dadosDaConta.numero(), BigDecimal.ZERO, cliente);
		String sql = "INSERT INTO conta (numero, saldo, cliente_nome, cliente_cpf, cliente_email) VALUES (?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getNumero());
			ps.setBigDecimal(2, BigDecimal.ZERO);
			ps.setString(3, dadosDaConta.dadosCliente().nome());
			ps.setString(4, dadosDaConta.dadosCliente().cpf());
			ps.setString(5, dadosDaConta.dadosCliente().email());
			ps.execute();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Set<Conta> listar() {
		Set<Conta> contas = new HashSet<>();
		String sql = "SELECT * FROM conta";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Integer numero = rs.getInt(1);
				BigDecimal saldo = rs.getBigDecimal(2);
				String nome = rs.getString(3);
				String cpf = rs.getString(4);
				String email = rs.getString(5);

				DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
				Cliente cliente = new Cliente(dadosCadastroCliente);

				contas.add(new Conta(numero, saldo, cliente));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return contas;
	}

	public Conta listarPorNumero(Integer numero) {
		String sql = "SELECT * FROM conta WHERE numero = ?";

		Conta conta = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, numero);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Integer numeroRecuperado = rs.getInt(1);
				BigDecimal saldo = rs.getBigDecimal(2);
				String nome = rs.getString(3);
				String cpf = rs.getString(4);
				String email = rs.getString(5);

				DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
				Cliente cliente = new Cliente(dadosCadastroCliente);

				conta = new Conta(numeroRecuperado, saldo, cliente);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return conta;
	}

	public void alterar(Integer numero, BigDecimal valor) {
		String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";

		try {
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setBigDecimal(1, valor);
			ps.setInt(2, numero);
			ps.execute();
			ps.close();
			conn.commit();
			conn.close();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException ex) {
				throw new RuntimeException(ex);
			}
			throw new RuntimeException(e);
		}

	}
}
