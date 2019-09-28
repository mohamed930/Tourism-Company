/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Classes.Accompanying;
import Classes.External;
import Classes.Flight;
import Classes.Internal;
import Classes.Umrah;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Phaser;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import tourism.company.Tools;

/**
 *
 * @author mohamed
 */
public class FlightStatement extends javax.swing.JFrame {

    /**
     * Creates new form FlightStatement
     */
    Flight f = new Flight();
    public FlightStatement() {
        initComponents();
        Tools.setIcon("src/Photo/TouristLogo.jpg", LBLImage, 700, 360);
        ComboOffer.addItem("");
        f.fillcombobox(ComboOffer);
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
        ComboOffer = new controls.JMyCompo();
        BTNPrint = new controls.JMybotton();
        BTNShow = new controls.JMybotton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFlight = new javax.swing.JTable();
        LBLImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        MenuReservation3 = new javax.swing.JMenu();
        MenuOffer3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuNote = new javax.swing.JMenuItem();
        MenuCalculator = new javax.swing.JMenuItem();
        MenuReservation4 = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(ComboOffer);
        ComboOffer.setBounds(380, 10, 210, 24);

        BTNPrint.setText("أطبع الكشف");
        BTNPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPrintActionPerformed(evt);
            }
        });
        jPanel1.add(BTNPrint);
        BTNPrint.setBounds(120, 10, 110, 25);

        BTNShow.setText("طلع الكشف");
        BTNShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNShowActionPerformed(evt);
            }
        });
        jPanel1.add(BTNShow);
        BTNShow.setBounds(250, 10, 104, 25);

        TableFlight.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TableFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم الزبون", "رقمه القومى", "رقم التليفون", "عدد المرافقين", "تم الدفع", "رقم الكرسى"
            }
        ));
        jScrollPane1.setViewportView(TableFlight);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 650, 300);

        LBLImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel1.add(LBLImage);
        LBLImage.setBounds(0, 0, 700, 370);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("أحضر كشوفات الرحلات الداخلية");

        MenuReservation3.setText("ملف");

        MenuOffer3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        MenuOffer3.setText("الأستعلامات");
        MenuOffer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOffer3ActionPerformed(evt);
            }
        });
        MenuReservation3.add(MenuOffer3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Seate.png"))); // NOI18N
        jMenuItem2.setText("الكراسى المتاحه والشاغره");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuReservation3.add(jMenuItem2);

        MenuNote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        MenuNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/note.png"))); // NOI18N
        MenuNote.setText("ملاحظات");
        MenuNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNoteActionPerformed(evt);
            }
        });
        MenuReservation3.add(MenuNote);

        MenuCalculator.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        MenuCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/calculator.png"))); // NOI18N
        MenuCalculator.setText("اله حاسبة");
        MenuCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCalculatorActionPerformed(evt);
            }
        });
        MenuReservation3.add(MenuCalculator);

        MenuReservation4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        MenuReservation4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/uplogo.png"))); // NOI18N
        MenuReservation4.setText("رجوغ");
        MenuReservation4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservation4ActionPerformed(evt);
            }
        });
        MenuReservation3.add(MenuReservation4);

        MenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/exit.png"))); // NOI18N
        MenuExit.setText("خروج");
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        MenuReservation3.add(MenuExit);

        jMenuBar4.add(MenuReservation3);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuOffer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOffer3ActionPerformed
        Tools.openForm(new Offers());
    }//GEN-LAST:event_MenuOffer3ActionPerformed

    private void MenuNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNoteActionPerformed
        Tools.openForm(new Note());
    }//GEN-LAST:event_MenuNoteActionPerformed

    private void MenuCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCalculatorActionPerformed
        Tools.openForm(new Calculator());
    }//GEN-LAST:event_MenuCalculatorActionPerformed

    private void MenuReservation4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReservation4ActionPerformed
        Tools.openForm(new EmployeeCataloge());
        this.dispose();
    }//GEN-LAST:event_MenuReservation4ActionPerformed

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        Tools.ConfirmExit();
    }//GEN-LAST:event_MenuExitActionPerformed

    private void BTNShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNShowActionPerformed
        f.settrip_Name(ComboOffer.getSelectedItem().toString());
        f.setOffer_code(f.getTripeCode());
        int x = f.getTripeCode();
        f.GetFlightStatement(TableFlight, 0, 0);
    }//GEN-LAST:event_BTNShowActionPerformed

    private void printinPdf (String Column)
    {
        try {
            String path = null;
            JFileChooser ch = new JFileChooser();
            ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int x = ch.showSaveDialog(this);
            
            if (x == JFileChooser.APPROVE_OPTION)
            {
                path = ch.getSelectedFile().toString();
            }
            
            
            Document dc = new Document();
            
            PdfWriter wr = PdfWriter.getInstance(dc, new FileOutputStream(path+".pdf"));
            dc.open();
            
            PdfPTable tb1 = new PdfPTable(2);
            tb1.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
           
            // Adding Header
            PdfPCell cell , cell2 , cell3 , cell4 , cell5 , cell6;
            cell = new PdfPCell(new Phrase("أسم الزبون",FONT1));
            tb1.addCell(cell);
            cell = new PdfPCell(new Phrase(Column,FONT1));
            tb1.addCell(cell);
            cell = new PdfPCell(new Phrase("رقم التليفون",FONT1));
            tb1.addCell(cell);
            cell = new PdfPCell(new Phrase("عدد المرافقين",FONT1));
            tb1.addCell(cell);
            cell = new PdfPCell(new Phrase("تم الدفع",FONT1));
            tb1.addCell(cell);
            cell = new PdfPCell(new Phrase("رقم الكرسى",FONT1));
            tb1.addCell(cell);
            
            for (int i=0 ; i < TableFlight.getRowCount() ; i++)
            {
                String Name = TableFlight.getValueAt(i, 0).toString();
                String SSN = TableFlight.getValueAt(i, 1).toString();
                String Tele = TableFlight.getValueAt(i, 2).toString();
                String Accomp = TableFlight.getValueAt(i, 3).toString();
                String Cash = TableFlight.getValueAt(i, 4).toString();
                String seateNumber = TableFlight.getValueAt(i, 5).toString();
                
                cell = new PdfPCell(new Phrase(Name,FONT1));
                cell2 = new PdfPCell(new Phrase(SSN,FONT1));
                cell3 = new PdfPCell(new Phrase(Tele,FONT1));
                cell4 = new PdfPCell(new Phrase(Accomp,FONT1));
                cell5 = new PdfPCell(new Phrase(Cash,FONT1));
                cell6 = new PdfPCell(new Phrase(seateNumber,FONT1));
                tb1.addCell(cell);
                tb1.addCell(cell2);
                tb1.addCell(cell3);
                tb1.addCell(cell4);
                tb1.addCell(cell5);
                tb1.addCell(cell6);
            }
            
            dc.add(tb1);
            dc.close();
            
           
//            try {
//                 File object = new File(path+Title+".pdf");
//                Desktop.getDesktop().open(object);
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Internal in = new Internal();
    Umrah u = new Umrah();
    External ex = new External();
//    Accompanying ac = new Accompanying();
    private static final com.itextpdf.text.Font FONT =  FontFactory.getFont("/home/mohamed/NetBeansProjects/Tourism Company/NotoNaskhArabic-Regular.ttf",BaseFont.IDENTITY_H,14);
    private static final com.itextpdf.text.Font FONT1 =  FontFactory.getFont("C:\\Users\\Mohamed Ali\\Documents\\Tourism Company\\NotoNaskhArabic-Regular.ttf",BaseFont.IDENTITY_H,14);
    private void BTNPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPrintActionPerformed
        f.settrip_Name(ComboOffer.getSelectedItem().toString());
        //f.setOffer_code(f.getTripeCode());
        int x = f.getTripeCode();
        in.setOffer_code(x);
        u.setOffer_code(x);
        ex.setOffer_code(x);
        if (String.valueOf(x).startsWith("100"))
        {
            if (in.count() == 48)
            {
                printinPdf("الرقم القومى");
            }
            else
                Tools.myMess("لايمكن طباعه الكشف الا عندما تكتمل الرحلة");
        }
        else if (String.valueOf(x).startsWith("200"))
        {
            if (u.count() == 48)
            {
                printinPdf("رقم الباسبور");
            }
            else
                Tools.myMess("لايمكن طباعه الكشف الا عندما تكتمل الرحلة");
        }
        else if (String.valueOf(x).startsWith("300"))
        {
            if (ex.count() == 48)
            {
                printinPdf("رقم الباسبور");
            }
            else
                Tools.myMess("لايمكن طباعه الكشف الا عندما تكتمل الرحلة");
        }
    }//GEN-LAST:event_BTNPrintActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Tools.openForm(new SeateNumber());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FlightStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightStatement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMybotton BTNPrint;
    private controls.JMybotton BTNShow;
    private controls.JMyCompo ComboOffer;
    private javax.swing.JLabel LBLImage;
    private javax.swing.JMenuItem MenuCalculator;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenuItem MenuNote;
    private javax.swing.JMenuItem MenuOffer3;
    private javax.swing.JMenu MenuReservation3;
    private javax.swing.JMenuItem MenuReservation4;
    private javax.swing.JTable TableFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
