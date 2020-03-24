package app;

import javax.swing.JOptionPane;

public class Exercise_87 {
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter numbre one: ")), n2  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter numbre two: "));

        JOptionPane.showMessageDialog(null, "El mayor es " +Math.max(n1, n2) + ".", "Resultado", 1);

    }
}