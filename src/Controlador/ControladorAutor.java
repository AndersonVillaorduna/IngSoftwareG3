
package Controlador;

import Modelodao.ConsultaAutor;
import Modelodto.Autordto;
import Vista.GestionAutores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorAutor implements ActionListener{
    private GestionAutores fmraut;
    private ConsultaAutor autCon;
    private Autordto aut;

    public ControladorAutor(GestionAutores fmraut, ConsultaAutor autCon, Autordto aut) {
        this.fmraut = fmraut;
        this.autCon = autCon;
        this.aut = aut;
        this.fmraut.jbtnGuardarAutor.addActionListener(this);
        this.fmraut.jbtnEliminarAutor.addActionListener(this);
        this.fmraut.jbtnActualizarAutor.addActionListener(this);
        this.fmraut.jbtnMostrarAutor.addActionListener(this);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        ///     BOTON AGREGAR
        if(e.getSource()==fmraut.jbtnGuardarAutor){
            aut.setNombre(fmraut.jtxtNombreAutor1.getText());
            aut.setEdad(Integer.parseInt(fmraut.jtxtEdadAutor.getText()));
            aut.setPais(fmraut.jtxtPaisAutor.getText());            
            if (autCon.Registrar(aut)){
                JOptionPane.showMessageDialog(null, "Autor agregado con éxito");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al agregar");
                Limpiar();
            }
        }///--------------FIN AGREGAR
        
         ///     BOTON MODIFICAR
        if(e.getSource()==fmraut.jbtnActualizarAutor){
            aut.setIdAutor(Integer.parseInt(fmraut.jtxtIdAutor.getText()));
            aut.setNombre(fmraut.jtxtNombreAutor1.getText());
            aut.setEdad(Integer.parseInt(fmraut.jtxtEdadAutor.getText()));
            aut.setPais(fmraut.jtxtPaisAutor.getText());            
            if (autCon.Modificar(aut)){
                JOptionPane.showMessageDialog(null, "Autor modificado con éxito");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
                Limpiar();
            }
        }///--------------FIN MODIFICAR
        
        ///     BOTON ELIMINAR
        if(e.getSource()==fmraut.jbtnEliminarAutor){
            aut.setIdAutor(Integer.parseInt(fmraut.jtxtIdAutor.getText()));           
            if (autCon.Eliminar(aut)){
                JOptionPane.showMessageDialog(null, "Autor eliminado con éxito");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                Limpiar();
            }
        }///--------------FIN ELIMINAR
        
        ///     BOTON MOSTRAR
        if(e.getSource()==fmraut.jbtnMostrarAutor){
            DefaultTableModel model = new DefaultTableModel();
            ResultSet rs =autCon.Mostrar();
            model.setColumnIdentifiers(new Object[]{"IdAutor","Nombre Completo","Edad","Pais"});
            try{
                while(rs.next()){
                    model.addRow(new Object[]{rs.getInt("IdAutor"),rs.getString("Nombre"),
                                    rs.getInt("Edad"),rs.getString("Pais")});
                    fmraut.jtblMostrarAutor.setModel(model);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+ex);
            }
        }///--------------FIN MOSTRAR
        
        ///--------------BOTON LIMPIAR
     
        ///--------------FIN LIMPIAR
        
    }
    
    public void Limpiar(){
        fmraut.jtxtIdAutor.setText(null);
        fmraut.jtxtIdAutor.setText(null);
        fmraut.jtxtEdadAutor.setText(null);
        fmraut.jtxtPaisAutor.setText(null);
    }
    
}
