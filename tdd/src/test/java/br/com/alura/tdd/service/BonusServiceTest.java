package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		// Primeira forma
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Link", LocalDate.now(), new BigDecimal(25000))));
		
		// Segunda forma
		try {
			service.calcularBonus(new Funcionario("Link", LocalDate.now(), new BigDecimal(25000)));
			fail("Nao deu a exception!");
		} catch (Exception e) {
			assertEquals("Funcionario com salario maior do que R$ 10.000,00 nao pode receber bonus", e.getMessage());
		}
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
