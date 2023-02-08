package Metodos;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

//clase creada específicamente para hacer funciones de select, update y delete
public class MetodosBD2 {
        Conexion cn=new Conexion();
        Statement st;
        ResultSet rs;
        String sql;
        MetodosBD metodo=new MetodosBD();
        MetodosJava metodoj=new MetodosJava();
        
        public void nuevaFactura(String nit, String nombre, String apellido){
            try{
                cn.Conectar();
                sql = "insert into factura(nit,nombre,apellido,fecha,usuario)"
                        + "values('"+nit+"','"+nombre+"','"+apellido+"',now(),'"+metodo.getObtenerusuario()+"')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Nueva factura creada con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear venta: "+e);
            }
        }
        
        public void nuevoDetalle(){
            try{
                for(int i=0; i<metodoj.ncarrito.size();i++){
                    cn.Conectar();
                    sql="call ps_crear_detalle('"+metodoj.ncarrito.get(i)+"',"+metodoj.cantidad.get(i)+",'"
                            +metodo.getObtenerusuario()+"')";
                    Statement ps=cn.conexion.prepareStatement(sql);
                    ps.execute(sql);
                    cn.conexion.close();
                    JOptionPane.showMessageDialog(null, "Compra realizada con exito");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear el detalle: "+e);
            }
        }
//---------------------------------------------------------------------    
//Modificar usuario
        
        //metodos para modificar el usuario sin la contraseña
        public void modificarUsuario(String correo, String pregunta, String respuesta){
            try{
                cn.Conectar();
                sql="update usuarios set correo='"+correo+"',pregunta='"+pregunta+"',respuesta=aes_encrypt('"+respuesta+"','AES') "
                        + "where usuario='"+metodo.getObtenerusuario()+"'";
                
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Usuario modificado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al modificar los datos");
            }
        }
        
        public void insertUsuario(String usuario, String correo, String contrasena, String pregunta, 
                String respuesta, int tipo, String ruta){
            cn.Conectar();
                sql="insert into usuarios(usuario,correo,contrasena,pregunta, respuesta,tipo, activo, color, foto)"
                        + "values(?,?,?,?,?,?,?,?,?)";
                FileInputStream fi=null;
                PreparedStatement ps=null;
            try{
                File file = new File(ruta);
                fi = new FileInputStream(file);
                ps=cn.conexion.prepareStatement(sql);
                ps.setString(1, usuario);
                ps.setString(2, correo);
                ps.setString(3, "aes_encrypt('"+contrasena+"','AES')");
                ps.setString(4, pregunta);
                ps.setString(5, "aes_encrypt('"+respuesta+"','AES')");
                ps.setInt(6, tipo);
                ps.setInt(7, 1);//para el campo "activo"
                ps.setString(8, "azul");
                ps.setBinaryStream(9, fi);
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario creado con éxito!!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear usuario: "+e);
            }
        }
        
        //Para usuario que no asigna una foto
        public void insertUsuarioSinFoto(String usuario, String correo, String contrasena, String pregunta, 
                String respuesta, int tipo){
            try{
                cn.Conectar();
                sql = "insert into usuarios(usuario,correo,contrasena,pregunta, respuesta,tipo, activo, color)"
                        + " values('"+usuario+"','"+correo+"',aes_encrypt('"+contrasena+"','AES'),'"+pregunta+"',"
                        + "aes_encrypt('"+respuesta+"','AES'),"+tipo+",1,'azul')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Usuario creado con éxito!!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear usuario: "+e);
            }
        }
        
        public void updateUsuario(String usuario,String correo, String contrasena, String pregunta, 
                String respuesta, int tipo, int activo, String color){
            try{
                cn.Conectar();
                sql = "update usuarios set correo='"+correo+"',contrasena=aes_encrypt('"+contrasena+"','AES')"
                        + ",pregunta='"+pregunta+"',respuesta=aes_encrypt('"+respuesta+"','AES'),tipo="+tipo+""
                        + ",activo="+activo+",color='"+color+"' where usuario='"+usuario+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Usuario modificado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: "+e);
            }
        }
        
        public void deleteUsuario(String usuario){
            try{
                cn.Conectar();
                sql = "delete from usuarios where usuario='"+usuario+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: "+e);
            }
        }
        
        public void updateFotoUsuario(String usuario,String ruta){
            cn.Conectar();
            sql="update usuarios set foto = ? where usuario='"+usuario+"'";
            FileInputStream fi=null;
            PreparedStatement ps=null;
            try{
                File file = new File(ruta);
                fi = new FileInputStream(file);
                ps=cn.conexion.prepareStatement(sql);
                ps.setBinaryStream(1, fi);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Foto actualizada!!");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar foto: "+e);
            }
        }
        
        public void updateContraseUsuario(String usuario,String contrasena){
            try{
                cn.Conectar();
                sql = "update usuarios set contrasena=aes_encrypt('"+contrasena+"','AES') where usuario='"+usuario+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Contraseña modificada con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: "+e);
            }
        }
         
        
 //------------------------------------------------------------------------------------
   
        //metodo para modificar los datos del cliente
        
        //Modificación para el usuario que desea modificar sus datos
        public void modificarCliente(String nombre, String apellido, String nit, String direccion, String genero){
            try{
                cn.Conectar();
                sql="update clientes set nombre='"+nombre+"',apellido='"+apellido+"',nit='"+nit+"',"
                        + "direccion='"+direccion+"',genero='"+genero+"' "
                        + "where usuario='"+metodo.getObtenerusuario()+"'";
                
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Cliente modificado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al modificar los datos");
            }
        }
        
        //El administrador que desee modificar un cliente en específico
        public void updateCliente(String id, String nombre, String apellido, String nit, String direccion, String genero){
            try{
                cn.Conectar();
                sql="update clientes set nombre='"+nombre+"',apellido='"+apellido+"',nit='"+nit+"',"
                        + "direccion='"+direccion+"',genero='"+genero+"' "
                        + "where idCliente='"+id+"'";
                
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al modificar los datos");
            }
        }
        
        public void deleteCliente(String id){
            try{
                cn.Conectar();
                sql = "delete from clientes where idCliente='"+id+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar a el cliente: "+e);
            }
        }
        
        public void nuevoCliente(String id,String nombre, String apellido, String nit, String direccion,
                String usuario, String genero){
            try{
                cn.Conectar();
                sql = "insert into clientes(idCliente, nombre, apellido, nit, direccion, usuario, genero)"
                        +" values('"+id+"','"+nombre+"','"+apellido+"','"+nit+"','"+direccion+"','"+usuario+"','"+genero+"')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Cliente creado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear al nuevo cliente: "+e);
            }
        }
        
