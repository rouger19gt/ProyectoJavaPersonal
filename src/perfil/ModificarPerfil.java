/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil;

import Metodos.Conexion;
import Metodos.FondoLabel;
import Metodos.MetodosBD;
import Metodos.MetodosBD2;
import Metodos.SetColores;
import Metodos.SetColores2;
import Metodos.SetColores3;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import proyectopersonal.Menu;


public class ModificarPerfil extends javax.swing.JPanel {

    MetodosBD metodos=new MetodosBD();
    MetodosBD2 metodos2=new MetodosBD2();
    Conexion cn=new Conexion();
    Statement st;
    ResultSet rs;
    String sql;
    String [] botones = {"Aceptar", "Cancelar"}; //Para botones de opciones de los JOption Pane.showOptionDialog
    
    String ruta;
    
    public ModificarPerfil() {
        initComponents();
        metodos.obtenerDatosCliente();
        metodos.obtenerDatosUsuario();
        this.nombreTxt.setText(metodos.getObtenerNombreCliente());
        this.apellidoTxt.setText(metodos.getObtenerApellidoCliente());
        this.nitTxt.setText(metodos.getObtenerNitCliente());
        this.direccionTxt.setText(metodos.getObtenerDireccionCliente());
        this.generoTxt.setText(metodos.getObtenerGeneroCliente());
        
        this.correoTxt.setText(metodos.getObtenerCorreoUsuario());
        this.contrasenaTxt.setText(metodos.getObtenercontrasena());
        this.preguntaTxt.setText(metodos.getObtenerPreguntaUsuario());
        this.respuestaTxt.setText(metodos.getObtenerRespuestaUsuario());
        
        SetColores3 ctxt1 = new SetColores3(nombreTxt);
        SetColores3 ctxt2 = new SetColores3(apellidoTxt);
        SetColores3 ctxt3 = new SetColores3(nitTxt);
        SetColores3 ctxt4 = new SetColores3(direccionTxt);
        SetColores3 ctxt5 = new SetColores3(generoTxt);
        SetColores3 ctxt6 = new SetColores3(correoTxt);
        SetColores3 ctxt7 = new SetColores3(contrasenaTxt);
        SetColores3 ctxt8 = new SetColores3(preguntaTxt);
        SetColores3 ctxt9 = new SetColores3(respuestaTxt);
        
        SetColores3 color = new SetColores3(panel1);
        
        SetColores color1 = new SetColores(abrirExploradorBtn);
        SetColores color2 = new SetColores(modificarFotoBtn);
        SetColores color3 = new SetColores(modiContraBtn);
        
        verFot();
        
        modificarFotoBtn.setVisible(false);
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
        jSeparator1 = new javax.swing.JSeparator();
        apellidoTxt = new javax.swing.JTextField();
        generoTxt = new javax.swing.JTextField();
        respuestaTxt = new javax.swing.JTextField();
        nitTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        direccionTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JTextField();
        correoTxt = new javax.swing.JTextField();
        preguntaTxt = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        modiContraBtn = new javax.swing.JPanel();
        abrirExploradorBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        contrasenaTxt = new javax.swing.JPasswordField();
        modificarFotoBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        imagenLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 470));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 10));

        apellidoTxt.setBorder(null);
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        panel1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 225, 40));

        generoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoTxtActionPerformed(evt);
            }
        });
        panel1.add(generoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 225, 40));

        respuestaTxt.setBorder(null);
        respuestaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaTxtActionPerformed(evt);
            }
        });
        panel1.add(respuestaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 225, 40));

        nitTxt.setBorder(null);
        nitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitTxtActionPerformed(evt);
            }
        });
        panel1.add(nitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 225, 40));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, 20));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 10));
        panel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 230, 10));
        panel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 230, 10));

        direccionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTxtActionPerformed(evt);
            }
        });
        panel1.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 225, 40));
        panel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 230, 10));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, 450));

        nombreTxt.setBorder(null);
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        panel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 225, 40));

        correoTxt.setBorder(null);
        correoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoTxtActionPerformed(evt);
            }
        });
        panel1.add(correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 225, 40));

        preguntaTxt.setBorder(null);
        preguntaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaTxtActionPerformed(evt);
            }
        });
        panel1.add(preguntaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 225, 40));
        panel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 230, 10));
        panel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 230, 10));
        panel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 230, 10));
        panel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 230, 10));

        jLabel1.setText("Nombre");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, -1));

        jLabel2.setText("Apellido");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setText("NIT O CF");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel4.setText("Direcci??n");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel5.setText("G??nero");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel6.setText("Correo");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel7.setText("Contase??a");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel8.setText("Pregunta secreta");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel9.setText("Respuesta");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        modiContraBtn.setBackground(new java.awt.Color(204, 204, 204));
        modiContraBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modiContraBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modiContraBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modiContraBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modiContraBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout modiContraBtnLayout = new javax.swing.GroupLayout(modiContraBtn);
        modiContraBtn.setLayout(modiContraBtnLayout);
        modiContraBtnLayout.setHorizontalGroup(
            modiContraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        modiContraBtnLayout.setVerticalGroup(
            modiContraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        panel1.add(modiContraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 40, 40));

        abrirExploradorBtn.setBackground(new java.awt.Color(204, 204, 204));
        abrirExploradorBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abrirExploradorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abrirExploradorBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abrirExploradorBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abrirExploradorBtnMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Elegir una nueva foto");

        javax.swing.GroupLayout abrirExploradorBtnLayout = new javax.swing.GroupLayout(abrirExploradorBtn);
        abrirExploradorBtn.setLayout(abrirExploradorBtnLayout);
        abrirExploradorBtnLayout.setHorizontalGroup(
            abrirExploradorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abrirExploradorBtnLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        abrirExploradorBtnLayout.setVerticalGroup(
            abrirExploradorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abrirExploradorBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(abrirExploradorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 210, 40));

        contrasenaTxt.setEditable(false);
        contrasenaTxt.setBorder(null);
        contrasenaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaTxtActionPerformed(evt);
            }
        });
        panel1.add(contrasenaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 230, 40));

        modificarFotoBtn.setBackground(new java.awt.Color(204, 204, 204));
        modificarFotoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarFotoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarFotoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarFotoBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modificarFotoBtnMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirmar la actualizaci??n");

        javax.swing.GroupLayout modificarFotoBtnLayout = new javax.swing.GroupLayout(modificarFotoBtn);
        modificarFotoBtn.setLayout(modificarFotoBtnLayout);
        modificarFotoBtnLayout.setHorizontalGroup(
            modificarFotoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarFotoBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        modificarFotoBtnLayout.setVerticalGroup(
            modificarFotoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarFotoBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(modificarFotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));
        panel1.add(urlLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 170, 20));
        panel1.add(imagenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 160, 210));

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

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "??Desea modificar su apellido?", "Modificaci??n", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            try{
                cn.Conectar();
                sql = "update clientes set apellido='"+apellidoTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar el apellido: "+e);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void generoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoTxtActionPerformed
        // TODO add your handling code here:
//        int x=JOptionPane.showOptionDialog(this, "??Desea modificar el g??nero?", "Modificaci??n", 
//                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
//        if(x==0){
//            try{
//                cn.Conectar();
//                sql = "update g??nero set apellido='"+generoTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
//                Statement ps=cn.conexion.prepareStatement(sql);
//                ps.execute(sql);
//                cn.conexion.close();
//            }catch(Exception e){
//                JOptionPane.showMessageDialog(null, "Error al actualizar el g??nero: "+e);
//            }
//        }else{
//           JOptionPane.showMessageDialog(this, "Proceso cancelado");
//        }
    }//GEN-LAST:event_generoTxtActionPerformed

    private void nitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitTxtActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "??Desea modificar el NIT?", "Modificaci??n", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            try{
                cn.Conectar();
                sql = "update clientes set nit='"+nitTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar el nit: "+e);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_nitTxtActionPerformed

    private void direccionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTxtActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "??Desea modificar la direcci??n?", "Modificaci??n", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            try{
                cn.Conectar();
                sql = "update clientes set direccion='"+direccionTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar la direcci??n: "+e);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_direccionTxtActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "??Desea modificar el nombre?", "Modificaci??n", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            try{
                cn.Conectar();
                sql = "update clientes set nombre='"+apellidoTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar el nombre: "+e);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void correoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoTxtActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "??Desea modificar el correo?", "Modificaci??n", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            try{
                cn.Conectar();
                sql = "update usuarios set correo='"+correoTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar correo: "+e);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_correoTxtActionPerformed

    private void respuestaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaTxtActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "??Desea modificar el la respuesta?", "Modificaci??n", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            try{
                cn.Conectar();
                sql = "update usuarios set respuesta='"+respuestaTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar la respuesta: "+e);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_respuestaTxtActionPerformed

    private void preguntaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntaTxtActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showOptionDialog(this, "??Desea modificar la pregunta?", "Modificaci??n", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        if(x==0){
            try{
                cn.Conectar();
                sql = "update usuarios set pregunta='"+preguntaTxt.getText()+"' where usuario = '"+metodos.getObtenerusuario()+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar el nombre: "+e);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Proceso cancelado");
        }
    }//GEN-LAST:event_preguntaTxtActionPerformed

    private void contrasenaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaTxtActionPerformed

    private void modiContraBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modiContraBtnMousePressed
        // TODO add your handling code here:
        CambiarContra cambiar=new CambiarContra(null,true);
        cambiar.setVisible(true);
    }//GEN-LAST:event_modiContraBtnMousePressed

    private void abrirExploradorBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirExploradorBtnMousePressed
        // TODO add your handling code here:
        JFileChooser jfile = new JFileChooser();
        int ap=jfile.showOpenDialog(this);
        if(ap == JFileChooser.APPROVE_OPTION){//si seleccionamos una imagene entonces har?? lo siguiente:
            ruta = jfile.getSelectedFile().getAbsolutePath();//se obtiene la ruta de imagenen
            Image miimagen=new ImageIcon(ruta).getImage();
            ImageIcon miIcono = new ImageIcon(miimagen.getScaledInstance(imagenLabel.getWidth(), imagenLabel.getHeight(), 0));
            imagenLabel.setIcon(miIcono);
            urlLabel.setText(ruta);
            
            modificarFotoBtn.setVisible(true);
            abrirExploradorBtn.setVisible(false);
        }
    }//GEN-LAST:event_abrirExploradorBtnMousePressed

    private void modificarFotoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarFotoBtnMousePressed
        // TODO add your handling code here:
        metodos2.updateFotoUsuario(metodos.getObtenerusuario(), ruta);
        abrirExploradorBtn.setVisible(true);
        modificarFotoBtn.setVisible(false);
    }//GEN-LAST:event_modificarFotoBtnMousePressed

    private void modiContraBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modiContraBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(modiContraBtn);
    }//GEN-LAST:event_modiContraBtnMouseEntered

    private void modiContraBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modiContraBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(modiContraBtn);
    }//GEN-LAST:event_modiContraBtnMouseExited

    private void abrirExploradorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirExploradorBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(abrirExploradorBtn);
    }//GEN-LAST:event_abrirExploradorBtnMouseEntered

    private void abrirExploradorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirExploradorBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(abrirExploradorBtn);
    }//GEN-LAST:event_abrirExploradorBtnMouseExited

    private void modificarFotoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarFotoBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(modificarFotoBtn);
    }//GEN-LAST:event_modificarFotoBtnMouseEntered

    private void modificarFotoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarFotoBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(modificarFotoBtn);
    }//GEN-LAST:event_modificarFotoBtnMouseExited

    public void verFot(){
        Conexion cn=new Conexion();
        cn.Conectar();
        
        String sql="select foto from usuarios where usuario='"+metodos.getObtenerusuario()+"'";
        ImageIcon foto;
        InputStream is;
        
        try{
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                is=cn.resultado.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(160, 210, java.awt.Image.SCALE_SMOOTH);
                ImageIcon  newicon = new ImageIcon(newimg);
                imagenLabel.setIcon(newicon);
                
            }
            
        }catch(Exception e){
            imagenLabel.setSize(150, 190);
            FondoLabel esc=new FondoLabel();
           esc.Escalar(imagenLabel, "/imagenes/usuario.png");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abrirExploradorBtn;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JPasswordField contrasenaTxt;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JTextField generoTxt;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel modiContraBtn;
    private javax.swing.JPanel modificarFotoBtn;
    private javax.swing.JTextField nitTxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField preguntaTxt;
    private javax.swing.JTextField respuestaTxt;
    private javax.swing.JLabel urlLabel;
    // End of variables declaration//GEN-END:variables
}
