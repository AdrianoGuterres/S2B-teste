package sbteste.artefato02.testes;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import s2bteste.artefato02.code.Hello;

public class HelloTest {

	@Test
	public void testSomaZeroZero() {
		assertEquals(0, Hello.somar(0, 0));
	}
	
	@Test
	public void testZeroUm() {
		assertEquals(1, Hello.somar(0, 1));
	}
	
	@Test
	public void testUmZero() {
		assertEquals(1, Hello.somar(1, 0));
	}
	
	@Test
	public void testCincoZero() {
		assertEquals(5, Hello.somar(5, 0));
	}
	
	@Test
	public void testUmNegativoDoisNegativo() {
		assertEquals(-3, Hello.somar(-1, -2));
	}
	
	@Test
	public void testDezDez() {
		assertEquals(20, Hello.somar(10, 10));
	}
	
	@Test
	public void testTresTres() {
		assertEquals(6, Hello.somar(3, 3));
	}
	
	
	@Test
	public void testMilMil() {
		assertEquals(2000, Hello.somar(1000, 1000));
	}
	
	@Test
	public void testVinteTrinta() {
		assertEquals(50, Hello.somar(20, 30));
	}
	
	@Test
	public void testSubtracaoUmUm() {
		assertEquals(0, Hello.subtracao(1,1));
	} 

}
