
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

public class CrudPuesto extends javax.swing.JPanel {

     String [] botones = {"Aceptar", "Cancelar"}; //Para botones de opciones de los JOption Pane.showOptionDialog
     MetodosBD2 metodos = new MetodosBD2();
    public CrudPuesto() {
        initComponents();
        mostrarPuesto();
        
        SetColores3 color1 = new SetColores3(panel1);
        SetColores color2 = new SetColores(guardarBtn);
        
        //cajas de textos
        SetColores3 ctxt1 = new SetColores3(puestoTxt);
        SetColores3 ctxt2 = new SetColores3(deptTxt);
        SetColores3 ctxt3 = new SetColores3(puestoTxt1);
        SetColores3 ctxt4 = new SetColores3(deptTxt1);
        
        Placeholder caja1 = new Placeholder("Buscar por puestos",puestoTxt);
        Placeholder caja2 = new Placeholder("Buscar por Departamentos",deptTxt);
        Placeholder caja3 = new Placeholder("Ingrese el nombre del nuevo puesto",puestoTxt1);
        Placeholder caja4 = new Placeholder("Ingrese el ID. a cual dept. pertenece",deptTxt1);
        
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(tablaPuesto);
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
        tablaPuesto = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        deptTxt = new javax.swing.JTextField();
        puestoTxt1 = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deptTxt1 = new javax.swing.JTextField();
        puestoTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

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

        tablaPuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPuesto.setComponentPopupMenu(jPopupMenu1);
        tablaPuesto.setShowGrid(true);
        jScrollPane1.setViewportView(tablaPuesto);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 120, 640, 290));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 50, 120));

        deptTxt.setBorder(null);
        deptTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptTxtActionPerformed(evt);
            }
        });
        panel1.add(deptTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 170, 30));

        puestoTxt1.setBorder(null);
        panel1.add(puestoTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 30));

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
        jLabel1.setText("Insertar nuevo puesto");

        javax.swing.GroupLayout guardarBtnLayout = new javax.swing.GroupLayout(guardarBtn);
        guardarBtn.setLayout(guardarBtnLayout);
        guardarBtnLayout.setHorizontalGroup(
            guardarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );
        guardarBtnLayout.setVerticalGroup(
            guardarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, 40));

        deptTxt1.setBorder(null);
        panel1.add(deptTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, 30));

        puestoTxt.setBorder(null);
        puestoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoTxtActionPerformed(evt);
            }
        });
        panel1.add(puestoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 170, 30));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, 190, 10));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, 10));
        panel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 170, -1));
        panel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 170, -1));

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

    
    public void mostrarPuesto(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        
        JTableHeader jtableheader = tablaPuesto.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        modelo.addColumn("ID");
        modelo.addColumn("Puesto");
        modelo.addColumn("Departamento");
        tablaPuesto.setModel(modelo);
        String[] datos=new String[3];//depende de cuantas columnas queremos mostrar, igual si queremos
        //mostrar solamente 5campos de la BD el array sera de 5 y la tabla tendra solo 5 columnas
        
        //aquí se manda a traer a una vista que se ha creado en la BD
        try{

            String sql="call procedure_filtro_puesto('"+puestoTxt.getText()+"','"+deptTxt.getText()+"')";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            //si el sql es correcto, ejecutrá el siguiente while
            while(cn.resultado.next()){
                //aquí se asignará a cada array el dato que corresponde
                datos[0]=cn.resultado.getString(1);
                datos[1]=cn.resultado.getString(2);
                datos[2]=cn.resultado.getString(3);
                modelo.addRow(datos);
            }
            tablaPuesto.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar BD: "+e);
        }
    }
    
    
    private void guardarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMousePressed
        // TODO add your handling code here:
        metodos.insertPuesto(puestoTxt1.getText(), Integer.parseInt(deptTxt1.getText()));
        mostrarPuesto();
        puestoTxt1.setText("");
        deptTxt1.setText("");
    }//GEN-LAST:event_guardarBtnMousePressed

    private void puestoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoTxtActionPerformed
        // TODO add your handling code here:
        mostrarPuesto();
    }//GEN-LAST:event_puestoTxtActionPerformed

    private void deptTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptTxtActionPerformed
        // TODO add your handling code here:
        mostrarPuesto();
    }//GEN-LAST:event_deptTxtActionPerformed

    private void modificarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarItemActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "¿Desea modificar el registro?", "Modificación", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            actualizar();
            mostrarPuesto();
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
            mostrarPuesto();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_eliminarItemActionPerformed

    private void guardarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseEntered

    private void guardarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseExited

    
    public void actualizar(){
        int fila=tablaPuesto.getSelectedRow();//la lía que está seleccionada
        int id = Integer.parseInt(tablaPuesto.getValueAt(fila, 0).toString());
        String puesto=tablaPuesto.getValueAt(fila, 1).toString();
        int dept = Integer.parseInt(tablaPuesto.getValueAt(fila, 2).toString());
          
        metodos.updatepuesto(id, puesto, dept);
    }
    
    public void eliminar(){
        int fila=tablaPuesto.getSelectedRow();//la lía que está seleccionada
          int id = Integer.parseInt(tablaPuesto.getValueAt(fila, 0).toString());
          metodos.deletePuesto(id);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deptTxt;
    private javax.swing.JTextField deptTxt1;
    private javax.swing.JMenuItem eliminarItem;
    private javax.swing.JPanel guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem modificarItem;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField puestoTxt;
    private javax.swing.JTextField puestoTxt1;
    private javax.swing.JTable tablaPuesto;
    // End of variables declaration//GEN-END:variables
}
