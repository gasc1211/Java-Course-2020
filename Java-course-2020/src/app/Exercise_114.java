package app;

import javax.swing.JOptionPane;

public class Exercise_114 {
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        int positives = 0, negatives = 0, zeros = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número:"));
            if (numbers[i] == 0) {
                zeros++;
            } else if (numbers[i] > 0) {
                positives++;
            } else {
                negatives++;
            }
        }

        String message = String.format("Hay %d positivos.\nHay %d negativos.\nHay %d ceros.", positives, negatives, zeros);
        JOptionPane.showMessageDialog(null, message, "Resultados", 1);
    }
}