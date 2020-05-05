package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_122 extends JFrame {

    private Font myFont = new Font("Arial", Font.PLAIN, 16);
    private Font tFont = new Font("Arial", Font.BOLD, 18);
    
    private JLabel titulo = new JLabel();
    private JComboBox cpais = new JComboBox();
    private JTextField ccapital = new JTextField(12);

    private String paises[] = {"Alemania","Italia","Grecia","Suecia","Rusia","Noruega","Francia","Polonia","España","Inglaterra"};
    
    public Exercise_122() {
        initComponents();
    }

    private void initComponents() {

        this.setResizable(false);
        this.setSize(400, 150);
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
        con.gridwidth = 2;
        root.add(titulo, con);

        for (String i:paises) {
            cpais.addItem(i);
        }

        cpais.setFont(myFont);
        con.gridx = 0;
        con.gridy = 1;
        con.gridwidth = 1;
        con.anchor = GridBagConstraints.LINE_START;
        root.add(cpais, con);

        ccapital.setEnabled(false);
        ccapital.setFont(myFont);
        ccapital.setText("Berlín");
        con.gridx = 1;
        con.gridy = 1;
        root.add(ccapital, con);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_122();
    }

}
