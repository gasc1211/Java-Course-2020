package app;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise_104 {

    ImageIcon icon;
    int asciiChar;

    Exercise_104 () {
        this.icon = new ImageIcon("./Java-course-2020/images/nyancat.png");
        this.asciiChar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número:", "ASCII", 1));
    }

    public void showAscii () {
        int option = JOptionPane.showConfirmDialog(null, "¿Quieres ver el equivalente ASCII?", "ASCII", JOptionPane.YES_NO_OPTION);

        if (option == 0) {
            JOptionPane.showMessageDialog(null, String.format("El caracter ASCII correspondiente es: '%c'", (char) asciiChar), "ASCII", 1, icon);
        }
    }
    public static void main(String[] args) {

        Exercise_104 e104 = new Exercise_104();
        e104.showAscii();

    }
}