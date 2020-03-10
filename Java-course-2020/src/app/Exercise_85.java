package app;

import java.util.Random;
import java.util.Scanner;
public class Exercise_85{

    public static void main (String[] args){
        Random ra = new Random ();
        Scanner sc = new Scanner(System.in);
        char cont = 'S';
        do{
            int A = ra.nextInt(100-10+1)+10;
            int B = ra.nextInt(100-10+1)+10;
            while (A == B){
                B = ra.nextInt(100-10+1)+10;
            }
            System.out.print("A o B?: ");
            char val = sc.next().charAt(0);
            char may;
            int ga=0, pe=0;
            if (A>B){
                may = 'A';
            } else {
                may = 'B';
            }
            if (val == may){
                System.out.println("Acertaste!");
            } else {
                System.out.println("Fallaste!");
            }
            System.out.printf("Ganadas: %d\nPerdidas: %d\n",ga,pe);
            System.out.print("Continuar? (S/N): ");
            cont = sc.next().toUpperCase().charAt(0);
        } while (cont == 'S');
        sc.close();
    }
}