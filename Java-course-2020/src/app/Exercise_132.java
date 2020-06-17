package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Exercise_132 extends JFrame {

    private static final long serialVersionUID = 60768122825923688L;

    private JLabel lName = new JLabel("Nombre:");
    private JLabel lDiu = new JLabel("Diurna");
    private JLabel lNoc = new JLabel("Nocturna");
    private JLabel lBus1 = new JLabel("Buscar");
    private JLabel lBus2 = new JLabel("Buscar");
    private JLabel lTot1 = new JLabel("Total");
    private JLabel lTot2 = new JLabel("Total");

    private JTextField tName = new JTextField(15);
    private JTextField tB1 = new JTextField(8);
    private JTextField tB2 = new JTextField(8);
    private JTextField tT1 = new JTextField(6);
    private JTextField tT2 = new JTextField(6);

    private JButton bMat = new JButton("Matricular");
    private JButton bRet = new JButton("Retirar");
    private JButton bCer = new JButton("Cerrar");
    private JButton bOrd1 = new JButton("Ordenar");
    private JButton bOrd2 = new JButton("Ordenar");
    private JButton bP1 = new JButton(" > ");
    private JButton bPM1 = new JButton(">>");
    private JButton bP2 = new JButton(" < ");
    private JButton bPM2 = new JButton("<<");

    private DefaultListModel<String> diurno = new DefaultListModel<>();
    private JList<String> lsDiu = new JList<>();
    private DefaultListModel<String> nocturno = new DefaultListModel<>();
    private JList<String> lsNoc = new JList<>();

    private ArrayList<String> dbase = new ArrayList();
    private ArrayList<String> nbase = new ArrayList();

    private ButtonGroup gDN = new ButtonGroup();
    private JRadioButton rDiu = new JRadioButton("Diurno");
    private JRadioButton rNoc = new JRadioButton("Nocturno");

    public Exercise_132() {
        this.setSize(450, 600);
        this.setTitle("Registro Estudiantil");
        this.setResizable(false);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }

        JPanel root = new JPanel(new GridBagLayout());
        this.add(root);

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.fill = GridBagConstraints.CENTER;
        c.anchor = GridBagConstraints.CENTER;

        gDN.add(rDiu);
        gDN.add(rNoc);

        lsDiu.setPreferredSize(new Dimension(100, 150));
        lsDiu.setModel(diurno);
        lsNoc.setPreferredSize(new Dimension(100, 150));
        lsNoc.setModel(nocturno);

        tT1.setEnabled(false);
        tT2.setEnabled(false);

        rDiu.setSelected(true);

        c.gridx = 0;
        c.gridy = 0;
        root.add(lName, c);
        c.gridx = 1;
        root.add(tName, c);
        c.gridy = 1;
        root.add(rNoc, c);
        c.gridx = 0;
        root.add(rDiu, c);
        c.gridy = 2;
        root.add(bMat, c);
        c.gridx = 1;
        root.add(bRet, c);
        c.gridx = 2;
        root.add(bCer, c);
        c.gridy = 3;
        root.add(lNoc, c);
        c.gridx = 0;
        root.add(lDiu, c);
        c.gridy = 4;
        c.gridheight = 4;
        root.add(lsDiu, c);
        c.gridx = 2;
        root.add(lsNoc, c);
        c.gridheight = 1;
        c.gridx = 1;
        root.add(bP1, c);
        c.gridy = 5;
        root.add(bPM1, c);
        c.gridy = 6;
        root.add(bP2, c);
        c.gridy = 7;
        root.add(bPM2, c);
        c.gridy = 8;
        c.gridx = 0;
        root.add(bOrd1, c);
        c.gridx = 2;
        root.add(bOrd2, c);
        c.gridy = 9;
        c.gridx = 0;
        root.add(lBus1, c);
        c.gridx = 2;
        root.add(lBus2, c);
        c.gridy = 10;
        root.add(tB2, c);
        c.gridx = 0;
        root.add(tB1, c);
        c.gridy = 11;
        root.add(lTot1, c);
        c.gridx = 2;
        root.add(lTot2, c);
        c.gridy = 12;
        root.add(tT2, c);
        c.gridx = 0;
        root.add(tT1, c);

        ActionListener cerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        ActionListener matricular = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = tName.getText();
                if (rDiu.isSelected()) {
                    dbase.add(nombre);
                } else {
                    nbase.add(nombre);
                }
                tName.setText("");
                sincronizar();
            }
        };

        ActionListener retirar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = tName.getText();
                if (diurno.contains(nombre)) {
                    dbase.remove(nombre);
                }
                if (nocturno.contains(nombre)) {
                    nbase.remove(nombre);

                }
                sincronizar();
            }
        };

        ActionListener ordenar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bOrd1) {
                    String[] cache = new String[diurno.getSize()];
                    for (int i = 0; i < diurno.getSize(); i++) {
                        cache[i] = diurno.getElementAt(i);
                    }
                    diurno.removeAllElements();
                    Arrays.sort(cache);
                    for (String i : cache) {
                        diurno.addElement(i);
                    }
                } else {
                    String[] cache = new String[nocturno.getSize()];
                    for (int i = 0; i < nocturno.getSize(); i++) {
                        cache[i] = nocturno.getElementAt(i);
                    }
                    nocturno.removeAllElements();
                    Arrays.sort(cache);
                    for (String i : cache) {
                        nocturno.addElement(i);
                    }
                }
            }
        };

        ActionListener mover = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bP1) {
                    String movendo = lsDiu.getSelectedValue();
                    diurno.removeElement(movendo);
                    nocturno.addElement(movendo);
                } else if (e.getSource() == bP2) {
                    String movendo = lsNoc.getSelectedValue();
                    nocturno.removeElement(movendo);
                    diurno.addElement(movendo);
                } else if (e.getSource() == bPM1) {
                    String cache[] = new String[diurno.getSize()];
                    for (int i = 0; i < diurno.getSize(); i++) {
                        cache[i] = diurno.getElementAt(i);
                    }
                    diurno.removeAllElements();
                    for (String i : cache) {
                        nocturno.addElement(i);
                    }
                } else if (e.getSource() == bPM2) {
                    String cache[] = new String[nocturno.getSize()];
                    for (int i = 0; i < nocturno.getSize(); i++) {
                        cache[i] = nocturno.getElementAt(i);
                    }
                    nocturno.removeAllElements();
                    for (String i : cache) {
                        diurno.addElement(i);
                    }
                }
            }
        };

        bCer.addActionListener(cerrar);
        bMat.addActionListener(matricular);
        bRet.addActionListener(retirar);
        bOrd1.addActionListener(ordenar);
        bOrd2.addActionListener(ordenar);
        bP1.addActionListener(mover);
        bPM1.addActionListener(mover);
        bP2.addActionListener(mover);
        bPM2.addActionListener(mover);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void sincronizar() {
        tT1.setText(Integer.toString(diurno.getSize()));
        tT2.setText(Integer.toString(nocturno.getSize()));
        diurno.removeAllElements();
        nocturno.removeAllElements();
        for (String i:dbase) {
            diurno.addElement(i);
        }
        for (String i:nbase) {
            nocturno.addElement(i);
        }
    }

    public static void main(String[] args) {
        new Exercise_132();
    }

}