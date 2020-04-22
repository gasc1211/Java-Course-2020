package app;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise_117 implements ActionListener{

    public static Font textFont = new Font("Arial", Font.PLAIN, 16);
    public static Font titleFont = new Font("Arial", Font.BOLD, 18);

    public static JTextField cel = new JTextField(8);
    public static JTextField fah = new JTextField(8);

    public static JButton calcular = new JButton("Calcular");
    public static JButton limpiar = new JButton("Limpiar");

    public Exercise_117() {
        JFrame root = new JFrame();
        root.setTitle("Conversor a grados Fahrenheit");
        root.setSize(400, 200);
        root.setResizable(false);
        
        JPanel frame = new JPanel(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();

        con.insets = new Insets(5, 5, 5, 5);

        JLabel titulo = new JLabel();
        titulo.setFont(titleFont);
        titulo.setText("Conversor a Fahrenheit");
        con.fill = GridBagConstraints.CENTER;
        con.gridx = 0;
        con.gridy = 0;
        con.gridwidth = 3;
        frame.add(titulo, con);

        JLabel lb1 = new JLabel("Celsius: ");
        lb1.setFont(textFont);
        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridy = 1;
        con.gridwidth = 1;
        frame.add(lb1, con);

        cel.setFont(textFont);
        con.gridx = 1;
        con.anchor = GridBagConstraints.LINE_END;
        frame.add(cel, con);

        JLabel lb2 = new JLabel("Fahrenheit: ");
        lb2.setFont(textFont);
        con.gridy = 2;
        con.gridx = 0;
        con.anchor = GridBagConstraints.CENTER;
        frame.add(lb2, con);

        fah.setFont(textFont);
        fah.setEnabled(false);
        con.gridx = 1;
        con.anchor = GridBagConstraints.LINE_END;
        frame.add(fah, con);

        calcular.setFont(titleFont);
        calcular.addActionListener(this);
        con.gridx = 2;
        con.gridy = 1;
        frame.add(calcular, con);

        limpiar.setFont(titleFont);
        limpiar.addActionListener(this);
        con.gridy = 2;
        frame.add(limpiar, con);

        root.add(frame);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_117();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcular) {
            Double temp = Double.parseDouble(cel.getText());

            temp = (temp * 9/5) + 32;
            fah.setText(Double.toString(temp));

            if (temp >= 86.0) {
                fah.setBackground(Color.RED);
            } else {
                fah.setBackground(Color.BLUE);
            }
        } else if (e.getSource() == limpiar) {
            fah.setText("");
            cel.setText("");
            fah.setBackground(Color.WHITE);
        }
    }

}