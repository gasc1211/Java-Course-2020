package app;

import javax.swing.JOptionPane;

public class Exercise_99 {
    public static void main(String[] args) {
        
        float n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la nota del primer examen(40%):")), m = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la media que deseas obtener:")), n2 = m - n1;

        JOptionPane.showMessageDialog(null, "Necesitas una nota de " + n2 + " para lograr la media que deseas obtener.", "Notas", 1);

    }  
}