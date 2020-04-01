package app;

import java.util.Scanner;
public class Exercise_109 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        int h = sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        int m = sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        int s = sc.nextInt();
        boolean vh = false;
        boolean vm = false;
        boolean vs = false;
        if (h>=0 && h<25) {
            vh = true;
        }
        if (m>=0 && m<60) {
            vm = true;
        }
        if (s>=0 && s<60) {
            vs = true;
        }
        if (vh==true && vm==true && vs==true) {
            System.out.println("Es una hora valida");
        } else {
            System.out.println("No es una hora valida");
        }
        sc.close();
    }
}