/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import Metodos.Conexion;
import Metodos.MetodosBD2;
import Metodos.PersonalizarTabla;
import Metodos.PersonalizarTabla2;
import Metodos.Placeholder;
import Metodos.SetColores3;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author roger
 */
public class CrudUsuarios extends javax.swing.JPanel {

    MetodosBD2 metodos = new MetodosBD2();
    String [] botones = {"Aceptar", "Cancelar"}; //Para botones de opciones de los JOption Pane.showOptionDialog
    public CrudUsuarios() {
        initComponents();
        mostrarUsuarios();
        
        SetColores3 color = new SetColores3(panel1);
        Placeholder caja1 = new Placeholder("Ingrese el usuario a buscar", buscarTxt);
        SetColores3 ctxt = new SetColores3(buscarTxt);
        
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(tablaUsuario);
        metodos.verItem(modificarItem, eliminarItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        modificarItem = new javax.swing.JMenuItem();
        eliminarItem = new javax.swing.JMenuItem();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        buscarTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        modificarItem.setText("Modificar");
        modificarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(modificarItem);

        eliminarItem.setText("Eliminar");
        eliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminarItem);

        setPreferredSize(new java.awt.Dimension(880, 420));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUsuario.setComponentPopupMenu(jPopupMenu1);
        tablaUsuario.setShowGrid(true);
        jScrollPane1.setViewportView(tablaUsuario);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 880, 320));

        buscarTxt.setBorder(null);
        buscarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTxtActionPerformed(evt);
            }
        });
        panel1.add(buscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 30));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTxtActionPerformed
        // TODO add your handling code here:
        mostrarUsuarios();
    }//GEN-LAST:event_buscarTxtActionPerformed

    private void modificarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarItemActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "¿Desea modificar el registro?", "Modificación", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            actualizar();
            mostrarUsuarios();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_modificarItemActionPerformed

    private void eliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarItemActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "¿Desea eliminar usuarios?", "Eliminar", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            eliminar();
            mostrarUsuarios();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
        
    }//GEN-LAST:event_eliminarItemActionPerformed
    
    public void mostrarUsuarios(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        JTableHeader jtableheader = tablaUsuario.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        modelo.addColumn("Usuario");
        modelo.addColumn("Correo");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Pregunta");
        modelo.addColumn("Respuesta");
        modelo.addColumn("Tipo");
        modelo.addColumn("Activo");
        modelo.addColumn("Color");
        tablaUsuario.setModel(modelo);
        String[] datos=new String[8];//depende de cuantas columnas queremos mostrar, igual si queremos
        //mostrar solamente 5campos de la BD el array sera de 5 y la tabla tendra solo 5 columnas
        
        //aquí se manda a traer a una vista que se ha creado en la BD
        try{

            String sql="call procedure_filtro_usuario('"+buscarTxt.getText()+"')";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            //si el sql es correcto, ejecutrá el siguiente while
            while(cn.resultado.next()){
                //aquí se asignará a cada array el dato que corresponde
                datos[0]=cn.resultado.getString(1);
                datos[1]=cn.resultado.getString(2);
                datos[2]=cn.resultado.getString(3);
                datos[3]=cn.resultado.getString(4);
                datos[4]=cn.resultado.getString(5);
                datos[5]=cn.resultado.getString(6);
                datos[6]=cn.resultado.getString(7);
                datos[7]=cn.resultado.getString(8);
                modelo.addRow(datos);
            }
            tablaUsuario.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar BD: "+e);
        }
    }
    
    public void actualizar(){
        int fila=tablaUsuario.getSelectedRow();//la lía que está seleccionada
          String vusuario=tablaUsuario.getValueAt(fila, 0).toString();
          String vcorreo=tablaUsuario.getValueAt(fila, 1).toString();
          String vcontrasena=tablaUsuario.getValueAt(fila, 2).toString();
          String vpregunta=tablaUsuario.getValueAt(fila, 3).toString();
          String vrespuesta=tablaUsuario.getValueAt(fila, 4).toString();
          int vtipo=Integer.parseInt(tablaUsuario.getValueAt(fila, 5).toString());
          int vactivo=Integer.parseInt(tablaUsuario.getValueAt(fila, 6).toString());
          String vcolor=tablaUsuario.getValueAt(fila, 7).toString();
          metodos.updateUsuario(vusuario, vcorreo, vcontrasena, vpregunta, vrespuesta, vtipo, vactivo, vcolor);
    }
    
    public void eliminar(){
        int fila=tablaUsuario.getSelectedRow();//la lía que está seleccionada
          String vusuario=tablaUsuario.getValueAt(fila, 0).toString();
          metodos.deleteUsuario(vusuario);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JMenuItem eliminarItem;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem modificarItem;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tablaUsuario;
    // End of variables declaration//GEN-END:variables
}
