package app;

import javax.swing.JOptionPane;

public class Exercise_88 {
    public static void main(String[] args) {
        
        Object colors[] = {"red", "green", "blue", "yellow"};

        String opt = JOptionPane.showInputDialog(null, "Select a color:", "Colors", JOptionPane.QUESTION_MESSAGE, null, colors, colors[0]).toString();

        JOptionPane.showMessageDialog(null, "You have chosen " + opt +".", "Colors", JOptionPane.INFORMATION_MESSAGE);
        
    }
}