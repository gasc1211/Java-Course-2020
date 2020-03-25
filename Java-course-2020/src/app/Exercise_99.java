package app;

import java.util.Scanner;

public class Exercise_99 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la nota del primer examen: ");
        int nota1 = sc.nextInt();

        int nota2 = 70 - nota1;
        if (nota2 <= 60) {
            System.out.printf("La nota requerida es: %d. \n", nota2);
        } else {
            System.out.println("No es posible pasar programacion.");
        }
        sc.close();
    }
}