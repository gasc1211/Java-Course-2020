package app;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float sueldo;
		String result;
		
		System.out.println("Ingrese su sueldo anterior: ");
		sueldo = sc.nextFloat();
		
		System.out.println("¿Recibirá aumento?(S/N)");
		sc.nextLine();
		result = sc.nextLine();
		
		if (result.equals("S")) {
			sueldo *= 1.25f;
		}
		
		System.out.printf("Su nuevo sueldo es de: L. %.2f", sueldo);
		
		sc.close();
	}

}
