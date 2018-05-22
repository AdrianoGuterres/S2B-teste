package sbteste.artefato02.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import s2bteste.artefato02.code.Hello;

@RunWith(JUnitParamsRunner.class)
public class AppTesteParametrizadoArquivo {	
	
			
	@Test
	@FileParameters("src/TesteParrametrizadoHelloSoma.csv")
	public void somaTestListaArquivo(int a, int b, int output) {		
		assertEquals(output, Hello.somar(a, b));				
	}
	
	@Test
	@FileParameters("src/TesteParrametrizadoHelloSubtracao.csv")
	public void subtracaoTestListaArquivo(int a, int b, int output) {		
		assertEquals(output, Hello.subtracao(a, b));				
	}
	
	@Test
	@FileParameters("src/TesteParrametrizadoHelloProduto.csv")
	public void multiplicacaoTestListaArquivo(int a, int b, int output) {		
		assertEquals(output, Hello.multiplicacao(a, b));				
	}
	
	@Test
	@FileParameters("src/TesteParrametrizadoHelloDivisao.csv")
	public void divisaoTestListaArquivo(double a, double b, double output) {		
		assertEquals(output, Hello.divisao(a, b),0.0001);				
	}
	
	

}
