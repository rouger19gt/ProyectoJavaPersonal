package Metodos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

//clase especificamente para obtener datos especificos de la BD, 
//también hay unos métodos que devuelven dichos datos hasta el final del file
public class MetodosBD {
    Conexion cn=new Conexion();
    Statement st;
    ResultSet rs;
    String sql;
    
    
    private String modificarColor;
    public static String obtenerusuario;
    private static String obtenercontrasena;
    public static int obtenertipo;
    public static String obtenerModelo;
    
    public static String obtenerNombreCliente;
    public static String obtenerApellidoCliente;
    public static String obtenerNitCliente;
    public static String obtenerGeneroCliente;
    public static String obtenerDireccionCliente;
    public static String obtenerCorreoUsuario;
    public static String obtenerPreguntaUsuario;
    public static String obtenerRespuestaUsuario;
    
    public static String obtenerIdFactura;
    public static String obtenerNitFactura;
    public static String obtenerNombreFactura;
    public static String obtenerApellidoFactura;
    public static String obtenerFechaFactura;
    public static String obtenerSubtotalFactura;
    public static String obtenerTotalFactura;
    
    public String obtenerIdTrabajador;
    public String obtenerNombreTrabajador;
    public String obtenerApellidoTrabajador;
    public long obtenerDPITrabajador;
    public int obtenrTelefonoTrabajador;
    public int obtenerNitTrabajador;
    public String obtenerPuesto;
    public String obtenerDepartamento;

    public String getObtenerNitFactura() {
        return obtenerNitFactura;
    }

    public void setObtenerNitFactura(String obtenerNitFactura) {
        this.obtenerNitFactura = obtenerNitFactura;
    }

    public String getObtenerNombreFactura() {
        return obtenerNombreFactura;
    }

    public void setObtenerNombreFactura(String obtenerNombreFactura) {
        this.obtenerNombreFactura = obtenerNombreFactura;
    }

    public String getObtenerApellidoFactura() {
        return obtenerApellidoFactura;
    }

    public void setObtenerApellidoFactura(String obtenerApellidoFactura) {
        this.obtenerApellidoFactura = obtenerApellidoFactura;
    }

    public String getObtenerFechaFactura() {
        return obtenerFechaFactura;
    }

    public void setObtenerFechaFactura(String obtenerFechaFactura) {
        this.obtenerFechaFactura = obtenerFechaFactura;
    }

    public String getObtenerSubtotalFactura() {
        return obtenerSubtotalFactura;
    }

    public void setObtenerSubtotalFactura(String obtenerSubtotalFactura) {
        this.obtenerSubtotalFactura = obtenerSubtotalFactura;
    }

    public String getObtenerTotalFactura() {
        return obtenerTotalFactura;
    }

    public void setObtenerTotalFactura(String obtenerTotalFactura) {
        this.obtenerTotalFactura = obtenerTotalFactura;
    }
    
    

    public String getObtenerIdFactura() {
        return obtenerIdFactura;
    }

    public void setObtenerIdFactura(String obtenerIdFactura) {
        this.obtenerIdFactura = obtenerIdFactura;
    }
    
    
//-----------------------------------------------------------------------------------------------------------
    public String getObtenerNombreCliente() {
        return obtenerNombreCliente;
    }

    public void setObtenerNombreCliente(String obtenerNombreCliente) {
        this.obtenerNombreCliente = obtenerNombreCliente;
    }

    public String getObtenerApellidoCliente() {
        return obtenerApellidoCliente;
    }

    public void setObtenerApellidoCliente(String obtenerApellidoCliente) {
        this.obtenerApellidoCliente = obtenerApellidoCliente;
    }

    public String getObtenerNitCliente() {
        return obtenerNitCliente;
    }

    public void setObtenerNitCliente(String obtenerNitCliente) {
        this.obtenerNitCliente = obtenerNitCliente;
    }

    public String getObtenerGeneroCliente() {
        return obtenerGeneroCliente;
    }

    public void setObtenerGeneroCliente(String obtenerGeneroCliente) {
        this.obtenerGeneroCliente = obtenerGeneroCliente;
    }

    public String getObtenerDireccionCliente() {
        return obtenerDireccionCliente;
    }

    public void setObtenerDireccionCliente(String obtenerDireccionCliente) {
        this.obtenerDireccionCliente = obtenerDireccionCliente;
    }

    public String getObtenerCorreoUsuario() {
        return obtenerCorreoUsuario;
    }

    public void setObtenerCorreoUsuario(String obtenerCorreoUsuario) {
        this.obtenerCorreoUsuario = obtenerCorreoUsuario;
    }

    public String getObtenerPreguntaUsuario() {
        return obtenerPreguntaUsuario;
    }

    public void setObtenerPreguntaUsuario(String obtenerPreguntaUsuario) {
        this.obtenerPreguntaUsuario = obtenerPreguntaUsuario;
    }

    public String getObtenerRespuestaUsuario() {
        return obtenerRespuestaUsuario;
    }

