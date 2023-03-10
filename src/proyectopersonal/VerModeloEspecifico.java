/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersonal;

import Metodos.Conexion;
import Metodos.FondoLabel;
import Metodos.MetodosBD;
import Metodos.MetodosJava;
import Metodos.PersonalizarTabla;
import Metodos.PersonalizarTabla2;
import Metodos.SetColores;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class VerModeloEspecifico extends javax.swing.JPanel {
    MetodosBD metodos =new MetodosBD();
    MetodosJava metodos2 = new MetodosJava();
    
    public VerModeloEspecifico() {
        initComponents();
        
        mostrarCaracteristica();
        
        SetColores color = new SetColores(panel1);
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(tablaCarac);
        nombreLabel.setText(metodos.getObtenerModelo());
        verFot();
    }
    
    public void mostrarCaracteristica(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        JTableHeader jtableheader = tablaCarac.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("RAM");
        modelo.addColumn("Almac. GB");
        modelo.addColumn("Color");
        modelo.addColumn("Precio");
        tablaCarac.setModel(modelo);
        String[] datos=new String[7];
        
        try{
            String producto=metodos.getObtenerModelo();
            String sql="call ver_producto_especifico('"+metodos.getObtenerModelo()+"')";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                datos[0]=cn.resultado.getString(1);
                datos[1]=cn.resultado.getString(2);
                datos[2]=cn.resultado.getString(3);
                datos[3]=cn.resultado.getString(4);
                datos[4]=cn.resultado.getString(5);
                datos[5]=cn.resultado.getString(6);
                datos[6]=cn.resultado.getString(7);
                modelo.addRow(datos);
            }
            tablaCarac.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el contenido: "+e);
        }
        
    }
    
    /*se crea un arraylist en la clase MetodosJava, este guardar?? todos los productos que se quiera comprar
    y luego lo mostrar?? en otra secci??n. Al ser arraylist, se podr?? remover productos.
    */
            
    public void a??adirCarritoCompras(){
        Conexion cn = new Conexion();
        cn.Conectar();
        //selecciona la fila presionada
        int fila = tablaCarac.getSelectedRow();
        String valor = tablaCarac.getValueAt(fila, 0).toString();
        try{
            if(metodos2.ncarrito.contains(valor)){//indica si el producto de la fila seleccionada ya est?? en el array
                JOptionPane.showMessageDialog(null, "Producto existente en el carrito");
            }else{
                metodos2.ncarrito.add(valor);
                int num =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad a comprar"));
                metodos2.cantidad.add(num);
                JOptionPane.showMessageDialog(null, "Producto agregado al carrito");
                System.out.println(metodos2.cantidad.get(0));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al a??adir al carrito: "+e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarac = new javax.swing.JTable();
        nombreLabel = new javax.swing.JLabel();
        imagenLabel = new javax.swing.JLabel();

        jMenuItem1.setText("A??adir al carrito");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        popup1.add(jMenuItem1);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setForeground(new java.awt.Color(187, 120, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCarac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCarac.setComponentPopupMenu(popup1);
        tablaCarac.setShowGrid(true);
        jScrollPane1.setViewportView(tablaCarac);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 490, 130));

        nombreLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        panel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 40));
        panel1.add(imagenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 150));

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        a??adirCarritoCompras();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //ver foto del producto
    public void verFot(){
        Conexion cn=new Conexion();
        cn.Conectar();
        
        String sql="select imagen from producto where modelo='"+metodos.getObtenerModelo()+"'";
        ImageIcon foto;
        InputStream is;
        
        try{
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                is=cn.resultado.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(130, 150, java.awt.Image.SCALE_SMOOTH);
                ImageIcon  newicon = new ImageIcon(newimg);
                imagenLabel.setIcon(newicon);    
            }
            
        }catch(Exception e){
           imagenLabel.setText("No imagen");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPopupMenu popup1;
    private javax.swing.JTable tablaCarac;
    // End of variables declaration//GEN-END:variables
}
