
package Controlador;

import Modelodao.ConsultaEditorial;
import Modelodto.Editorialdto;
import Vista.GestionEditorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorEditorial implements ActionListener{
    private GestionEditorial fmredi;
    private ConsultaEditorial ediCon;
    private Editorialdto edi;

    public ControladorEditorial(GestionEditorial fmredi, ConsultaEditorial ediCon, Editorialdto edi) {
        this.fmredi = fmredi;
        this.ediCon = ediCon;
        this.edi = edi;
        this.fmredi.jbtnGuardarEditorial.addActionListener((ActionListener) this);
        this.fmredi.jbtnEliminarEditorial.addActionListener(this);
        this.fmredi.jbtnActualizarEditorial.addActionListener(this);
        this.fmredi.jbtnMostrarEditorial.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ///     BOTON AGREGAR
        if(e.getSource()==fmredi.jbtnGuardarEditorial){
            edi.setNomEditorial(fmredi.jtxtNombreEditorial.getText());           
            if (ediCon.Registrar(edi)){
                JOptionPane.showMessageDialog(null, "Editorial agregada con éxito");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al agregar");
                Limpiar();
            }
        }///--------------FIN AGREGAR
        
         ///     BOTON MODIFICAR
        if(e.getSource()==fmredi.jbtnActualizarEditorial){
            edi.setIdEditorial(Integer.parseInt(fmredi.jtxtIdEditorial.getText()));
            edi.setNomEditorial(fmredi.jtxtNombreEditorial.getText());          
            if (ediCon.Modificar(edi)){
                JOptionPane.showMessageDialog(null, "Editorial modificada con éxito");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
                Limpiar();
            }
        }///--------------FIN MODIFICAR
        
        ///     BOTON ELIMINAR
        if(e.getSource()==fmredi.jbtnEliminarEditorial){
            edi.setIdEditorial(Integer.parseInt(fmredi.jtxtIdEditorial.getText()));           
            if (ediCon.Eliminar(edi)){
                JOptionPane.showMessageDialog(null, "Editorial eliminada con éxito");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                Limpiar();
            }
        }///--------------FIN ELIMINAR
        
        ///     BOTON MOSTRAR
        if(e.getSource()==fmredi.jbtnMostrarEditorial){
            DefaultTableModel model = new DefaultTableModel();
            ResultSet rs =ediCon.Mostrar();
            model.setColumnIdentifiers(new Object[]{"IdEditorial","Nombre de la Editorial"});
            try{
                while(rs.next()){
                    model.addRow(new Object[]{rs.getInt("IdEditorial"),rs.getString("NomEditorial")});
                    fmredi.jtblMostrarEditorial.setModel(model);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+ex);
            }
        }///--------------FIN MOSTRAR
        
        ///--------------BOTON LIMPIAR
       
        
        ///--------------FIN LIMPIAR
    }
    
    public void Limpiar(){
        fmredi.jtxtIdEditorial.setText(null);
        fmredi.jtxtNombreEditorial.setText(null);
    }
    
    
}
