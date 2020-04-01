package app;

import java.util.Scanner;

public class Exercise_105 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los grados centrigrados: ");
        double cent = sc.nextInt();
        double fahr = 32 + (9 * cent / 5);
        System.out.printf("La cantidad de grados fahrenheit es: %.2f\n", fahr);
        sc.close();
    }
}