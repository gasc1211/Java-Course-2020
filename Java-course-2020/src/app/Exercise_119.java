package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_119 {

    public Exercise_119() {

        // Frame initialization

        JFrame frame = new JFrame();
        frame.setTitle("¿Suma o Resta?");
        frame.setSize(320, 250);
        frame.setResizable(false);

        // Panel & GridBag Layout setup

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Labels

        constraints.fill = GridBagConstraints.LINE_START;

        JLabel lbl_nums = new JLabel("Números:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lbl_nums, constraints);

        // Text Boxes

        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        JTextField txt_n1 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(txt_n1, constraints);

        JTextField txt_n2 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(txt_n2, constraints);

        // Radiobuttons

        constraints.fill = GridBagConstraints.LINE_START;
        constraints.anchor = GridBagConstraints.LINE_START;

        JRadioButton rbtn_add = new JRadioButton("Suma");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(rbtn_add, constraints);

        JRadioButton rbtn_subs = new JRadioButton("Resta");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(rbtn_subs, constraints);

        ButtonGroup group = new ButtonGroup();
        group.add(rbtn_add);
        group.add(rbtn_subs);

        // Button

        JButton btn_calc = new JButton("Calcular");
        btn_calc.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Double n1 = Double.parseDouble(txt_n1.getText());
                Double n2 = Double.parseDouble(txt_n2.getText());
                
                if (rbtn_add.isSelected()) {
                    frame.setTitle(String.format("El resultado es: %.2f.", n1 + n2));
                } else if (rbtn_subs.isSelected()) {
                    frame.setTitle(String.format("El resultado es: %.2f.", n1 - n2));
                }

            }

        });
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        panel.add(btn_calc, constraints);

        
        // Frame 

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
     new Exercise_119();   
    }
}