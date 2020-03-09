package app;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la cadena: ");
		String s = sc.nextLine().trim();
		
		StringTokenizer w = new StringTokenizer(s);
		
		System.out.printf("La cantidad de palabras es de: %d", w.countTokens());
		
		sc.close();
	}

}
