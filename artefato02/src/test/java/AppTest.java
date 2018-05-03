import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import s2bteste.artefato02.Hello;

class HelloTest {

		@Test
		void testSomaZeroZero() {
			assertEquals(0, Hello.somar(0, 0));
		}
		
		@Test
		void testZeroUm() {
			assertEquals(1, Hello.somar(0, 1));
		}
		
		@Test
		void testUmZero() {
			assertEquals(1, Hello.somar(1, 0));
		}
		
		@Test
		void testCincoZero() {
			assertEquals(5, Hello.somar(5, 0));
		}
		
		@Test
		void testUmNegativoDoisNegativo() {
			assertEquals(-3, Hello.somar(-1, -2));
		}
		
		@Test
		void testDezDez() {
			assertEquals(20, Hello.somar(10, 10));
		}
		
		@Test
		void testTresTres() {
			assertEquals(6, Hello.somar(3, 3));
		}
		
		
		@Test
		void testMilMil() {
			assertEquals(2000, Hello.somar(1000, 1000));
		}
		
		@Test
		void testVinteTrinta() {
			assertEquals(50, Hello.somar(20, 30));
		}
		
		@Test
		void testSubtracaoUmUm() {
			assertEquals(0, Hello.subtracao(1,1));
		} 
	}