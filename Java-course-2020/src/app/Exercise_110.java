package app;

import javax.swing.JOptionPane;

public class Exercise_110 {
    public static void main(String[] args) {
        
        double n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número:"));

        Object[] options = {"Valor absoluto","Raíz quinta", "Calcular el cuadrado", "Calcular el cubo"};

        Object op = JOptionPane.showInputDialog(null, "Selecciona la operación a realizar:", "Calculadora", 1, null, options, options[0]);

        switch ((String) op) {
            case "Valor absoluto":
                n = Math.abs(n);
                break;
            case "Raíz quinta":
                n = Math.pow(n, (double)(1/5));
                break;
            case "Calcular el cuadrado":
                n = Math.pow(n, 2);
                break;
            case "Calcular el cubo":
                n = Math.pow(n, 3);
                break;
        }

        JOptionPane.showMessageDialog(null, String.format("%s\nEl resultado es: %.2f", op, n), "Resultado", 1);
    }
}