    public void setObtenerRespuestaUsuario(String obtenerRespuestaUsuario) {
        this.obtenerRespuestaUsuario = obtenerRespuestaUsuario;
    }
//----------------------------------------------------------------------------------------------------------

    public String getObtenerIdTrabajador() {
        return obtenerIdTrabajador;
    }

    public void setObtenerIdTrabajador(String obtenerIdTrabajador) {
        this.obtenerIdTrabajador = obtenerIdTrabajador;
    }

    public String getObtenerNombreTrabajador() {
        return obtenerNombreTrabajador;
    }

    public void setObtenerNombreTrabajador(String obtenerNombreTrabajador) {
        this.obtenerNombreTrabajador = obtenerNombreTrabajador;
    }

    public String getObtenerApellidoTrabajador() {
        return obtenerApellidoTrabajador;
    }

    public void setObtenerApellidoTrabajador(String obtenerApellidoTrabajador) {
        this.obtenerApellidoTrabajador = obtenerApellidoTrabajador;
    }

    public long getObtenerDPITrabajador() {
        return obtenerDPITrabajador;
    }

    public void setObtenerDPITrabajador(long obtenerDPITrabajador) {
        this.obtenerDPITrabajador = obtenerDPITrabajador;
    }

    public int getObtenrTelefonoTrabajador() {
        return obtenrTelefonoTrabajador;
    }

    public void setObtenrTelefonoTrabajador(int obtenrTelefonoTrabajador) {
        this.obtenrTelefonoTrabajador = obtenrTelefonoTrabajador;
    }

    public int getObtenerNitTrabajador() {
        return obtenerNitTrabajador;
    }

    public void setObtenerNitTrabajador(int obtenerNitTrabajador) {
        this.obtenerNitTrabajador = obtenerNitTrabajador;
    }

    public String getObtenerPuesto() {
        return obtenerPuesto;
    }

    public void setObtenerPuesto(String obtenerPuesto) {
        this.obtenerPuesto = obtenerPuesto;
    }

    public String getObtenerDepartamento() {
        return obtenerDepartamento;
    }

    public void setObtenerDepartamento(String obtenerDepartamento) {
        this.obtenerDepartamento = obtenerDepartamento;
    }
    
    
    //---------------------------------------------------------------------
    public String getObtenerusuario() {
        return obtenerusuario;
    }

    public void setObtenerusuario(String obtenerusuario) {
        this.obtenerusuario = obtenerusuario;
    }

    public String getObtenercontrasena() {
        return obtenercontrasena;
    }

    public void setObtenercontrasena(String obtenercontrasena) {
        this.obtenercontrasena = obtenercontrasena;
    }

    public int getObtenertipo() {
        return obtenertipo;
    }

    public void setObtenertipo(int obtenertipo) {
        this.obtenertipo = obtenertipo;
    }
    
    
    public String getModificarColor() {
        return modificarColor;
    }

    
    public void setModificarColor(String modificarColor) {
        this.modificarColor = modificarColor;
    }

    public String getObtenerModelo() {
        return obtenerModelo;
    }

    public void setObtenerModelo(String obtenerModelo) {
        this.obtenerModelo = obtenerModelo;
    }
    
    
    
    
    public void cambiarColor(String color){
        //color=getModificarColor();
        try{
            cn.Conectar();
            sql="update usuarios set color = '"+color+"' where usuario = '"+this.getObtenerusuario()+"'";
            Statement ps=cn.conexion.prepareStatement(sql);
            ps.execute(sql);
            cn.conexion.close();
            JOptionPane.showMessageDialog(null, "Éxito en el cambio de color");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el cambio de color"+e);
        }
    }
    
