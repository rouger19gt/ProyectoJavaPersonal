/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

import Metodos.Conexion;
import Metodos.Fondos;
import Metodos.MetodosBD;
import Metodos.MetodosJava;
import Metodos.PersonalizarTabla;
import Metodos.PersonalizarTabla2;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author roger
 */
public class Carrito extends javax.swing.JPanel {
    
    MetodosJava metodos = new MetodosJava();
    MetodosBD mbd=new MetodosBD();
    Fondos fondo2=new Fondos();
    public Carrito() {
        initComponents();
        mostrarProducto();
        
        setColorPrincipal(jPanel2);
        setColor(confirmarTxt);
        
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(tablaCarrito);
        
        verBoton();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        quitarItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        confirmarTxt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        quitarItem.setText("Quitar del carrito");
        quitarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(quitarItem);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carrito y comprar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 520, 290));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCarrito.setComponentPopupMenu(jPopupMenu1);
        tablaCarrito.setShowGrid(true);
        jScrollPane1.setViewportView(tablaCarrito);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 880, 320));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmarTxt.setBackground(new java.awt.Color(153, 153, 153));
        confirmarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmarTxtMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirmar carrito");

        javax.swing.GroupLayout confirmarTxtLayout = new javax.swing.GroupLayout(confirmarTxt);
        confirmarTxt.setLayout(confirmarTxtLayout);
        confirmarTxtLayout.setHorizontalGroup(
            confirmarTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmarTxtLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        confirmarTxtLayout.setVerticalGroup(
            confirmarTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmarTxtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(confirmarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        label.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Añade un producto al carrito!!! ");
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarTxtMousePressed
        // TODO add your handling code here:
        CrearFactura factura=new CrearFactura();
        factura.setSize(520,290);
        factura.setLocation(0,0);
        
        panel2.removeAll();
        panel2.add(factura,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
        
        //tablaCarrito.setVisible(false);
        jScrollPane1.removeAll();
        confirmarTxt.setVisible(false);
    }//GEN-LAST:event_confirmarTxtMousePressed

    private void quitarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarItemActionPerformed
        // TODO add your handling code here:
        quitarDelCarrito();
        mostrarProducto();
        
    }//GEN-LAST:event_quitarItemActionPerformed

    
        public void mostrarProducto(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        JTableHeader jtableheader = tablaCarrito.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("RAM");
        modelo.addColumn("Almac. GB");
        modelo.addColumn("Color");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        tablaCarrito.setModel(modelo);
        String[] datos=new String[8];//depende de cuantas columnas queremos mostrar, igual si queremos
        //mostrar solamente 5campos de la BD el array sera de 5 y la tabla tendra solo 5 columnas
        
        //aquí se manda a traer a una vista que se ha creado en la BD
        try{
            for (int i=0;i<metodos.ncarrito.size();i++ ) {
                String sql = "call procedure_carrito_compras('"+metodos.ncarrito.get(i)+"')";
                cn.sentencia = cn.conexion.createStatement();
                cn.resultado = cn.sentencia.executeQuery(sql);
                //si el sql es correcto, ejecutrá el siguiente while
                while (cn.resultado.next()) {
                    //aquí se asignará a cada array el dato que corresponde
                    datos[0]=cn.resultado.getString(1);
                    datos[1]=cn.resultado.getString(2);
                    datos[2]=cn.resultado.getString(3);
                    datos[3]=cn.resultado.getString(4);
                    datos[4]=cn.resultado.getString(5);
                    datos[5]=cn.resultado.getString(6);
                    datos[6]=cn.resultado.getString(7);
                    datos[7]=metodos.cantidad.get(i).toString();
                    modelo.addRow(datos);
                }
                tablaCarrito.setModel(modelo);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro BD: "+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel confirmarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JPanel panel2;
    private javax.swing.JMenuItem quitarItem;
    private javax.swing.JTable tablaCarrito;
    // End of variables declaration//GEN-END:variables

    void setColor(JPanel panel){
        try{    
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
                
            }
        } catch (Exception e) {
                fondo2.azul(panel);
        }
    }

        void setColorPrincipal(JPanel panel) {
        try {
            mbd.obtenerColor();
            mbd.getModificarColor();
            if (mbd.getModificarColor().equals("azul")) {
                fondo2.azulClaro(panel);
            } else if (mbd.getModificarColor().equals("negro")) {
                fondo2.oscuroClaro(panel);
            } else if (mbd.getModificarColor().equals("negroBonito")) {
                fondo2.oscuroBonitoClaro(panel);

            } else if (mbd.getModificarColor().equals("azulBonito")) {
                fondo2.azulOscuroClaro(panel);
            } else {
                JOptionPane.showMessageDialog(null, "Error con el color");
            }
        } catch (Exception e) {
            fondo2.azulClaro(panel);
        }
    }
        
        public void quitarDelCarrito(){
            int fila = tablaCarrito.getSelectedRow();
            
            System.out.println(fila);
            metodos.ncarrito.remove(fila);
            metodos.cantidad.remove(fila);
            verBoton();

        }
        
        //este es por si el carrito no tiene ningun producto, entonces que no se visualice el botón de confirmación
        public void verBoton(){
            if(metodos.ncarrito.isEmpty()){
                confirmarTxt.setVisible(false);
                label.setVisible(true);
            }else{
                confirmarTxt.setVisible(true);
                label.setVisible(false);
            }
        }

}
