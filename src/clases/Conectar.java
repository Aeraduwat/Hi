/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.gjt.mm.mysql.Driver;
/**
 *
 * @author Felipe Alonso
 */
public class Conectar {
    Connection conect;
  //  String url ="jdbc:mysql://sql60.hostinger.es/phpmyadmin//DRONES";
  //  String user="u822458886_invek";
  //  String pass="^ZiQ]W=~8C94";
    String url ="jdbc:mysql://localhost/inventario";
    String user="root";
    String pass="";
    
      
    public Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.err.println(e);          
        }
       try {
           conect=(Connection) DriverManager.getConnection(url,user,pass);
       }catch(SQLException e){
           System.err.println(e);
       }    
    }
     
   public  Connection obtener_conexion(){
           return conect;
    }
   
 }
