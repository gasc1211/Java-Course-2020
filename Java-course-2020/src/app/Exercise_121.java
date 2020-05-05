package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_121 extends javax.swing.JFrame {

    private static final long serialVersionUID = 8378210056333509452L;
    
    private JButton btn_auth;
    private String author = "Gabriel Alejandro Suazo Castro #24";
    private JLabel lbl_auth;
    private JLabel lbl_color;
    private JLabel lbl_align;
    private JLabel lbl_font;
    private JRadioButton rad_red;
    private JRadioButton rad_green;
    private JRadioButton rad_left;
    private JRadioButton rad_center;
    private JRadioButton rad_right;
    private JRadioButton rad_bold;
    private JRadioButton rad_curs;
    private JTextField txt_;

    public Exercise_121 () {
        initComponents();
    }

    private void initComponents() {
        
        // Frame initial setup

        this.setTitle("Ejercicio 1");
        this.setSize(480, 360);
        this.setResizable(false);

        // Panel & GridBag Layout setup

        Container panel = this.getContentPane();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 10, 5, 10);

        // Label

        constraints.anchor = GridBagConstraints.LINE_START;
        
        lbl_auth = new JLabel("Conoce al autor:");
        constraints.gridx = 3;
        constraints.gridy = 5;
        panel.add(lbl_auth, constraints);

        lbl_color = new JLabel("Cambia el color de fondo:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        panel.add(lbl_color, constraints);

        lbl_align = new JLabel("Cambia la alineación del texto:");
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        panel.add(lbl_align, constraints);

        lbl_font = new JLabel("Cambia el tipo de fuente:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        panel.add(lbl_font, constraints);

        // Radiobuttons

        rad_red = new JRadioButton("Rojo");
        rad_red.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                txt_.setBackground(Color.RED);
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(rad_red, constraints);

        rad_green = new JRadioButton("Verde");
        rad_green.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                txt_.setBackground(Color.GREEN);
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(rad_green, constraints);

        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(rad_red);
        colorGroup.add(rad_green);

        rad_bold = new JRadioButton("Negrita");
        rad_bold.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                txt_.setFont(new Font("Fira Code", Font.BOLD, 18));
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(rad_bold, constraints);

        rad_curs = new JRadioButton("Cursiva");
        rad_curs.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                txt_.setFont(new Font("Fira Code", Font.ITALIC, 18));
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 6;
        panel.add(rad_curs, constraints);

        ButtonGroup fontGroup = new ButtonGroup();
        fontGroup.add(rad_curs);
        fontGroup.add(rad_bold);
        
        rad_left = new JRadioButton("Izquierda");
        rad_left.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                txt_.setHorizontalAlignment(JTextField.LEFT);
            }
        });
        constraints.gridx = 3;
        constraints.gridy = 2;
        panel.add(rad_left, constraints);

        rad_center = new JRadioButton("Centro");
        rad_center.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                txt_.setHorizontalAlignment(JTextField.CENTER);
            }
        });
        constraints.gridx = 3;
        constraints.gridy = 3;
        panel.add(rad_center, constraints);

        rad_right = new JRadioButton("Derecha");
        rad_right.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                txt_.setHorizontalAlignment(JTextField.RIGHT);
            }
        });
        constraints.gridx = 3;
        constraints.gridy = 4;
        panel.add(rad_right, constraints);

        ButtonGroup alignGroup = new ButtonGroup();
        alignGroup.add(rad_left);
        alignGroup.add(rad_center);
        alignGroup.add(rad_right);

        // Text box
        
        constraints.ipady = 10;
        constraints.insets = new Insets (20, 0, 20, 0);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.CENTER;
        
        txt_ = new JTextField(25);
        txt_.setFont(new Font("Fira Code", Font.PLAIN, 18));
        constraints.gridx = 0; 
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        panel.add(txt_, constraints);

        //  Button
        
        constraints.ipady = 0;
        constraints.insets = new Insets (5, 5, 5, 5);

        btn_auth = new JButton("Autor");
        btn_auth.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                JOptionPane.showMessageDialog(null, author, "Autor", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        constraints.gridx = 4;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(btn_auth, constraints);

        // Frame final setup

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Exercise_121();
    }
}