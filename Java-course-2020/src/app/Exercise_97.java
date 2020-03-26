package app;

import javax.swing.JOptionPane;

public class Exercise_97 {
    public static void main(String[] args) {
        
        float p = 400f, d = 0.15f;
        int q = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de camisas a comprar: "));

        float st = q * p, dis = st * d, t = st - dis;

        String m = "Subtotal: " + String.format("L. %.2f", st) + "\nDescuento: " + String.format("L. %.2f", dis) + "\nTotal: " + String.format("L. %.2f", t);

        JOptionPane.showMessageDialog(null, m , "Factura", 1);
    }
} 