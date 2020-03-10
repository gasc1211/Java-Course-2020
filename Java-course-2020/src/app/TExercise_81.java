package app;

import java.util.Random;
public class TExercise_81{

    public static void main (String[] args){
        int dado;
        int[] resultados = {0, 0, 0, 0, 0, 0};
        Random ra = new Random();
        for (int i=0; i<100; i++){
            dado = ra.nextInt(6-1+1)+1;
            switch (dado){
                case 1:
                    resultados[0] = resultados[0] + 1;
                    break;
                case 2:
                    resultados[1] = resultados[1] + 1;
                    break;
                case 3:
                    resultados[2] = resultados[2] + 1;
                    break;
                case 4:
                    resultados[3] = resultados[3] + 1;
                    break;
                case 5:
                    resultados[4] = resultados[4] + 1;
                    break;
                case 6:
                    resultados[5] = resultados[5] + 1;
                    break;
                    
            }
        }
        System.out.printf("Cara 1: %d\nCara 2: %d\nCara 3: %d\nCara 4: %d\nCara 5: %d\nCara 6: %d\n", resultados[0], resultados[1], resultados[2], resultados[3], resultados[4], resultados[5]);
    }
}