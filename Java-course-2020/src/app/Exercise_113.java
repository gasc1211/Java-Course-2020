package app;

import javax.swing.JOptionPane;

public class Exercise_113 {
    public static void main(String[] args) {
        
        int numberOfStudents  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de alumnos de la clase:"));
        double[] studentAge = new double[numberOfStudents];
        double averageAge = 0;
        int aboveAverage = 0, belowAverage = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            studentAge[i] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Ingresa la edad del alumno %d:", i+1)));
            averageAge += studentAge[i];
        }

        averageAge /= numberOfStudents;

        for (int i = 0; i < studentAge.length; i++) {
            if  (studentAge[i] > averageAge) {
                aboveAverage++;
            } else {
                belowAverage++;
            }
        }

        JOptionPane.showMessageDialog(null, String.format("La media de edad de los alumnos es %.0f.\nAlumnos por debajo de la media: %d.\nAlumnos por arriba de la media: %d.", averageAge, aboveAverage, belowAverage), "Resultados", 1);

    }
}