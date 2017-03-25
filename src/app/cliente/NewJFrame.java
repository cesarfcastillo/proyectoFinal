/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.cliente;

import app.dto.DeptDTO;
import app.facade.Facade;
import app.factory.UFactory;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fcastillo
 */
public class NewJFrame extends javax.swing.JFrame
{

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame()
    {
        initComponents();
        /*Facade facade = (Facade) UFactory.getInstancia("FACADE");
        Collection<DeptDTO> collDepts = facade.obtenerDepartamentos();
        String titulos[] = {"Numero", "Nombre", "Ubicacion"};
        DefaultTableModel m = new DefaultTableModel(null, titulos);
        String fila[] = new String[3];
        for (DeptDTO dto : collDepts) {
            fila[0] = String.valueOf(dto.getDeptno());
            fila[1] = dto.getDname();
            fila[2] = dto.getLoc();
            m.addRow(fila);

        }
        tabla.setModel(m);*/
        prepararTabla();
    }
    
    private void prepararTabla()
    {
         Facade facade = (Facade) UFactory.getInstancia("FACADE");
        Collection<DeptDTO> collDepts = facade.obtenerDepartamentos();
        String titulos[] = {"Numero", "Nombre", "Ubicacion"};
        DefaultTableModel m = new DefaultTableModel(null, titulos);
        String fila[] = new String[3];
        for (DeptDTO dto : collDepts) {
            fila[0] = String.valueOf(dto.getDeptno());
            fila[1] = dto.getDname();
            fila[2] = dto.getLoc();
            m.addRow(fila);

        }
        tabla.setModel(m);
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        centro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        norte = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sur = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout centroLayout = new javax.swing.GroupLayout(centro);
        centro.setLayout(centroLayout);
        centroLayout.setHorizontalGroup(
            centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        centroLayout.setVerticalGroup(
            centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(centro, java.awt.BorderLayout.CENTER);

        norte.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de Departamentos");

        javax.swing.GroupLayout norteLayout = new javax.swing.GroupLayout(norte);
        norte.setLayout(norteLayout);
        norteLayout.setHorizontalGroup(
            norteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(norteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        norteLayout.setVerticalGroup(
            norteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, norteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(norte, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout surLayout = new javax.swing.GroupLayout(sur);
        sur.setLayout(surLayout);
        surLayout.setHorizontalGroup(
            surLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        surLayout.setVerticalGroup(
            surLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        getContentPane().add(sur, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel norte;
    private javax.swing.JPanel sur;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}