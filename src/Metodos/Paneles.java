package Metodos;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Paneles {
    //en esta clase estarán los metodos para establecer los colores a los paneles
        MetodosBD mbd =new MetodosBD();
        Fondos fondo=new Fondos();
        
    public void setColorPricipal(JPanel panel) {
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                fondo.azulClaro(panel);

            } else if (mbd.getModificarColor().equals("negro")) {
                fondo.oscuroClaro(panel);

            } else if (mbd.getModificarColor().equals("negroBonito")) {
                fondo.oscuroBonitoClaro(panel);

            } else if (mbd.getModificarColor().equals("azulBonito")) {
                fondo.azulOscuroClaro(panel);

            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado el color");
            }
        } catch (Exception e) {

        }
    }
    
       public void setColorBotones(JPanel panel) {
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                fondo.azul(panel);

            } else if (mbd.getModificarColor().equals("negro")) {
                fondo.oscuro(panel);

            } else if (mbd.getModificarColor().equals("negroBonito")) {
                fondo.oscuroBonito(panel);

            } else if (mbd.getModificarColor().equals("azulBonito")) {
                fondo.azulOscuro(panel);

            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado el color");
            }
        } catch (Exception e) {

        }
    } 
}
