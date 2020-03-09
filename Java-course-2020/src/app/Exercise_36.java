package app;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		String[] w;
		String s;
		
		System.out.println("Ingresa una cadena: ");
		s = sc.nextLine();
		
		w = s.split(" "); 
		
		for(int i = 0; i < w.length; i++) {
			if (w[i].length() > w[max].length()) {
				max = i;
			}
		}
		
		System.out.printf("La palabra más extensa ingresada es %s, con %d caracteres.", w[max], w[max].length());
		
		sc.close();
	}

}
