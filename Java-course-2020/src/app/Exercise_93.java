package app;

import javax.swing.JOptionPane;
public class Exercise_93 {

    public static void main (String[] args) {

        int billetes[] = {500, 100, 50, 20, 10, 5, 2, 1};
        int bill[] = new int[8];

        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
        int cache = cant;

        for (int i=0; i < 8; i++) {
            bill[i] = (cache - (cache % billetes[i])) / billetes[i];
            cache = cant % billetes[i];
        }

        String msg = "";
        for (int i=0; i<8; i++) {
            msg += "Cantidad de billetes de " + billetes[i] + ": " + bill[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, msg);
    }

}