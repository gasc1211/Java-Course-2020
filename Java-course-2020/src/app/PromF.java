package app;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PromF implements ActionListener {

    private static Font myFont = new Font("Arial", Font.PLAIN, 16);

    private static JTextField name = new JTextField(20);
    private static JTextField n1 = new JTextField(5);
    private static JTextField n2 = new JTextField(5);
    private static JTextField n3 = new JTextField(5);
    private static JTextField n4 = new JTextField(5);
    private static JTextField promedio = new JTextField(5);
    private static JTextField observacion = new JTextField(20);

    private static JButton calcular = new JButton("Calcular");
    private static JButton limpiar = new JButton("Limpiar");

    public PromF() {

        JFrame root = new JFrame();
        root.setTitle("Promedio de alumnos");
        root.setSize(600, 400);
        root.setResizable(false);

        JPanel frame = new JPanel();
        frame.setLayout(null);

        // Data
        JLabel titulo = new JLabel("Promedio");
        titulo.setFont(new Font("Arial", Font.PLAIN, 24));
        titulo.setBounds(236, 12, 128, 24);
        frame.add(titulo);

        JLabel lname = new JLabel("Nombre: ");
        lname.setFont(myFont);
        lname.setBounds(24, 60, 128, 24);
        frame.add(lname);

        name.setFont(myFont);
        name.setBounds(128, 60, 128, 24);
        frame.add(name);

        JLabel ln1 = new JLabel("Nota 1:");
        ln1.setFont(myFont);
        ln1.setBounds(24, 100, 128, 24);
        frame.add(ln1);

        n1.setFont(myFont);
        n1.setBounds(128, 100, 128, 24);
        frame.add(n1);

        JLabel ln2 = new JLabel("Nota 2:");
        ln2.setFont(myFont);
        ln2.setBounds(24, 140, 128, 24);
        frame.add(ln2);

        n2.setFont(myFont);
        n2.setBounds(128, 140, 128, 24);
        frame.add(n2);

        JLabel ln3 = new JLabel("Nota 3:");
        ln3.setFont(myFont);
        ln3.setBounds(24, 180, 128, 24);
        frame.add(ln3);

        n3.setFont(myFont);
        n3.setBounds(128, 180, 128, 24);
        frame.add(n3);

        JLabel ln4 = new JLabel("Nota 4:");
        ln4.setFont(myFont);
        ln4.setBounds(24, 220, 128, 24);
        frame.add(ln4);

        n4.setFont(myFont);
        n4.setBounds(128, 220, 128, 24);
        frame.add(n4);

        JLabel lpr = new JLabel("Promedio:");
        lpr.setFont(myFont);
        lpr.setBounds(24, 260, 128, 24);
        frame.add(lpr);

        promedio.setFont(myFont);
        promedio.setBounds(128, 260, 128, 24);
        promedio.setEnabled(false);
        frame.add(promedio);

        JLabel lob = new JLabel("Observacion:");
        lob.setFont(myFont);
        lob.setBounds(24, 300, 128, 24);
        frame.add(lob);

        observacion.setFont(myFont);
        observacion.setBounds(128, 300, 128, 24);
        observacion.setEnabled(false);
        frame.add(observacion);

        calcular.addActionListener(this);
        calcular.setBounds(400, 60, 128, 24);
        frame.add(calcular);

        limpiar.addActionListener(this);
        limpiar.setBounds(400, 100, 128, 24);
        frame.add(limpiar);

        // Show
        root.add(frame);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setVisible(true);
    }

    public static void main(String[] args) {
        new PromF();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcular) {
            double prom = 0.0;
            String obs = "";
            double values[] = { Double.parseDouble(n1.getText()), Double.parseDouble(n2.getText()),
                    Double.parseDouble(n3.getText()), Double.parseDouble(n4.getText()) };

            for (int x = 0; x < values.length; x++) {
                prom += values[x];
            }
            prom /= 4;

            if (prom < 50) {
                obs = "Insuficiente";
                promedio.setBackground(Color.RED);
            } else if (prom < 70) {
                promedio.setBackground(Color.RED);
                obs = "Reprobado";
            } else if (prom < 80) {
                obs = "Bueno";
            } else if (prom < 91) {
                obs = "Muy Bueno";
            } else {
                obs = "Sobresaliente";
            }

            promedio.setText(Double.toString(prom));
            observacion.setText(obs);

        } else if (e.getSource() == limpiar) {
            name.setText("");
            n1.setText("");
            n2.setText("");
            n3.setText("");
            n4.setText("");
            promedio.setText("");
            observacion.setText("");

            promedio.setBackground(Color.WHITE);
        }
    }
}