    public void obtenerColor(){
        String color="";
        int num=1;
        
        
        try{
            cn.Conectar();
            sql="select *from usuarios where usuario='"+this.getObtenerusuario()+"'";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                setModificarColor(cn.resultado.getString("color"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "aaa:"+e);
        }
       
    }
    
    public void obtenerDatosCliente(){
        try{
            //setObtenerNombreCliente("Hola");
            cn.Conectar();
            sql="select *from clientes where usuario='"+this.getObtenerusuario()+"'";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                this.setObtenerNombreCliente(cn.resultado.getString("nombre"));
                this.setObtenerApellidoCliente(cn.resultado.getString("apellido"));
                this.setObtenerNitCliente(cn.resultado.getString("Nit"));
                this.setObtenerDireccionCliente(cn.resultado.getString("Direccion"));
                this.setObtenerGeneroCliente(cn.resultado.getString("Genero"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al obtener el dato cliente:"+e);
        }
       
    }
    
    public void obtenerDatosTrabajador(){
        try{
            //setObtenerNombreCliente("Hola");
            cn.Conectar();
            sql="select *from vista_empleados where usuario='"+this.getObtenerusuario()+"'";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                this.setObtenerIdTrabajador(cn.resultado.getString("idTrabajador"));
                this.setObtenerNombreTrabajador(cn.resultado.getString("nombre"));
                this.setObtenerApellidoTrabajador(cn.resultado.getString("apellido"));
                this.setObtenerDPITrabajador(cn.resultado.getLong("dpi"));
                this.setObtenrTelefonoTrabajador(cn.resultado.getInt("telefono"));
                this.setObtenerNitTrabajador(cn.resultado.getInt("nit"));
                this.setObtenerPuesto(cn.resultado.getString("nombrePuesto"));
                this.setObtenerDepartamento(cn.resultado.getString("departamento"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al obtener dato trabajador:"+e);
        }
       
    }
    
    
    public void obtenerDatosUsuario(){
        try{
            //setObtenerNombreCliente("Hola");
            cn.Conectar();
            sql="select *from Usuarios where usuario='"+this.getObtenerusuario()+"'";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                this.setObtenerCorreoUsuario(cn.resultado.getString("Correo"));
                this.setObtenerPreguntaUsuario(cn.resultado.getString("Pregunta"));
                this.setObtenerRespuestaUsuario(cn.resultado.getString("Respuesta"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos usuario:"+e);
        }
       
    }

    //-------------------------------------------------------------------------------------
    
    public void obtenerDatosFactura(){
        try{
            cn.Conectar();
            sql="select *from Factura where idFactura='"+this.getObtenerIdFactura()+"'";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                this.setObtenerNitFactura(cn.resultado.getString("nit"));
                this.setObtenerNombreFactura(cn.resultado.getString("nombre"));
                this.setObtenerApellidoFactura(cn.resultado.getString("Apellido"));
                this.setObtenerFechaFactura(cn.resultado.getString("Fecha"));
                this.setObtenerSubtotalFactura(cn.resultado.getString("subtotal"));
                this.setObtenerTotalFactura(cn.resultado.getString("total"));
            }
        }catch(Exception e){
            
        }
    }
    
    public int obtenerUltimaFactura(String usuario){
        int z=0;
        try{
            String x="";
            cn.Conectar();
            sql="select funcion_obtener_ultimaFactura('"+usuario+"') as id";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                x = cn.resultado.getString("id");
                z += Integer.parseInt(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return z;
    }
    
    //obtiene la fecha de la ultima factura
    //esto es para cuando el cliente acaba de hacer una compra, aparezca la ventana de factura y se isnerte el dato obtenido
    public String obtenerFechaUltimaFactura(String usuario){
        String x="";
        try{
            cn.Conectar();
            sql="select fecha from factura where usuario ='"+usuario+"' order by idFactura desc limit 1;";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                x += cn.resultado.getString("fecha");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return x;
    }
    
    //obtiene el subtotal de la ultima factura
    //esto es para cuando el cliente acaba de hacer una compra, aparezca la ventana de factura y se isnerte el dato obtenido
    public String obtenerSubtotalUltimaFactura(String usuario){
        String x="";
        try{
            cn.Conectar();
            sql="select subtotal from factura where usuario ='"+usuario+"' order by idFactura desc limit 1;";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                x += cn.resultado.getString("subtotal");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return x;
    }
    
    //obtiene el total de la ultima factura
    //esto es para cuando el cliente acaba de hacer una compra, aparezca la ventana de factura y se isnerte el dato obtenido
    public String obtenerTotalUltimaFactura(String usuario){
        String x="";
        try{
            cn.Conectar();
            sql="select total from factura where usuario ='"+usuario+"' order by idFactura desc limit 1;";
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                x += cn.resultado.getString("total");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return x;
    }
    
    //Obtiene el id del cliente para generarlo autamticamente
    //esto suponiendo que el cliente creará su usuario por si solo, no necesitará de poner el ID
    public String obtenerUltimaIDCliente(){
        String x="";
        try{
            cn.Conectar();
            sql="select idCliente from clientes order by idCliente desc limit 1;";//obtiene el id
            cn.sentencia=cn.conexion.createStatement();
            cn.resultado=cn.sentencia.executeQuery(sql);
            while(cn.resultado.next()){
                x += cn.resultado.getString("idCliente");
            }
            
            //Para quitar el primer caracter "C" y que se suma al último cliente insertado
            String b="";
            int c=0;
            char p;
            for(int i=1;i<x.length();i++){
               if(x.length()==0){
                   JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
               }else{
                    p= x.charAt(i);
                    b+=String.valueOf(p);
                    c=Integer.parseInt(b)+1;
               } 
            }
            x="";
            x+="C"+String.valueOf(c);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return x;
    }
        
    
    
    
    
    
    
//    public void obtenerUsuario(){
//        String color="";
//        int num=1;
//        
//        
//        try{
//            cn.Conectar();
//            sql="select *from Usuario where id=1";
//            cn.sentencia=cn.conexion.createStatement();
//            cn.resultado=cn.sentencia.executeQuery(sql);
//            while(cn.resultado.next()){
//                setModificarColor(cn.resultado.getString("color"));
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "aaa:"+e);
//        }
//       
//    }
    
    
}
