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


public class CrudProveedor extends javax.swing.JPanel {

    MetodosBD2 metodos = new MetodosBD2();
    String [] botones = {"Aceptar", "Cancelar"}; //Para botones de opciones de los JOption Pane.showOptionDialog
    public CrudProveedor() {
        initComponents();
        mostrarProv();
        
        SetColores3 color1 = new SetColores3(panel1);
        SetColores color2 = new SetColores(guardarBtn);
        
        //Cajas de texto
        SetColores3 ctxt1 = new SetColores3(idTxt);
        SetColores3 ctxt2 = new SetColores3(provTxt);
        SetColores3 ctxt3 = new SetColores3(nombreTxt);
        
        Placeholder caja1 = new Placeholder("Ingrese el ID del nuevo prov.",idTxt);
        Placeholder caja2 = new Placeholder("Ingrese el nombre del nuevo prov",provTxt);
        Placeholder caja3 = new Placeholder("Ingrese el nombre del proveedor a buscar",nombreTxt);
        
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(tablaProveedor);
        metodos.verItem(modificarItem, eliminarItem);
        metodos.verBoton(guardarBtn);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        modificarItem = new javax.swing.JMenuItem();
        eliminarItem = new javax.swing.JMenuItem();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        idTxt = new javax.swing.JTextField();
        provTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

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

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProveedor.setComponentPopupMenu(jPopupMenu1);
        tablaProveedor.setShowGrid(true);
        jScrollPane1.setViewportView(tablaProveedor);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 120, 630, 290));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 40, 120));

        idTxt.setBorder(null);
        panel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        provTxt.setBorder(null);
        panel1.add(provTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 30));

        nombreTxt.setBorder(null);
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        panel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 240, 30));

        guardarBtn.setBackground(new java.awt.Color(153, 153, 153));
        guardarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarBtnMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Insertar nuevo proveedor");

        javax.swing.GroupLayout guardarBtnLayout = new javax.swing.GroupLayout(guardarBtn);
        guardarBtn.setLayout(guardarBtnLayout);
        guardarBtnLayout.setHorizontalGroup(
            guardarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        guardarBtnLayout.setVerticalGroup(
            guardarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 40));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, -1));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 210, -1));
        panel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 240, 10));

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

    private void guardarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMousePressed
        // TODO add your handling code here:
        metodos.insertProveedor(idTxt.getText(), provTxt.getText());
        mostrarProv();
        idTxt.setText("");
        provTxt.setText("");
    }//GEN-LAST:event_guardarBtnMousePressed

    private void modificarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarItemActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "¿Desea modificar el registro?", "Modificación", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            actualizar();
            mostrarProv();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_modificarItemActionPerformed

    private void eliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarItemActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "¿Desea eliminar el registro?", "Eliminar", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            eliminar();
            mostrarProv();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_eliminarItemActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:}
        mostrarProv();
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void guardarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseEntered

    private void guardarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseExited

    
    public void mostrarProv(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        JTableHeader jtableheader = tablaProveedor.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        modelo.addColumn("ID");
        modelo.addColumn("Proveedor");
        tablaProveedor.setModel(modelo);
        String[] datos=new String[2];//depende de cuantas columnas queremos mostrar, igual si queremos
        //mostrar solamente 5campos de la BD el array sera de 5 y la tabla tendra solo 5 columnas
        
        //aquí se manda a traer a una vista que se ha creado en la BD
        try{

            String sql="call procedure_filtro_proveedor('"+nombreTxt.getText()+"')";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            //si el sql es correcto, ejecutrá el siguiente while
            while(cn.resultado.next()){
                //aquí se asignará a cada array el dato que corresponde
                datos[0]=cn.resultado.getString(1);
                datos[1]=cn.resultado.getString(2);
                modelo.addRow(datos);
            }
            tablaProveedor.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar BD: "+e);
        }
    }
    
    public void actualizar(){
        int fila=tablaProveedor.getSelectedRow();//la lía que está seleccionada
        String id=tablaProveedor.getValueAt(fila, 0).toString();
        String nombre=tablaProveedor.getValueAt(fila, 1).toString();
          
          metodos.updateProvvedor(id, nombre);
    }
    
    public void eliminar(){
        int fila=tablaProveedor.getSelectedRow();//la lía que está seleccionada
          String id=tablaProveedor.getValueAt(fila, 0).toString();
        metodos.deleteProveedor(id);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem eliminarItem;
    private javax.swing.JPanel guardarBtn;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JMenuItem modificarItem;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField provTxt;
    private javax.swing.JTable tablaProveedor;
    // End of variables declaration//GEN-END:variables
}
