/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsn;

import clases.Dron;
import dao.daoDron;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Alonso
 */
public class bsnDron {
    daoDron dao = new daoDron();
    
    public void Agregar(Dron dron) {
            dao.Agregar(dron);
    }
    
    public DefaultTableModel ModeloBase(){
        return dao.modeloBase();
    }
    
    public DefaultTableModel Datostabla(){
        return dao.datosTabla();
    }

    public void eliminar(String num_serie) {
            dao.eliminar(num_serie);
    }
    
    public Dron CargarDatos(String num_serie){
          return  dao.CargarDatos(num_serie);
    }

    public void Actualizar(Dron dron) {
        dao.Actualizar(dron);
    }
}
