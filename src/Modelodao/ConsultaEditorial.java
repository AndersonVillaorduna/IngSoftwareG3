
package Modelodao;

import Conexion.Conexion;
import Modelodto.Editorialdto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultaEditorial extends Conexion{
    //==========MÉTODO REGISTRAR AUTOR
    public boolean Registrar(Editorialdto edi){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "exec sp_RegistrarEditorial ?;";
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, edi.getNomEditorial());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
            }
    }
    //==========FIN REGISTRAR
    
    //==========MÉTODO MODIFICAR EDITORIAL
    public boolean Modificar(Editorialdto edi){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "exec sp_ModificarEditorial ?,?;";
        try {
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, edi.getIdEditorial());
            ps.setString(2, edi.getNomEditorial());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
            }
    }
    //==========FIN MODIFICAR
    
    //==========MÉTODO ELIMINAR EDITORIAL
    public boolean Eliminar(Editorialdto edi){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "exec sp_EliminarEditorial ?;";
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, edi.getIdEditorial());
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
            String sql = "exec sp_MostrarEditorial;";
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
