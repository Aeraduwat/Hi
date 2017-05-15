/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Conectar;
import clases.Dron;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Felipe Alonso
 */
public class daoDron {

    public DefaultTableModel modeloBase() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("EQUIPO");
        modelo.addColumn("Marca-Modelo");
        modelo.addColumn("N° de serie");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Baterias");
        modelo.addColumn("Helices");
        return modelo;
    }
    
    public DefaultTableModel datosTabla(){
        DefaultTableModel modelo = modeloBase();
        String Query ="SELECT * FROM drones";
        
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            String[] datos = new String[6];

            while (rs.next()) {
                datos[0] = rs.getString("equipo");
                datos[1] = rs.getString("modelo_marca");
                datos[2] = rs.getString("num_serie");
                datos[3] = rs.getString("cantidad");
                datos[4] = rs.getString("bateria");
                datos[5] = rs.getString("helice"); 
                        
                
                modelo.addRow(datos);
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
        return modelo;
    }

    public void Agregar(Dron dron) {
       /*plop*/
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String Query = "INSERT INTO drones VALUES ("+
                       "'"+dron.getEquipo().toUpperCase()+"',"+
                       "'"+dron.getMarca()+"',"+
                       "'"+dron.getNum_serie()+"',"+
                       dron.getCant()+","+
                       dron.getHelice()+","+
                       dron.getControl()+","+
                       dron.getBateria()+","+
                       dron.getProtector_helice()+","+
                       dron.getAdaptador()+","+
                       dron.getMochila()+","+
                       dron.getGimball()+","+
                       dron.getHelice_repuesto()+","+
                       dron.getCable_usb()+","+
                       dron.getCargador()+","+
                       dron.getEnchufe_cargador()+","+
                       "'"+dron.getOtros()+"',"+
                       "'"+dron.getObs()+"',"+
                       dron.getAdaptador_bateria()+","+
                       "'"+dron.getEstado()+"',"+
                       "'"+dron.getFecha_estado()+"')";
        
        try {
            
            Statement st = cn.prepareStatement(Query);
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    public void eliminar(String num_serie) {
        
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String Query = "DELETE FROM drones WHERE num_serie = '"+num_serie+"'";
        
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Borrado exitosamente");
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
    }

    public Dron CargarDatos(String num_serie) {
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();
        String Query ="SELECT * FROM drones WHERE num_serie='"+num_serie+"'";
        Dron dron = new Dron();
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            dron.setEquipo(rs.getString(1));
            dron.setMarca(rs.getString(2));
            dron.setNum_serie(rs.getString(3));
            dron.setCant(Integer.parseInt(rs.getString(4)));
            dron.setHelice(Integer.parseInt(rs.getString(5)));
            dron.setControl(Integer.parseInt(rs.getString(6)));
            dron.setBateria(Integer.parseInt(rs.getString(7)));
            dron.setProtector_helice(Integer.parseInt(rs.getString(8)));
            dron.setAdaptador(Integer.parseInt(rs.getString(9)));
            dron.setMochila(Integer.parseInt(rs.getString(10)));
            dron.setGimball(Integer.parseInt(rs.getString(11)));
            dron.setHelice_repuesto(Integer.parseInt(rs.getString(12)));
            dron.setCable_usb(Integer.parseInt(rs.getString(13)));
            dron.setCargador(Integer.parseInt(rs.getString(14)));
            dron.setEnchufe_cargador(Integer.parseInt(rs.getString(15)));
            dron.setOtros(rs.getString(16));
            dron.setObs(rs.getString(17));
            dron.setAdaptador_bateria(Integer.parseInt(rs.getString(18)));
            dron.setEstado(rs.getString(19));
            dron.setFecha_estado(rs.getString(20));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {cn.close();} catch (Exception e) {
                         JOptionPane.showMessageDialog(null, e);
            }
        }
         return dron;
        }

    public void Actualizar(Dron dron) {
        Conectar cc= new Conectar();
        Connection cn = cc.obtener_conexion();    
        String Query ="UPDATE drones SET "
                + "equipo ='"+dron.getEquipo().toUpperCase()+"',"
                + "modelo_marca ='"+dron.getMarca()+"',"
                + "num_serie ='"+dron.getNum_serie()+"',"
                + "cantidad ="+dron.getCant()+","
                + "helice ="+dron.getHelice()+","
                + "control ="+dron.getControl()+","
                + "bateria ="+dron.getBateria()+","
                + "protectores_de_helice ="+dron.getProtector_helice()+","
                + "adaptador ="+dron.getAdaptador()+","
                + "maleta ="+dron.getMochila()+","
                + "gimball ="+dron.getGimball()+","
                + "helice_repuesto ="+dron.getHelice_repuesto()+","
                + "cables_usb ="+dron.getCable_usb()+","
                + "cargador_baterias ="+dron.getCargador()+","
                + "enchufe_cargador="+dron.getEnchufe_cargador()+","
                + "otros ='"+dron.getOtros()+"',"
                + "observaciones ='"+dron.getObs()+"',"
                + "adaptador_bateria="+dron.getAdaptador_bateria()+","
                + "estado_actual ='"+dron.getEstado()+"',"
                + "estado_2 ='"+dron.getFecha_estado()+"' "
                + "WHERE num_serie ='"+dron.getNum_serie()+"'";
        
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
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
