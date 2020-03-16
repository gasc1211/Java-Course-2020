package app;

import javax.swing.JOptionPane;
public class Exercise_90{
    
    public static void main (String[] args){
        Object[] opts = {"suma","resta","multiplicacion","division","residuo"};
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2:"));
        double total = 0;
        String frase = "El resultado es: ";
        Object op = JOptionPane.showInputDialog(null, "Ingrese la operacion a realizar", "Operacion", JOptionPane.QUESTION_MESSAGE, null, opts, opts[0]);
        if (op == "suma"){
            total = n1+n2;
        } else if (op == "resta"){
            total = n1-n2;
        } else if (op == "multiplicacion"){
            total = n1*n2;
        } else if (op == "division"){
            total = n1/n2;
        } else if (op == "residuo"){
            total = n1%n2;
        }
        frase = frase + total;
        JOptionPane.showMessageDialog(null,frase);
    }
}