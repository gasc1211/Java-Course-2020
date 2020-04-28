package app;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_120 {

    public Exercise_120() {

        // Frame initialization

        JFrame frame = new JFrame();
        frame.setTitle("Operaciones Matemáticas");
        frame.setSize(400, 320);
        frame.setResizable(false);

        // Panel & GridBag Layout setup

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Labels

        constraints.fill = GridBagConstraints.LINE_START;

        JLabel lbl_n1 = new JLabel("Número 1:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lbl_n1, constraints);

        JLabel lbl_n2 = new JLabel("Número 2:");
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(lbl_n2, constraints);

        // Text Boxes
        
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        JTextField txt_n1 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(txt_n1, constraints);

        JTextField txt_n2 = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(txt_n2, constraints);

        // Results Textboxes

        JPanel internalPanel_txt = new JPanel(new GridBagLayout());
        internalPanel_txt.setBorder(BorderFactory.createTitledBorder("Resultados"));
        GridBagConstraints cons_txt = new GridBagConstraints();
        cons_txt.insets = new Insets(7, 5, 7, 5);

        cons_txt.fill = GridBagConstraints.LINE_START;
        cons_txt.anchor = GridBagConstraints.LINE_START;

        JTextField txt_add = new JTextField(18);
        txt_add.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 0;
        internalPanel_txt.add(txt_add, cons_txt);

        JTextField txt_sub = new JTextField(18);
        txt_sub.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 1;
        internalPanel_txt.add(txt_sub, cons_txt);

        JTextField txt_mul = new JTextField(18);
        txt_mul.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 2;
        internalPanel_txt.add(txt_mul, cons_txt);

        JTextField txt_div = new JTextField(18);
        txt_div.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 3;
        internalPanel_txt.add(txt_div, cons_txt);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(internalPanel_txt, constraints);

        // Radiobuttons

        JPanel internalPanel_chk = new JPanel(new GridBagLayout());
        internalPanel_chk.setBorder(BorderFactory.createTitledBorder("Operaciones"));
        GridBagConstraints cons_chk = new GridBagConstraints();
        cons_chk.insets = new Insets(5, 5, 5, 5);

        cons_chk.fill = GridBagConstraints.LINE_START;
        cons_chk.anchor = GridBagConstraints.LINE_START;

        JCheckBox chk_add = new JCheckBox("Suma");
        chk_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk_add.isSelected()) {
                    Double n1 = Double.parseDouble(txt_n1.getText());
                    Double n2 = Double.parseDouble(txt_n2.getText());
                    txt_add.setText(String.format("= %.2f", n1 + n2));
                } else {
                    txt_add.setText("Operación no seleccionada");
                }
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 0;
        internalPanel_chk.add(chk_add, cons_chk);

        JCheckBox chk_sub = new JCheckBox("Resta");
        chk_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk_sub.isSelected()) {
                    Double n1 = Double.parseDouble(txt_n1.getText());
                    Double n2 = Double.parseDouble(txt_n2.getText());
                    txt_sub.setText(String.format("= %.2f", n1 - n2));
                } else {
                    txt_sub.setText("Operación no seleccionada");
                }
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 1;
        internalPanel_chk.add(chk_sub, cons_chk);

        JCheckBox chk_mul = new JCheckBox("Multiplicación");
        chk_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk_mul.isSelected()) {
                    Double n1 = Double.parseDouble(txt_n1.getText());
                    Double n2 = Double.parseDouble(txt_n2.getText());
                    txt_mul.setText(String.format("= %.2f", n1 * n2));
                } else {
                    txt_mul.setText("Operación no seleccionada");
                }
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 2;
        internalPanel_chk.add(chk_mul, cons_chk);

        JCheckBox chk_div = new JCheckBox("División");
        chk_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk_div.isSelected()) {
                    Double n1 = Double.parseDouble(txt_n1.getText());
                    Double n2 = Double.parseDouble(txt_n2.getText());
                    txt_div.setText(String.format("= %.2f", n1 / n2));
                } else {
                    txt_div.setText("Operación no seleccionada");
                }
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 3;
        internalPanel_chk.add(chk_div, cons_chk);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(internalPanel_chk, constraints);

        // Buttons

        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        JButton btn_calc = new JButton("Salir");
        btn_calc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                
                System.exit(0);
            }

        });
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(btn_calc, constraints);

        JButton btn_clear = new JButton("Limpiar");
        btn_clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                txt_n1.setText("");
                txt_n2.setText("");
                txt_add.setText("");
                txt_sub.setText("");
                txt_mul.setText("");
                txt_div.setText("");
                
                chk_add.setSelected(false);
                chk_sub.setSelected(false);
                chk_mul.setSelected(false);
                chk_div.setSelected(false);

            }

        });
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(btn_clear, constraints);

        // Frame

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_120();
    }

}