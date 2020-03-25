package app;

import java.util.Scanner;

public class Exercise_102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuestionario: ");
        String[] preguntas = { "Java es un lenguaje de alto o bajo nivel?", "Que version de HTML es la actual?",
                "Palabra para definir una variable numerica sin decimales",
                "Titulo que fue otorgado al creador de la World Wide Web", "Que RJ es el cable ethernet tradicional?",
                "Nombre con el que se le llamo a la ARPANET", "Nombre del protocolo de internet seguro",
                "Nombre para dibujos de vectores en HTML",
                "Nombre del lenguaje que se usa para dar estilos a las paginas web", "OSI es un" };
        String r;
        int puntos = 0;
        String respuestas[] = { "alto", "5", "int", "45", "internet", "https", "svg", "css", "modelo" };

        for (int i = 0; i < 9; i++) {
            System.out.println(preguntas[i] + ": ");
            r = sc.nextLine();
            if (r.equals(respuestas[i])) {
                puntos++;
            }
        }

        System.out.println("La cantidad de puntos es: " + puntos);
        sc.close();
    }
}