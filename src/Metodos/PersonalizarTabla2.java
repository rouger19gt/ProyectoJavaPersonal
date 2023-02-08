package Metodos;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableCellRenderer;

//para personalizar el contenido de la tabla
public class PersonalizarTabla2{
    Fondos fondo2=new Fondos();
    MetodosBD mbd=new MetodosBD();
    public PersonalizarTabla2(JTable tabla){
        personalizar(tabla);
    }
    
    public void personalizar(JTable tabla){
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                tabla.setBackground(Color.white);
                tabla.setForeground(Color.black);
                
            } else if (mbd.getModificarColor().equals("negro")) {
                tabla.setBackground(new Color(35,35,35));
                tabla.setForeground(Color.white);
                tabla.setSelectionBackground(new Color(50,50,50));
                tabla.setSelectionForeground(new Color(0,0,0));
                
            } else if (mbd.getModificarColor().equals("negroBonito")) {
                tabla.setBackground(Color.white);
                tabla.setForeground(Color.black);
                tabla.setSelectionBackground(new Color(50,50,50));
                
            } else if (mbd.getModificarColor().equals("azulBonito")) {
                tabla.setBackground(Color.white);
                tabla.setForeground(Color.black);
                tabla.setSelectionBackground(new Color(0,0,55));
            } else {
                //JOptionPane.showMessageDialog(null, "Error con el color");
                tabla.setBackground(Color.white);
                tabla.setForeground(Color.black);
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error con el color");
            tabla.setBackground(Color.white);
                tabla.setForeground(Color.black);
        }
    }
 
}
