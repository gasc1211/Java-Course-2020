package app;

import java.util.Random;
public class Exercise_84{
    
    public static void main(String[] args){
        Random ra = new Random();
        int vec[] = new int[100];
        for (int i=0; i<100; i++){
            vec[i] = ra.nextInt(500-100+1)+100;
            String num = Integer.toString(vec[i]);
            if (num.charAt(num.length()-1) == '2' || num.charAt(num.length()-1) == '6' ){
                System.out.print(vec[i]+" - ");
            }
        }
        System.out.println();
    }
}