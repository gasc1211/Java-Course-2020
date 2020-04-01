package app;

import java.util.Scanner;

public class Exercise_108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char ca = sc.next().charAt(0);
        switch (ca) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("Es un digito");
                break;
            default:
                System.out.println("No es un digito");
                break;
        }
        sc.close();
    }
}