package Modelodao;
import Controlador.ControladorPrincipal;
import Vista.BuscarAdmin;
import Vista.Gestion;
import Vista.GestionAutores;
import Vista.GestionEditorial;
import Vista.Login;
import Vista.MenuAdmin;
import Vista.MostrarAdmin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField; 
import javax.swing.JTextField;

public class ConsultaLogin {
    public boolean validaUsuario(JTextField user, JPasswordField pass){
        PreparedStatement ps = null;
        String sql = "select * from Cuenta where Usuario= ?  and Contraseña= ? ";
        try{
            ResultSet rs = null;
            
            Conexion.Conexion objConexion = new Conexion.Conexion();
        
            String consulta = "select * from Cuenta where Usuario= ?  and Contraseña= ?";
            ps = objConexion.getConexion().prepareStatement(consulta);
            
            
            ps.setString(1, user.getText());
            ps.setString(2, String.valueOf(pass.getPassword()));
            
            rs = ps.executeQuery();
            if (rs.next()){
                Login login = new Login();
                JOptionPane.showMessageDialog(null, "Bienvenido ");
                ControladorPrincipal ctrlPrin = new ControladorPrincipal(new MenuAdmin(),new BuscarAdmin(),new Gestion(),new GestionAutores(),new GestionEditorial(),new MostrarAdmin());
                login.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El Usuario o contraseña es INCORRECTO, VUELVA A INTENTAR");
            }
            return true;
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e);
            return false;
        }
        
    }    
}
