package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise_128 extends JFrame {

    // Serial Version ID
    private static final long serialVersionUID = 7902961663740510268L;

    public Exercise_128() {

        // For external methods
        JFrame refval = this;

        // Frame properties
        this.setTitle("Deja Vu Motors");
        this.setSize(460, 600);
        this.setResizable(false);

        // Panel setup
        JPanel root = new JPanel(new GridBagLayout());
        this.add(root);

        // Initial Location Settings
        GridBagConstraints con = new GridBagConstraints();
        GridBagConstraints scon = new GridBagConstraints();
        con.insets = new Insets(5, 5, 5, 5);
        scon.insets = new Insets(10, 5, 10, 5);
        con.fill = GridBagConstraints.CENTER;
        scon.fill = GridBagConstraints.CENTER;
        con.anchor = GridBagConstraints.CENTER;
        scon.anchor = GridBagConstraints.CENTER;

        // Font setup
        Font tF = new Font("Tahoma", Font.BOLD, 20);
        Font mF = new Font("Tahoma", Font.PLAIN, 14);

        // Header
        JLabel mTitle = new JLabel("Rentadora de Vehículos");
        mTitle.setFont(tF);
        con.gridx = 0;
        con.gridy = 0;
        con.gridwidth = 3;
        root.add(mTitle, con);

        JLabel sTitle = new JLabel("Deja Vu Motors");
        sTitle.setFont(tF);
        con.gridy = 1;
        root.add(sTitle, con);

        // Panel: Extras
        JPanel extras = new JPanel(new GridLayout(2, 2));
        extras.setBorder(BorderFactory.createTitledBorder("Extras"));

        JCheckBox aire = new JCheckBox();
        aire.setText("Aire Acondicionado");
        extras.add(aire);

        JCheckBox radp = new JCheckBox();
        radp.setText("Radio Pantalla");
        extras.add(radp);

        JCheckBox pelec = new JCheckBox();
        pelec.setText("Paquete Eléctrico");
        extras.add(pelec);

        JCheckBox gps = new JCheckBox();
        gps.setText("GPS");
        extras.add(gps);

        con.gridx = 1;
        con.gridy = 2;
        con.gridwidth = 2;
        root.add(extras, con);

        // Panel: Facturación
        JPanel fact = new JPanel(new GridBagLayout());
        fact.setBorder(BorderFactory.createTitledBorder("Facturación"));

        JLabel lf1 = new JLabel("Días a rentar:");
        scon.gridx = 0;
        scon.gridy = 0;
        fact.add(lf1, scon);
        JLabel lf2 = new JLabel("Modelo Seleccionado:");
        scon.gridy = 1;
        fact.add(lf2, scon);
        JLabel lf3 = new JLabel("Extras:");
        scon.gridy = 2;
        fact.add(lf3, scon);
        JLabel lf4 = new JLabel("Subtotal:");
        scon.gridy = 3;
        fact.add(lf4, scon);
        JLabel lf5 = new JLabel("Descuento:");
        scon.gridy = 4;
        fact.add(lf5, scon);
        JLabel lf6 = new JLabel("ISV:");
        scon.gridy = 5;
        fact.add(lf6, scon);
        JLabel lf7 = new JLabel("Total a Pagar:");
        lf7.setFont(new Font("Tahoma", Font.BOLD, 14));
        scon.gridy = 6;
        fact.add(lf7, scon);

        scon.gridx = 1;
        scon.gridy = 0;
        JTextField cdias = new JTextField(10);
        cdias.setFont(mF);
        fact.add(cdias, scon);
        JTextField cmodelo = new JTextField(10);
        scon.gridy = 1;
        fact.add(cmodelo, scon);
        JTextField cextras = new JTextField(10);
        scon.gridy = 2;
        fact.add(cextras, scon);
        JTextField csubtotal = new JTextField(10);
        scon.gridy = 3;
        fact.add(csubtotal, scon);
        JTextField cdesc = new JTextField(10);
        scon.gridy = 4;
        fact.add(cdesc, scon);
        JTextField cisv = new JTextField(10);
        scon.gridy = 5;
        fact.add(cisv, scon);
        JTextField ctotal = new JTextField(10);
        ctotal.setFont(new Font("Tahoma", Font.BOLD, 14));
        ctotal.setEnabled(false);
        scon.gridy = 6;
        fact.add(ctotal, scon);

        con.gridy = 3;
        root.add(fact, con);

        // Panel: Modelo
        JPanel modelo = new JPanel(new GridLayout(6, 1));
        modelo.setBorder(BorderFactory.createTitledBorder("Modelo"));

        ButtonGroup gmodelo = new ButtonGroup();
        JRadioButton turismo = new JRadioButton("Turismo", true);
        JRadioButton pickup = new JRadioButton("Pick Up");
        JRadioButton microbus = new JRadioButton("Microbús");
        JRadioButton camioneta = new JRadioButton("Camioneta");
        JRadioButton motocicleta = new JRadioButton("Motocicleta");
        ImageIcon image = new ImageIcon("Java-course-2020/images/turismo.png");
        Image img = image.getImage().getScaledInstance(64, 48, Image.SCALE_SMOOTH);
        image = new ImageIcon(img);
        JLabel preview = new JLabel();
        preview.setIcon(image);

        con.gridx = 0;
        con.gridy = 2;
        con.gridwidth = 1;
        con.gridheight = 2;
        root.add(modelo, con);

        // Font styling
        JLabel labels[] = { lf1, lf2, lf3, lf4, lf5, lf6 };
        for (JLabel i : labels) {
            i.setFont(mF);
        }
        JTextField fields[] = { cmodelo, cextras, csubtotal, cdesc, cisv };
        for (JTextField i : fields) {
            i.setFont(mF);
            i.setEnabled(false);
        }

        // RadioButton aditions
        JRadioButton radio[] = { turismo, pickup, microbus, camioneta, motocicleta };
        for (JRadioButton i : radio) {
            gmodelo.add(i);
            modelo.add(i);
            i.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent e) {
                    String route = "";
                    if (turismo.isSelected()) {
                        route = "turismo.png";
                    } else if (pickup.isSelected()) {
                        route = "pickup.png";
                    } else if (microbus.isSelected()) {
                        route = "microbus.png";
                    } else if (camioneta.isSelected()) {
                        route = "camioneta.png";
                    } else if (motocicleta.isSelected()) {
                        route = "motocicleta.png";
                    }
                    ImageIcon image = new ImageIcon("Java-course-2020/images/" + route);
                    Image img = image.getImage().getScaledInstance(64, 48, Image.SCALE_SMOOTH);
                    image = new ImageIcon(img);
                    preview.setIcon(image);
                }
            });
        }
        modelo.add(preview);

        // Buttons
        JPanel pButtons = new JPanel(new GridLayout());
        con.gridy = 5;
        con.gridx = 0;
        con.gridwidth = 3;

        JButton bcalc = new JButton("Calcular");
        bcalc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double dr = Double.parseDouble(String.valueOf(cdias.getText()));
                double mod = 0.0;
                double extras = 0.0;
                double desc = 0;
                if (turismo.isSelected()) {
                    mod = dr * 1200.0;
                } else if (pickup.isSelected()) {
                    mod = dr * 1635.0;
                } else if (microbus.isSelected()) {
                    mod = dr * 2000.0;
                } else if (camioneta.isSelected()) {
                    mod = dr * 1850.0;
                } else if (motocicleta.isSelected()) {
                    mod = dr * 500.0;
                }

                if (aire.isSelected()) {
                    extras += 200.0;
                }
                if (radp.isSelected()) {
                    extras += 300.0;
                }
                if (pelec.isSelected()) {
                    extras += 400.0;
                }
                if (gps.isSelected()) {
                    extras += 200.0;
                }

                double subtotal = mod + extras;
                if (dr > 4) {
                    desc = subtotal * 0.10;
                }
                double isv = subtotal * 0.15;
                double total = subtotal + isv - desc;

                cmodelo.setText(String.format("%.2f", mod));
                cextras.setText(String.format("%.2f", extras));
                csubtotal.setText(String.format("%.2f", subtotal));
                cdesc.setText(String.format("%.2f", desc));
                cisv.setText(String.format("%.2f", isv));
                ctotal.setText(String.format("L. %.2f", total));
            }
        });
        pButtons.add(bcalc);
        JButton blimp = new JButton("Limpiar");
        blimp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JTextField i : fields) {
                    i.setText("");
                }
                ctotal.setText("");
                cdias.setText("");
            }
        });
        pButtons.add(blimp);
        JButton bsalir = new JButton("Salir");
        bsalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                refval.setVisible(false);
                System.exit(0);
            }
        });
        pButtons.add(bsalir);

        root.add(pButtons, con);

        // Execution tweaks
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Exercise_128();
    }

}