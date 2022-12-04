package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Link", LocalDate.now(), new BigDecimal(25000)));

		assertEquals(new BigDecimal("0.00"), bonus);
	}

	@Test
	public void bonusDeveriaSerDezPorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Link", LocalDate.now(), new BigDecimal(2500)));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	public void bonusDeveriaSerDezPorCentoParaSalarioDeDezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Link", LocalDate.now(), new BigDecimal(10000)));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
