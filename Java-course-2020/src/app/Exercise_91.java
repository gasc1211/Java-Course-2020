package app;

import javax.swing.JOptionPane;

public class Exercise_91 {
    public static void main(String[] args) {
        
        float p = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el precio del auto: "));

        if (p < 500000f) {
            p *= 0.9f;
        } else if (p > 550000f && p < 700000) {
            p *= 0.85f;
        } else {
            p *= 0.8f;
        }

        JOptionPane.showMessageDialog(null, "El precio final es de: L. " + p, "Resultado", 3);
    }
}