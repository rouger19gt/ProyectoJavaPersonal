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


public class crudCarcateristica extends javax.swing.JPanel {

    MetodosBD2 metodos = new MetodosBD2();
    
    public crudCarcateristica() {
        initComponents();
        mostrarCarcateristica();
        
        SetColores3 color1 = new SetColores3(panel1);
        SetColores color2 = new SetColores(guardarBtn);
        
        SetColores3 ctx1 = new SetColores3(idCaracTxt);
        SetColores3 ctx2 = new SetColores3(idProducTxt);
        SetColores3 ctx3 = new SetColores3(almacenamientoTxt);
        SetColores3 ctx4 = new SetColores3(colorTxt);
        SetColores3 ctx5 = new SetColores3(ramTxt);
        SetColores3 ctx6 = new SetColores3(gananciaTxt);
        SetColores3 ctx7 = new SetColores3(idProductoTxt);
        
        Placeholder caja1 = new Placeholder("Ingrese ID Cara.",idCaracTxt);
        Placeholder caja2 = new Placeholder("Ingrese Id pro.",idProducTxt);
        Placeholder caja3 = new Placeholder("Ingrese alm. GB",almacenamientoTxt);
        Placeholder caja4 = new Placeholder("Ingrese color",colorTxt);
        Placeholder caja5 = new Placeholder("Ingrese ram",ramTxt);
        Placeholder caja6 = new Placeholder("Ingrese ganancia",gananciaTxt);
        Placeholder caja7 = new Placeholder("Buscar por id Producto",idProductoTxt);
        
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(caracteristicaTabla);
        
        metodos.verItem(actualizarItem, eliminarItem);
        metodos.verBoton(guardarBtn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        eliminarItem = new javax.swing.JMenuItem();
        actualizarItem = new javax.swing.JMenuItem();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caracteristicaTabla = new javax.swing.JTable();
        idProductoTxt = new javax.swing.JTextField();
        idCaracTxt = new javax.swing.JTextField();
        idProducTxt = new javax.swing.JTextField();
        almacenamientoTxt = new javax.swing.JTextField();
        colorTxt = new javax.swing.JTextField();
        ramTxt = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        gananciaTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        eliminarItem.setText("Eliminar");
        eliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminarItem);

        actualizarItem.setText("Modificar");
        actualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(actualizarItem);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caracteristicaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        caracteristicaTabla.setComponentPopupMenu(jPopupMenu1);
        caracteristicaTabla.setShowGrid(true);
        jScrollPane1.setViewportView(caracteristicaTabla);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 880, 280));

        idProductoTxt.setBorder(null);
        idProductoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoTxtActionPerformed(evt);
            }
        });
        panel1.add(idProductoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 150, 20));

        idCaracTxt.setBorder(null);
        idCaracTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCaracTxtActionPerformed(evt);
            }
        });
        panel1.add(idCaracTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 20));

        idProducTxt.setBorder(null);
        idProducTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProducTxtActionPerformed(evt);
            }
        });
        panel1.add(idProducTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, 20));

        almacenamientoTxt.setBorder(null);
        panel1.add(almacenamientoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 80, 20));

        colorTxt.setBorder(null);
        panel1.add(colorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, 20));

        ramTxt.setBorder(null);
        panel1.add(ramTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, 20));

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
        guardarBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Guardar");
        guardarBtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, -1));

        panel1.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 160, 40));

        gananciaTxt.setBorder(null);
        panel1.add(gananciaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 80, 20));

        jLabel1.setText("IdCaracter.");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("idProducto");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel3.setText("Alm. GB");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, -1));

        jLabel4.setText("Color");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 40, -1));

        jLabel5.setText("Ram");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel6.setText("Ganancia %");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 20, 130));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 150, 10));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 10));
        panel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, 10));
        panel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, 10));
        panel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 80, 10));
        panel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 80, 10));
        panel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 80, 10));

        jLabel8.setText("No ingresar \"%\"");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setText("Filtro");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 60, 30));

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

    private void idProductoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoTxtActionPerformed
        // TODO add your handling code here:
        mostrarCarcateristica();
    }//GEN-LAST:event_idProductoTxtActionPerformed

    private void idCaracTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCaracTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCaracTxtActionPerformed

    private void idProducTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProducTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProducTxtActionPerformed

    private void guardarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMousePressed
        // TODO add your handling code here:
        metodos.insertCaracteristica(idCaracTxt.getText(), Integer.parseInt(almacenamientoTxt.getText()), 
                idProducTxt.getText(), colorTxt.getText(), 
                Integer.parseInt(ramTxt.getText()), Float.parseFloat(gananciaTxt.getText()));
        
        idCaracTxt.setText("");
        almacenamientoTxt.setText("");
        idProducTxt.setText("");
        colorTxt.setText("");
        ramTxt.setText("");
        gananciaTxt.setText("");
        mostrarCarcateristica();
    }//GEN-LAST:event_guardarBtnMousePressed

    private void actualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarItemActionPerformed
        // TODO add your handling code here:
        String [] botones = {"Aceptar", "Cancelar"};
        int x=JOptionPane.showOptionDialog(this, "¿Desea modificar registro?", "Modificación", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        
        if(x==0){
            actualizar();
            mostrarCarcateristica();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_actualizarItemActionPerformed

    private void eliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarItemActionPerformed
        // TODO add your handling code here:
        String [] botones = {"Aceptar", "Cancelar"};
        int x=JOptionPane.showOptionDialog(this, "¿Desea eliminar el registro?", "Eliminación", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            eliminar();
            mostrarCarcateristica();
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_eliminarItemActionPerformed

    private void guardarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color2 = new SetColores2(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseEntered

    private void guardarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseExited
        // TODO add your handling code here:
        SetColores color2 = new SetColores(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseExited


    public void mostrarCarcateristica(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        JTableHeader jtableheader = caracteristicaTabla.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        modelo.addColumn("idCaracteristica");
        modelo.addColumn("idProducto");
        modelo.addColumn("Almacenamiento");
        modelo.addColumn("Color");
        modelo.addColumn("Ram GB");
        modelo.addColumn("Costo");
        modelo.addColumn("Ganancia");
        modelo.addColumn("Precio");
        modelo.addColumn("Entradas");
        modelo.addColumn("Salidas");
        modelo.addColumn("Existencia");
        caracteristicaTabla.setModel(modelo);
        String[] datos=new String[11];//depende de cuantas columnas queremos mostrar, igual si queremos
        //mostrar solamente 5campos de la BD el array sera de 5 y la tabla tendra solo 5 columnas
        
        //aquí se manda a traer a una vista que se ha creado en la BD
        try{

            String sql="call procedure_vista_caracteristica('"+idProductoTxt.getText()+"')";
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
                datos[8]=cn.resultado.getString(9);
                datos[9]=cn.resultado.getString(10);
                datos[10]=cn.resultado.getString(11);
                modelo.addRow(datos);
            }
            caracteristicaTabla.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro BD: "+e);
        }
    }
    
    public void actualizar(){
        int fila=caracteristicaTabla.getSelectedRow();//la lía que está seleccionada
        
        String idCa = caracteristicaTabla.getValueAt(fila, 0).toString();
        String idPro = caracteristicaTabla.getValueAt(fila, 1).toString();
        int almacenamiento = Integer.parseInt(caracteristicaTabla.getValueAt(fila, 2).toString());
        String color = caracteristicaTabla.getValueAt(fila, 3).toString();
       
        int ram =  Integer.parseInt(caracteristicaTabla.getValueAt(fila, 4).toString());
      
        float ganancia = Float.parseFloat(caracteristicaTabla.getValueAt(fila, 6).toString());
        float precio = Float.parseFloat(caracteristicaTabla.getValueAt(fila, 7).toString());
        //En el caso de que la celda esté vacía, habrá error en los datos de tipo numérico, por lo que puedes
        //usar lo siguiente: Object precio = caracteristicaTabla.getValueAt(fila, 7)
        
        metodos.updateCaracteristica(idCa, almacenamiento, precio, idPro, color, ram, ganancia);
        //JOptionPane.showMessageDialog(null, ram);
    }
    
    public void eliminar(){
        int fila=caracteristicaTabla.getSelectedRow();//la lía que está seleccionada
        //String valor=tablaMarcas.getValueAt(fila, 0).toString();
        String idCa = caracteristicaTabla.getValueAt(fila, 0).toString();
        metodos.deleteCaracteristica(idCa);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarItem;
    private javax.swing.JTextField almacenamientoTxt;
    private javax.swing.JTable caracteristicaTabla;
    private javax.swing.JTextField colorTxt;
    private javax.swing.JMenuItem eliminarItem;
    private javax.swing.JTextField gananciaTxt;
    private javax.swing.JPanel guardarBtn;
    private javax.swing.JTextField idCaracTxt;
    private javax.swing.JTextField idProducTxt;
    private javax.swing.JTextField idProductoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField ramTxt;
    // End of variables declaration//GEN-END:variables
}
