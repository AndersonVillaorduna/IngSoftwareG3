
package Controlador;

import Modelodao.ConsultaLogin;
import Modelodto.Logindto;
import Vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;


public class ControladorLogin implements ActionListener{
    private Logindto loginDTO;
    private Login login;
    private ConsultaLogin consulLogin;

    public ControladorLogin(Logindto loginDTO, Login login, ConsultaLogin consulLogin) {
        this.loginDTO = loginDTO;
        this.login = login;
        this.consulLogin = consulLogin;
        this.login.jbtnEntrar.addActionListener(this);
    }
    
    public void iniciar(){
        login.setTitle("Login");
        login.setLocationRelativeTo(null);              
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // BOTON LOGIN
        if(e.getSource()==login.jbtnEntrar){
            Modelodao.ConsultaLogin objLogin = new Modelodao.ConsultaLogin();
            objLogin.validaUsuario(login.jtxtUsuario,  login.jtxtPassword);
            }
        //FIN BOTON LOGIN
        
    }
    
}
