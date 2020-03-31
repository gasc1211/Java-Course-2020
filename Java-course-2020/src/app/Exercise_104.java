package app;

import javax.swing.JOptionPane;

public class Exercise_104 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        char output = (char)(num);
        String msg = "El numero " + num + " devuelve el caracter: " + output;
        int saber = JOptionPane.showConfirmDialog(null, "Desea ver el caracter?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (saber==0) {
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}