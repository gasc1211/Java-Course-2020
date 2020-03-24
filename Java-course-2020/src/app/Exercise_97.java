package app;

import javax.swing.JOptionPane;
public class Exercise_97 {
    
    public static void main(String[] args) {
        double pr = 400.0;
        double cliente = 12.0;
        double vr=0, vn=0, desc = 0;

        vr=cliente*pr;

        if (cliente > 5) {
            desc = vr*0.15;
        }

        vn = vr - desc;
        String msg = "El valor real es: "+vr+"\nEl descuento es: "+desc+"\nEl valor neto a pagar es: "+vn;

        JOptionPane.showMessageDialog(null, msg);

    }
}