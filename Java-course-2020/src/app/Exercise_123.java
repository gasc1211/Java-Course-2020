package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class Exercise_123 extends JFrame {

    private static final long serialVersionUID = -3094403425238379186L;
    
    private String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    private Hashtable<String, String> estaciones = new Hashtable<String, String>(){

        private static final long serialVersionUID = -5638063078026411519L;

        {
            put("Enero", "Invierno");
            put("Febrero", "Invierno");
            put("Marzo", "Primavera");
            put("Abril", "Primavera");
            put("Mayo", "Primavera");
            put("Junio", "Primavera");
            put("Julio", "Verano");
            put("Agosto", "Verano");
            put("Septiembre", "Verano");
            put("Octubre", "Otoño");
            put("Noviembre", "Otoño");
            put("Diciembre", "Invierno");
        }
    };
    
    private Font myFont = new Font("Arial", Font.PLAIN, 16);
    private Font tFont = new Font("Arial", Font.BOLD, 18);

    private JLabel titulo = new JLabel();
    private JComboBox<String> cmes = new JComboBox<>(meses);

    private JFrame refval = this;

    public Exercise_123() {
        initComponents();
    }

    private void initComponents() {

        this.setResizable(false);
        this.setSize(400, 150);
        this.setTitle("Invierno");

        JPanel root = new JPanel();
        root.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        con.insets = new Insets(5, 5, 5, 5);
        con.anchor = GridBagConstraints.CENTER;
        this.add(root);

        titulo.setText("Elija un mes");
        titulo.setFont(tFont);
        con.gridx = 0;
        con.gridy = 0;
        root.add(titulo, con);

        cmes.setFont(myFont);
        con.gridx = 0;
        con.gridy = 1;
        con.anchor = GridBagConstraints.LINE_START;
        cmes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mes = String.valueOf(cmes.getSelectedItem());
                refval.setTitle(estaciones.get(mes));
                switch (estaciones.get(mes)) {
                    case "Invierno" :
                        root.setBackground(Color.BLUE);
                        break;
                    case "Primavera" :
                        root.setBackground(Color.ORANGE);
                        break;
                    case "Verano" :
                        root.setBackground(Color.YELLOW);
                        break;
                    case "Otoño" :
                        root.setBackground(Color.GRAY);
                        break;
                }
            }
        });
        root.add(cmes, con);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_123();
    }

}
