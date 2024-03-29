/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Classes.External;
import Classes.Umrah;
import tourism.company.Tools;

/**
 *
 * @author mohamed
 */
public class SeateAvailbaleExternal extends javax.swing.JFrame {

    /**
     * Creates new form SeateAvailbale
     */
    External ex = new External();
    public SeateAvailbaleExternal() {
        initComponents();
        Tools.setIcon("src/Photo/TouristLogo.jpg", LBLImage, 450, 160);
        ComboOffer.addItem("");
        ex.fillComboBox(ComboOffer);
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
        jLabel1 = new javax.swing.JLabel();
        ComboOffer = new controls.JMyCompo();
        BTNShow = new controls.JMybotton();
        jLabel2 = new javax.swing.JLabel();
        LBLSeate = new javax.swing.JLabel();
        LBLImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("أدخل اسم الرحلة التى تريد معرفة عدد الكراسى المتاحه بها");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 20, 350, 15);
        jPanel1.add(ComboOffer);
        ComboOffer.setBounds(180, 50, 200, 24);

        BTNShow.setText("اعرض الكراسى");
        BTNShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNShowActionPerformed(evt);
            }
        });
        jPanel1.add(BTNShow);
        BTNShow.setBounds(24, 50, 140, 25);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("عدد الكراسى المتاحه");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 100, 130, 20);

        LBLSeate.setBackground(new java.awt.Color(255, 255, 255));
        LBLSeate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LBLSeate.setForeground(new java.awt.Color(0, 0, 0));
        LBLSeate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLSeate.setText("0");
        LBLSeate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(LBLSeate);
        LBLSeate.setBounds(120, 90, 80, 50);
        jPanel1.add(LBLImage);
        LBLImage.setBounds(0, 0, 450, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNShowActionPerformed
        int x = ex.getTripeCode(ComboOffer);
        ex.setOffer_code(x);
        LBLSeate.setText(String.valueOf(48-ex.count()));
    }//GEN-LAST:event_BTNShowActionPerformed

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
            java.util.logging.Logger.getLogger(SeateAvailbaleExternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeateAvailbaleExternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeateAvailbaleExternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeateAvailbaleExternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeateAvailbaleExternal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMybotton BTNShow;
    private controls.JMyCompo ComboOffer;
    private javax.swing.JLabel LBLImage;
    private javax.swing.JLabel LBLSeate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
