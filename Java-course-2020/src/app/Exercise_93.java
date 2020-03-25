package app;

import javax.swing.JOptionPane;

public class Exercise_93 {
    public static void main(String[] args) {
        
        int r = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero a retirar:"));
        int b[] = {500, 100, 50, 20, 10, 5, 2, 1};
        int cb[] = new int[b.length];
        int rc = r;
        
        for (int i = 0; i < b.length; i++) {
            cb[i] = (rc - (rc % b[i])) / b[i];
            rc = r % b[i];
        }

        String m = "";

        for (int i = 0; i < b.length; i++) {
            m += b[i] + " : " + cb[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, m, "Fraccionaria", 3);
    
    }
}