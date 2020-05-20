package app;

import javax.swing.*;
import java.awt.*;

public class Exercise_128 extends JFrame{
    
    // Serial Version ID
    private static final long serialVersionUID = 7902961663740510268L;


    public Exercise_128() {

        // Frame properties
        this.setTitle("Deja Vu Motors");
        this.setSize(360, 600);
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
        scon.gridy = 6;
        fact.add(ctotal, scon);

        con.gridy = 3;
        root.add(fact, con);

        // Font styling
        JLabel labels[] = {lf1, lf2, lf3, lf4, lf5, lf6};
        for (JLabel i:labels) {
            i.setFont(mF);
        }
        JTextField fields[] = {cdias, cmodelo, cextras, csubtotal, cdesc, cisv};
        for (JTextField i:fields) {
            i.setFont(mF);
        }

        // Execution tweaks
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Exercise_128();
    }

}