package Metodos;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SetColores3 {
    
    Fondos fondo2=new Fondos();
    MetodosBD mbd=new MetodosBD();
    
    public SetColores3(JPanel panel){
        setColor3(panel);
    }
    
    public SetColores3(JTextField texto){
        setColorTxt(texto);
    }
    
    
    void setColor3(JPanel panel) {
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                fondo2.panelBlanco(panel);
            } else if (mbd.getModificarColor().equals("negro")) {
                fondo2.oscuroClaro(panel);
            } else if (mbd.getModificarColor().equals("negroBonito")) {
                fondo2.oscuroBonitoClaro(panel);

            } else if (mbd.getModificarColor().equals("azulBonito")) {
                fondo2.panelBlanco(panel);
            } else {
                //JOptionPane.showMessageDialog(null, "Error con el color");
                fondo2.panelBlanco(panel);
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Error con el color");
            fondo2.panelBlanco(panel);
        }
    }
    
    public void setColorTxt(JTextField texto){
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                texto.setBackground(Color.white);
                texto.setForeground(Color.BLACK);
            } else if (mbd.getModificarColor().equals("negro")) {
                texto.setBackground(new Color(0,0,0));
                texto.setForeground(Color.white);
            } else if (mbd.getModificarColor().equals("negroBonito")) {
                texto.setBackground(new Color(20,20,20));
                texto.setForeground(Color.white);
            } else if (mbd.getModificarColor().equals("azulBonito")) {
                texto.setBackground(Color.white);
                texto.setForeground(Color.BLACK);
            } else {
                //JOptionPane.showMessageDialog(null, "Error con el color");
                texto.setBackground(Color.white);
                texto.setForeground(Color.BLACK);
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error con el color");
            texto.setBackground(Color.white);
            texto.setForeground(Color.BLACK);
        }
    }
}
