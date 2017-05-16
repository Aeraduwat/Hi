/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsn;

import clases.otros;
import dao.daoOtros;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Felipe Alonso
 */
public class bsnOtros {
    
    daoOtros dao = new daoOtros();
    
    public DefaultTableModel ModeloBase(){
        return dao.ModeloBase();
    }
    
    public void Agregar(otros Otro){
        dao.Agregar(Otro);
    }
    
    public void Eliminar(otros Otro){
        dao.Eliminar(Otro);
    }
    
    public void Modificar(otros Otro,String Clave){
        dao.Modificar(Otro,Clave);
    }

    public TableModel datostabla() {
        return dao.CargarDatos();
    }
               
}
