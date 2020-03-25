package app;

import java.util.Scanner;

public class Exercise_100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Asignatura de la primera hora:");
        System.out.println("Ingrese dia de la semana:\nLunes=1\nMartes=2\nMiercoles=3\nJueves=4\nViernes=5");
        System.out.print("Ingrese: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
            case 2:
            case 3:
                System.out.println("Laboratorio");
                break;
            case 4:
                System.out.println("Diseño Web");
                break;
            case 5:
                System.out.println("Programacion");
                break;
            default:
                System.out.println("Fuera de rango");
                break;
        }
        sc.close();
    }
}