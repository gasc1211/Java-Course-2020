package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_116 implements ActionListener {

    private static JTextField txt_name = new JTextField(25);
    private static JTextField txt_n1 = new JTextField(3);
    private static JTextField txt_n2 = new JTextField(3);
    private static JTextField txt_n3 = new JTextField(3);
    private static JTextField txt_n4 = new JTextField(3);
    private static JTextField txt_average = new JTextField(3);
    private static JTextField txt_result = new JTextField(20);

    private static JButton btn_clean = new JButton("Limpiar");
    private static JButton btn_calculate = new JButton("Calcular");    

    public Exercise_116() {

        // Frame initialization

        JFrame frame = new JFrame();
        frame.setTitle("Promedio");
        frame.setSize(396, 264);
        frame.setResizable(false);

        // Panel initialization

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Name Input

        JLabel lbl_name = new JLabel("Nombre:");
        lbl_name.setBounds(60, 24, 48, 24);
        panel.add(lbl_name);

        txt_name.setBounds(128, 24, 196, 24);
        panel.add(txt_name);

        // Grades Input

        JLabel lbl_n1 = new JLabel("Nota 1:");
        lbl_n1.setBounds(60, 60, 48, 24);
        panel.add(lbl_n1);

        txt_n1.setBounds(128, 60, 60, 24);
        panel.add(txt_n1);

        JLabel lbl_n2 = new JLabel("Nota 2:");
        lbl_n2.setBounds(60, 96, 48, 24);
        panel.add(lbl_n2);

        txt_n2.setBounds(128, 96, 60, 24);
        panel.add(txt_n2);

        JLabel lbl_n3 = new JLabel("Nota 3:");
        lbl_n3.setBounds(204, 60, 48, 24);
        panel.add(lbl_n3);

        txt_n3.setBounds(264, 60, 60, 24);
        panel.add(txt_n3);

        JLabel lbl_n4 = new JLabel("Nota 4:");
        lbl_n4.setBounds(204, 96, 48, 24);
        panel.add(lbl_n4);

        txt_n4.setBounds(264, 96, 60, 24);
        panel.add(txt_n4);

        // Buttons

        btn_calculate.addActionListener(this);
        btn_calculate.setBounds(60, 144, 84, 24);
        panel.add(btn_calculate);

        btn_clean.addActionListener(this);
        btn_clean.setBounds(60, 180, 84, 24);
        panel.add(btn_clean);

        // Result

        txt_average.setEnabled(false);
        txt_average.setBounds(156, 144, 60, 24);
        panel.add(txt_average);

        txt_result.setEnabled(false);
        txt_result.setBounds(228, 144, 96, 24);
        panel.add(txt_result);

        // Final tweaks

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_116();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_calculate) {
            int[] n = { Integer.parseInt(txt_n1.getText()), Integer.parseInt(txt_n2.getText()),
                Integer.parseInt(txt_n3.getText()), Integer.parseInt(txt_n4.getText()) };

        float average = 0f;
        String result;

        for (int i : n) {
            average += i;
        }

        average /= 4;

        if (average < 50) {
            result = "Insuficiente";
        } else if (average < 70) {
            txt_average.setBackground(Color.RED);
            result = "Reprobado";
        } else if (average < 80) {
            result = "Bueno";
        } else if (average < 91) {
            result = "Muy Bueno";
        } else {
            result = "Sobresaliente";
        }

        txt_result.setText(result);
        txt_average.setText(Float.toString(average));

        } else if (e.getSource() == btn_clean) {

            txt_name.setText("");
            txt_n1.setText("");
            txt_n2.setText("");
            txt_n3.setText("");
            txt_n4.setText("");
            txt_average.setText("");
            txt_average.setBackground(Color.WHITE);
            txt_result.setText("");

        }
    }
}