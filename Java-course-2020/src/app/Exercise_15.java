package app;

import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0;
        System.out.print("Ingrese la cantidad de piezas: ");
        n = sc.nextInt();
        Double l;
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese la longitud #%d: ", (i + 1));
            l = sc.nextDouble();
            if (l >= 1.2 && l <= 1.3) {
                a++;
            }
        }
        System.out.printf("La cantidad de piezas aptas es: %d\n", a);
        sc.close();
    }
}