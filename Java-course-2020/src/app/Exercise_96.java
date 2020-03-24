package app;

import javax.swing.JOptionPane;

public class Exercise_96 {
    public static void main(String[] args) {
        
        double w = (Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu peso en lbs.:"))) / 2.2f, h = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu altura en metros:")), imc = w/Math.pow(h, 2);
        
        JOptionPane.showMessageDialog(null, "Tu índice de masa corporal es de: " + (Math.round(imc * 100) / 100), "Índice de Masa Corporal", 3);
    }
}