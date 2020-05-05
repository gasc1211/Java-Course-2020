package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_123 extends JFrame {

    private static final long serialVersionUID = -3094403425238379186L;
    
    private Font myFont = new Font("Arial", Font.PLAIN, 16);
    private Font tFont = new Font("Arial", Font.BOLD, 18);

    private JLabel titulo = new JLabel();
    private JComboBox cmes = new JComboBox();

    private String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
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

        for (String i : meses) {
            cmes.addItem(i);
        }

        cmes.setFont(myFont);
        con.gridx = 0;
        con.gridy = 1;
        con.anchor = GridBagConstraints.LINE_START;
        cmes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mes = String.valueOf(cmes.getSelectedItem());
                String y = "";
                switch (mes) {
                    case "Diciembre":
                    case "Enero":
                    case "Febrero":
                        y="Invierno";
                        break;
                    case "Marzo":
                    case "Abril":
                    case "Mayo":
                    case "Junio":
                        y="Primavera";
                        break;
                    case "Julio":
                    case "Agosto":
                    case "Septiembre":
                        y="Verano";
                        break;
                    case "Octubre":
                    case "Noviembre":
                        y="Otoño";
                        break;
                    default:
                        y="Estacion";
                        break;
                }
                refval.setTitle(y);
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
