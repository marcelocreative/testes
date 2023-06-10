package br.com.testes;

import org.junit.Assert;
import org.junit.Test;



public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Mascelo");
		cli.adicionarNome1("Marcelo");

		Assert.assertEquals("Marcelo", cli.getNome());
	}
}
