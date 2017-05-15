/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Conectar;

/**
 *
 * @author Felipe Alonso
 */
public class testConexion {
    
    public static void main (String[] args){
        Conectar c = new Conectar();
        if(c.obtener_conexion() != null){
            System.out.println("Conectado");
        }else{
            System.out.println("No Conectado");
        }
    }
    
}
