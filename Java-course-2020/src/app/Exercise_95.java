package app;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercise_95 {
    public static void main(String[] args) {
        
        Random rndm =  new Random();
        int n, r = (rndm.nextInt(9)+ 1);
        String m = "";

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número entre 1 y 10:"));
            if (n > r) {
                m = "menor";
            } else if (n < r) {
                m = "mayor";
            }
            JOptionPane.showMessageDialog(null, "El número es " + m + ".", "Adivina", 1);
        } while (n != r);

        JOptionPane.showMessageDialog(null, "El número era: " + r + ".", "¡Acertaste!", 1);
    }    
}