package app;

import javax.swing.JOptionPane;

public class Exercise_102 {
    public static void main(String[] args) {
       
        String q[] = {"¿Qué significa html?", "¿Qué significa css?", "¿Qué sistema es el actual estándar en redes?", "¿Qué empresa inventó java?", "¿Qué lenguaje de programación se usa en las páginas web?", "¿Cuáles son los tipos de redes según el medio que usan?", "¿Qué significa PDU?", "¿Qué significa TCP?", "¿Qué significa IP?", "¿Qué significa MAC?"};

        String a[] = {"hyper text markup language", "cascading style sheets", "TCP/IP", "Sun Microsystems", "Javascript", "inalámbricas y cableadas", "protocol data unit", "transmission control protocol", "internet protocol", "media access control"};

        String ua[] = new String[10];

        for (int i = 0; i < a.length; i++) {
            ua[i] = JOptionPane.showInputDialog(null, q[i]);
        }

        byte g = 0;

        for (int i = 0; i < a.length; i++) {
            if( a[i].equals(ua[i])) {
                g++;
            }
        }

        JOptionPane.showMessageDialog(null, "Tu nota es de: " + g + "/10.", "Resultado", 1);

    }
}