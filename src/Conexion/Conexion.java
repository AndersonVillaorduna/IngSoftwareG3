
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    private String usuario = "usersql";
    private String password = "root";
    private String base = "Biblioteca";
    private String ip = "RODRIGO";
    private String puerto = "1434";
    private String url = "jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+base+";trustServerCertificate=true;";;
    private Connection conectar = null;
    public Connection getConexion(){
        try{
            conectar= DriverManager.getConnection(this.url,this.usuario,this.password);
            JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de Datos");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, error"+e.toString());
        }
        return conectar;
    }
}  
    

