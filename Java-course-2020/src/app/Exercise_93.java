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

        JOptionPane.showMessageDialog(null, b[0] + " : " + cb[0] + "\n" + b[1] + " : " + cb[1] + "\n" +  b[2] + " : " + cb[2] + "\n" + b[3] + " : " + cb[3] + "\n" + b[4] + " : " + cb[4] + "\n" + b[5] + " : " + cb[5] + "\n" +  b[6] + " : " + cb[6] + "\n" +  b[7] + " : " + cb[7] + "\n", "Fraccionaria", 3);
    
    }
}