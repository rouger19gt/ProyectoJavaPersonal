package proyectopersonal;

import Metodos.Conexion;
import Metodos.Fondos;
import Metodos.MetodosBD;
import Metodos.Paneles;
import Metodos.PersonalizarTabla;
import Metodos.PersonalizarTabla2;
import Metodos.SetColores;
import Metodos.SetColores2;
import Metodos.SetColores3;
import crud.TablaImagenProducto;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class VerProductos extends javax.swing.JPanel {
MetodosBD metodos=new MetodosBD();
Paneles panel=new Paneles();

LocalDate fecha=LocalDate.now();
String str = String.valueOf(fecha);

Fondos fon=new Fondos();

private int numTabla=1;
private String sql="";


    public VerProductos() {
        initComponents();
        mostrarProducto();
        
        SetColores color1 = new SetColores(panel3);
        SetColores3 color2 = new SetColores3(panelp);
        SetColores color3 = new SetColores(panel2);
        SetColores color4 = new SetColores(todosBtn);
        SetColores color5 = new SetColores(buscarBtn);
        
        this.fechaLabel.setText(str);
        
        PersonalizarTabla2 personalizar = new PersonalizarTabla2(tablaProducto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        fechaLabel = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        panelp = new javax.swing.JPanel();
        marcaTxt = new javax.swing.JTextField();
        modeloTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        todosBtn = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 570));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProducto.setShowGrid(true);
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaProductoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProducto);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 870, 320));

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un producto para ver modelos");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 490, 300));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setForeground(new java.awt.Color(255, 255, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaLabel.setBackground(new java.awt.Color(153, 153, 153));
        fechaLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));
        panel3.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 137, 40));

        hora.setBackground(new java.awt.Color(153, 153, 153));
        hora.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 0));
        panel3.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 140, 41));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 40));

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comprar");
        panel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 30));

        add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });

        modeloTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloTxtActionPerformed(evt);
            }
        });

        buscarBtn.setBackground(new java.awt.Color(51, 61, 131));
        buscarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarBtnMousePressed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Buscar");

        javax.swing.GroupLayout buscarBtnLayout = new javax.swing.GroupLayout(buscarBtn);
        buscarBtn.setLayout(buscarBtnLayout);
        buscarBtnLayout.setHorizontalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        buscarBtnLayout.setVerticalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1)
                .addContainerGap())
        );

        todosBtn.setBackground(new java.awt.Color(51, 61, 131));
        todosBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        todosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        todosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                todosBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                todosBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                todosBtnMousePressed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Todos");

        javax.swing.GroupLayout todosBtnLayout = new javax.swing.GroupLayout(todosBtn);
        todosBtn.setLayout(todosBtnLayout);
        todosBtnLayout.setHorizontalGroup(
            todosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todosBtnLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        todosBtnLayout.setVerticalGroup(
            todosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todosBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Buscar marca");

        jLabel4.setText("Buscar modelo ");

        javax.swing.GroupLayout panelpLayout = new javax.swing.GroupLayout(panelp);
        panelp.setLayout(panelpLayout);
        panelpLayout.setHorizontalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(marcaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(todosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modeloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addGap(30, 30, 30))
        );
        panelpLayout.setVerticalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        add(panelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 390, 260));
    }// </editor-fold>//GEN-END:initComponents

    //este método sirve para poder ver las caracteristica que tiene el producto
    private void tablaProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMousePressed
        // TODO add your handling code here:
        panel2.removeAll();
        this.obtenerModelo();//se obtiene el modelo al momento de presionar la fila
        VerModeloEspecifico verModelo=new VerModeloEspecifico();
        verModelo.setSize(490,300);
        setLocation(0,0);
        
        panel2.add(verModelo,BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }//GEN-LAST:event_tablaProductoMousePressed

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed

    private void modeloTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloTxtActionPerformed

    private void buscarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMousePressed
        // TODO add your handling code here:
        sql="";
        numTabla = 2;
        mostrarProducto();
        sql="";
    }//GEN-LAST:event_buscarBtnMousePressed

    private void todosBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todosBtnMousePressed
        // TODO add your handling code here:
        sql="";
        numTabla = 1;
        mostrarProducto();
        sql="";
    }//GEN-LAST:event_todosBtnMousePressed

    private void buscarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(buscarBtn);
    }//GEN-LAST:event_buscarBtnMouseEntered

    private void buscarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(buscarBtn);
    }//GEN-LAST:event_buscarBtnMouseExited

    private void todosBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todosBtnMouseEntered
        // TODO add your handling code here:
        SetColores2 color = new SetColores2(todosBtn);
    }//GEN-LAST:event_todosBtnMouseEntered

    private void todosBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todosBtnMouseExited
        // TODO add your handling code here:
        SetColores color = new SetColores(todosBtn);
    }//GEN-LAST:event_todosBtnMouseExited

    //Se crea la tabla. En propiedades de la tabla poner 0 columnas y 0 filas, porque aquí en el código se 
    //configura eso
    public void mostrarProducto(){
        DefaultTableModel modelo=new DefaultTableModel();
        Conexion cn=new Conexion();
        cn.Conectar();
        JTableHeader jtableheader = tablaProducto.getTableHeader();
        jtableheader.setDefaultRenderer(new PersonalizarTabla());
        
        tablaProducto.setDefaultRenderer(Object.class, new TablaImagenProducto());
        
        modelo.addColumn("Tipo");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Imagen");
        tablaProducto.setModel(modelo);
        tablaProducto.setRowHeight(90);
        
        //aquí se manda a traer a una vista que se ha creado en la BD
        try{
            //depende de los filtros se asigna una variable lo cual llamará cada consulta 
            //hubiera sido más facil hacerlo con un stored procedure, pero pues
            //eso lo supe yo despues y me dio hueva cambiarlo JAJAJAJAJA
            if(numTabla==2){
                sql+="call procedure_filtro_producto('"+marcaTxt.getText()+"','"+modeloTxt.getText()+"')";
            }else if(numTabla==1){
                sql+="select  *from marca_producto";
            }else{
                sql+="select  *from marca_producto";
            }
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            //si el sql es correcto, ejecutrá el siguiente while
            while(cn.resultado.next()){
                Object[] datos = new Object[4];
                //aquí se asignará a cada array el dato que corresponde
                datos[0]=cn.resultado.getObject(1);
                datos[1]=cn.resultado.getObject(2);
                datos[2]=cn.resultado.getObject(3);
                
                Blob blob = cn.resultado.getBlob(4);
                
                if(blob != null){
                    try{
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img=null;
                        try{
                            img=ImageIO.read(new ByteArrayInputStream(data));
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, "Error en imagen:"+e);
                        }
                                                
                        ImageIcon icono = new ImageIcon(img.getScaledInstance(70, 60, 0));
                        datos[3] = new JLabel(icono);
                    }catch(Exception e){
                        datos[3] = "No imagen";
                    }
                }else{
                    datos[3]="No imagen";
                }              
                modelo.addRow(datos);
            }
            tablaProducto.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro BD: "+e);
        }
    }
    
    //aquí para cuando se selccione una linea en la tabla, que obtenga el modelo, esto para que en el otro
    //internal frame, poder obtener una vista con las caracteristicas del modelo que se ha escogido
    public void obtenerModelo(){
        Conexion cn=new Conexion();
        cn.Conectar();
        int fila=tablaProducto.getSelectedRow();//la lía que está seleccionada
        String valor=tablaProducto.getValueAt(fila, 2).toString();
        try{
            String sql="select *from producto where modelo='"+valor+"'";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                metodos.setObtenerModelo(cn.resultado.getString("modelo"));
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(Escritorio,"Error en base de datos: "+e);
        }
    }
      
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscarBtn;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel label1;
    public static javax.swing.JLabel label2;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panelp;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JPanel todosBtn;
    // End of variables declaration//GEN-END:variables
}
