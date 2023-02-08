package proyectopersonal;

import Metodos.MetodosBD;
import javax.swing.JOptionPane;
public class CambioFondo extends javax.swing.JFrame {

    MetodosBD cambio=new MetodosBD();
    public CambioFondo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combox1 = new javax.swing.JComboBox<>();
        cambiarBtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul(Default)", "Oscuro", "OscuroB", "AzulB" }));
        jPanel1.add(combox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        cambiarBtn.setText("Cambiar");
        cambiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cambiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        cancelarbtn.setText("Cancelar");
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 30, 150));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Personalizar color de fondo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cambiar el color 
    //Se llamará al metodo que modifica el color en la BD, y a través de sto, los paneles podrán leer que color 
    //le corresponden
    private void cambiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarBtnActionPerformed
        // TODO add your handling code here:
            Menu menu = new Menu();
        if(this.combox1.getSelectedItem().equals("Azul(Default)")){
            cambio.cambiarColor("azul");
                    cambio.obtenerColor();
        }else if(this.combox1.getSelectedItem().equals("Oscuro")){
            cambio.cambiarColor("negro");
                    cambio.obtenerColor();
        }else if(this.combox1.getSelectedItem().equals("OscuroB")){
            cambio.cambiarColor("negroBonito");
                    cambio.obtenerColor();
        }else if(this.combox1.getSelectedItem().equals("AzulB")){
            cambio.cambiarColor("azulBonito");
                    cambio.obtenerColor();
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se ha seleccionado ningún color");
        }
        cambio.obtenerColor();
        this.abrirMenu();//se crea este método porque solo así funciona para que se abra el Menu
    }//GEN-LAST:event_cambiarBtnActionPerformed

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_cancelarbtnActionPerformed

    public void abrirMenu(){
            Menu menu = new Menu();
            setVisible(false);
            menu.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CambioFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioFondo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarBtn;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JComboBox<String> combox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
