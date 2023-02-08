
package crud;

import Metodos.MetodosBD2;
import Metodos.Placeholder;
import Metodos.SetColores;
import Metodos.SetColores2;
import Metodos.SetColores3;

public class InsertarDetalleFactura extends javax.swing.JPanel {

    MetodosBD2 metodos = new MetodosBD2();
    public InsertarDetalleFactura() {
        initComponents();
        
        SetColores3 color1 = new SetColores3(panel1);
        SetColores color2 = new SetColores(guardarBtn);
        SetColores3 color3 = new SetColores3(idFacturaTxt);
        SetColores3 color4 = new SetColores3(idCaracteristicaTxt);
        SetColores3 color5 = new SetColores3(precioTxt);
        SetColores3 color6 = new SetColores3(cantidadTtx);
        
        Placeholder caja1 = new Placeholder("Ingrese el id de factura",idFacturaTxt);
        Placeholder caja2 = new Placeholder("Ingrese el id de caracteristica",idCaracteristicaTxt);
        Placeholder caja3 = new Placeholder("Ingrese el precio de compra",precioTxt);
        Placeholder caja4 = new Placeholder("Ingrese la cantidad de ingreso",cantidadTtx);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        idFacturaTxt = new javax.swing.JTextField();
        precioTxt = new javax.swing.JTextField();
        idCaracteristicaTxt = new javax.swing.JTextField();
        cantidadTtx = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idFacturaTxt.setBorder(null);
        panel1.add(idFacturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 200, 30));

        precioTxt.setBorder(null);
        panel1.add(precioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, 30));

        idCaracteristicaTxt.setBorder(null);
        panel1.add(idCaracteristicaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 30));

        cantidadTtx.setBorder(null);
        panel1.add(cantidadTtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 200, 30));

        guardarBtn.setBackground(new java.awt.Color(153, 153, 153));
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

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Guardar detalle de entrada");

        javax.swing.GroupLayout guardarBtnLayout = new javax.swing.GroupLayout(guardarBtn);
        guardarBtn.setLayout(guardarBtnLayout);
        guardarBtnLayout.setHorizontalGroup(
            guardarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarBtnLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );
        guardarBtnLayout.setVerticalGroup(
            guardarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 210, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 30, 360));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, 10));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 93, 200, 10));
        panel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 200, 10));
        panel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 200, 10));

        jLabel1.setText("Id de factura");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 90, -1));

        jLabel2.setText("ID carcaterisitca o modelo");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel3.setText("Precio en Q");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel4.setText("Cantidad de entrada");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMousePressed
        // TODO add your handling code here:
        metodos.insertarDetalleFactura(Integer.parseInt(idFacturaTxt.getText()), idCaracteristicaTxt.getText(), Float.parseFloat(precioTxt.getText()), Integer.parseInt(cantidadTtx.getText()));
        idFacturaTxt.setText("");
        idCaracteristicaTxt.setText("");
        precioTxt.setText("");
        cantidadTtx.setText("");
    }//GEN-LAST:event_guardarBtnMousePressed

    private void guardarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseEntered

    private void guardarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(guardarBtn);
    }//GEN-LAST:event_guardarBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadTtx;
    private javax.swing.JPanel guardarBtn;
    private javax.swing.JTextField idCaracteristicaTxt;
    private javax.swing.JTextField idFacturaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField precioTxt;
    // End of variables declaration//GEN-END:variables
}
