
package Modelodao;

import Conexion.Conexion;
import Modelodto.Autordto;
import Modelodto.Categoriadto;
import Modelodto.Librodto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultaBuscar extends Conexion{
    
    //==========BUSCAR POR AUTOR
        public ResultSet BuscarxAutor(Autordto aut){
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "exec sp_BuscarLibroxAutor ?;";
            ResultSet rs =null;
            try{
                ps = con.prepareStatement(sql);
                ps.setString(1, aut.getNombre());
                rs = ps.executeQuery();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+e);
            }
            return rs;
        }//==========FIN BUSCAR
        
    
    //==========BUSCAR POR CATEGORIA
        public ResultSet BuscarxCategoria(Categoriadto cat){
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "exec sp_BuscarLibroxCategoria ?;";
            ResultSet rs =null;
            try{
                ps = con.prepareStatement(sql);
                ps.setString(1, cat.getNomCategoria());
                rs = ps.executeQuery();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+e);
            }
            return rs;
        }//==========FIN BUSCAR
        
        
        //==========BUSCAR POR TITULO
        public ResultSet BuscarxTitulo(Librodto li){
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "exec sp_BuscarLibroxTitulo ?";
            ResultSet rs =null;
            try{
                ps = con.prepareStatement(sql);
                ps.setString(1, li.getTitulo());
                rs = ps.executeQuery();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+e);
            }
            return rs;
        }//==========FIN BUSCAR
        
        
}
