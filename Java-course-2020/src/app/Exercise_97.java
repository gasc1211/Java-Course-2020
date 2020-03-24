package app;

import javax.swing.JOptionPane;

public class Exercise_97 {
    public static void main(String[] args) {
        
        float p = 400f, d = 0.15f;
        int q = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de camisas a comprar: "));

        float st = q * p, dis = st * d, t = st - dis;

        JOptionPane.showMessageDialog(null, "Subtotal: L. " + st + "\nDescuento: L. " + dis + "\nTotal: L. " + t, "Factura", 3);
    }
}