package app;

import javax.swing.JOptionPane;

public class Exercise_98 {
    public static void main(String[] args) {
        
        float s = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa tu sueldo: ")), d = s * 0.035f, st = s - d + 500;

        JOptionPane.showMessageDialog(null,"Sueldo bruto: L. " + s + "\nDeducciones: L. " + d + "\nBono: L. 500.00" + "\nSueldo neto: L. " + st, "Sueldo", 3);

    }    
}