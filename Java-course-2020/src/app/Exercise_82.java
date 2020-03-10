package app;

import java.util.Random;
public class Exercise_82{

    public static void main (String[] args){
        Random ra = new Random();
        int dado1, dado2;
        int intentos = 0;
        do{
            dado1 = ra.nextInt(6-1+1)+1;
            dado2 = ra.nextInt(6-1+1)+1;
            intentos++;
        }while(dado1+dado2!=11);
        System.out.printf("Tomo %d intentos lograr el 11 en los dados!\n",intentos);
    }
}