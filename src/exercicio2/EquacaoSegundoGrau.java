package exercicio2;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		calculaDelta();
	}
	
	public static void calculaDelta() {
		int a = 2;
		int b = 10;
		int c = 5;
		int delta = (b*b) -4* a*c;
		int xLinha = (int) ((-b + Math.sqrt(delta))/(2*a));
		int xDuasLinhas = (int) ((-b - Math.sqrt(delta))/(2*a));
		System.out.println("X linha é igual a:"+xLinha); 
		System.out.println("X duas linhas é igual a:"+xDuasLinhas);	
	}
}
