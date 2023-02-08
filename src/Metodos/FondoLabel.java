
package Metodos;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//clase para establecer una imagen en el label
public class FondoLabel {
    public void Escalar(JLabel verc,String ruta){
            verc.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(verc.getWidth(), verc.getHeight(), Image.SCALE_DEFAULT)));
        }
}
