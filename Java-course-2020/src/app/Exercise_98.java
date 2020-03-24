package app;

import javax.swing.JOptionPane;

public class Exercise_98 {

    public static void main(String[] args) {
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo: "));
        double ded = sueldo * 0.035;
        double bono = 500.0;
        double total = sueldo - ded + bono;
        String msg = "El sueldo bruto es de: " + sueldo + "\nLas deducciones son: " + ded + "\nEl sueldo total es: "
                + total;
        JOptionPane.showMessageDialog(null, msg);
    }
}