package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class Exercise_122 extends JFrame {

    private static final long serialVersionUID = 6825655101757518603L;

    private String paises[] = { "Alemania", "Italia", "Grecia", "Suecia", "Rusia", "Noruega", "Francia", "Polonia", "España", "Inglaterra" };
    private Hashtable<String, String> capitales = new Hashtable<String, String>(){

        private static final long serialVersionUID = -5638063078026411519L;

        {
            put("Alemania", "Berlín");
            put("Italia", "Roma");
            put("Grecia", "Atenas");
            put("Suecia", "Estocolmo");
            put("Rusia", "Moscú");
            put("Noruega", "Oslo");
            put("Francia", "París");
            put("Polonia", "Varsovia");
            put("España", "Madrid");
            put("Inglaterra", "Londres");
        }
    };

    private Font myFont = new Font("Arial", Font.PLAIN, 16);
    private Font tFont = new Font("Arial", Font.BOLD, 18);

    private JLabel titulo = new JLabel();
    private JComboBox<String> cpais = new JComboBox<>(paises);
    private JTextField ccapital = new JTextField(12);

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
        con.insets = new Insets(5, 5, 5, 5);
        con.anchor = GridBagConstraints.CENTER;
        this.add(root);

        titulo.setText("Capital del país");
        titulo.setFont(tFont);
        con.gridx = 0;
        con.gridy = 0;
        con.gridwidth = 2;
        root.add(titulo, con);

        cpais.setFont(myFont);
        con.gridx = 0;
        con.gridy = 1;
        con.gridwidth = 1;
        con.anchor = GridBagConstraints.LINE_START;
        cpais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pais = String.valueOf(cpais.getSelectedItem());
                ccapital.setText(capitales.get(pais));
            }
        });
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
