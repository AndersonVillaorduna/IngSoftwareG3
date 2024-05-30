
package Modelodao;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultaMostrarLibros extends Conexion{
    public ResultSet Mostrar(){
            PreparedStatement ps = null;
            Connection con =getConexion();
            String sql = "exec dbo.MostrarLibro";
            ResultSet rs =null;
            try{
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+e);
            }
            return rs;
        }
}
