/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import Metodos.MetodosBD2;
import Metodos.Placeholder;
import Metodos.SetColores;
import Metodos.SetColores2;
import Metodos.SetColores3;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class CrearEmpleado extends javax.swing.JPanel {

    MetodosBD2 metodos = new MetodosBD2();
    public CrearEmpleado() {
        initComponents();
        
        SetColores3 color1 = new SetColores3(panel1);
        SetColores color2 = new SetColores(crearBtn);
        
        SetColores3 ctxt1 = new SetColores3(idTxt);
        SetColores3 ctxt2 = new SetColores3(nombreTxt);
        SetColores3 ctxt3 = new SetColores3(apellidoTxt);
        SetColores3 ctxt4 = new SetColores3(dpiTxt);
        SetColores3 ctxt5 = new SetColores3(telefonoTxt);
        SetColores3 ctxt6 = new SetColores3(nitTxt);
        SetColores3 ctxt7 = new SetColores3(puestoTxt);
        SetColores3 ctxt8 = new SetColores3(usuarioTxt);
        
        Placeholder caja1 = new Placeholder("Ingrese el id del empleado",idTxt);
        Placeholder caja2 = new Placeholder("Ingrese el nombre del empleado",nombreTxt);
        Placeholder caja3 = new Placeholder("Ingrese el apellido del empleado",apellidoTxt);
        Placeholder caja4 = new Placeholder("Ingrese el dpi del empleado",dpiTxt);
        Placeholder caja5 = new Placeholder("Ingrese el puesto del empleado",puestoTxt);
        Placeholder caja6 = new Placeholder("Ingrese el nit del empleado",nitTxt);
        Placeholder caja7 = new Placeholder("Ingrese el usuario del empleado",usuarioTxt);
        Placeholder caja8 = new Placeholder("Ingrese el teléfono del empleado",telefonoTxt);
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
        puestoTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        dpiTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        nitTxt = new javax.swing.JTextField();
        crearBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        puestoTxt.setBorder(null);
        puestoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoTxtActionPerformed(evt);
            }
        });
        panel1.add(puestoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 230, 31));

        idTxt.setBorder(null);
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        panel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 240, 31));

        nombreTxt.setBorder(null);
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        panel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 240, 31));

        apellidoTxt.setBorder(null);
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        panel1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 240, 31));

        dpiTxt.setBorder(null);
        dpiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpiTxtActionPerformed(evt);
            }
        });
        panel1.add(dpiTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 240, 31));

        telefonoTxt.setBorder(null);
        telefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTxtActionPerformed(evt);
            }
        });
        panel1.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 240, 31));

        nitTxt.setBorder(null);
        nitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitTxtActionPerformed(evt);
            }
        });
        panel1.add(nitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 40, 230, 31));

        crearBtn.setBackground(new java.awt.Color(102, 102, 102));
        crearBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                crearBtnMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guardar");

        javax.swing.GroupLayout crearBtnLayout = new javax.swing.GroupLayout(crearBtn);
        crearBtn.setLayout(crearBtnLayout);
        crearBtnLayout.setHorizontalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearBtnLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        crearBtnLayout.setVerticalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 220, 40));

        usuarioTxt.setBorder(null);
        panel1.add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 220, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 30, 380));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 240, 20));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 240, 20));
        panel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, 20));
        panel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 240, 20));
        panel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 240, 20));
        panel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 240, 20));
        panel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 240, 20));
        panel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 240, 20));

        jLabel2.setText("ID");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, -1));

        jLabel3.setText("Nombre");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel4.setText("Apellido");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel5.setText("DPI");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel6.setText("Teléfono");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel7.setText("NIT");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel8.setText("Puesto");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel9.setText("Usuario");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void puestoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoTxtActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void dpiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpiTxtActionPerformed

    private void telefonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTxtActionPerformed

    private void nitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitTxtActionPerformed

    private void crearBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMousePressed
        // TODO add your handling code here:
        if(idTxt.getText().length()>0 && nombreTxt.getText().length()>0 && apellidoTxt.getText().length()>0
                && dpiTxt.getText().length()>0 && telefonoTxt.getText().length()>0 && nitTxt.getText().length()>0 && puestoTxt.getText().length()>0){
                metodos.insertTrabajador(idTxt.getText(), nombreTxt.getText(), apellidoTxt.getText(), 
                        Long.parseLong(dpiTxt.getText()), Integer.parseInt(telefonoTxt.getText()), Integer.parseInt(nitTxt.getText()),
                        Integer.parseInt(puestoTxt.getText()), usuarioTxt.getText());
                
                idTxt.setText("");
                nombreTxt.setText("");
                apellidoTxt.setText("");
                dpiTxt.setText("");
                telefonoTxt.setText("");
                nitTxt.setText("");
                puestoTxt.setText("");
                usuarioTxt.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Debe de llenar todos los campos");
        }
    }//GEN-LAST:event_crearBtnMousePressed

    private void crearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(crearBtn);
    }//GEN-LAST:event_crearBtnMouseEntered

    private void crearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(crearBtn);
    }//GEN-LAST:event_crearBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JTextField dpiTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nitTxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField puestoTxt;
    private javax.swing.JTextField telefonoTxt;
    public javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
