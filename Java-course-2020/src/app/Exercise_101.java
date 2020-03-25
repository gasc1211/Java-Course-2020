package app;

import javax.swing.JOptionPane;

public class Exercise_101 {
    public static void main(String[] args) {

        String time = JOptionPane.showInputDialog(null, "Ingresa la hora: "), m = "";
        byte hour = Byte.parseByte(time.substring(0, 2));

        if (hour >= 6 && hour <= 12) {
            m = "¡Buenos días!";
        } else if (hour >= 13 && hour <= 20) {
            m = "¡Buenas tardes!";
        } else if ((hour >= 21) || (hour >= 0 && hour <= 5)) {
            m = "¡Buenas noches!";
        }

        JOptionPane.showMessageDialog(null, m, "Saludo", 1);
    }
}