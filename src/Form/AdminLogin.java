/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import tourism.company.Tools;
import Classes.Admin;
import Classes.Internal;
import static Form.AdminCataloge.LBLName;
import java.awt.Color;

/**
 *
 * @author mohamed
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    Internal in = new Internal();
    public AdminLogin() {
        initComponents();
        Tools.setIcon("src/Photo/AdminLogin.png", LBLLogin, 140, 130);
        ShowPass.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBLLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TXTUser = new controls.JTextBox(170);
        jLabel3 = new javax.swing.JLabel();
        ShowPass = new javax.swing.JCheckBox();
        TXTPass = new controls.JPasswordBox(170);
        BTNLogin = new controls.JMybotton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        MenuBack = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel1.setLayout(null);
        jPanel1.add(LBLLogin);
        LBLLogin.setBounds(290, 30, 140, 130);

        jLabel1.setText("أسم المستخدم");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(186, 50, 90, 30);

        TXTUser.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(TXTUser);
        TXTUser.setBounds(10, 50, 170, 30);

        jLabel3.setText("كلمة المرور");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 90, 79, 30);

        ShowPass.setText("SP");
        ShowPass.setOpaque(false);
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel1.add(ShowPass);
        ShowPass.setBounds(10, 90, 50, 30);

        TXTPass.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXTPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPassActionPerformed(evt);
            }
        });
        jPanel1.add(TXTPass);
        TXTPass.setBounds(10, 90, 170, 30);

        BTNLogin.setText("تسجيل الدخول");
        BTNLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BTNLogin);
        BTNLogin.setBounds(80, 130, 140, 40);

        jLabel2.setText("واجهة المدير");

        jMenu3.setText("ملف");

        MenuBack.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        MenuBack.setText("رجوع");
        MenuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackActionPerformed(evt);
            }
        });
        jMenu3.add(MenuBack);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("تسجيل بيانات المستخدم");
        jMenu3.add(jMenuItem1);

        MenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuExit.setText("خروج");
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        jMenu3.add(MenuExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackActionPerformed
        Tools.openForm(new MainForm());
        this.dispose();
    }//GEN-LAST:event_MenuBackActionPerformed

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        Tools.ConfirmExit();
    }//GEN-LAST:event_MenuExitActionPerformed

    private void BTNLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLoginActionPerformed
        String UserName = TXTUser.getText().trim();
        String PassWord = TXTPass.getText().trim();
        
        if (TXTUser.getText().equals("") || TXTPass.getText().equals(""))
        {
            Tools.myMess("ارجو ادخال البيانات كاملة");
        }
        else
        {
            Admin a = new Admin();
            a.setUserName(UserName);
            a.setPassWord(PassWord);
            
            if (a.login())
            {
                Tools.openForm(new AdminCataloge());
                AdminCataloge.LBLName.setText(UserName);
                in.setEmp_name(UserName);
                this.dispose();
            }
            else
            {
                TXTPass.setText("");
                TXTPass.requestFocus();
                Tools.myMess("تأكد من ادخالك البيانات بطريقة صحيحة");
            }
        }
        
    }//GEN-LAST:event_BTNLoginActionPerformed

    private void TXTPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPassActionPerformed
        String UserName = TXTUser.getText().trim();
        String PassWord = TXTPass.getText().trim();
        
        if (TXTUser.getText().equals("") || TXTPass.getText().equals(""))
        {
            Tools.myMess("ارجو ادخال البيانات كاملة");
        }
        else
        {
            Admin a = new Admin();
            a.setUserName(UserName);
            a.setPassWord(PassWord);
            
            if (a.login())
            {
                Tools.openForm(new AdminCataloge());
                AdminCataloge.LBLName.setText(UserName);
                in.setEmp_name(UserName);
                this.dispose();
            }
            else
            {
                TXTPass.setText("");
                TXTPass.requestFocus();
                Tools.myMess("تأكد من ادخالك البيانات بطريقة صحيحة");
            }
        }
    }//GEN-LAST:event_TXTPassActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        if (ShowPass.isSelected())
        {
            TXTPass.setEchoChar((char)0);
        }
        else
        {
            TXTPass.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_ShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMybotton BTNLogin;
    private javax.swing.JLabel LBLLogin;
    private javax.swing.JMenuItem MenuBack;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JPasswordField TXTPass;
    private javax.swing.JTextField TXTUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}