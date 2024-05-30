
package Controlador;

import Modelodao.ConsultaBuscar;
import Modelodto.Autordto;
import Modelodto.Categoriadto;
import Modelodto.Librodto;
import Vista.BuscarAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorBuscar implements ActionListener{
    private BuscarAdmin fmrbus;
    private ConsultaBuscar busCon;
    private Autordto aut;
    private Librodto li;

    public ControladorBuscar(BuscarAdmin fmrbus, ConsultaBuscar busCon, Autordto aut, Librodto li) {
        this.fmrbus = fmrbus;
        this.busCon = busCon;
        this.aut = aut;
        this.li = li;
        this.fmrbus.jbtnBuscarAutor.addActionListener(this);
        this.fmrbus.jbtnBuscarTitulo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ///     BOTON BUSCAR AUTOR
        if(e.getSource()==fmrbus.jbtnBuscarAutor){
            aut.setNombre(fmrbus.jtxtBuscarAutor.getText());
            DefaultTableModel model = new DefaultTableModel();
            ResultSet rs =busCon.BuscarxAutor(aut);
            model.setColumnIdentifiers(new Object[]{"IdLibro","Titulo","Autor","Categoria","Editoria","Publicación"});
            try{
                while(rs.next()){
                    model.addRow(new Object[]{rs.getInt("IdLibro"),rs.getString("Titulo"),rs.getString("Nombre"),
                                 rs.getString("NomCategoria"),rs.getString("NomEditorial"),rs.getString("Publicacion")});
                    fmrbus.jtblMostrarBuscarLibro.setModel(model);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+ex);
            }
        }///--------------FIN BUSCAR
        
        ///     BOTON BUSCAR TITULO
        if(e.getSource()==fmrbus.jbtnBuscarTitulo){
            li.setTitulo(fmrbus.jtxtBuscarTitulo.getText());
            DefaultTableModel model = new DefaultTableModel();
            ResultSet rs =busCon.BuscarxTitulo(li);
            model.setColumnIdentifiers(new Object[]{"IdLibro","Titulo","Autor","Categoria","Editoria","Publicación"});
            try{
                while(rs.next()){
                    model.addRow(new Object[]{rs.getInt("IdLibro"),rs.getString("Titulo"),rs.getString("Nombre"),
                                 rs.getString("NomCategoria"),rs.getString("NomEditorial"),rs.getString("Publicacion")});
                    fmrbus.jtblMostrarBuscarLibro.setModel(model);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error al mostrar"+ex);
            }
        }///--------------FIN BUSCAR
        
        
    }
    
    
}
