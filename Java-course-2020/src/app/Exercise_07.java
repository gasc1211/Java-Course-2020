package app;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n;
		
		System.out.println("Ingresa un entero positivo de no más de tres cifras: ");
		n = sc.nextLine();
		
		if (n.length() <= 3) {
			System.out.printf("El número que ingresaste tiene %d cifras.", n.length());
		}else {
			System.out.println("¡El número que ingresaste no es válido!");
		}
		
		sc.close();
	}

}
