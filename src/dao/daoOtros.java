/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Conectar;
import clases.otros;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JCheckBox;
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
            modelo.addColumn("Detalle");
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
        //    rs.next();
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
                + "'"+ Otro.getDetalle()+ "',"
                + Otro.getCantidad()+")";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Insercion Exitosa");
        } catch (SQLException | HeadlessException e) {
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
        String Query ="DELETE FROM otros WHERE equipo='"+Otro.getEquipo()+"' and marca='"+Otro.getMarca()+"'";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void Modificar(otros Otro,String clave) {
        String act_equipo = clave.substring(0,clave.indexOf("%"));
        String act_marca = clave.substring(clave.indexOf("%")+1);
        
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String Query ="UPDATE otros SET equipo='"+Otro.getEquipo()+
                      "', marca='"+Otro.getMarca()+"', detalle='"+Otro.getDetalle()+"',cantidad="+Otro.getCantidad()+
                       " WHERE equipo='"+act_equipo+"' and marca='"+act_marca+"'";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public String[] ObtenerNombres() {
        
        //JCheckBox listado[] = new JCheckBox[cantidad()];
        String nombres[] = new String[cantidad()];
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion(); 
        String Query ="SELECT * FROM otros";
        int i = 0;
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                nombres[i] = rs.getString("equipo") +" "+rs.getString("marca");
                
                i++;
                
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return nombres;
    }

    public int cantidad() {
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion(); 
        int num =0;
        String Query ="SELECT COUNT(*) cant from otros";
         try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            num = Integer.parseInt(rs.getString("cant"));
            

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return num;
    }
    
    
}
