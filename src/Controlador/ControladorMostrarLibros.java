
package Controlador;

import Modelodao.ConsultaLibro;
import Modelodto.Librodto;
import Vista.GestionAutores;
import Vista.GestionEditorial;
import Vista.MostrarAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorMostrarLibros implements ActionListener{
    private MostrarAdmin frmLib;
    private ConsultaLibro LibC;
    private Librodto Lib;

    public ControladorMostrarLibros(MostrarAdmin frmLib, ConsultaLibro LibC, Librodto Lib) {
        this.frmLib = frmLib;
        this.LibC = LibC;
        this.Lib = Lib;
        this.frmLib.jbtnMostrarLibro.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        ///     BOTON MOSTRAR
        if(e.getSource()==frmLib.jbtnMostrarLibro){
            DefaultTableModel model = new DefaultTableModel();
            ResultSet rs =LibC.Mostrar();
            model.setColumnIdentifiers(new Object[]{"IdLibro","IdAutor","IdCategoria","IdEditorial","Titulo","Ubicacion","Publicacion",});
            try{
                while(rs.next()){
                    model.addRow(new Object[]{rs.getInt("IdLibro"),rs.getInt("IdAutor"),rs.getInt("IdCategoria"),rs.getInt("IdEditorial"),
                       rs.getString("Titulo"),rs.getString("Ubicacion"),rs.getString("Publicacion")});
                    frmLib.jtblMostrarLibros.setModel(model);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+ex);
            }
        }///--------------FIN MOSTRAR
    }
}
