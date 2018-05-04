package sbteste.artefato02.testes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junitparams.FileParameters;
import s2bteste.artefato02.code.Hello;


@RunWith(Parameterized.class)
public class AppTesteParametrizadoArquivo {
	
	
	
	
	@Parameters(name= "{index} : soma({0} e {1}) = {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{0,0,0}, {1,10,11}, {10,-5,5}, {50,20,70}, {20,300,320}, {8,-50,-42}, {99,-20,79}, {-1,1,0}, {-99,500,401}, {500,60,560}			
		});		
	}
	
	
			
	@Test
	@FileParameters("/artefato02/ListasParaTestes/TesteParrametrizadoHelloSoma.csv")
	public void somaTestListaArquivo(int a, int b, int output) {
		assertEquals(output, Hello.somar(a, b));				
	}
	
	

}
