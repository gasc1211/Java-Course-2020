package app;

import java.util.Scanner;
import java.lang.Math;
public class Exercise_14{
    
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        Integer sum = 0;
        for (int i=0; i<10; i++){
            System.out.print("Ingrese el numero #" + (i+1) + ": ");
            sum = sum + sc.nextInt();
        }
        System.out.println("La suma es de: " + sum);
        System.out.println("El promedio es de: " + sum / 10);
        if (sum <= 100){
            for (int i=sum; i>0; i--){
                System.out.print(i + " - ");
            }
            System.out.println();
        } else {
            System.out.printf("La raiz cuadrada es de: %2f", Math.sqrt(sum));
        }
        sc.close();
    }

}