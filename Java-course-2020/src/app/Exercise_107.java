package app;

import java.util.Scanner;

public class Exercise_107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero de tres cifras: ");
        int num = sc.nextInt();
        if (num > 99 && num < 1000) {
            String decs = Integer.toString(num);
            System.out.printf("%c %c %c\n", decs.charAt(0), decs.charAt(1), decs.charAt(2));
        } else {
            System.out.println("Error! No tiene tres cifras o no es un numero!");
        }
        sc.close();
    }
}