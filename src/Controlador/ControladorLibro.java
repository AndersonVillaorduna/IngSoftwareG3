package Controlador;

import Modelodao.ConsultaAutor;
import Modelodao.ConsultaEditorial;
import Modelodao.ConsultaLibro;
import Modelodto.Autordto;
import Modelodto.Editorialdto;
import Modelodto.Librodto;
import Vista.Gestion;
import Vista.GestionAutores;
import Vista.GestionEditorial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorLibro implements ActionListener{
    
   
    private Gestion frmLib;
    private ConsultaLibro LibC;
    private Librodto Lib;
    private GestionAutores fmrAut;
    private GestionEditorial frmEdi;

    public ControladorLibro(Gestion frmLib, ConsultaLibro LibC, Librodto Lib, GestionAutores fmrAut, GestionEditorial frmEdi) {
        this.frmLib = frmLib;
        this.LibC = LibC;
        this.Lib = Lib;
        this.fmrAut = fmrAut;
        this.frmEdi = frmEdi;
        this.frmLib.btnGuardar.addActionListener(this);
        this.frmLib.btnEliminar.addActionListener(this);
        this.frmLib.btnActualizar.addActionListener(this);
        this.frmLib.btnSalir.addActionListener(this);
        this.frmLib.btnMostrar.addActionListener(this);
        this.frmLib.btnAutor.addActionListener(this);
        this.frmLib.btnEditorial.addActionListener(this);
    }

    

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==frmLib.btnGuardar){
            Lib.setTitulo(frmLib.txtTituloLibro.getText());
            Lib.setIdAutor(Integer.parseInt(frmLib.txtAutor.getText()));
            Lib.setIdCategoria(Integer.parseInt(frmLib.txtCategoria.getText()));
            Lib.setIdEditorial(Integer.parseInt(frmLib.txtEditorial.getText()));
            Lib.setUbicacion(frmLib.txtUbicacion.getText());
            Lib.setFechaPublicacion(frmLib.txtFechaPublicacion.getText());  
           
           if(LibC.registrar(Lib)){
               JOptionPane.showMessageDialog(null, "Libro Agregado");
               limpiar();
           }else{
                JOptionPane.showMessageDialog(null, "Error al Agregar");
               limpiar();
           }
        
    }
///     BOTON MOSTRAR
        if(e.getSource()==frmLib.btnMostrar){
            DefaultTableModel model = new DefaultTableModel();
            ResultSet rs =LibC.Mostrar();
            model.setColumnIdentifiers(new Object[]{"IdLibro","IdAutor","IdCategoria","IdEditorial","Titulo","Ubicacion","Publicacion",});
            try{
                while(rs.next()){
                    model.addRow(new Object[]{rs.getInt("IdLibro"),rs.getInt("IdAutor"),rs.getInt("IdCategoria"),rs.getInt("IdEditorial"),
                       rs.getString("Titulo"),rs.getString("Ubicacion"),rs.getString("Publicacion")});
                    frmLib.jtblLibro.setModel(model);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+ex);
            }
        }///--------------FIN MOSTRAR



           if(e.getSource()==frmLib.btnActualizar){
            Lib.setIdLibro(Integer.parseInt(frmLib.txtIDlibro.getText()));
             Lib.setIdAutor(Integer.parseInt(frmLib.txtAutor.getText()));
            Lib.setIdCategoria(Integer.parseInt(frmLib.txtCategoria.getText()));
            Lib.setIdEditorial(Integer.parseInt(frmLib.txtEditorial.getText()));
            Lib.setTitulo(frmLib.txtTituloLibro.getText());
            Lib.setUbicacion(frmLib.txtUbicacion.getText());
            Lib.setFechaPublicacion(frmLib.txtFechaPublicacion.getText());
           if(LibC.modifcar(Lib)){
               JOptionPane.showMessageDialog(null, "Libro Modificado");
               limpiar();
           }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
               limpiar();
           }
        }  
           
           if(e.getSource()==frmLib.btnEliminar){
                  Lib.setIdLibro(Integer.parseInt(frmLib.txtIDlibro.getText()));
           if(LibC.eliminar(Lib)){
               JOptionPane.showMessageDialog(null, "Libro Eliminado");
               limpiar();
           }else{
                JOptionPane.showMessageDialog(null, "Error al Elimianr");
               limpiar();
           }
        }  
          
         //BOTONES DE MENU
        if(e.getSource()==frmLib.btnAutor){

            fmrAut.setVisible(true);
            frmEdi.setVisible(false);
            ControladorAutor crlAut = new ControladorAutor(fmrAut, new ConsultaAutor(),new Autordto());
        }
        
        if(e.getSource()==frmLib.btnEditorial){

            fmrAut.setVisible(false);
            frmEdi.setVisible(true);
            ControladorEditorial crlEdi = new ControladorEditorial(frmEdi, new ConsultaEditorial(),new Editorialdto());
        }
        
           
     }
         public void limpiar(){
          frmLib.txtAutor.setText(null);
         frmLib.txtCategoria.setText(null);
          frmLib.txtEditorial.setText(null);
          frmLib.txtFechaPublicacion.setText(null);
         frmLib.txtIDlibro.setText(null);
         frmLib.txtUbicacion.setText(null);
         frmLib.txtTituloLibro.setText(null);
    }
    
    
    
}
    
    
    
    
    

