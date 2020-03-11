package app;

import javax.swing.JOptionPane;
public class Exercise_87{

    public static void main (String[] args){
        int e1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer entero: "));
        int e2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo entero: "));
        String msg="";
        if (e1>e2){
            msg = "El mayor es: " + Integer.toString(e1);
        } else if (e2>e1){
            msg = "El mayor es: " + Integer.toString(e2);
        } else {
            msg = "Ambos son iguales";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}