package exercicio4;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		// Como calcular �rea da moldura retangular?

		float h, h1, b, b1, area1, area2, areaMoldura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a base:");
		b = entrada.nextFloat();

		System.out.println("Digite a base1:");
		b1 = entrada.nextFloat();

		System.out.println("Digite a altura:");
		h = entrada.nextFloat();

		System.out.println("Digite a altura1:");
		h1 = entrada.nextFloat();

		area1 = b * h;
		System.out.println("A �rea do retangulo1 �:" + area1);

		area2 = b1 * h1;
		System.out.println("A �rea do retangulo2 �:" + area2);

		areaMoldura = area1 - area2;
		System.out.println("A �rea da moldura �:" + areaMoldura);

		entrada.close();
	}
}