//--------------------------------------------------------------------------------------------
        //metodo para modificar datos de la tabla marca
        
        public void nuevaMarca(String marca){
            try{
                cn.Conectar();
                sql = "insert into marca(marca)"+
                        "values('"+marca+"')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Nuea marca insertada con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear la nueva marca: "+e);
            }
        }
        
        public void updateMarca(String marca, int id){
            try{
                cn.Conectar();
                sql = "update marca set marca='"+marca+"' where idMarca="+id;
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar la marca: "+e);
            }
        }
        
        public void deleteMarca(int id){
            try{
                cn.Conectar();
                sql = "delete from marca where idMarca="+id;
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar la marca: "+e);
            }
        }
        
 //----------------------------------------------------------------------------------------------
        //Procesos de la tabla producto
        
        public void insertProducto(String idProducto,int idMarca,String modelo,String ruta, String tipo){
            cn.Conectar();
                sql="insert into producto(idProducto,idMarca,modelo,imagen,tipo)"
                        + "values(?,?,?,?,?)";
                FileInputStream fi=null;
                PreparedStatement ps=null;
            try{
                File file = new File(ruta);
                fi = new FileInputStream(file);
                ps=cn.conexion.prepareStatement(sql);
                ps.setString(1, idProducto);
                ps.setInt(2, idMarca);
                ps.setString(3, modelo);
                ps.setBinaryStream(4, fi);
                ps.setString(5, tipo);
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto guardado con éxito!!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al guardar productos: "+e);
            }
        }
        
        
        public void updateProducto(String idProducto, int idmarca, String modelo,String tipo){
            try{
                cn.Conectar();
                sql ="update producto set idmarca="+idmarca+", modelo='"+modelo+"',tipo='"+tipo+"' "
                        + "where idProducto='"+idProducto+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro: "+e);
            }
        }
        
        public void deleteProducto(String idProducto){
            try{
                cn.Conectar();
                sql ="delete from producto where idProducto='"+idProducto+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro: "+e);
            }
        }
        
//-------------------------------------------------------------------------------------------------------
        //Procesos para la tabla tipoProducto
        
        public void insertTipoProducto(String idTipo,String tipo){
           try{
                cn.Conectar();
                sql = "insert into tipoProducto(idTipo, tipoProducto)"+
                        "values('"+idTipo+"','"+tipo+"')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Nueva poroducto creado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear el nuevo tipo de producto: "+e);
            }
        }
        
        public void updateTipoProducto(String idTipo, String tipo){
            try{
                cn.Conectar();
                sql="update tipoProducto "
                        + "set tipoProducto='"+tipo+"' where idTipo='"+idTipo+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro modificaco con éxito");
            }catch(Exception e){
                
            }
        }
        
        public void deleteTipoProducto(String idTipo){
            try{
                cn.Conectar();
                sql="delete from tipoProducto where idTipo='"+idTipo+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            }catch(Exception e){
                
            }
        }

        
        
