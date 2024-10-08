/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

public class JLogin extends javax.swing.JFrame {
    public JLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        formulario = new javax.swing.JPanel();
        titulo = new javax.swing.JPanel();
        log = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        inputs = new javax.swing.JPanel();
        email = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        senha = new javax.swing.JPanel();
        labelSenha = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        forgot = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        labelForgot = new javax.swing.JLabel();
        buttons = new javax.swing.JPanel();
        cadastrarGoogle = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cadastrar = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        signin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        card = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(2147483647, 520));
        setResizable(false);

        formulario.setBackground(new java.awt.Color(82, 58, 53));
        formulario.setForeground(new java.awt.Color(89, 76, 71));
        formulario.setPreferredSize(new java.awt.Dimension(400, 100));

        titulo.setBackground(new java.awt.Color(82, 58, 53));
        titulo.setForeground(new java.awt.Color(89, 76, 71));
        titulo.setPreferredSize(new java.awt.Dimension(400, 80));

        log.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        log.setForeground(new java.awt.Color(242, 174, 48));
        log.setText("Log");

        in.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        in.setForeground(new java.awt.Color(240, 141, 50));
        in.setText("in");

        javax.swing.GroupLayout tituloLayout = new javax.swing.GroupLayout(titulo);
        titulo.setLayout(tituloLayout);
        tituloLayout.setHorizontalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(log)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in)
                .addGap(150, 150, 150))
        );
        tituloLayout.setVerticalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log)
                    .addComponent(in))
                .addContainerGap())
        );

        formulario.add(titulo);

        inputs.setBackground(new java.awt.Color(82, 58, 53));
        inputs.setForeground(new java.awt.Color(89, 76, 71));
        inputs.setPreferredSize(new java.awt.Dimension(400, 200));

        email.setBackground(new java.awt.Color(82, 58, 53));
        email.setPreferredSize(new java.awt.Dimension(300, 80));

        jTextField1.setPreferredSize(new java.awt.Dimension(64, 22));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(242, 220, 194));
        labelEmail.setText("Email");

        javax.swing.GroupLayout emailLayout = new javax.swing.GroupLayout(email);
        email.setLayout(emailLayout);
        emailLayout.setHorizontalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(emailLayout.createSequentialGroup()
                .addComponent(labelEmail)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        emailLayout.setVerticalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        inputs.add(email);

        senha.setBackground(new java.awt.Color(82, 58, 53));
        senha.setPreferredSize(new java.awt.Dimension(300, 80));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(242, 220, 194));
        labelSenha.setText("Senha");

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout senhaLayout = new javax.swing.GroupLayout(senha);
        senha.setLayout(senhaLayout);
        senhaLayout.setHorizontalGroup(
            senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(senhaLayout.createSequentialGroup()
                .addComponent(labelSenha)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        senhaLayout.setVerticalGroup(
            senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, senhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        inputs.add(senha);

        forgot.setBackground(new java.awt.Color(82, 58, 53));
        forgot.setPreferredSize(new java.awt.Dimension(300, 20));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(242, 220, 194));
        jCheckBox2.setText("Remember me");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        labelForgot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelForgot.setForeground(new java.awt.Color(242, 220, 194));
        labelForgot.setText("Esqueci minha senha");
        labelForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout forgotLayout = new javax.swing.GroupLayout(forgot);
        forgot.setLayout(forgotLayout);
        forgotLayout.setHorizontalGroup(
            forgotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotLayout.createSequentialGroup()
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(labelForgot))
        );
        forgotLayout.setVerticalGroup(
            forgotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forgotLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(forgotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(labelForgot)))
        );

        inputs.add(forgot);

        formulario.add(inputs);

        buttons.setBackground(new java.awt.Color(82, 58, 53));
        buttons.setForeground(new java.awt.Color(89, 76, 71));
        buttons.setPreferredSize(new java.awt.Dimension(400, 200));

        cadastrarGoogle.setBackground(new java.awt.Color(82, 58, 53));
        cadastrarGoogle.setPreferredSize(new java.awt.Dimension(300, 50));

        jButton1.setBackground(new java.awt.Color(217, 94, 50));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 220, 194));
        jButton1.setText("Entrar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastrarGoogleLayout = new javax.swing.GroupLayout(cadastrarGoogle);
        cadastrarGoogle.setLayout(cadastrarGoogleLayout);
        cadastrarGoogleLayout.setHorizontalGroup(
            cadastrarGoogleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        cadastrarGoogleLayout.setVerticalGroup(
            cadastrarGoogleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarGoogleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buttons.add(cadastrarGoogle);

        cadastrar.setBackground(new java.awt.Color(82, 58, 53));
        cadastrar.setPreferredSize(new java.awt.Dimension(300, 50));

        jButton2.setBackground(new java.awt.Color(217, 94, 50));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 220, 194));
        jButton2.setText("Entrar com Google");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastrarLayout = new javax.swing.GroupLayout(cadastrar);
        cadastrar.setLayout(cadastrarLayout);
        cadastrarLayout.setHorizontalGroup(
            cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        cadastrarLayout.setVerticalGroup(
            cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        buttons.add(cadastrar);

        signin.setBackground(new java.awt.Color(82, 58, 53));
        signin.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 220, 194));
        jLabel5.setText("Ainda não possui uma conta?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 220, 194));
        jLabel6.setText("Cadastre-se");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin.add(jLabel6);

        buttons.add(signin);

        formulario.add(buttons);

        card.setBackground(new java.awt.Color(255, 255, 255));
        card.setPreferredSize(new java.awt.Dimension(1435, 559));
        card.setLayout(new java.awt.CardLayout());

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/restaurante.jpg"))); // NOI18N
        imagem.setText("img");
        card.add(imagem, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(formulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText() != null && !jTextField1.getText().isEmpty() &&
           jPasswordField2.getText() != null && !jPasswordField2.getText().isEmpty())
        {    
            JOptionPane.showMessageDialog(jButton1, "Informações válidas!");
        } else {
            JOptionPane.showMessageDialog(jButton1, "Verifique as informações", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel cadastrar;
    private javax.swing.JPanel cadastrarGoogle;
    private javax.swing.JPanel card;
    private javax.swing.JPanel email;
    private javax.swing.JPanel forgot;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel in;
    private javax.swing.JPanel inputs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelForgot;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel log;
    private javax.swing.JPanel senha;
    private javax.swing.JPanel signin;
    private javax.swing.JPanel titulo;
    // End of variables declaration//GEN-END:variables
}
