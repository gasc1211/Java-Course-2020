package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise_124 extends JFrame {

    private static final long serialVersionUID = 5430513214412853815L;
    
    // Form Panel Variables
    
    private JLabel lbl_gender;
    private JLabel lbl_name;
    private JLabel lbl_scndName;
    private JLabel lbl_address;
    private JLabel lbl_city;
    private JLabel lbl_preferences;

    private JTextField txt_name;
    private JTextField txt_scndName;
    private JTextField txt_address;

    private JRadioButton rad_male;
    private JRadioButton rad_female;

    private JComboBox<String> cmb_city;
    private String[] cities = {"San Francisco (US)", "Barranquilla (CL)", "Comayagua (HN)", "Nueva York (US)", "Washington D.C. (US)", "Tegucigalpa (HN)", "Santiago (CL)"};

    private JCheckBox chk_books;
    private JCheckBox chk_movies;

    private JButton btn_send;
    private JButton btn_cancel;

    // Image Panel Variables

    private Image img;
    private ImageIcon image;
    private JLabel lbl_image;

    // Info Panel Variables

    private JLabel lbl_Gender;
    private JLabel lbl_Name;
    private JLabel lbl_ScndName;
    private JLabel lbl_Address;
    private JLabel lbl_City;
    private JLabel lbl_Preferences;

    private JLabel lbl_infoGender;
    private JLabel lbl_infoName;
    private JLabel lbl_infoScndName;
    private JLabel lbl_infoAddress;
    private JLabel lbl_infoCity;
    private JLabel lbl_infoPreferences;

    public Exercise_124 () {
        initComponents();
    }

    private void initComponents() {

        // Frame initialization

        this.setTitle("Formulario 1");
        this.setSize(600, 360);
        this.setResizable(false);

        // Root Panel & GridBag Layout setup

        Container root = this.getContentPane();
        root.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.insets = new Insets(5, 5, 5, 5);
        cons.anchor = GridBagConstraints.CENTER;

        // --- Form Panel ---

        JPanel pnl_form = new JPanel();
        pnl_form.setBorder(BorderFactory.createTitledBorder("Formulario"));
        pnl_form.setLayout(new GridBagLayout());

        // Labels

        cons.anchor = GridBagConstraints.LINE_END;

        lbl_gender = new JLabel("Tratamiento:");
        cons.gridx = 0;
        cons.gridy = 0;
        pnl_form.add(lbl_gender, cons);

        lbl_name = new JLabel("Nombre:");
        cons.gridx = 0;
        cons.gridy = 1;
        pnl_form.add(lbl_name, cons);

        lbl_scndName = new JLabel("Apellido:");
        cons.gridx = 0;
        cons.gridy = 2;
        pnl_form.add(lbl_scndName, cons);

        lbl_address = new JLabel("Dirección:");
        cons.gridx = 0;
        cons.gridy = 3;
        pnl_form.add(lbl_address, cons);

        lbl_city = new JLabel("Ciudad:");
        cons.gridx = 0;
        cons.gridy = 4;
        pnl_form.add(lbl_city, cons);

        lbl_preferences = new JLabel("Preferencias:");
        cons.gridx = 0;
        cons.gridy = 5;
        pnl_form.add(lbl_preferences, cons);

        // Form Radiobuttons

        cons.anchor = GridBagConstraints.CENTER;

        rad_male = new JRadioButton("Sr.");
        cons.gridx = 1;
        cons.gridy = 0;
        pnl_form.add(rad_male, cons);

        rad_female = new JRadioButton("Sra.");
        cons.gridx = 2;
        cons.gridy = 0;
        pnl_form.add(rad_female, cons);

        ButtonGroup gender_group = new ButtonGroup();
        gender_group.add(rad_female);
        gender_group.add(rad_male);

        // Form Checkboxes

        chk_books = new JCheckBox("Libros");
        cons.gridx = 1;
        cons.gridy = 5;
        pnl_form.add(chk_books, cons);

        chk_movies = new JCheckBox("Peliculas");
        cons.gridx = 2;
        cons.gridy = 5;
        pnl_form.add(chk_movies, cons);

        // Form ComboBox

        cons.gridwidth = 2;

        cmb_city = new JComboBox<>(cities);
        cons.gridx = 1;
        cons.gridy = 4;
        pnl_form.add(cmb_city, cons);
        
        // Form Textboxes
        
        txt_name = new JTextField(13);
        cons.gridx = 1;
        cons.gridy = 1;
        pnl_form.add(txt_name, cons);

        txt_scndName = new JTextField(13);
        cons.gridx = 1;
        cons.gridy = 2;
        pnl_form.add(txt_scndName, cons);

        txt_address = new JTextField(13);
        cons.gridx = 1;
        cons.gridy = 3;
        pnl_form.add(txt_address, cons);

        // Form Buttons
        
        btn_send = new JButton("Enviar");
        btn_send.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                btn_sendAction();
            }
        });
        cons.gridx = 0;
        cons.gridy = 6;
        pnl_form.add(btn_send, cons);

        btn_cancel = new JButton("Cancelar");
        btn_cancel.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                btn_cancelAction();
            }
        });
        cons.gridx = 1;
        cons.gridy = 6;
        pnl_form.add(btn_cancel, cons);

        // --- Image Panel ---

        JPanel pnl_img = new JPanel();
        pnl_img.setBorder(BorderFactory.createTitledBorder("Imágen"));
        pnl_img.setLayout(new GridBagLayout());

        // Image 

        image = new ImageIcon("Java-course-2020/images/default.png");
        img = image.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
        image = new ImageIcon(img);

        lbl_image = new JLabel(image);
        cons.gridx = 0;
        cons.gridy = 0;
        pnl_img.add(lbl_image, cons);

        // --- Info Panel ---

        JPanel pnl_info = new JPanel();
        pnl_info.setBorder(BorderFactory.createTitledBorder("Datos Personales"));
        pnl_info.setLayout(new GridBagLayout());

        // Info Labels

        cons.gridwidth = 1;
        cons.anchor = GridBagConstraints.LINE_END;

        lbl_Gender = new JLabel("Tratamiento:");
        cons.gridx = 0;
        cons.gridy = 0;
        pnl_info.add(lbl_Gender, cons);

        lbl_Name = new JLabel("Nombre:");
        cons.gridx = 0;
        cons.gridy = 1;
        pnl_info.add(lbl_Name, cons);

        lbl_ScndName = new JLabel("Apellido:");
        cons.gridx = 0;
        cons.gridy = 2;
        pnl_info.add(lbl_ScndName, cons);

        lbl_Address = new JLabel("Dirección:");
        cons.gridx = 0;
        cons.gridy = 3;
        pnl_info.add(lbl_Address, cons);

        lbl_City = new JLabel("Ciudad:");
        cons.gridx = 0;
        cons.gridy = 4;
        pnl_info.add(lbl_City, cons);

        lbl_Preferences = new JLabel("Preferencias:");
        cons.gridx = 0;
        cons.gridy = 5;
        pnl_info.add(lbl_Preferences, cons);

        cons.anchor = GridBagConstraints.LINE_START;

        lbl_infoGender = new JLabel();
        cons.gridx = 1;
        cons.gridy = 0;
        pnl_info.add(lbl_infoGender, cons);

        lbl_infoName = new JLabel();
        cons.gridx = 1;
        cons.gridy = 1;
        pnl_info.add(lbl_infoName, cons);

        lbl_infoScndName = new JLabel();
        cons.gridx = 1;
        cons.gridy = 2;
        pnl_info.add(lbl_infoScndName, cons);

        lbl_infoAddress = new JLabel();
        cons.gridx = 1;
        cons.gridy = 3;
        pnl_info.add(lbl_infoAddress, cons);

        lbl_infoCity = new JLabel();
        cons.gridx = 1;
        cons.gridy = 4;
        pnl_info.add(lbl_infoCity, cons);

        lbl_infoPreferences = new JLabel("");
        cons.gridx = 1;
        cons.gridy = 5;
        pnl_info.add(lbl_infoPreferences, cons);

        // Panels collocation

        cons.fill = GridBagConstraints.BOTH;
        cons.anchor = GridBagConstraints.CENTER;

        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridheight = 2;
        root.add(pnl_form, cons);

        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridheight = 1;
        root.add(pnl_img, cons);

        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridheight = 1;
        root.add(pnl_info, cons);

        // Frame final setup

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void btn_sendAction() {

        // Form Fillout
        
        lbl_infoName.setText(txt_name.getText());
        lbl_infoScndName.setText(txt_scndName.getText());
        lbl_infoAddress.setText(txt_address.getText());
        lbl_infoCity.setText(cmb_city.getSelectedItem().toString());

        lbl_infoPreferences.setText("");

        if (chk_books.isSelected()) {
            lbl_infoPreferences.setText(lbl_infoPreferences.getText() + " Libros");
        }

        if (chk_movies.isSelected()) {
            lbl_infoPreferences.setText(lbl_infoPreferences.getText() + " Películas");
        }

        // Profile Picture Setup

        if (rad_male.isSelected()) {
            lbl_infoGender.setText("Sr.");
            image = new ImageIcon("Java-course-2020/images/male.png");
        } else if (rad_female.isSelected()) {
            lbl_infoGender.setText("Sra.");
            image = new ImageIcon("Java-course-2020/images/female.png");
        } else {
            lbl_infoGender.setText("No Seleccionado.");
            image = new ImageIcon("Java-course-2020/images/default.png");
        }

        img = image.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
        image = new ImageIcon(img);
        lbl_image.setIcon(image);

    }

    private void btn_cancelAction() {
        
        // Info Panel Reset

        lbl_infoGender.setText("");
        lbl_infoName.setText("");
        lbl_infoScndName.setText("");
        lbl_infoAddress.setText("");
        lbl_infoCity.setText("");
        lbl_infoPreferences.setText("");

        image = new ImageIcon("Java-course-2020/images/default.png");
        img = image.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
        image = new ImageIcon(img);
        lbl_image.setIcon(image);

        // Form Panel Reset

        txt_name.setText("");
        txt_scndName.setText("");
        txt_address.setText("");

        chk_books.setSelected(false);
        chk_movies.setSelected(false);

    }

    public static void main(String[] args) throws Exception {
        new Exercise_124();
    }
}