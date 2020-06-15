package app;

import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import java.util.*;

public class Exercise_129 extends JFrame {

    private static final long serialVersionUID = 5351479410072643014L;
    private Font customFont = new Font("Arial", Font.PLAIN, 14);
    private String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    private JLabel lFont = new JLabel("Fuente:");
    private JLabel lSize = new JLabel("Tamaño:");
    private JLabel lAlign = new JLabel("Alineamiento:");
    private JLabel lCase = new JLabel("Convertir minúsculas/mayúsculas:");
    private JLabel lStyle = new JLabel("Estilos:");

    private JTextField cView = new JTextField();

    private JComboBox<String> cFont = new JComboBox();
    private JComboBox<Integer> cSize = new JComboBox();
    private JComboBox<String> cAlign = new JComboBox();
    private JComboBox<String> cCase = new JComboBox();

    private JToggleButton tN = new JToggleButton("n");
    private JToggleButton tK = new JToggleButton("k");
    private JToggleButton tS = new JToggleButton("s");

    public Exercise_129() {
        this.setSize(700, 250);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setTitle("Tipografía");

        for (String i : fonts) {
            cFont.addItem(i);
        }

        for (int i = 8; i < 63; i++) {
            cSize.addItem(i);
        }

        cAlign.addItem("Izquierda");
        cAlign.addItem("Centro");
        cAlign.addItem("Derecha");

        cCase.addItem("Tipo oración");
        cCase.addItem("Todo minúsculas");
        cCase.addItem("Todo mayúsculas");
        cCase.addItem("Mayúsculas por palabra");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }

        JPanel root = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 10, 5, 10);
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.LINE_START;
        this.add(root);

        cView.setText("Texto de prueba");
        cView.setFont(customFont);
        cSize.setSelectedIndex(6);

        c.gridy = 0;
        c.gridx = 4;
        root.add(lStyle, c);
        c.gridwidth = 4;
        c.gridheight = 2;
        c.gridx = 0;
        root.add(cView, c);
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        root.add(lFont, c);
        c.gridx = 1;
        root.add(lSize, c);
        c.gridx = 2;
        root.add(lAlign, c);
        c.gridx = 3;
        root.add(lCase, c);

        c.gridx = 3;
        c.gridy = 3;
        root.add(cCase, c);
        c.gridx = 0;
        root.add(cFont, c);
        c.gridx = 1;
        root.add(cSize, c);
        c.gridx = 2;
        root.add(cAlign, c);

        c.gridx = 4;
        c.gridy = 1;
        root.add(tN, c);
        c.gridy = 2;
        root.add(tK, c);
        c.gridy = 3;
        root.add(tS, c);

        tS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont();
            }
        });

        tK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont();
            }
        });

        tN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont();
            }
        });

        cSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont();
            }
        });

        cFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont();
            }
        });

        cCase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont();
            }
        });

        cAlign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont();
            }
        });

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void updateFont() {
        String font, align, trn;
        int size, vN, vK, vS;
        if (tN.isSelected()) {
            vN = Font.BOLD;
        } else {
            vN = 0;
        }
        if (tK.isSelected()) {
            vK = Font.ITALIC;
        } else {
            vK = 0;
        }
        size = Integer.parseInt(String.valueOf(cSize.getSelectedItem()));
        font = String.valueOf(cFont.getSelectedItem());
        customFont = new Font(font, vN | vK, size);
        align = String.valueOf(cAlign.getSelectedItem());
        switch (align) {
            case "Izquierda":
                cView.setHorizontalAlignment(JTextField.LEFT);
                break;
            case "Centro":
                cView.setHorizontalAlignment(JTextField.CENTER);
                break;
            case "Derecha":
                cView.setHorizontalAlignment(JTextField.RIGHT);
                break;
        }
        if (tS.isSelected()) {
            Map attributes = customFont.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            cView.setFont(customFont.deriveFont(attributes));
        } else {
            cView.setFont(customFont);
        }

        trn = String.valueOf(cCase.getSelectedItem());
        String text = cView.getText();
        switch (trn) {
            case "Tipo oración":
                text = text.substring(0, 1).toUpperCase() + text.substring(1);
                cView.setText(text);
                break;
            case "Todo minúsculas":
                cView.setText(text.toLowerCase());
                break;
            case "Todo mayúsculas":
                cView.setText(text.toUpperCase());
                break;
            case "Mayúsculas por palabra":
                String[] palabras = text.split(" ");
                text = "";
                for (String i : palabras) {
                    text += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
                }
                cView.setText(text);
                break;
        }

    }

    public static void main(String[] args) {
        new Exercise_129();
    }

}