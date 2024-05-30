
package Modelodao;

import Conexion.Conexion;
import Modelodto.Autordto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultaAutor extends Conexion {
    //==========MÉTODO REGISTRAR AUTOR
    public boolean Registrar(Autordto aut){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "execute sp_RegistrarAutor ?,?,?;";
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, aut.getNombre());
            ps.setInt(2, aut.getEdad());
            ps.setString(3, aut.getPais());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
            }
    }
    //==========FIN RREGISTRAR
    
    //==========MÉTODO MODIFICAR AUTOR
    public boolean Modificar(Autordto aut){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "exec sp_ModificarAutor ?,?,?,?";
        try {
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, aut.getIdAutor());
            ps.setString(2, aut.getNombre());
            ps.setInt(3, aut.getEdad());
            ps.setString(4, aut.getPais());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
            }
    }
    //==========FIN MODIFICAR
    
    //==========MÉTODO ELIMINAR AUTOR
    public boolean Eliminar(Autordto aut){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "exec sp_EliminarAutor ?;";
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, aut.getIdAutor());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
            }
    }
    //==========FIN ELIMINAR
    
    //==========METODO MOSTRAR
        public ResultSet Mostrar(){
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "exec sp_MostrarAutor;";
            ResultSet rs =null;
            try{
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+e);
            }
            return rs;
        }//==========FIN MOSTRAR
    
    
}
