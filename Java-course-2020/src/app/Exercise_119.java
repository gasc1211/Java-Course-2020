package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_119 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel lbl_nums;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JRadioButton rad_add;
    private JRadioButton rad_sub;
    private JButton btn_calc;

    public Exercise_119() {
        initComponents();
    }

    private void initComponents() {

        // Frame initialization

        this.setTitle("¿Suma o Resta?");
        this.setSize(320, 250);
        this.setResizable(false);

        // Panel & GridBag Layout setup

        Container panel = this.getContentPane();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        // Labels

        lbl_nums = new JLabel("Números:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lbl_nums, constraints);

        // Text Boxes

        txt_n1 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(txt_n1, constraints);

        txt_n2 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(txt_n2, constraints);

        // Radiobuttons

        rad_add = new JRadioButton("Suma");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(rad_add, constraints);

        rad_sub = new JRadioButton("Resta");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(rad_sub, constraints);

        ButtonGroup group = new ButtonGroup();
        group.add(rad_add);
        group.add(rad_sub);

        // Button

        btn_calc = new JButton("Calcular");
        btn_calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_calcAction(e);
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        panel.add(btn_calc, constraints);

        // Frame final setup

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void btn_calcAction(ActionEvent e) {

        Double n1 = Double.parseDouble(txt_n1.getText());
        Double n2 = Double.parseDouble(txt_n2.getText());

        if (rad_add.isSelected()) {
            this.setTitle(String.format("El resultado es: %.2f.", n1 + n2));
        } else if (rad_sub.isSelected()) {
            this.setTitle(String.format("El resultado es: %.2f.", n1 - n2));
        }

    }

    public static void main(String[] args) {
        new Exercise_119();
    }
}