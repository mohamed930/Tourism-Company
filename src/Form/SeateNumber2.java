/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Classes.Seate;
import javax.swing.JButton;
import tourism.company.Tools;

/**
 *
 * @author Ali
 */

public class SeateNumber2 extends javax.swing.JFrame {

    /**
     * Creates new form GUI3
     */
    Seate S = new Seate();
    public SeateNumber2() {
        initComponents();
        Tools.setIcon("src/Photo/Seats.png", LBLImage, 580, 240);
        ComboOffer.addItem("");
        S.fillcombobox2(ComboOffer);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        BTN10 = new javax.swing.JButton();
        BTN11 = new javax.swing.JButton();
        BTN12 = new javax.swing.JButton();
        BTN13 = new javax.swing.JButton();
        BTN14 = new javax.swing.JButton();
        BTN15 = new javax.swing.JButton();
        BTN16 = new javax.swing.JButton();
        BTN17 = new javax.swing.JButton();
        BTN18 = new javax.swing.JButton();
        BTN19 = new javax.swing.JButton();
        BTN20 = new javax.swing.JButton();
        BTN21 = new javax.swing.JButton();
        BTN22 = new javax.swing.JButton();
        BTN23 = new javax.swing.JButton();
        BTN24 = new javax.swing.JButton();
        BTN25 = new javax.swing.JButton();
        BTN26 = new javax.swing.JButton();
        BTN27 = new javax.swing.JButton();
        BTN28 = new javax.swing.JButton();
        BTN29 = new javax.swing.JButton();
        BTN30 = new javax.swing.JButton();
        BTN31 = new javax.swing.JButton();
        BTN32 = new javax.swing.JButton();
        BTN33 = new javax.swing.JButton();
        BTN34 = new javax.swing.JButton();
        BTN35 = new javax.swing.JButton();
        BTN36 = new javax.swing.JButton();
        BTN37 = new javax.swing.JButton();
        BTN38 = new javax.swing.JButton();
        BTN39 = new javax.swing.JButton();
        BTN40 = new javax.swing.JButton();
        BTN41 = new javax.swing.JButton();
        BTN42 = new javax.swing.JButton();
        BTN43 = new javax.swing.JButton();
        BTN44 = new javax.swing.JButton();
        BTN45 = new javax.swing.JButton();
        BTN46 = new javax.swing.JButton();
        BTN47 = new javax.swing.JButton();
        LBLImage = new javax.swing.JLabel();
        ComboOffer = new controls.JMyCompo();
        BTNSeate = new controls.JMybotton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("اختار الكرسى الذى تفضله");

        jPanel1.setLayout(null);

        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN1);
        BTN1.setBounds(50, 200, 20, 20);

        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN2);
        BTN2.setBounds(50, 150, 20, 20);

        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN3);
        BTN3.setBounds(50, 60, 20, 20);

        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN4);
        BTN4.setBounds(50, 20, 20, 20);

        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN5);
        BTN5.setBounds(100, 200, 20, 20);

        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN6);
        BTN6.setBounds(100, 150, 20, 20);

        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN7);
        BTN7.setBounds(100, 60, 20, 20);

        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN8);
        BTN8.setBounds(100, 20, 20, 20);

        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN9);
        BTN9.setBounds(150, 200, 20, 20);

        BTN10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN10ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN10);
        BTN10.setBounds(150, 150, 20, 20);

        BTN11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN11ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN11);
        BTN11.setBounds(150, 60, 20, 20);

        BTN12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN12ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN12);
        BTN12.setBounds(150, 20, 20, 20);

        BTN13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN13ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN13);
        BTN13.setBounds(190, 200, 20, 20);

        BTN14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN14ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN14);
        BTN14.setBounds(190, 150, 20, 20);

        BTN15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN15ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN15);
        BTN15.setBounds(190, 60, 20, 20);

        BTN16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN16ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN16);
        BTN16.setBounds(190, 20, 20, 20);

        BTN17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN17ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN17);
        BTN17.setBounds(230, 200, 20, 20);

        BTN18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN18ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN18);
        BTN18.setBounds(230, 150, 20, 20);

        BTN19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN19ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN19);
        BTN19.setBounds(230, 60, 20, 20);

        BTN20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN20ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN20);
        BTN20.setBounds(230, 20, 20, 20);

        BTN21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN21ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN21);
        BTN21.setBounds(280, 200, 20, 20);

        BTN22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN22ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN22);
        BTN22.setBounds(280, 150, 20, 20);

        BTN23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN23ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN23);
        BTN23.setBounds(280, 60, 20, 20);

        BTN24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN24ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN24);
        BTN24.setBounds(280, 20, 20, 20);

        BTN25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN25ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN25);
        BTN25.setBounds(320, 200, 20, 20);

        BTN26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN26ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN26);
        BTN26.setBounds(320, 150, 20, 20);

        BTN27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN27ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN27);
        BTN27.setBounds(370, 200, 20, 20);

        BTN28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN28ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN28);
        BTN28.setBounds(370, 150, 20, 20);

        BTN29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN29ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN29);
        BTN29.setBounds(370, 70, 20, 20);

        BTN30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN30ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN30);
        BTN30.setBounds(370, 20, 20, 20);

        BTN31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN31ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN31);
        BTN31.setBounds(410, 200, 20, 20);

        BTN32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN32ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN32);
        BTN32.setBounds(410, 150, 20, 20);

        BTN33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN33ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN33);
        BTN33.setBounds(410, 70, 20, 20);

        BTN34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN34ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN34);
        BTN34.setBounds(410, 20, 20, 20);

        BTN35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN35ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN35);
        BTN35.setBounds(450, 200, 20, 20);

        BTN36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN36ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN36);
        BTN36.setBounds(450, 150, 20, 20);

        BTN37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN37ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN37);
        BTN37.setBounds(450, 70, 20, 20);

        BTN38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN38ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN38);
        BTN38.setBounds(450, 20, 20, 20);

        BTN39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN39ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN39);
        BTN39.setBounds(500, 200, 20, 20);

        BTN40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN40ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN40);
        BTN40.setBounds(500, 150, 20, 20);

        BTN41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN41ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN41);
        BTN41.setBounds(500, 70, 20, 20);

        BTN42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN42ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN42);
        BTN42.setBounds(500, 20, 20, 20);

        BTN43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN43ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN43);
        BTN43.setBounds(540, 200, 20, 20);

        BTN44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN44ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN44);
        BTN44.setBounds(540, 150, 20, 20);

        BTN45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN45ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN45);
        BTN45.setBounds(540, 110, 20, 20);

        BTN46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN46ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN46);
        BTN46.setBounds(540, 70, 20, 20);

        BTN47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN47ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN47);
        BTN47.setBounds(540, 20, 20, 20);
        jPanel1.add(LBLImage);
        LBLImage.setBounds(0, 0, 580, 240);

        BTNSeate.setText("اعرض الكراسى المتاحه فى الرحلة");
        BTNSeate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSeateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(BTNSeate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ComboOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNSeate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendNumber (JButton BTN , int sent)
    {
        if (S.isAvailableUmrah(BTN, sent) == false)
        {
            Tools.myMess("لا تستطيع حجز الكرسى");
        }
        else
        {
            try{
                UmrahSektion.TXTChair.setText(String.valueOf(sent));
                AccompanyingPage.TXTChair1.setText(String.valueOf(sent));
            } catch (Exception ex)
            {
                
            }
            try {
                UmrahUpdate.TXTChair.setText(String.valueOf(sent));
            } catch (Exception ex)
            {
                
            }
            
        }
        
    }
            
    private void BTNSeateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSeateActionPerformed
        S.settrip_Name(ComboOffer.getSelectedItem().toString());
        S.setOffer_code(S.getTripeCode());
        
        S.isAvailable(BTN1, 1);
        S.isAvailable(BTN2, 2);
        S.isAvailable(BTN3, 3);
        S.isAvailable(BTN4, 4);
        S.isAvailable(BTN5, 5);
        S.isAvailable(BTN6, 6);
        S.isAvailable(BTN7, 7);
        S.isAvailable(BTN8, 8);
        S.isAvailable(BTN9, 9);
        S.isAvailable(BTN10, 10);
        S.isAvailable(BTN11, 11);
        S.isAvailable(BTN12, 12);
        S.isAvailable(BTN13, 13);
        S.isAvailable(BTN14, 14);
        S.isAvailable(BTN15, 15);
        S.isAvailable(BTN16, 16);
        S.isAvailable(BTN17, 17);
        S.isAvailable(BTN18, 18);
        S.isAvailable(BTN19, 19);
        S.isAvailable(BTN20, 20);
        S.isAvailable(BTN21, 21);
        S.isAvailable(BTN22, 22);
        S.isAvailable(BTN23, 23);
        S.isAvailable(BTN24, 24);
        S.isAvailable(BTN25, 25);
        S.isAvailable(BTN26, 26);
        S.isAvailable(BTN27, 27);
        S.isAvailable(BTN28, 28);
        S.isAvailable(BTN29, 29);
        S.isAvailable(BTN30, 30);
        S.isAvailable(BTN31, 31);
        S.isAvailable(BTN32, 32);
        S.isAvailable(BTN33, 33);
        S.isAvailable(BTN34, 34);
        S.isAvailable(BTN35, 35);
        S.isAvailable(BTN36, 36);
        S.isAvailable(BTN37, 37);
        S.isAvailable(BTN38, 38);
        S.isAvailable(BTN39, 39);
        S.isAvailable(BTN40, 40);
        S.isAvailable(BTN41, 41);
        S.isAvailable(BTN42, 42);
        S.isAvailable(BTN43, 43);
        S.isAvailable(BTN44, 44);
        S.isAvailable(BTN45, 45);
        S.isAvailable(BTN46, 46);
        S.isAvailable(BTN47, 47);
    }//GEN-LAST:event_BTNSeateActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        sendNumber(BTN1, 1);
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        sendNumber(BTN2, 2);
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        sendNumber(BTN3, 3);
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        sendNumber(BTN4, 4);
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        sendNumber(BTN5, 5);
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        sendNumber(BTN8, 8);
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        sendNumber(BTN7, 7);
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        sendNumber(BTN6, 6);
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        sendNumber(BTN9, 9);
    }//GEN-LAST:event_BTN9ActionPerformed

    private void BTN10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN10ActionPerformed
        sendNumber(BTN10, 10);
    }//GEN-LAST:event_BTN10ActionPerformed

    private void BTN11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN11ActionPerformed
        sendNumber(BTN11, 11);
    }//GEN-LAST:event_BTN11ActionPerformed

    private void BTN12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN12ActionPerformed
        sendNumber(BTN12, 12);
    }//GEN-LAST:event_BTN12ActionPerformed

    private void BTN13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN13ActionPerformed
        sendNumber(BTN13, 13);
    }//GEN-LAST:event_BTN13ActionPerformed

    private void BTN14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN14ActionPerformed
        sendNumber(BTN14, 14);
    }//GEN-LAST:event_BTN14ActionPerformed

    private void BTN15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN15ActionPerformed
        sendNumber(BTN15, 15);
    }//GEN-LAST:event_BTN15ActionPerformed

    private void BTN16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN16ActionPerformed
        sendNumber(BTN16, 16);
    }//GEN-LAST:event_BTN16ActionPerformed

    private void BTN17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN17ActionPerformed
       sendNumber(BTN17, 17);
    }//GEN-LAST:event_BTN17ActionPerformed

    private void BTN18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN18ActionPerformed
        sendNumber(BTN18, 18);
    }//GEN-LAST:event_BTN18ActionPerformed

    private void BTN19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN19ActionPerformed
        sendNumber(BTN19, 19);
    }//GEN-LAST:event_BTN19ActionPerformed

    private void BTN20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN20ActionPerformed
        sendNumber(BTN20, 20);
    }//GEN-LAST:event_BTN20ActionPerformed

    private void BTN21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN21ActionPerformed
        sendNumber(BTN21, 21);
    }//GEN-LAST:event_BTN21ActionPerformed

    private void BTN22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN22ActionPerformed
        sendNumber(BTN22, 22);
    }//GEN-LAST:event_BTN22ActionPerformed

    private void BTN23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN23ActionPerformed
        sendNumber(BTN23, 23);
    }//GEN-LAST:event_BTN23ActionPerformed

    private void BTN24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN24ActionPerformed
        sendNumber(BTN24, 24);
    }//GEN-LAST:event_BTN24ActionPerformed

    private void BTN25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN25ActionPerformed
        sendNumber(BTN25, 25);
    }//GEN-LAST:event_BTN25ActionPerformed

    private void BTN26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN26ActionPerformed
        sendNumber(BTN26, 26);
    }//GEN-LAST:event_BTN26ActionPerformed

    private void BTN27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN27ActionPerformed
        sendNumber(BTN27, 27);
    }//GEN-LAST:event_BTN27ActionPerformed

    private void BTN28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN28ActionPerformed
        sendNumber(BTN28, 28);
    }//GEN-LAST:event_BTN28ActionPerformed

    private void BTN29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN29ActionPerformed
        sendNumber(BTN29, 29);
    }//GEN-LAST:event_BTN29ActionPerformed

    private void BTN30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN30ActionPerformed
        sendNumber(BTN30, 30);
    }//GEN-LAST:event_BTN30ActionPerformed

    private void BTN31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN31ActionPerformed
        sendNumber(BTN31, 31);
    }//GEN-LAST:event_BTN31ActionPerformed

    private void BTN32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN32ActionPerformed
        sendNumber(BTN32, 32);
    }//GEN-LAST:event_BTN32ActionPerformed

    private void BTN33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN33ActionPerformed
        sendNumber(BTN33, 33);
    }//GEN-LAST:event_BTN33ActionPerformed

    private void BTN34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN34ActionPerformed
        sendNumber(BTN34, 34);
    }//GEN-LAST:event_BTN34ActionPerformed

    private void BTN35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN35ActionPerformed
        sendNumber(BTN35, 35);
    }//GEN-LAST:event_BTN35ActionPerformed

    private void BTN36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN36ActionPerformed
        sendNumber(BTN36, 36);
    }//GEN-LAST:event_BTN36ActionPerformed

    private void BTN37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN37ActionPerformed
        sendNumber(BTN37, 37);
    }//GEN-LAST:event_BTN37ActionPerformed

    private void BTN38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN38ActionPerformed
        sendNumber(BTN38, 38);
    }//GEN-LAST:event_BTN38ActionPerformed

    private void BTN39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN39ActionPerformed
        sendNumber(BTN39, 39);
    }//GEN-LAST:event_BTN39ActionPerformed

    private void BTN40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN40ActionPerformed
        sendNumber(BTN40, 40);
    }//GEN-LAST:event_BTN40ActionPerformed

    private void BTN41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN41ActionPerformed
        sendNumber(BTN41, 41);
    }//GEN-LAST:event_BTN41ActionPerformed

    private void BTN42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN42ActionPerformed
        sendNumber(BTN42, 42);
    }//GEN-LAST:event_BTN42ActionPerformed

    private void BTN43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN43ActionPerformed
        sendNumber(BTN43, 43);
    }//GEN-LAST:event_BTN43ActionPerformed

    private void BTN44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN44ActionPerformed
        sendNumber(BTN44, 44);
    }//GEN-LAST:event_BTN44ActionPerformed

    private void BTN45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN45ActionPerformed
        sendNumber(BTN45, 45);
    }//GEN-LAST:event_BTN45ActionPerformed

    private void BTN46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN46ActionPerformed
        sendNumber(BTN46, 46);
    }//GEN-LAST:event_BTN46ActionPerformed

    private void BTN47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN47ActionPerformed
        sendNumber(BTN47, 47);
    }//GEN-LAST:event_BTN47ActionPerformed

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
            java.util.logging.Logger.getLogger(SeateNumber2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeateNumber2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeateNumber2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeateNumber2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SeateNumber2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN10;
    private javax.swing.JButton BTN11;
    private javax.swing.JButton BTN12;
    private javax.swing.JButton BTN13;
    private javax.swing.JButton BTN14;
    private javax.swing.JButton BTN15;
    private javax.swing.JButton BTN16;
    private javax.swing.JButton BTN17;
    private javax.swing.JButton BTN18;
    private javax.swing.JButton BTN19;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN20;
    private javax.swing.JButton BTN21;
    private javax.swing.JButton BTN22;
    private javax.swing.JButton BTN23;
    private javax.swing.JButton BTN24;
    private javax.swing.JButton BTN25;
    private javax.swing.JButton BTN26;
    private javax.swing.JButton BTN27;
    private javax.swing.JButton BTN28;
    private javax.swing.JButton BTN29;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN30;
    private javax.swing.JButton BTN31;
    private javax.swing.JButton BTN32;
    private javax.swing.JButton BTN33;
    private javax.swing.JButton BTN34;
    private javax.swing.JButton BTN35;
    private javax.swing.JButton BTN36;
    private javax.swing.JButton BTN37;
    private javax.swing.JButton BTN38;
    private javax.swing.JButton BTN39;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN40;
    private javax.swing.JButton BTN41;
    private javax.swing.JButton BTN42;
    private javax.swing.JButton BTN43;
    private javax.swing.JButton BTN44;
    private javax.swing.JButton BTN45;
    private javax.swing.JButton BTN46;
    private javax.swing.JButton BTN47;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private controls.JMybotton BTNSeate;
    private controls.JMyCompo ComboOffer;
    private javax.swing.JLabel LBLImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}