// Programador: James Russell Cabrera Mejia #28
package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_126 extends JFrame {

    private static final long serialVersionUID = 8378542846522822976L;

    private String paises[] = { "Honduras", "Colombia", "Alemania", "Francia", "Paraguay" };
    private JFrame refval = this;
    private JLabel l1 = new JLabel("Nombre:");
    private JLabel l2 = new JLabel("Pais:");
    private JTextField nombre = new JTextField(15);
    private JComboBox seleccion = new JComboBox();
    private JButton aplicar = new JButton();

    public Exercise_126() {
        initComponents();
    }

    public void initComponents() {
        this.setResizable(false);
        this.setSize(300, 200);

        JPanel root = new JPanel();
        root.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        this.add(root);

        c.gridx = 0;
        c.gridy = 0;
        root.add(l1, c);

        c.gridx = 1;
        root.add(nombre, c);

        c.gridy = 1;
        for (String i:paises) {
            seleccion.addItem(i);
        }
        root.add(seleccion, c);

        c.gridx = 0;
        root.add(l2, c);

        c.gridy = 2;
        c.gridwidth = 2;
        aplicar.setText("Aplicar");
        root.add(aplicar, c);
        aplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pais = String.valueOf(seleccion.getSelectedItem());
                String nom = String.valueOf(nombre.getText());
                String res = pais + " - " + nom;
                refval.setTitle(res);
            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Exercise_126();
    }
}