//---------------------------------------------------------------------------------------------------------
        //Procesos de la tabla Carcateristica
        public void insertCaracteristica(String idCaracteristica,int almacenamiento, 
                String idProducto, String color, int ram, float ganancia){
           try{
                cn.Conectar();
                sql = "insert into caracteristica(idCaracteristica, almacenamiento, idProducto, color, ram, ganancia, precio,entradas, salidas, existencia,costo)"
                        + "values('"+idCaracteristica+"',"+almacenamiento+",'"+idProducto+"','"
                        +color+"',"+ram+","+ganancia+",null,null,null,null,null)";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Proceso exitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear la nueva caracteristica: "+e);
            }
        }
        
        public void updateCaracteristica(String idCaracteristica, int almacenamiento, float precio, String idProducto,
                String color, int ram, float ganancia){
            try{
                cn.Conectar();
                sql = "update caracteristica set almacenamiento="+almacenamiento+", precio='"+precio+"', "
                        + "idProducto='"+idProducto+"', color='"+color+"',ram="+ram+",ganancia="+ganancia+" "
                        + "where idCaracteristica = '"+idCaracteristica+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro modificaco con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar caracteristica: "+e);
            }
        }
        
        public void deleteCaracteristica(String idCaracteristica){
            try{
                cn.Conectar();
                sql = "delete from caracteristica where idCaracteristica = '"+idCaracteristica+"'";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error aleliminar caracteristica: "+e);
            }
        }
        
//----------------------------------------------------------------------------------------------------------
        //Metodos para la tabla Trabajador
        
        public void insertTrabajador(String idTrabajador,String nombre, 
                String apellido, long dpi, int telefono, int nit, int idPuesto, String usuario){
           try{
                cn.Conectar();
                sql = "insert into trabajador(idTrabajador,nombre,apellido,dpi,telefono,nit,idPuesto,usuario)"
                        + " values('"+idTrabajador+"','"+nombre+"','"+apellido+"',"+dpi+","+telefono+","+nit+","
                        + idPuesto+",'"+usuario+"')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Proceso exitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear el nuevo trabajador: "+e);
            }
        }
        
        public void updateTrabajador(String idTrabajador,String nombre, String apellido, long dpi,int telefono,
                int nit, int idPuesto, String usuario){
            try{
                cn.Conectar();
                sql = "update Trabajador set nombre='"+nombre+"', apellido='"+apellido+
                        "', dpi="+dpi+",nit="+nit+",idPuesto="+idPuesto+",usuario='"+usuario+"' "
                        + "where idTrabajador='"+idTrabajador+"'";
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro modificaco con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar registro: "+e);
            }
        }
        
        public void deleteTrabajador(String idTrabajador){
            try{
                cn.Conectar();
                sql = "delete from trabajador where idTrabajador='"+idTrabajador+"'";
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar registro: "+e);
            }
        }

//---------------------------------------------------------------------------------------------------------------
        //Métodos para la tabla Departamento
        
        public void insertDepartamento(String departamento){
           try{
                cn.Conectar();
                sql = "insert into departamento(departamento) values('"+departamento+"')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Proceso exitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear el nuevo departamento: "+e);
            }
        }
       
        
        public void updateDepartamento(int id,String departamento){
            try{
                cn.Conectar();
                sql = "update departamento set departamento='"+departamento+"' where id_departamento="+id;
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro modificaco con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar registro: "+e);
            }
        }
        
        public void deleteDepartamento(int id){
            try{
                cn.Conectar();
                sql = "delete from departamento where id_departamento = "+ id;
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar registro: "+e);
            }
        }
        
//-----------------------------------------------------------------------------------------------------------
        //Metodos para la tabla Puesto
        
        public void insertPuesto(String puesto, int departamento){
           try{
                cn.Conectar();
                sql = "insert into puesto(nombrePuesto,departamento)"
                        + "values('"+puesto+"',"+departamento+")";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Proceso exitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear el nuevo puesto: "+e);
            }
        }
       
        
        public void updatepuesto(int id,String puesto,int departamento){
            try{
                cn.Conectar();
                sql = "update puesto set nombrePuesto='"+puesto+"',departamento="+departamento+" where idPuesto="+id;
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro modificaco con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar registro: "+e);
            }
        }
        
        public void deletePuesto(int id){
            try{
                cn.Conectar();
                sql = "delete from puesto where idPuesto = "+ id;
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar registro: "+e);
            }
        }
     
