
package crud;

import Metodos.Conexion;
import Metodos.MetodosBD2;
import Metodos.PersonalizarTabla;
import Metodos.PersonalizarTabla2;
import Metodos.Placeholder;
import Metodos.SetColores;
import Metodos.SetColores2;
import Metodos.SetColores3;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class crudMarcas extends javax.swing.JPanel {

    MetodosBD2 metodos=new MetodosBD2();
    String [] botones = {"Aceptar", "Cancelar"}; //Para botones de opciones de los JOption Pane.showOptionDialog
    public crudMarcas() {
        initComponents();
        mostrarMarcas();
        
        SetColores3 color1 = new SetColores3(panel1);
        SetColores color2 = new SetColores(nuevoBtn);
        
        SetColores3 ctxt = new SetColores3(marcaTxt);
        Placeholder caja = new Placeholder("Ingrese la nueva marca",marcaTxt);
        
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(tablaMarcas);
        metodos.verItem(actualizarItem, eliminarItem);
        metodos.verBoton(nuevoBtn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        actualizarItem = new javax.swing.JMenuItem();
        eliminarItem = new javax.swing.JMenuItem();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMarcas = new javax.swing.JTable();
        marcaTxt = new javax.swing.JTextField();
        nuevoBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        actualizarItem.setText("Actualizar");
        actualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(actualizarItem);

        eliminarItem.setText("Eliminar");
        eliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminarItem);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMarcas.setComponentPopupMenu(jPopupMenu1);
        tablaMarcas.setShowGrid(true);
        jScrollPane1.setViewportView(tablaMarcas);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 880, 253));

        marcaTxt.setBorder(null);
        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });
        panel1.add(marcaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 30));

        nuevoBtn.setBackground(new java.awt.Color(102, 102, 102));
        nuevoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nuevoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoBtnMousePressed(evt);
            }
        });
        nuevoBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guardar registro");
        nuevoBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 30));

        panel1.add(nuevoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 30));

        jLabel2.setText("Nueva marca");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 10));

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

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed

    private void nuevoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoBtnMousePressed
        // TODO add your handling code here:
        metodos.nuevaMarca(marcaTxt.getText());
        mostrarMarcas();
        marcaTxt.setText("");
    }//GEN-LAST:event_nuevoBtnMousePressed

    private void actualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarItemActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "¿Desea modificar el registro?", "Modificación", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            actualizar();
            mostrarMarcas();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_actualizarItemActionPerformed

    private void eliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarItemActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "¿Desea eliminar el registro?", "Eliminación", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            eliminar();
            mostrarMarcas();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_eliminarItemActionPerformed

    private void nuevoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(nuevoBtn);
        
    }//GEN-LAST:event_nuevoBtnMouseEntered

    private void nuevoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(nuevoBtn);
    }//GEN-LAST:event_nuevoBtnMouseExited

    
    public void mostrarMarcas(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        JTableHeader jtableheader = tablaMarcas.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        modelo.addColumn("idMarca");
        modelo.addColumn("Marca");
        tablaMarcas.setModel(modelo);
        String[] datos=new String[2];//depende de cuantas columnas queremos mostrar, igual si queremos
        //mostrar solamente 5campos de la BD el array sera de 5 y la tabla tendra solo 5 columnas
        
        //aquí se manda a traer a una vista que se ha creado en la BD
        try{

            String sql="select *from Marca";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            //si el sql es correcto, ejecutrá el siguiente while
            while(cn.resultado.next()){
                //aquí se asignará a cada array el dato que corresponde
                datos[0]=cn.resultado.getString(1);
                datos[1]=cn.resultado.getString(2);
                modelo.addRow(datos);
            }
            tablaMarcas.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro BD: "+e);
        }
    }
    
    
    public void actualizar(){
        int fila=tablaMarcas.getSelectedRow();//la lía que está seleccionada
        //String valor=tablaMarcas.getValueAt(fila, 0).toString();
        int id=Integer.parseInt(tablaMarcas.getValueAt(fila, 0).toString());
        String newMarca=tablaMarcas.getValueAt(fila, 1).toString();
        metodos.updateMarca(newMarca, id);
    }
    
    public void eliminar(){
        int fila=tablaMarcas.getSelectedRow();//la lía que está seleccionada
        //String valor=tablaMarcas.getValueAt(fila, 0).toString();
        int id=Integer.parseInt(tablaMarcas.getValueAt(fila, 0).toString());
        metodos.deleteMarca(id);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarItem;
    private javax.swing.JMenuItem eliminarItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JPanel nuevoBtn;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tablaMarcas;
    // End of variables declaration//GEN-END:variables
}
