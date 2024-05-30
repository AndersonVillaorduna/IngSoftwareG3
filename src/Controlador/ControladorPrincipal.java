
package Controlador;

import Modelodao.ConsultaBuscar;
import Modelodao.ConsultaLibro;
import Modelodto.Autordto;
import Modelodto.Librodto;
import Vista.BuscarAdmin;
import Vista.Gestion;
import Vista.GestionAutores;
import Vista.GestionEditorial;
import Vista.MenuAdmin;
import Vista.MostrarAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener{
    private MenuAdmin menu;
    private BuscarAdmin fmrBusA;
    private Gestion fmrLi;
    private GestionAutores fmrAut;
    private GestionEditorial fmrEdi;
    private MostrarAdmin fmrMosAd;

    public ControladorPrincipal(MenuAdmin menu, BuscarAdmin fmrBusA, Gestion fmrLi, GestionAutores fmrAut, GestionEditorial fmrEdi, MostrarAdmin fmrMosAd) {
        this.menu = menu;
        this.fmrBusA = fmrBusA;
        this.fmrLi = fmrLi;
        this.fmrAut = fmrAut;
        this.fmrEdi = fmrEdi;
        this.fmrMosAd = fmrMosAd;
        this.menu.btnBuscar.addActionListener(this);
        this.menu.btnGestionLibros.addActionListener(this);
        this.menu.btnGestionPrestamos.addActionListener(this);
        this.menu.btnMostrarLibros.addActionListener(this);
        this.menu.setVisible(true);
    }

    
    
    

    public void iniciar(){
        menu.setTitle("Principal");
        menu.setLocationRelativeTo(null);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //BOTONES DE MENU
        if(e.getSource()==menu.btnGestionLibros){
            fmrLi.setVisible(true);
            fmrAut.setVisible(false);
            fmrEdi.setVisible(false);
            fmrBusA.setVisible(false);
            fmrMosAd.setVisible(false);
            menu.setVisible(false);
            ControladorLibro crlLi = new ControladorLibro(fmrLi, new ConsultaLibro(),new Librodto(),fmrAut,fmrEdi);
        }
        if(e.getSource()==menu.btnBuscar){
            fmrLi.setVisible(false);
            fmrAut.setVisible(false);
            fmrEdi.setVisible(false);
            fmrBusA.setVisible(true);
            fmrMosAd.setVisible(false);
            menu.setVisible(false);
            ControladorBuscar crlBus = new ControladorBuscar(fmrBusA,new ConsultaBuscar(), new Autordto(), new Librodto());
        }
        if(e.getSource()==menu.btnMostrarLibros){
            fmrLi.setVisible(false);
            fmrAut.setVisible(false);
            fmrEdi.setVisible(false);
            fmrBusA.setVisible(false);
            fmrMosAd.setVisible(true);
            menu.setVisible(false); 
            
            ControladorMostrarLibros crlMosl = new ControladorMostrarLibros(fmrMosAd,new ConsultaLibro(), new Librodto());
        }
        
        //FIN DE BOTONES */
    }
    
    
}
