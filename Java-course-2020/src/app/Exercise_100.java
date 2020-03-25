package app;

import javax.swing.JOptionPane;

public class Exercise_100 {
    public static void main(String[] args) {
        
        String day = JOptionPane.showInputDialog(null, "Ingresa el día de la semana:").toLowerCase(), m = "";
        
        switch (day) {
            case "lunes":
            case "martes":
            case "miércoles":
                m = "Laboratorio";
                break;
            case "jueves":
                m = "Diseño Web";
                break;
            case "viernes":
                m = "Programación";
                break;
        }

        JOptionPane.showMessageDialog(null, "La primera clase del " + day + " es " + m + ".", "Clases", 1);

    }    
}