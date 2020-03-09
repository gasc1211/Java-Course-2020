package app;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		byte qty;
		float price;
		float isv = 0.15f;
		float disc = 0.03f;		
		
		System.out.println("Ingrese el precio y la cantidad del producto: ");
		
		price =  sc.nextFloat();
		qty = sc.nextByte();
		
		System.out.printf("El total es de: L. %.2f", ((qty * price) * (1 + isv) - (qty * price) * disc));
		
		sc.close();
	}

}
