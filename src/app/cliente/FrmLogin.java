/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.cliente;

import app.dto.UserDTO;
import app.facade.Facade;
import app.factory.UFactory;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Collection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author fcastillo
 */
public class FrmLogin extends javax.swing.JFrame
{

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin()
    {
        initComponents();

        setLocationRelativeTo(this);
    }

    // se agrego esto y se cambio la propiedad imageIcon del JFrame
    @Override
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/user.png"));

        return retValue;
    }

    void limpiar()
    {
        cajaUsuario.setText("");
        cajaPass.setText("");
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

        jPanel1 = new javax.swing.JPanel();
        etiquetaUsr = new javax.swing.JLabel();
        etiquetaCtr = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaPass = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnEntrar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaUsr.setText("Usuario:");
        jPanel1.add(etiquetaUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 20, -1, -1));

        etiquetaCtr.setText("Contraseña: ");
        jPanel1.add(etiquetaCtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 69, -1, -1));

        cajaUsuario.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 12, 167, 31));

        cajaPass.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(cajaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 61, 167, 31));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/ico/accept.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 68));

        btnEntrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/ico/cancer.png"))); // NOI18N
        btnEntrar1.setText("Cancelar");
        btnEntrar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEntrar1.setBorderPainted(false);
        btnEntrar1.setContentAreaFilled(false);
        btnEntrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntrar1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEntrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 68));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Iniciar Sesion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEntrarActionPerformed
    {//GEN-HEADEREND:event_btnEntrarActionPerformed
        // Aqui vamos aautenticar el usuario
        Facade facade = (Facade) UFactory.getInstancia("FACADE");
        if (cajaUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo usuario no puede estar vacio.");
            cajaUsuario.requestFocus();

        } else if (cajaPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo password no puede estar vacio.");
            cajaUsuario.requestFocus();

        } else {
            Collection<UserDTO> collUsers = facade.autenticarUsuario(cajaUsuario.getText(), cajaPass.getText());
            if (collUsers.size() > 0) {
                this.dispose();
                FrmMenu menu = new FrmMenu();
                for (UserDTO dto : collUsers) {
                    menu.etiquetaUsuario.setText("Usuario : " + dto.getUser());
                    menu.etiquetaRol.setText("Rol: " + dto.getRol());

                }

                menu.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Sus datos son incorrectos...");
            }
        }


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEntrar1ActionPerformed
    {//GEN-HEADEREND:event_btnEntrar1ActionPerformed
        limpiar();  
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JPasswordField cajaPass;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel etiquetaCtr;
    private javax.swing.JLabel etiquetaUsr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
