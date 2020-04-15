package app;

import javax.swing.JOptionPane;

public class Exercise_115V1 {
    public static void main(String[] args) {
        
        int n = 1;
        String message;

        while (n != 0) {
           
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número: "));
            
            if (n < 0) {
                message = "El número que ingresaste es negativo";
            } else if (n > 0) {
                message = "El número que ingresaste es positivo";
            } else {
               break;
            }

            if (n % 2 == 0) {
                message += " y es par.";
            } else {
                message += " y es impar.";
            }

            JOptionPane.showMessageDialog(null, message, "Resultados", 1);

        }

    }
}