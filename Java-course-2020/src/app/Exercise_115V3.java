package app;

import javax.swing.JOptionPane;

public class Exercise_115V3 {
    public static void main(String[] args) {
        
        int n;
        String message;
        Boolean dontContinue;

        do {

            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número: "));
            
            if (n < 0) {
                message = "El número que ingresaste es negativo";
            } else if (n > 0) {
                message = "El número que ingresaste es positivo";
            } else {
                message = "El número que ingresaste es cero.";
            }

            if (n % 2 == 0 && n != 0) {
                message += " y es par.";
            } else if (n % 2 != 0){
                message += " y es impar.";
            }

            JOptionPane.showMessageDialog(null, message, "Resultados", 1);

            dontContinue = JOptionPane.showInputDialog(null, "¿Deseas continuar? (S/N) ").toUpperCase().equals("N") ? true : false;

        } while (!dontContinue);
    }
}