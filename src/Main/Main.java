
package Main;

import Controlador.ControladorLogin;
import Controlador.ControladorPrincipal;
import Modelodao.ConsultaLogin;
import Modelodto.Logindto;
import Vista.BuscarAdmin;
import Vista.Gestion;
import Vista.GestionAutores;
import Vista.GestionEditorial;
import Vista.Login;
import Vista.MenuAdmin;
import Vista.MostrarAdmin;


public class Main {

   
    public static void main(String[] args) {
        MenuAdmin fmrMeA = new MenuAdmin();
        BuscarAdmin fmrbus = new BuscarAdmin();
        Gestion fmrLib = new Gestion();
        GestionAutores fmraut = new GestionAutores();
        GestionEditorial fmrEd = new GestionEditorial();
        MostrarAdmin frmLib = new MostrarAdmin();
        
        Login login = new Login();
        Logindto loginDTO= new Logindto();
        ConsultaLogin consulLogin = new ConsultaLogin(); 
        ControladorPrincipal ctrlPri = new ControladorPrincipal(fmrMeA, fmrbus, fmrLib, fmraut, fmrEd,frmLib);
        ControladorLogin ctrlLo = new ControladorLogin(loginDTO, login, consulLogin);
        ctrlLo.iniciar();
        login.setVisible(true);
        fmrMeA.dispose();
         
    }
    
}
