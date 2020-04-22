package app;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise_117 {

    public static Font myFont = new Font("Arial", Font.PLAIN, 16);

    public static JTextField cel = new JTextField(5);

    public Exercise_117() {
        JFrame root = new JFrame();
        root.setTitle("Conversor a grados Fahrenheit");
        root.setSize(500, 500);
        root.setResizable(false);
        
        JPanel frame = new JPanel(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();

        JLabel titulo = new JLabel();
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setText("Conversor a Fahrenheit");
        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridx = 0;
        con.gridy = 0;
        con.gridwidth = 3;
        frame.add(titulo, con);

        JLabel lb1 = new JLabel("Celsius: ");
        lb1.setFont(myFont);
        con.gridy = 1;
        con.gridwidth = 1;
        frame.add(lb1, con);

        cel.setFont(myFont);
        con.gridx = 1;
        frame.add(cel, con);

        root.add(frame);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_117();
    }

}