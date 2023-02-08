package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

    public void Conectar() {
        try {
            final String Controlador = "com.mysql.cj.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/miProyecto";
            conexion = DriverManager.getConnection(url_bd, "root", "Agregue aquí la contraseña");//colocar clave despues del root
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "errp"+ex.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Connection getConnection() {
        return conexion;
    }
}
