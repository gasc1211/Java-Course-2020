package app;

import java.util.Scanner;

public class Exercise_12bouns {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n;
		Byte opt;
		
		System.out.println("Ingresa un código o caracter a convertir a ASCII (32-126) o viceversa:");
		n = sc.nextLine();
		
		System.out.println("Código(1) o caracter(2) a convertir:");
		opt = sc.nextByte();
		
		switch (opt) {
			case 1:
				System.out.printf("El resultado es: %c.", (char) Byte.parseByte(n));
				break;
			case 2:
				System.out.printf("El resultado es: %d.", (byte) n.charAt(0));
				break;
			default:
				System.out.println("Ingresaste una opción incorrecta.");
		}
		
		sc.close();
	}
}
