package app;

import javax.swing.JOptionPane;

public class Exercise_94 {
    public static void main(String[] args) {
        
        String n = JOptionPane.showInputDialog(null, "Ingresa el número:");
        String r = "";

        for (int i = n.length() - 1; i >= 0; i--) {
            r += n.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "El número era: " + n + ".\n" + "El número invertido es: " + r, "Resultado", 1);
    }
}