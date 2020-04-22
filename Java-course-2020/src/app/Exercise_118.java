package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_118 {

    public Exercise_118() {

        // Frame initialization

        JFrame frame = new JFrame();
        frame.setTitle("Ingresar");
        frame.setSize(300, 200);
        frame.setResizable(false);

        // Panel & GridLayout setup

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Labels

        constraints.anchor = GridBagConstraints.LINE_START;

        JLabel lbl_user = new JLabel("Usuario:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        panel.add(lbl_user, constraints);

        JLabel lbl_passwd = new JLabel("Contraseña:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(lbl_passwd, constraints);

        //  Textboxes 

        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.CENTER;

        JTextField txt_user = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(txt_user, constraints);

        JPasswordField txt_passwd = new JPasswordField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        panel.add(txt_passwd, constraints);

        //Button

        JButton btn_login = new JButton("Ingresar");
        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txt_user.getText().equals("juan") && String.valueOf(txt_passwd.getPassword()).equals("abc123")) {
                    frame.setTitle("Correcto");
                } else {
                    frame.setTitle("Incorrecto");
                }

            }
        });
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        panel.add(btn_login, constraints);

        // Final setup

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_118();
    }
}