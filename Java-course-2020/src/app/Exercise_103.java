package app;

import java.util.Scanner;
import java.util.Random;
public class Exercise_103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random ra = new Random();
        int rand = ra.nextInt((9999-1000+1)-1000);
        int clave = 0;
        for (int i=0; i<4; i++) {
            System.out.print("Ingresa la clave de la caja fuerte a continuacion: ");
            clave = sc.nextInt();
            if (clave == rand) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento esa no es la combinacion");
            }
        }
        sc.close();
    }
}