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
  //  String url ="ec2-54-235-240-92.compute-1.amazonaws.com/dfge9qn4ornl1c/dfge9qn4ornl1c";
  //  String user="wronzhlqbnglhn";
  //  String pass="eb9fa4830b4ebe2812988c85744d2bc159a9ffee0aff0904b0e63b406c2d7e6e";
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
