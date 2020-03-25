package app;

import javax.swing.JOptionPane;

public class Exercise_102 {
    public static void main(String[] args) {
       
        String q[] = {JOptionPane.showInputDialog(null, "¿Qué significa html?"), 
        JOptionPane.showInputDialog(null, "¿Qué significa css?"), 
        JOptionPane.showInputDialog(null, "¿Qué sistema es el actual estándar en redes?"), 
        JOptionPane.showInputDialog(null, "¿Qué empresa inventó java?"), 
        JOptionPane.showInputDialog(null, "¿Qué lenguaje de programación se usa en las páginas web?"), 
        JOptionPane.showInputDialog(null, "¿Cuáles son los tipos de redes según el medio que usan?"),
        JOptionPane.showInputDialog(null, "¿Qué significa PDU?"),
        JOptionPane.showInputDialog(null, "¿Qué significa TCP?"),
        JOptionPane.showInputDialog(null, "¿Qué significa IP?"),
        JOptionPane.showInputDialog(null, "¿Qué significa MAC?")};

        String a[] = {"hyper text markup language", "cascading style sheets", "TCP/IP", "Sun Microsystems", "Javascript", "inalámbricas y cableadas", "protocol data unit", "transmission control protocol", "internet protocol", "media access control"};

        byte g = 0;

        for (int i = 0; i < a.length; i++) {
            if( a[i].equals(q[i])) {
                g++;
            }
        }

        JOptionPane.showMessageDialog(null, "Tu nota es de: " + g + "/10.", "Resultado", 1);

    }
}