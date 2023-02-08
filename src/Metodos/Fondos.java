package Metodos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTable;


//clase para poner fondo en el panel, ya sea una imagen

/*Se crea un constructor para recibir el url de la imagen, asi poder usar esta clase muchas veces.
  en file donde está el panel, solo se instancia y como parametro, se le coloca el url, despues solo nos vamos
  a "customize code" en el apartado de ediciión, y luego en "default code" le cambiamos a "custom creation"
   y en donde dice "jPanel = new javax.swing.JPanel();" borramos lo ultimo despues del "=" y ponemos el nombre de
  objeto*/
public class Fondos extends JPanel{
    private Image imagen;
    private String url;

    public Fondos(String url) {
        this.url = url;
    }
    
    public Fondos(){
        
    }
    
    @Override
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource(url)).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);//para que aparezca la imagen
            super.paint(g);
        } 
        
        
        
        //para asignarle color a los paneles
        
        public void oscuro(JPanel panel){
            panel.setBackground(new Color(0, 0, 0));
        }
        
        public void oscuroClaro(JPanel panel){
            panel.setBackground(new Color(10,10,10));
        }
        
        //asignarle color azul, el predeterminado
        public void azul(JPanel panel){
            panel.setBackground(new Color(51,61,131));
        }
        
        public void azulClaro(JPanel panel){
             panel.setBackground(new Color(51, 77, 131));
        }
        
        public void oscuroBonito(JPanel panel){
            panel.setBackground(new Color(20, 20, 20));
        }
        
        public void oscuroBonitoClaro(JPanel panel){
            panel.setBackground(new Color(35, 35, 35));
        }
        
        public void azulOscuro(JPanel panel){
            panel.setBackground(new Color(0, 0, 25));
        }
        
        public void azulOscuroClaro(JPanel panel){
            panel.setBackground(new Color(0, 0, 35));
        }
        
        
        //para las tablas
        public void tablaOscuroB(JTable tabla){
            tabla.setBackground(new Color(40, 40, 40));
        }
        
        public void tablaOscuro(JTable tabla){
            tabla.setBackground(new Color(15, 15, 15));
        }
        
        public void tablaAzulB(JTable tabla){
            tabla.setBackground(new Color(0, 0, 45));
        }
        
        public void menuBar(JMenuBar menu){
            menu.setBackground(new Color(40, 40, 40));
        }
        
        //para paneles blancos
        public void panelBlanco(JPanel panel){
            panel.setBackground(new Color(255, 255, 255));
        }
}



