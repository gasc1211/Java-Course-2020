package app;

import javax.swing.JOptionPane;
public class Exercise_88{
    
    public static void main(String[] args){
        Object col[] = {"Amarillo","Rojo","Verde","Azul"};
        Object op = JOptionPane.showInputDialog(null, "Selecciona un color de la lista: ","Colores",JOptionPane.QUESTION_MESSAGE,null,col,col[0]);
        String msg = "El color seleccionado es: ";
        
        if (op=="Amarillo"){
            msg += "Amarillo";
        } else if (op=="Rojo"){
            msg += "Rojo";
        } else if (op=="Verde"){
            msg += "Verde";
        } else if (op=="Azul"){
            msg += "Azul";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}