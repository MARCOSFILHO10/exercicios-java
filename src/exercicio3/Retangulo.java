package exercicio3;

import java.util.Scanner;

public class Retangulo {

	
	public static void main (String[] args ) {
		//Como calcular área do triangulo ?
		
		float h, b, area;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base:");
		b = entrada.nextFloat();
		
		System.out.println("Digite a altura:");
		h = entrada.nextFloat();
		
		 area = b*h;
		System.out.println("A área do retangulo é:"+area);
		
		entrada.close();
	}
}