//------------------------------------------------------------------------------------------------------------
        //metodos para la tabla proveedor
        
        public void insertProveedor(String id, String proveedor){
           try{
                cn.Conectar();
                sql = "insert into proveedor(idProveedor, nombre) values('"+id+"','"+proveedor+"')";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Proceso exitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear el nuevo proveedor: "+e);
            }
        }
       
        
        public void updateProvvedor(String id,String nombre){
            try{
                cn.Conectar();
                sql = "update proveedor set nombre='"+nombre+"' where idProveedor='"+id+"'";
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro modificaco con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al actualizar registro: "+e);
            }
        }
        
        public void deleteProveedor(String id){
            try{
                cn.Conectar();
                sql = "delete from proveedor where idProveedor = '"+ id+"'";
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar registro: "+e);
            }
        }

//------------------------------------------------------------------------------------------------------------
//métodos para recuperación
        public void buscarUsuario(String usuario, JLabel label,JTextField caja, JPanel boton){
            try{
                cn.Conectar();
                sql = "select *from usuarios where usuario = '"+usuario+"'";
                cn.sentencia=cn.conexion.createStatement();
                cn.resultado=cn.sentencia.executeQuery(sql);
                while(cn.resultado.next()){
                    label.setVisible(true);
                    label.setText(cn.resultado.getString("pregunta"));
                    caja.setVisible(true);
                    boton.setVisible(true);
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error con la BD");
            }
        }
        
        public void verificarRespuesta(String usuario, String respuesta, JTextField nuevaContra, JTextField confirmar,
                JTextField caja, JPanel boton,JPanel cambiarBtn){
            try{
                int x=0;
                cn.Conectar();
                sql = "select *from usuarios where usuario='"+usuario+"' and (CAST(aes_decrypt(respuesta,'AES')as char(20)))='"+respuesta+"'";
                cn.sentencia=cn.conexion.createStatement();
                cn.resultado=cn.sentencia.executeQuery(sql);
                while(cn.resultado.next()){
                    x=1;
                    nuevaContra.setVisible(true);
                    confirmar.setVisible(true);
                    cambiarBtn.setVisible(true);
                }
                if(x==0){
                    nuevaContra.setVisible(false);
                    confirmar.setVisible(false);
                    cambiarBtn.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
                }else{
                    caja.setEditable(false);
                    boton.setVisible(false);
                }
                
            }catch(Exception e){
                
            }
        }
        
        public void cambiarContrasena(String usuario, String contrasena){
            try{
                cn.Conectar();
                sql = "update usuarios set contrasena=aes_encrypt('"+contrasena+"','AES') where usuario='"+usuario+"'";
                      
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Cambio de contrasena con éxito");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al modificar contrasena registro: "+e);
            }
        }
        
//--------------------------------------------------------------------------------------------------------
        //metodos para insertar entradas
        
        public void insertarFactura(String proveedor, String usuario){
            try{
                cn.Conectar();
                sql = "insert into entrada(idProveedor, usuario, fecha) "
                        + "values('"+proveedor+"','"+usuario+"',date(now()))";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Proceso exitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear la nueva factura: "+e);
            }
        }
        
        public void insertarDetalleFactura(int factura, String producto, float precio, int cantidad){
            try{
                cn.Conectar();
                sql = "insert into detalleentrada(idEntrada,idCaracteristica,precio,cantidadEntrada)"
                        + "values("+factura+",'"+producto+"',"+precio+","+cantidad+")";
                Statement ps=cn.conexion.prepareStatement(sql);
                ps.execute(sql);
                cn.conexion.close();
                JOptionPane.showMessageDialog(null, "Proceso exitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al crear el nuevo detalle: "+e);
            }
        }
        
//----------------------------------------------------------------------------------------------------------
        //Método por si el usuario es trbajador que no pueda ver los botones de actualizar ni eliminar
        public void verItem(JMenuItem item1, JMenuItem item2){
            if(metodo.getObtenertipo()==1){
                item1.setVisible(true);
                item2.setVisible(true);
            }else{
                item1.setVisible(false);
                item2.setVisible(false);
            }
        }
        
        public void verBoton(JPanel boton){
            if(metodo.getObtenertipo()==1){
                boton.setVisible(true);
            }else{
                boton.setVisible(false);
            }
        }
}
