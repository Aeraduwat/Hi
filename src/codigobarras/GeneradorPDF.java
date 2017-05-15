/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigobarras;

/**
 *
 * @author HP
 */
public class GeneradorPDF {
    
    public static void main(String[] args) {
        GenerarPDF g = new GenerarPDF();
        g.GenerarPDF("Titulo", "asdfasdfasdf", "esto es la parte de abajo", "C:\\Users\\HP\\Desktop\\imagenprueba.jpg", "C:\\Users\\HP\\Desktop\\prueba.pdf","123456789");
    }
}
