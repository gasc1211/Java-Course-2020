package app;

import java.util.Random;
public class Exercise_86{
    public static void main (String[] args){
        Random ra = new Random();
        int num;
        int juan=0, manuel=0, irene=0;
        for (int i=0; i<100; i++){
            num = ra.nextInt(100-1+1)+1;
            if (num<34){
                juan++;
            } else if (num<77){
                manuel++;
            } else {
                irene++;
            }
        }
        if (juan>manuel && juan>irene){
            System.out.println("El ganador es Juan!");
        } else if (manuel>juan && manuel>irene){
            System.out.println("El ganador es Manuel!");
        } else {
            System.out.println("La ganadora es Irene!");        }
    }
}