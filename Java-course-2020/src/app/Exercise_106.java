package app;

import java.util.Scanner;

public class Exercise_106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        int[] dotr = { num * 2, num * 3 };
        System.out.printf("El doble de el numero es: %d\nEl triple de el numero es: %d\n", dotr[0], dotr[1]);
        sc.close();
    }
}