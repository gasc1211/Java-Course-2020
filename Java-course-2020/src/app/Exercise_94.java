package app;

import javax.swing.JOptionPane;

public class Exercise_94 {

    public static void main(String[] args) {

        String vn = JOptionPane.showInputDialog("Ingrese el numero (0 - 9999): ");
        String vf = "El valor final es: ";

        if (vn.length() < 5 && vn.length() > 0) {
            for (int i = vn.length() - 1; i >= 0; i--) {
                vf += vn.charAt(i);
            }
        } else {
            vf = "Fuera de rango";
        }

        JOptionPane.showMessageDialog(null, vf);

    }

}