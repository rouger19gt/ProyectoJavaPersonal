package crud;

import Metodos.MetodosBD2;
import Metodos.SetColores;
import Metodos.SetColores2;
import Metodos.SetColores3;
import java.awt.BorderLayout;


public class crudPersonas extends javax.swing.JPanel {

    
    private int x=0;//para los botones
    MetodosBD2 metodos = new MetodosBD2();
    public crudPersonas() {
        initComponents();
        
        SetColores3 color1 = new SetColores3(panel1);
        SetColores3 color2 = new SetColores3(panel2);
        SetColores color3 = new SetColores(nuevoUsuarioBtn);
        SetColores color4 = new SetColores(UsuariosBtn);
        SetColores color5 = new SetColores(clientesBtn);
        SetColores color6 = new SetColores(empleadosBtn);
        metodos.verBoton(nuevoUsuarioBtn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        nuevoUsuarioBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UsuariosBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        clientesBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        empleadosBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(153, 153, 153));
        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevoUsuarioBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nuevoUsuarioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoUsuarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoUsuarioBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoUsuarioBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoUsuarioBtnMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Usuario");

        javax.swing.GroupLayout nuevoUsuarioBtnLayout = new javax.swing.GroupLayout(nuevoUsuarioBtn);
        nuevoUsuarioBtn.setLayout(nuevoUsuarioBtnLayout);
        nuevoUsuarioBtnLayout.setHorizontalGroup(
            nuevoUsuarioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoUsuarioBtnLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        nuevoUsuarioBtnLayout.setVerticalGroup(
            nuevoUsuarioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoUsuarioBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(nuevoUsuarioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, -1));

        UsuariosBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UsuariosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsuariosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuariosBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuariosBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuariosBtnMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuarios");

        javax.swing.GroupLayout UsuariosBtnLayout = new javax.swing.GroupLayout(UsuariosBtn);
        UsuariosBtn.setLayout(UsuariosBtnLayout);
        UsuariosBtnLayout.setHorizontalGroup(
            UsuariosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosBtnLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        UsuariosBtnLayout.setVerticalGroup(
            UsuariosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(UsuariosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 150, -1));

        clientesBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clientesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientesBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesBtnMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");

        javax.swing.GroupLayout clientesBtnLayout = new javax.swing.GroupLayout(clientesBtn);
        clientesBtn.setLayout(clientesBtnLayout);
        clientesBtnLayout.setHorizontalGroup(
            clientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesBtnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        clientesBtnLayout.setVerticalGroup(
            clientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(clientesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 150, -1));

        empleadosBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        empleadosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empleadosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empleadosBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empleadosBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empleadosBtnMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empleados");

        javax.swing.GroupLayout empleadosBtnLayout = new javax.swing.GroupLayout(empleadosBtn);
        empleadosBtn.setLayout(empleadosBtnLayout);
        empleadosBtnLayout.setHorizontalGroup(
            empleadosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empleadosBtnLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        empleadosBtnLayout.setVerticalGroup(
            empleadosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadosBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(empleadosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 140, -1));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 420));

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

    private void nuevoUsuarioBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioBtnMousePressed
        // TODO add your handling code here:
        x=1;
        SetColores2 color = new SetColores2(nuevoUsuarioBtn);
        SetColores colorr1 = new SetColores(UsuariosBtn);
        SetColores colorr2 = new SetColores(clientesBtn);
        SetColores colorr3 = new SetColores(empleadosBtn);
            
        CrearUsuario usuario = new CrearUsuario();
        usuario.setSize(880,420);
        usuario.setLocation(0,0);
        
        panel2.removeAll();
        panel2.add(usuario,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_nuevoUsuarioBtnMousePressed

    private void UsuariosBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosBtnMousePressed
        // TODO add your handling code here:
        x=2;
        SetColores2 color = new SetColores2(UsuariosBtn);
        SetColores colorr1 = new SetColores(nuevoUsuarioBtn);
        SetColores colorr2 = new SetColores(clientesBtn);
        SetColores colorr3 = new SetColores(empleadosBtn);
        
        CrudUsuarios usuario = new CrudUsuarios();
        usuario.setSize(880, 420);
        usuario.setLocation(0, 0);
        
        //tuve que hacer que el panel2 de la clase crudPersona fuera publica y static
        panel2.removeAll();
        panel2.add(usuario, BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_UsuariosBtnMousePressed

    private void clientesBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnMousePressed
        // TODO add your handling code here:
        x=3;
        SetColores2 color = new SetColores2(clientesBtn);
        SetColores colorr1 = new SetColores(UsuariosBtn);
        SetColores colorr2 = new SetColores(nuevoUsuarioBtn);
        SetColores colorr3 = new SetColores(empleadosBtn);
        
        CrudClientes cliente = new CrudClientes();
        cliente.setSize(880, 420);
        cliente.setLocation(0, 0);
        
        //tuve que hacer que el panel2 de la clase crudPersona fuera publica y static
        panel2.removeAll();
        panel2.add(cliente, BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_clientesBtnMousePressed

    private void empleadosBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosBtnMousePressed
        // TODO add your handling code here:
        x=4;
        SetColores2 color = new SetColores2(empleadosBtn);
        SetColores colorr1 = new SetColores(UsuariosBtn);
        SetColores colorr2 = new SetColores(clientesBtn);
        SetColores colorr3 = new SetColores(nuevoUsuarioBtn);
        
        CrudEmpleado empleado = new CrudEmpleado();
        empleado.setSize(880, 420);
        empleado.setLocation(0, 0);
        
        //tuve que hacer que el panel2 de la clase crudPersona fuera publica y static
        panel2.removeAll();
        panel2.add(empleado, BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_empleadosBtnMousePressed

    private void nuevoUsuarioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(nuevoUsuarioBtn);
    }//GEN-LAST:event_nuevoUsuarioBtnMouseEntered

    private void nuevoUsuarioBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioBtnMouseExited
        // TODO add your handling code here:
        if(x==1){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(nuevoUsuarioBtn);
        }
    }//GEN-LAST:event_nuevoUsuarioBtnMouseExited

    private void UsuariosBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(UsuariosBtn);
        
    }//GEN-LAST:event_UsuariosBtnMouseEntered

    private void UsuariosBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosBtnMouseExited
        // TODO add your handling code here:
        if(x==2){
            //no hace nada porque el botón está seleccionado y no cambia de color
        }else{
            SetColores color = new SetColores(UsuariosBtn);
        }
    }//GEN-LAST:event_UsuariosBtnMouseExited

    private void clientesBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(clientesBtn);
    }//GEN-LAST:event_clientesBtnMouseEntered

    private void clientesBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnMouseExited
        // TODO add your handling code here:
        if(x==3){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(clientesBtn);
        }
    }//GEN-LAST:event_clientesBtnMouseExited

    private void empleadosBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(empleadosBtn);
    }//GEN-LAST:event_empleadosBtnMouseEntered

    private void empleadosBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosBtnMouseExited
        // TODO add your handling code here:
        if(x==4){
            //no hace nada porque el botón está seleccionado y no quiero que cambie de color
        }else{
            SetColores color = new SetColores(empleadosBtn);
        }
    }//GEN-LAST:event_empleadosBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UsuariosBtn;
    private javax.swing.JPanel clientesBtn;
    private javax.swing.JPanel empleadosBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel nuevoUsuarioBtn;
    private javax.swing.JPanel panel1;
    public static javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
