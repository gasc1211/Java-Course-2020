package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_127 extends JFrame {

    private static final long serialVersionUID = 3607693707517402307L;

    // Main Frame Elements

    private JLabel lbl_title;
    private JLabel lbl_subTitle;

    private JTextField txt_amount;

    private JButton btn_calculate;
    private JButton btn_new;
    private JButton btn_exit;

    // Break Down Frame Elements

    private JLabel lbl_denom;
    private JLabel lbl_qtyBills;
    private JLabel lbl_qtyMoney;

    private JLabel lbl_500;
    private JLabel lbl_100;
    private JLabel lbl_50;
    private JLabel lbl_20;
    private JLabel lbl_10;
    private JLabel lbl_5;
    private JLabel lbl_2;
    private JLabel lbl_1;

    private JLabel lbl_total;

    private JTextField txt_qty500;
    private JTextField txt_qty100;
    private JTextField txt_qty50;
    private JTextField txt_qty20;
    private JTextField txt_qty10;
    private JTextField txt_qty5;
    private JTextField txt_qty2;
    private JTextField txt_qty1;

    private JTextField txt_500;
    private JTextField txt_100;
    private JTextField txt_50;
    private JTextField txt_20;
    private JTextField txt_10;
    private JTextField txt_5;
    private JTextField txt_2;
    private JTextField txt_1;

    private JTextField txt_total;

    public Exercise_127() {

        // Frame initialization

        this.setTitle("Geek Bank");
        this.setSize(400, 520);
        this.setResizable(false);

        // Panels & GridBag Layout setup

        Container pnl_main = this.getContentPane();
        pnl_main.setLayout(new GridBagLayout());
        
        GridBagConstraints cons = new GridBagConstraints();
        cons.insets = new Insets(5, 5, 5, 5);
        cons.fill = GridBagConstraints.CENTER;
        cons.anchor = GridBagConstraints.CENTER;

        JPanel pnl_brkdwn = new JPanel(new GridBagLayout());
        pnl_brkdwn.setBorder(BorderFactory.createTitledBorder("Desglose de Efectivo"));

        GridBagConstraints con = new GridBagConstraints();
        con.insets = new Insets(5, 15, 5, 15);
        con.fill = GridBagConstraints.CENTER;
        con.anchor = GridBagConstraints.CENTER;

        // --- Main Frame ---

        // Labels

        cons.gridwidth = 3;

        lbl_title = new JLabel("Geek Bank");
        cons.gridx = 0;
        cons.gridy = 0;
        pnl_main.add(lbl_title, cons);

        lbl_subTitle = new JLabel("Arqueo de Caja");
        cons.gridx = 0;
        cons.gridy = 1;
        pnl_main.add(lbl_subTitle, cons);

        cons.gridwidth = 1;

        // Textfield

        txt_amount = new JTextField(10);
        cons.gridx = 0;
        cons.gridy = 2;
        pnl_main.add(txt_amount, cons);

        // Buttons

        btn_calculate = new JButton("Calcular");
        btn_calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();            }
        });
        cons.gridx = 1;
        cons.gridy = 2;
        pnl_main.add(btn_calculate, cons);

        btn_new = new JButton("Nuevo");
        btn_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        cons.gridx = 2;
        cons.gridy = 2;
        pnl_main.add(btn_new, cons);

        btn_exit = new JButton("Salir");
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
        cons.gridx = 0;
        cons.gridy = 4;
        cons.gridwidth = 3;
        pnl_main.add(btn_exit, cons);

        // --- Results Frame ---

        // Labels

        lbl_denom = new JLabel("Denominación");
        con.gridx = 0;
        con.gridy = 0;
        pnl_brkdwn.add(lbl_denom, con);
        
        lbl_qtyBills = new JLabel("Billetes");
        con.gridx = 1;
        con.gridy = 0;
        pnl_brkdwn.add(lbl_qtyBills, con);

        lbl_qtyMoney = new JLabel("Efectivo");
        con.gridx = 2;
        con.gridy = 0;
        pnl_brkdwn.add(lbl_qtyMoney, con);

        lbl_500 = new JLabel("500");
        con.gridx = 0;
        con.gridy = 1;
        pnl_brkdwn.add(lbl_500, con);

        lbl_100 = new JLabel("100");
        con.gridx = 0;
        con.gridy = 2;
        pnl_brkdwn.add(lbl_100, con);

        lbl_50 = new JLabel("50");
        con.gridx = 0;
        con.gridy = 3;
        pnl_brkdwn.add(lbl_50, con);

        lbl_20 = new JLabel("20");
        con.gridx = 0;
        con.gridy = 4;
        pnl_brkdwn.add(lbl_20, con);

        lbl_10 = new JLabel("10");
        con.gridx = 0;
        con.gridy = 5;
        pnl_brkdwn.add(lbl_10, con);

        lbl_5 = new JLabel("5");
        con.gridx = 0;
        con.gridy = 6;
        pnl_brkdwn.add(lbl_5, con);

        lbl_2 = new JLabel("2");
        con.gridx = 0;
        con.gridy = 7;
        pnl_brkdwn.add(lbl_2, con);

        lbl_1 = new JLabel("1");
        con.gridx = 0;
        con.gridy = 8;
        pnl_brkdwn.add(lbl_1, con);

        lbl_total = new JLabel("Total:");
        con.gridx = 1;
        con.gridy = 9;
        pnl_brkdwn.add(lbl_total, con);

        // Textfields
        
        txt_qty500 = new JTextField(5);
        txt_qty500.setEnabled(false);
        con.gridx = 1;
        con.gridy = 1;
        pnl_brkdwn.add(txt_qty500, con);

        txt_qty100 = new JTextField(5);
        txt_qty100.setEnabled(false);
        con.gridx = 1;
        con.gridy = 2;
        pnl_brkdwn.add(txt_qty100, con);

        txt_qty50 = new JTextField(5);
        txt_qty50.setEnabled(false);
        con.gridx = 1;
        con.gridy = 3;
        pnl_brkdwn.add(txt_qty50, con);

        txt_qty20 = new JTextField(5);
        txt_qty20.setEnabled(false);
        con.gridx = 1;
        con.gridy = 4;
        pnl_brkdwn.add(txt_qty20, con);

        txt_qty10 = new JTextField(5);
        txt_qty10.setEnabled(false);
        con.gridx = 1;
        con.gridy = 5;
        pnl_brkdwn.add(txt_qty10, con);

        txt_qty5 = new JTextField(5);
        txt_qty5.setEnabled(false);
        con.gridx = 1;
        con.gridy = 6;
        pnl_brkdwn.add(txt_qty5, con);

        txt_qty2 = new JTextField(5);
        txt_qty2.setEnabled(false);
        con.gridx = 1;
        con.gridy = 7;
        pnl_brkdwn.add(txt_qty2, con);

        txt_qty1 = new JTextField(5);
        txt_qty1.setEnabled(false);
        con.gridx = 1;
        con.gridy = 8;
        pnl_brkdwn.add(txt_qty1, con);

        txt_500 = new JTextField(5);
        txt_500.setEnabled(false);
        con.gridx = 2;
        con.gridy = 1;
        pnl_brkdwn.add(txt_500, con);

        txt_100 = new JTextField(5);
        txt_100.setEnabled(false);
        con.gridx = 2;
        con.gridy = 2;
        pnl_brkdwn.add(txt_100, con);

        txt_50 = new JTextField(5);
        txt_50.setEnabled(false);
        con.gridx = 2;
        con.gridy = 3;
        pnl_brkdwn.add(txt_50, con);

        txt_20 = new JTextField(5);
        txt_20.setEnabled(false);
        con.gridx = 2;
        con.gridy = 4;
        pnl_brkdwn.add(txt_20, con);

        txt_10 = new JTextField(5);
        txt_10.setEnabled(false);
        con.gridx = 2;
        con.gridy = 5;
        pnl_brkdwn.add(txt_10, con);

        txt_5 = new JTextField(5);
        txt_5.setEnabled(false);
        con.gridx = 2;
        con.gridy = 6;
        pnl_brkdwn.add(txt_5, con);

        txt_2 = new JTextField(5);
        txt_2.setEnabled(false);
        con.gridx = 2;
        con.gridy = 7;
        pnl_brkdwn.add(txt_2, con);

        txt_1 = new JTextField(5);
        txt_1.setEnabled(false);
        con.gridx = 2;
        con.gridy = 8;
        pnl_brkdwn.add(txt_1, con);

        txt_total = new JTextField(5);
        txt_total.setEnabled(false);
        con.gridx = 2;
        con.gridy = 9;
        pnl_brkdwn.add(txt_total, con);

        cons.gridx = 0;
        cons.gridy = 3;
        cons.gridwidth = 3;
        pnl_main.add(pnl_brkdwn, cons);

        // Frame Final Setup

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void calculate() {

        JTextField[] txt_bills = {txt_qty500, txt_qty100, txt_qty50, txt_qty20, txt_qty10, txt_qty5, txt_qty2, txt_qty1};
        JTextField[] txt_billsAmount = {txt_500, txt_100, txt_50, txt_20, txt_10, txt_5, txt_2, txt_1};

        int[] bills = {500, 100, 50, 20, 10, 5, 2, 1};
        int amount = Integer.parseInt(txt_amount.getText());

        txt_total.setText(String.format("L. %d", amount));

        for (int i = 0; i < bills.length; i++) {
            txt_bills[i].setText(Integer.toString((amount - amount % bills[i]) / bills[i]));
            txt_billsAmount[i].setText(Integer.toString(amount - amount % bills[i]));
            amount = amount % bills[i];
        }

    }

    public void clear() {

        JTextField[] txt_bills = {txt_qty500, txt_qty100, txt_qty50, txt_qty20, txt_qty10, txt_qty5, txt_qty2, txt_qty1};
        JTextField[] txt_billsAmount = {txt_500, txt_100, txt_50, txt_20, txt_10, txt_5, txt_2, txt_1};

        txt_amount.setText("");
        txt_total.setText("");
        
        for (JTextField txt : txt_bills) {
            txt.setText("");
        }

        for (JTextField txt : txt_billsAmount) {
            txt.setText("");
        }
    }

    public void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new Exercise_127();
    }

}