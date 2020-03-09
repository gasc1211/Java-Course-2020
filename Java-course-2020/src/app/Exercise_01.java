package app;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float l;
		
		System.out.print("Ingresa el lado de un cuadrado: ");
		l = sc.nextFloat();
		
		System.out.printf("El perímetro del cuadrado es de : %f .", (4 * l));
		
		sc.close();
	}

}
