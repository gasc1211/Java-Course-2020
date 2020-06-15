package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise_130 extends JFrame{

    private JList list = new JList();

    public Exercise_130() {
        this.setSize(400, 400);
        this.setResizable(false);

        JPanel root = new JPanel();
        this.add(root);

        

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_130();
    }
}