package app;

import java.lang.Math;
public class Exercise_83{
    
    public static void main (String[] args){
        int vec[] = new int[100];
        for (int i=0; i<100; i++){
            vec[i] = (int) (Math.random()*(150-20+1)+20);
            if (vec[i]%2==0){
                System.out.printf("Par!\nPosicion: %d\nCuadrado: %d\n",i,vec[i]*vec[i]);
            }
        }
    }
}