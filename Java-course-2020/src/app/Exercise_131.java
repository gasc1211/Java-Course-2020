package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Exercise_131 extends JFrame{

    private JButton b1 = new JButton("Curso 1");
    private JButton b2 = new JButton("Curso 2");
    DefaultListModel<String> model = new DefaultListModel<>();
    JList<String> list = new JList<>( model );
    private JTextField resultado = new JTextField(30);
    private String[] curso1 = {"Andres", "Mario", "Jimena"};
    private String[] curso2 = {"Ana", "Marta", "Jose"};

    public Exercise_131() {
        this.setSize(400, 200);
        this.setResizable(false);

        JPanel root = new JPanel();
        this.add(root);
        
        list.setSelectedIndex(0);
        list.setPreferredSize(new Dimension(300, 60));
        root.add(list);

        resultado.setEnabled(false);
        root.add(resultado);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeAllElements();
                for (String i:curso1) {
                    model.addElement(i);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeAllElements();
                for (String i:curso2) {
                    model.addElement(i);
                }
            }
        });

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
              resultado.setText(list.getSelectedValue());
            }
          });

        root.add(b1);
        root.add(b2);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise_131();
    }
}