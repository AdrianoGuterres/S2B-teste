package s2bteste.artefato02.code;
public class Hello {
	public static void main(String[]args) {			
		int a = 20;
		int b = 30;				
		
		if(somar(a,b)==50) {
			System.out.println("Sucesso!");						
		}else {
			System.out.println("Falha!");
		}
	}
	
	public static int somar(int a, int b) {		
		return a+b;		
	}
	
	public static int subtracao(int a, int b) {		
		return a-b;		
	}

	public static long multiplicacao(int a, int b) {
		
		return a*b;
	}

	
	public static double divisao(double a, double b) {
		if(b !=0) {
			return a/b;
		}else {
			return 99999;
		}
	}	
	
}