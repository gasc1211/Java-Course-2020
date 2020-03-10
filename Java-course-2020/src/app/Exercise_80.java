package app;

import java.util.Random;
public class Exercise_80{

    public static void main (String[]args){
        Random ra = new Random();
        double num = ra.nextDouble();
        System.out.println(num);
        if (num<0.5){
            System.out.println("Debajo de la mesa!");
        } else {
            System.out.println("Hello friend");
        }
    }
}