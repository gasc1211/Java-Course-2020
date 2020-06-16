package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise_130 extends JFrame{

    private JList list;
    private String colores[] = {"Rojo", "Verde","Azul"};
    private JButton aceptar = new JButton("Aceptar");
    private JTextField resultado = new JTextField(25);

    public Exercise_130() {
        this.setSize(400, 150);
        this.setResizable(false);

        JPanel root = new JPanel();
        this.add(root);

        list = new JList(colores);
        list.setSelectedIndex(0);
        list.setPreferredSize(new Dimension(150, 50));
        root.add(list);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("El color seleccionado es: " + list.getSelectedValue());
            }
        });
        root.add(aceptar);

        resultado.setText("El color seleccionado es: ");
        resultado.setEnabled(false);
        root.add(resultado);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_130();
    }
}