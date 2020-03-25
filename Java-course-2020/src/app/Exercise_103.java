package app;

import javax.swing.JOptionPane;

public class Exercise_103 {
    public static void main(String[] args) {
        
        int c = 1234, ic;

        for (int i = 0; i < 4; i++) {
            ic  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la combinación: "));
            if (c == ic) {
                JOptionPane.showMessageDialog(null, "¡Combinación Correcta!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "¡Combinación Incorrecta! \n Inténtalo de nuevo.\n Tienes " + (3 - i) + " intentos restantes.");
            }
        }

    }    
}