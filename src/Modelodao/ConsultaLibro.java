package Modelodao;

import Conexion.Conexion;
import Modelodto.Librodto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class ConsultaLibro extends Conexion {
     public boolean registrar (Librodto L){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql ="Execute sp_RegistrarLibro ?,?,?,?,?,?";
        try{
            ps= con.prepareStatement(sql);
            ps.setInt(1, L.getIdAutor());
           ps.setInt(2, L.getIdCategoria());
            ps.setInt(3, L.getIdEditorial());
            ps.setString(4, L.getTitulo());
            ps.setString(5, L.getUbicacion());
            ps.setString(6, L.getFechaPublicacion());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
       public boolean modifcar (Librodto L){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql ="EXEC ModificarLibro ?,?,?,?,?,?,?";
        try{
            ps= con.prepareStatement(sql);
            ps.setInt(1, L.getIdLibro());
            ps.setInt(2, L.getIdAutor());
            ps.setInt(3, L.getIdCategoria());
            ps.setInt(4, L.getIdEditorial());
            ps.setString(5, L.getTitulo());
            ps.setString(6, L.getUbicacion()); 
            ps.setString(7, L.getFechaPublicacion());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    
    }
      public boolean eliminar (Librodto L){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql ="EXEC sp_EliminarLibro @IdLibro = ?";
        try{
            ps= con.prepareStatement(sql);
            ps.setInt(1, L.getIdLibro());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }
    }
     
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
