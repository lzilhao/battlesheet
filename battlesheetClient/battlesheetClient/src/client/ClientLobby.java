/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.CardLayout;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo Pereira
 */
public class ClientLobby extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public ClientLobby() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lobby = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CreateGame_Button = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CreateGame = new javax.swing.JPanel();
        GoBack = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Minimize_CreateGame = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        CreateGame_ServerName = new javax.swing.JTextField();
        CreateGame_Password = new javax.swing.JTextField();
        CreateGame_VSPlayerName = new javax.swing.JTextField();
        CreateGame_ChangeServerName = new javax.swing.JTextField();
        CreateGame_ChangePassword = new javax.swing.JTextField();
        Send_Button = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JoinGame = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        GoBack2 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Send_Button2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lobby.setAlignmentX(0.0F);
        Lobby.setAlignmentY(0.0F);
        Lobby.setOpaque(false);
        Lobby.setPreferredSize(new java.awt.Dimension(904, 605));
        Lobby.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Settings.jpg"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Settings.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Lobby.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 28, 25));

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Lobby.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 5, 26, 25));

        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Lobby.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 5, 26, 25));

        CreateGame_Button.setBorderPainted(false);
        CreateGame_Button.setContentAreaFilled(false);
        CreateGame_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateGame_Button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_Create_Game.jpg"))); // NOI18N
        CreateGame_Button.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_Create_Game.jpg"))); // NOI18N
        CreateGame_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateGame_ButtonMouseClicked(evt);
            }
        });
        Lobby.add(CreateGame_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 159, 245, 57));

        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_Join_Game.jpg"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_Join_Game.jpg"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Lobby.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 251, 245, 57));

        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_Spectate_Game.jpg"))); // NOI18N
        jButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_Spectate_Game.jpg"))); // NOI18N
        Lobby.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 345, 245, 57));

        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Send.jpg"))); // NOI18N
        Lobby.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 379, 30, 20));

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        Lobby.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 750, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lobby.jpg"))); // NOI18N
        Lobby.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        getContentPane().add(Lobby, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 620));

        CreateGame.setOpaque(false);
        CreateGame.setPreferredSize(new java.awt.Dimension(904, 605));
        CreateGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GoBack.setBorder(null);
        GoBack.setBorderPainted(false);
        GoBack.setContentAreaFilled(false);
        GoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow_button.jpg"))); // NOI18N
        GoBack.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow_button.jpg"))); // NOI18N
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackMouseClicked(evt);
            }
        });
        GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackActionPerformed(evt);
            }
        });
        CreateGame.add(GoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 5, 28, 25));

        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Settings.jpg"))); // NOI18N
        jButton9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Settings.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        CreateGame.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 28, 25));

        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        CreateGame.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 750, 32));

        Minimize_CreateGame.setBorder(null);
        Minimize_CreateGame.setBorderPainted(false);
        Minimize_CreateGame.setContentAreaFilled(false);
        Minimize_CreateGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize_CreateGame.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        Minimize_CreateGame.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        Minimize_CreateGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minimize_CreateGameActionPerformed(evt);
            }
        });
        CreateGame.add(Minimize_CreateGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 5, 26, 25));

        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        jButton11.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        CreateGame.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 5, 26, 25));

        CreateGame_ServerName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateGame_ServerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CreateGame_ServerName.setBorder(null);
        CreateGame_ServerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateGame_ServerNameActionPerformed(evt);
            }
        });
        CreateGame.add(CreateGame_ServerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 313, 182, 27));

        CreateGame_Password.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateGame_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CreateGame_Password.setBorder(null);
        CreateGame_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateGame_PasswordActionPerformed(evt);
            }
        });
        CreateGame.add(CreateGame_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 96, 182, 27));

        CreateGame_VSPlayerName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateGame_VSPlayerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CreateGame_VSPlayerName.setBorder(null);
        CreateGame_VSPlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateGame_VSPlayerNameActionPerformed(evt);
            }
        });
        CreateGame.add(CreateGame_VSPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 127, 182, 27));

        CreateGame_ChangeServerName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateGame_ChangeServerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CreateGame_ChangeServerName.setBorder(null);
        CreateGame_ChangeServerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateGame_ChangeServerNameActionPerformed(evt);
            }
        });
        CreateGame.add(CreateGame_ChangeServerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 221, 182, 27));

        CreateGame_ChangePassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateGame_ChangePassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CreateGame_ChangePassword.setBorder(null);
        CreateGame_ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateGame_ChangePasswordActionPerformed(evt);
            }
        });
        CreateGame.add(CreateGame_ChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 375, 182, 27));

        Send_Button.setBorder(null);
        Send_Button.setBorderPainted(false);
        Send_Button.setContentAreaFilled(false);
        Send_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Send_Button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Send.jpg"))); // NOI18N
        Send_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Send_ButtonActionPerformed(evt);
            }
        });
        CreateGame.add(Send_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 379, 30, 20));

        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change_button.jpg"))); // NOI18N
        jButton12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change_button.jpg"))); // NOI18N
        CreateGame.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 373, 60, 30));

        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/startgame_button.jpg"))); // NOI18N
        jButton13.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/startgame_button.jpg"))); // NOI18N
        CreateGame.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 250, 184, 30));

        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change_button.jpg"))); // NOI18N
        jButton14.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change_button.jpg"))); // NOI18N
        CreateGame.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 311, 60, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CreateGame.jpg"))); // NOI18N
        CreateGame.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(CreateGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        JoinGame.setOpaque(false);
        JoinGame.setPreferredSize(new java.awt.Dimension(904, 605));
        JoinGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Settings.jpg"))); // NOI18N
        jButton21.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Settings.jpg"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        JoinGame.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 28, 25));

        GoBack2.setBorder(null);
        GoBack2.setBorderPainted(false);
        GoBack2.setContentAreaFilled(false);
        GoBack2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoBack2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow_button.jpg"))); // NOI18N
        GoBack2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow_button.jpg"))); // NOI18N
        GoBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBack2MouseClicked(evt);
            }
        });
        GoBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBack2ActionPerformed(evt);
            }
        });
        JoinGame.add(GoBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 5, 28, 25));

        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        jButton22.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_minimizar_selecionado.jpg"))); // NOI18N
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22MousePressed(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        JoinGame.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 5, 26, 25));

        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        jButton23.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botao_fechar_selecionado.jpg"))); // NOI18N
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        JoinGame.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 5, 26, 25));

        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        JoinGame.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 750, 32));

        Send_Button2.setBorder(null);
        Send_Button2.setBorderPainted(false);
        Send_Button2.setContentAreaFilled(false);
        Send_Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Send_Button2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Send.jpg"))); // NOI18N
        Send_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Send_Button2ActionPerformed(evt);
            }
        });
        JoinGame.add(Send_Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 379, 30, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JoinGame.jpg"))); // NOI18N
        JoinGame.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(JoinGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
                                  
    
    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void CreateGame_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateGame_ButtonMouseClicked
        this.setContentPane(CreateGame);
    }//GEN-LAST:event_CreateGame_ButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        this.setContentPane(Lobby);
    }//GEN-LAST:event_GoBackMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void Minimize_CreateGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimize_CreateGameActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Minimize_CreateGameActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void CreateGame_ServerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateGame_ServerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateGame_ServerNameActionPerformed

    private void CreateGame_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateGame_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateGame_PasswordActionPerformed

    private void CreateGame_VSPlayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateGame_VSPlayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateGame_VSPlayerNameActionPerformed

    private void CreateGame_ChangeServerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateGame_ChangeServerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateGame_ChangeServerNameActionPerformed

    private void CreateGame_ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateGame_ChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateGame_ChangePasswordActionPerformed

    private void Send_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Send_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Send_ButtonActionPerformed

    private void GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoBackActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void GoBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBack2MouseClicked
        this.setContentPane(Lobby);
    }//GEN-LAST:event_GoBack2MouseClicked

    private void GoBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoBack2ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MousePressed

    private void Send_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Send_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Send_Button2ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        this.setContentPane(JoinGame);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MousePressed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton22MousePressed

    private void jButton23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MousePressed
        System.exit(0);
    }//GEN-LAST:event_jButton23MousePressed

    
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
            java.util.logging.Logger.getLogger(ClientLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientLobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateGame;
    private javax.swing.JButton CreateGame_Button;
    private javax.swing.JTextField CreateGame_ChangePassword;
    private javax.swing.JTextField CreateGame_ChangeServerName;
    private javax.swing.JTextField CreateGame_Password;
    private javax.swing.JTextField CreateGame_ServerName;
    private javax.swing.JTextField CreateGame_VSPlayerName;
    private javax.swing.JButton GoBack;
    private javax.swing.JButton GoBack2;
    private javax.swing.JPanel JoinGame;
    private javax.swing.JPanel Lobby;
    private javax.swing.JButton Minimize_CreateGame;
    private javax.swing.JButton Send_Button;
    private javax.swing.JButton Send_Button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}