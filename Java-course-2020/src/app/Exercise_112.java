package app;

import javax.swing.JOptionPane;

public class Exercise_112 {
    public static void main(String[] args) {
        
        String message;
        
        for (int i = 0; i < 100000; i++) {
            message = String.format("%05d", i).replace('3', 'E');
            JOptionPane.showMessageDialog(null, message, "Contador", 1);
        }

    }
}