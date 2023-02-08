package crud;

import Metodos.MetodosBD2;
import Metodos.SetColores;
import Metodos.SetColores2;
import Metodos.SetColores3;
import java.awt.BorderLayout;


public class crudPrincipal extends javax.swing.JPanel {

    private int x=0;
    MetodosBD2 metodos = new MetodosBD2();
    
    public crudPrincipal() {
        initComponents();
        SetColores color = new SetColores(panel4);
        SetColores3 color1 = new SetColores3(panel1);
        SetColores color2 = new SetColores(productoBtn);
        SetColores color3 = new SetColores(personasBtn);
        SetColores color5 = new SetColores(inventarioBtn);
        SetColores color6 = new SetColores(insertarBtn);
        SetColores color7 = new SetColores(empresaBtn);
        SetColores3 color8 = new SetColores3(panel2);
        
        metodos.verBoton(insertarBtn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        personasBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        productoBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inventarioBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        insertarBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        empresaBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personasBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        personasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                personasBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                personasBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                personasBtnMousePressed(evt);
            }
        });
        personasBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personas");
        personasBtn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, -1));

        panel1.add(personasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 80));

        productoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productoBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productoBtnMousePressed(evt);
            }
        });
        productoBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Producto");
        productoBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 30));

        panel1.add(productoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 80));

        inventarioBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inventarioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventarioBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventarioBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inventarioBtnMousePressed(evt);
            }
        });
        inventarioBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventarios");
        inventarioBtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        panel1.add(inventarioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 170, 80));

        insertarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertarBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertarBtnMousePressed(evt);
            }
        });
        insertarBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("entradas");
        insertarBtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Insertar");
        insertarBtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, -1));

        panel1.add(insertarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 180, 80));

        empresaBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        empresaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empresaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empresaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empresaBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empresaBtnMousePressed(evt);
            }
        });
        empresaBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Empresa");
        empresaBtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        panel1.add(empresaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 170, 80));

        panel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Source Code Pro", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADMINISTRACIÓN");
        panel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 50));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 130));

        panel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 880, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inventarioBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioBtnMousePressed
        // TODO add your handling code here:
        x=1;
        SetColores2 colorr2 = new SetColores2(inventarioBtn);
        SetColores colorr3 = new SetColores(personasBtn);
        SetColores colorr5 = new SetColores(productoBtn);
        SetColores colorr6 = new SetColores(insertarBtn);
        SetColores colorr7 = new SetColores(empresaBtn);
        
        crudInventario crudI=new crudInventario();
        crudI.setSize(880,610);
        crudI.setLocation(0,0);
        
        panel2.removeAll();
        panel2.add(crudI,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_inventarioBtnMousePressed

    private void productoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoBtnMousePressed
        // TODO add your handling code here:
        x=2;
        SetColores2 colorr2 = new SetColores2(productoBtn);
        SetColores colorr3 = new SetColores(personasBtn);
        SetColores colorr5 = new SetColores(inventarioBtn);
        SetColores colorr6 = new SetColores(insertarBtn);
        SetColores colorr7 = new SetColores(empresaBtn);
        
        crudProductos pro=new crudProductos();
        pro.setSize(880,610);
        pro.setLocation(0,0);
        
        panel2.removeAll();
        panel2.add(pro,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_productoBtnMousePressed

    private void insertarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarBtnMousePressed
        // TODO add your handling code here:
        x=3;
        SetColores2 color2 = new SetColores2(insertarBtn);
        SetColores color3 = new SetColores(personasBtn);
        SetColores color5 = new SetColores(inventarioBtn);
        SetColores color6 = new SetColores(productoBtn);
        SetColores color7 = new SetColores(empresaBtn);
        
        InsertarEntradas insertar = new InsertarEntradas();
        insertar.setSize(880,480);
        insertar.setLocation(0, 0);
        
        panel2.removeAll();
        panel2.add(insertar,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_insertarBtnMousePressed

    private void personasBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personasBtnMousePressed
        // TODO add your handling code here:
        x=4;
        SetColores2 color2 = new SetColores2(personasBtn);
        SetColores color3 = new SetColores(productoBtn);
        SetColores color5 = new SetColores(inventarioBtn);
        SetColores color6 = new SetColores(insertarBtn);
        SetColores color7 = new SetColores(empresaBtn);
        
        crudPersonas persona = new crudPersonas();
        persona.setSize(880,480);
        persona.setLocation(0,0);
        
        panel2.removeAll();
        panel2.add(persona,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_personasBtnMousePressed

    private void empresaBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaBtnMousePressed
        // TODO add your handling code here:
        x=5;
        SetColores2 colorr2 = new SetColores2(empresaBtn);
        SetColores colorr3 = new SetColores(personasBtn);
        SetColores colorr5 = new SetColores(inventarioBtn);
        SetColores colorr6 = new SetColores(insertarBtn);
        SetColores colorr7 = new SetColores(productoBtn);
        
        CrudEmpresa empresa = new CrudEmpresa();
        empresa.setSize(880,480);
        empresa.setLocation(0,0);
        
        panel2.removeAll();
        panel2.add(empresa,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_empresaBtnMousePressed

    private void productoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(productoBtn);
    }//GEN-LAST:event_productoBtnMouseEntered

    private void productoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoBtnMouseExited
        // TODO add your handling code here:
        if(x==2){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(productoBtn);
        }
    }//GEN-LAST:event_productoBtnMouseExited

    private void personasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personasBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(personasBtn);
    }//GEN-LAST:event_personasBtnMouseEntered

    private void personasBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personasBtnMouseExited
        // TODO add your handling code here:
        if(x==4){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(personasBtn);
        }
    }//GEN-LAST:event_personasBtnMouseExited

    private void inventarioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(inventarioBtn);
    }//GEN-LAST:event_inventarioBtnMouseEntered

    private void inventarioBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioBtnMouseExited
        // TODO add your handling code here:
        if(x==1){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(inventarioBtn);
        }
    }//GEN-LAST:event_inventarioBtnMouseExited

    private void insertarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(insertarBtn);
    }//GEN-LAST:event_insertarBtnMouseEntered

    private void insertarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarBtnMouseExited
        // TODO add your handling code here:
        if(x==3){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(insertarBtn);
        }
    }//GEN-LAST:event_insertarBtnMouseExited

    private void empresaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(empresaBtn);
    }//GEN-LAST:event_empresaBtnMouseEntered

    private void empresaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaBtnMouseExited
        // TODO add your handling code here:
        if(x==5){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(empresaBtn);
        }
    }//GEN-LAST:event_empresaBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel empresaBtn;
    private javax.swing.JPanel insertarBtn;
    private javax.swing.JPanel inventarioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel personasBtn;
    private javax.swing.JPanel productoBtn;
    // End of variables declaration//GEN-END:variables

}
