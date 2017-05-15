/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import bsn.bsnDron;
import clases.Dron;
import java.beans.PropertyChangeListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Felipe Alonso
 */

public class Inventario extends javax.swing.JFrame {
    
    bsnDron bsn = new bsnDron();
        
    public Inventario(){
        initComponents();
        btn_eliminar.setVisible(false);
        btn_modificar.setVisible(false);
        btn_detalles.setVisible(false);
        
        this.setTitle("Control de Inventario");
        this.setLocationRelativeTo(null);
        tbl_Inventario.setModel(bsn.ModeloBase());
        tbl_Inventario.setModel(bsn.Datostabla());
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_titulo = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Inventario = new javax.swing.JTable();
        lbl_img = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        lbl_total = new javax.swing.JLabel();
        btn_detalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(983, 604));
        setMinimumSize(new java.awt.Dimension(983, 604));

        jPanel1.setMaximumSize(new java.awt.Dimension(983, 604));
        jPanel1.setMinimumSize(new java.awt.Dimension(983, 604));
        jPanel1.setPreferredSize(new java.awt.Dimension(983, 604));
        jPanel1.setLayout(null);

        txt_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setText("Inventario");
        jPanel1.add(txt_titulo);
        txt_titulo.setBounds(190, 20, 270, 92);

        btn_agregar.setText("Agregar Producto");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar);
        btn_agregar.setBounds(810, 110, 160, 60);

        tbl_Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_InventarioMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Inventario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 840, 360);

        lbl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Screenshot_2.png"))); // NOI18N
        jPanel1.add(lbl_img);
        lbl_img.setBounds(460, 30, 350, 80);

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar);
        btn_eliminar.setBounds(880, 270, 90, 60);

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar);
        btn_modificar.setBounds(880, 190, 90, 60);

        lbl_total.setText("total");
        jPanel1.add(lbl_total);
        lbl_total.setBounds(610, 550, 250, 40);

        btn_detalles.setText("Ver Detalles");
        btn_detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detallesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_detalles);
        btn_detalles.setBounds(30, 110, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        nuevo_dron nuevo = new nuevo_dron(this, rootPaneCheckingEnabled);
        this.dispose();
        nuevo.setVisible(true);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tbl_InventarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_InventarioMouseReleased
       btn_eliminar.setVisible(true);
       btn_modificar.setVisible(true);
       btn_detalles.setVisible(true);
    }//GEN-LAST:event_tbl_InventarioMouseReleased

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String equipo = tbl_Inventario.getModel().getValueAt(tbl_Inventario.getSelectedRow(), 0).toString();
        String num_serie = tbl_Inventario.getModel().getValueAt(tbl_Inventario.getSelectedRow(), 2).toString();
        String modelo = tbl_Inventario.getModel().getValueAt(tbl_Inventario.getSelectedRow(), 1).toString();
        
        String producto = "Equipo: "+equipo +"\n "+ "Nº de serie: "+ num_serie +"\n "+"Modelo: "+modelo;
        
        if (tbl_Inventario.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un item de la tabla primero");
        } else if (JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR \n" + producto) == JOptionPane.OK_OPTION) {
            bsn.eliminar(num_serie);
            ActualizarTabla();
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        String num_serie = tbl_Inventario.getModel().getValueAt(tbl_Inventario.getSelectedRow(), 2).toString();
        nuevo_dron nuevo = new nuevo_dron(this, rootPaneCheckingEnabled,num_serie);
        this.dispose();
        nuevo.setVisible(true);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detallesActionPerformed
       String Detalle ="";
       String num_serie = tbl_Inventario.getModel().getValueAt(tbl_Inventario.getSelectedRow(), 2).toString();
       
       Dron dron = new Dron(bsn.CargarDatos(num_serie));
       
       Detalle ="Detalle Producto:\n"
                + " Equipo ="+dron.getEquipo() + "\n" 
                + " Modelo-marca ="+dron.getMarca()+"\n"
                + " Nº de serie ="+dron.getNum_serie()+"\n" 
                + " Cantidad ="+dron.getCant()+"\n" 
                + " Helice ="+dron.getHelice()+"\n" 
                + " Control ="+dron.getControl()+"\n" 
                + " Bateria ="+dron.getBateria()+"\n" 
                + " Protectores de helice ="+dron.getProtector_helice()+"\n" 
                + " Adaptador ="+dron.getAdaptador()+"\n" 
                + " Maleta o Mochila ="+dron.getMochila()+"\n" 
                + " Gimball ="+dron.getGimball()+"\n" 
                + " Helice repuesto ="+dron.getHelice_repuesto()+"\n" 
                + " Cables usb ="+dron.getCable_usb()+"\n" 
                + " Cargador baterias ="+dron.getCargador()+"\n" 
                + " Enchufe cargador="+dron.getEnchufe_cargador()+"\n" 
                + " Otros ="+dron.getOtros()+"\n" 
                + " Observaciones ="+dron.getObs()+"\n" 
                + " Adaptador_bateria="+dron.getAdaptador_bateria()+"\n" 
                + " Estado actual ="+dron.getEstado()+"\n" 
                + " Estado_2 ="+dron.getEstado()+"";       
       
        JOptionPane.showMessageDialog(null,Detalle);
    }//GEN-LAST:event_btn_detallesActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_detalles;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_total;
    public javax.swing.JTable tbl_Inventario;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables

public void ActualizarTabla(){
           tbl_Inventario.removeAll();
           tbl_Inventario.setModel(bsn.Datostabla());
        }

}
