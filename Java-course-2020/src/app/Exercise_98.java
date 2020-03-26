 package app;

import javax.swing.JOptionPane;

public class Exercise_98 {
    public static void main(String[] args) {
        
        float s = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa tu sueldo: ")), d = s * 0.035f, st = s - d + 500;

        String m = "Sueldo bruto: " + String.format("L. %.2f", s) + "\nDeducciones: " + String.format("L. %.2f", d) + "\nBono: L. 500.00" + "\nSueldo neto: " + String.format("L. %.2f" ,st);

        JOptionPane.showMessageDialog(null, m, "Sueldo", 3);

    }    
}