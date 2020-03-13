package app;

import javax.swing.JOptionPane;

public class Exercise_92 {
    public static void main(String[] args) {

        int n[] = new int[3], cache;

        do {
            n[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número 1: "));
            n[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número 2: "));
            n[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número 3: "));

            for (int i = 0; i < n.length; i++) {
                for (int j = i+1; j < n.length; j++) {
                    if (n[j] > n[i]) {
                        cache = n[i];
                        n[i] = n[j];
                        n[j] = cache;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "El valor central es de: " + n[1], "Resultado", 3);

        } while ((n[0] + n[1] + n[2]) != 15);


    }
}