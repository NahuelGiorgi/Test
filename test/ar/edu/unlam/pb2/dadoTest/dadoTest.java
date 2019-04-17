package ar.edu.unlam.pb2.dadoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.dado.dado;

class dadoTest {
	dado dado1;

	@Before
	public void instancia() {
		
	}

	@Test
	public void testMath() {
		dado1 = new dado();
		Integer resultadoDado = dado1.lanzarDado();
		assertTrue(resultadoDado>=1 && resultadoDado <=6);
		assertFalse(resultadoDado <= 0);
	}

}
