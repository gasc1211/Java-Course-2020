package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_122 extends JFrame {

    private Font myFont = new Font("Arial", Font.PLAIN, 16);
    private Font tFont = new Font("Arial", Font.BOLD, 18);
    
    private JLabel titulo = new JLabel();
    
    public Exercise_122() {
        initComponents();
    }

    private void initComponents() {

        this.setResizable(false);
        this.setSize(600, 400);
        this.setTitle("Europa");

        JPanel root = new JPanel();
        root.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        con.insets = new Insets(5, 5, 5 ,5);
        con.anchor = GridBagConstraints.CENTER;
        this.add(root);

        titulo.setText("Capital del país");
        titulo.setFont(tFont);
        con.gridx = 0;
        con.gridy = 0;
        root.add(titulo, con);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_122();
    }

}
