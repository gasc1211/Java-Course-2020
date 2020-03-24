package app;

import javax.swing.JOptionPane;

public class Exercise_95 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        int ing = 0;
        do {
            ing = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if (ing == n) {
                JOptionPane.showMessageDialog(null, "Acertaste!");
            } else if (ing > n) {
                JOptionPane.showMessageDialog(null, "Es menor");
            } else if (ing < n) {
                JOptionPane.showMessageDialog(null, "Es mayor");
            }
        } while (ing != n);
    }
}