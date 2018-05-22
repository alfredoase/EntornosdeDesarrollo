package TestsClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Examen;

class ExamenTest {
	@Test
	void TestIguales() {
		Examen examen = new Examen(1, 0, 0);
		int resultado = examen.ContadorIguales();
		assertEquals(2,resultado);
	}
	
	@Test
	void TestMenor() {
		Examen examen = new Examen(1000, 500, 200);
		int resultado = examen.numeroMenor();
		assertEquals(200,resultado);
	}
	
	@Test
	void TestMayor() {
		Examen examen = new Examen(1, 20, 3);
		int resultado = examen.numeroMayor();
		assertEquals(20,resultado);
	}

}
