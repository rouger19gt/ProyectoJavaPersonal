package Metodos;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SetColores {
    
    Fondos fondo2=new Fondos();
    MetodosBD mbd=new MetodosBD();
    
    //para identificar los paneles, solo se llama desde el frame que panel llevará estos colores
    public SetColores(JPanel panel){
        setColor1(panel);
    }
    

    
    void setColor1(JPanel panel) {
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                fondo2.azul(panel);
            } else if (mbd.getModificarColor().equals("negro")) {
                fondo2.oscuro(panel);
            } else if (mbd.getModificarColor().equals("negroBonito")) {
                fondo2.oscuroBonito(panel);

            } else if (mbd.getModificarColor().equals("azulBonito")) {
                fondo2.azulOscuro(panel);
            } else {
                //JOptionPane.showMessageDialog(null, "Error con el color");
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error con el color");
            fondo2.azul(panel);
        }
    }
    
}
