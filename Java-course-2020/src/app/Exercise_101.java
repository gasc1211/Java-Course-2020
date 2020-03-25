package app;

import java.util.Scanner;

public class Exercise_101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        int hora = sc.nextInt();
        if (hora < 6) {
            System.out.println("Buenas noches!");
        } else if (hora < 12) {
            System.out.println("Buenos dias!");
        } else if (hora < 20) {
            System.out.println("Buenas tardes!");
        } else if (hora < 24) {
            System.out.println("Buenas noches!");
        } else {
            System.out.println("Fuera de rango");
        }
        sc.close();
    }
}