/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Conectar;
import clases.otros;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Alonso
 */
public class daoOtros {
    
    public DefaultTableModel ModeloBase(){
        DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Equipo");
            modelo.addColumn("Marca");
            modelo.addColumn("xxx");
            modelo.addColumn("Cantidad");
        
        return modelo;
    }
    
    public DefaultTableModel CargarDatos(){
        DefaultTableModel modelo = ModeloBase();
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String datos[] = new String[4];
        String Query ="SELECT * FROM otros";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    modelo.addRow(datos);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        return modelo;
    }

    public void Agregar(otros Otro) {
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String Query ="INSERT INTO otros VALUES("
                + "'"+ Otro.getEquipo()+ "',"
                + "'"+ Otro.getMarca()+ "',"
                + "'"+ Otro.getXxx()+ "',"
                + Otro.getCantidad()+")";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Insercion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void Eliminar(otros Otro) {
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String Query ="DELETE FROM otros WHERE equipo='"+Otro.getEquipo()+" and marca='"+Otro.getMarca()+"'";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void Modificar(otros Otro) {
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String Query ="UPDATE otros SET equipo='"+Otro.getEquipo()+
                      "', marca='"+Otro.getMarca()+"', xxx='"+Otro.getXxx()+"',cantidad="+Otro.getCantidad();
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
}
