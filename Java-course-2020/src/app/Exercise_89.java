package app;

import javax.swing.JOptionPane;
public class Exercise_89{

    public static void main (String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        String frase = "El valor es: ";
        if (num>5 && num<10){
            frase = frase + (num * num);
        } else {
            frase = frase + num;
        }
        JOptionPane.showMessageDialog(null,frase);
    }
}