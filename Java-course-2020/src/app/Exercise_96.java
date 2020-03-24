package app;

import javax.swing.JOptionPane;

public class Exercise_96 {
    public static void main(String[] args) {
        double pesolb = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso en libras: "));
        double pesokg = pesolb*2.2;
        double estatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en metros: "));
        estatura = estatura * estatura;
        double pmi = pesokg/estatura;
        String msg = "El PMI es de: "+pmi;
        JOptionPane.showMessageDialog(null, msg);
    }
}