
package Metodos;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SetColores2 {
    Fondos fondo2=new Fondos();
    MetodosBD mbd=new MetodosBD();
    
    public SetColores2(JPanel panel){
        setColor2(panel);
    }
    
    void setColor2(JPanel panel) {
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                fondo2.azulClaro(panel);
            } else if (mbd.getModificarColor().equals("negro")) {
                fondo2.oscuroClaro(panel);
            } else if (mbd.getModificarColor().equals("negroBonito")) {
                fondo2.oscuroBonitoClaro(panel);

            } else if (mbd.getModificarColor().equals("azulBonito")) {
                fondo2.azulOscuroClaro(panel);
            } else {
                //JOptionPane.showMessageDialog(null, "Error con el color");
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error con el color");
            fondo2.azulClaro(panel);
        }
    }
}
