package Metodos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import static javax.management.Query.value;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.table.TableCellRenderer;

//mas que todo para personalizar el encabezado de la tabla
public class PersonalizarTabla implements TableCellRenderer{

    Fondos fondo2=new Fondos();
    MetodosBD mbd=new MetodosBD();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        JComponent jcomponent=null;
        
        if(value instanceof String){
            jcomponent = new JLabel((String) value);
            ((JLabel)jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel)jcomponent).setSize(20, jcomponent.getWidth());
            ((JLabel)jcomponent).setPreferredSize(new Dimension(6,jcomponent.getWidth()));
        }
        
        jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0,0,0)));
        jcomponent.setBorder(new BevelBorder(BevelBorder.RAISED,null,new Color(0,0,0),new Color(0,0,0),null));
        jcomponent.setOpaque(true);
        
        try{
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                jcomponent.setBackground(new Color(51,61,131));
            } else if (mbd.getModificarColor().equals("negro")) {
                jcomponent.setBackground(new Color(65,65,65));
            } else if (mbd.getModificarColor().equals("negroBonito")) {
                jcomponent.setBackground(new Color(65,65,65));
            } else if (mbd.getModificarColor().equals("azulBonito")) {
                jcomponent.setBackground(new Color(0,0,25));
            } else {
                //JOptionPane.showMessageDialog(null, "Error con el color");
                jcomponent.setBackground(new Color(51,61,131));
            }
        }catch(Exception e){
            jcomponent.setBackground(new Color(51,61,131));
        }
        
        jcomponent.setToolTipText("Tabla");
        jcomponent.setForeground(Color.white);
        
        return jcomponent;
    }
    
}
