package app;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercise_95 {
    public static void main(String[] args) {
        
        Random rand =  new Random();
        int n, r = (rand.nextInt(9)+ 1);
        System.out.println(r);

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número entre 1 y 10:"));
            if (n > r) {
                JOptionPane.showMessageDialog(null, "El número es menor.", "Adivina", 3);
            } else if (n < r) {
                JOptionPane.showMessageDialog(null, "El número es mayor.", "Adivina", 3);
            }
        } while (n != r);

        JOptionPane.showMessageDialog(null, "El número era: " + r + ".", "¡Acertaste!", 3);
    }    
}