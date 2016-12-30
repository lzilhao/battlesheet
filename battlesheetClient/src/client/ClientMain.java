/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Pereira
 */
public class ClientMain extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    static String utilizador;
    static String senhaencriptada;
    static String senha;
    static int pedido;
    static MySocket client = new MySocket();
    
    public ClientMain() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    MD5Pwd obj =  MD5Pwd.getInstance();
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Index_Username = new javax.swing.JTextField();
        index_PasswordField = new javax.swing.JPasswordField();
        Index_Button_CreateAcc = new javax.swing.JButton();
        Index_Button_Login = new javax.swing.JButton();
        Index_Button_Minimize = new javax.swing.JButton();
        Index_Button_close = new javax.swing.JButton();
        Index_Drag = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Index = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Index_Username.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Index_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Index_Username.setBorder(null);
        Index_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Index_UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Index_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 165, 20));

        index_PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        index_PasswordField.setBorder(null);
        index_PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                index_PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(index_PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 233, 165, 20));

        Index_Button_CreateAcc.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.highlight"));
        Index_Button_CreateAcc.setBorder(null);
        Index_Button_CreateAcc.setBorderPainted(false);
        Index_Button_CreateAcc.setContentAreaFilled(false);
        Index_Button_CreateAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Index_Button_CreateAcc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao_createacc_selecionado.jpg"))); // NOI18N
        Index_Button_CreateAcc.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao_createacc_selecionado.jpg"))); // NOI18N
        Index_Button_CreateAcc.setSelected(true);
        Index_Button_CreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Index_Button_CreateAccMouseClicked(evt);
            }
        });
        Index_Button_CreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Index_Button_CreateAccActionPerformed(evt);
            }
        });
        getContentPane().add(Index_Button_CreateAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 278, 77, 24));

        Index_Button_Login.setBorder(null);
        Index_Button_Login.setBorderPainted(false);
        Index_Button_Login.setContentAreaFilled(false);
        Index_Button_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Index_Button_Login.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao_login.jpg"))); // NOI18N
        Index_Button_Login.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao_login_selecionado.jpg"))); // NOI18N
        Index_Button_Login.setSelected(true);
        Index_Button_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Index_Button_LoginMouseClicked(evt);
            }
        });
        Index_Button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Index_Button_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Index_Button_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 277, 57, 22));

        Index_Button_Minimize.setBorder(null);
        Index_Button_Minimize.setBorderPainted(false);
        Index_Button_Minimize.setContentAreaFilled(false);
        Index_Button_Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Index_Button_Minimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        Index_Button_Minimize.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        Index_Button_Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Index_Button_MinimizeActionPerformed(evt);
            }
        });
        getContentPane().add(Index_Button_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 6, 26, 25));

        Index_Button_close.setBorder(null);
        Index_Button_close.setBorderPainted(false);
        Index_Button_close.setContentAreaFilled(false);
        Index_Button_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Index_Button_close.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        Index_Button_close.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        Index_Button_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Index_Button_closeActionPerformed(evt);
            }
        });
        getContentPane().add(Index_Button_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 6, 24, 25));

        Index_Drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Index_DragMouseDragged(evt);
            }
        });
        Index_Drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Index_DragMousePressed(evt);
            }
        });
        getContentPane().add(Index_Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 435, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Publicidade.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 137, 150, 265));

        Index.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/index.jpg"))); // NOI18N
        getContentPane().add(Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Index_Button_CreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Index_Button_CreateAccActionPerformed
        // TODO add your handling code here:
        //DBClass DB = new DBClass();
    }//GEN-LAST:event_Index_Button_CreateAccActionPerformed

    private void Index_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Index_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Index_UsernameActionPerformed

    private void Index_Button_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Index_Button_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Index_Button_closeActionPerformed

    private void Index_Button_MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Index_Button_MinimizeActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Index_Button_MinimizeActionPerformed

    private void Index_DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Index_DragMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_Index_DragMouseDragged

    private void Index_DragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Index_DragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Index_DragMousePressed

    private void index_PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_index_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_index_PasswordFieldActionPerformed

    private void Index_Button_CreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Index_Button_CreateAccMouseClicked
        utilizador = Index_Username.getText();
        senha = new String(index_PasswordField.getPassword());
        senhaencriptada = obj.encode(utilizador,senha);
        pedido = 1;
       // SendData.Envia(pedido, utilizador, senhaencriptada);
        pedido = 1;    }//GEN-LAST:event_Index_Button_CreateAccMouseClicked

    private void Index_Button_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Index_Button_LoginMouseClicked
         System.out.println(":D");
        utilizador = Index_Username.getText();
        senha = new String(index_PasswordField.getPassword());
        senhaencriptada = obj.encode(utilizador,senha);
        pedido = 2;
        ClientLobby2 clientlobby = new ClientLobby2();
        clientlobby.setVisible(true);
        dispose();
     //   SendData.Envia(pedido, utilizador, senhaencriptada);
        pedido = 2;     }//GEN-LAST:event_Index_Button_LoginMouseClicked

    private void Index_Button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Index_Button_LoginActionPerformed
        if(1==1)
        {
             System.out.println(":D");
            utilizador = Index_Username.getText();
            senha = new String(index_PasswordField.getPassword());
            senhaencriptada = obj.encode(utilizador,senha);
            pedido = 2;
         //   SendData.Envia(pedido, utilizador, senhaencriptada);
            ClientLobby1 clientlobby = new ClientLobby1();
            clientlobby.setVisible(true);
            dispose();
       
        }

    }//GEN-LAST:event_Index_Button_LoginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("http://lpro.fe.up.pt/201617/doku.php/lpro22/index").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(ClientMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientMain().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Index;
    private javax.swing.JButton Index_Button_CreateAcc;
    private javax.swing.JButton Index_Button_Login;
    private javax.swing.JButton Index_Button_Minimize;
    private javax.swing.JButton Index_Button_close;
    private javax.swing.JLabel Index_Drag;
    private javax.swing.JTextField Index_Username;
    private javax.swing.JPasswordField index_PasswordField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}