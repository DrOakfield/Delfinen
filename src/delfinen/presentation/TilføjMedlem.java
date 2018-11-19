/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

import logic.AllMembers;
import logic.Member;

/**
 *
 * @author Mads Egevang Jensen
 */
public class TilføjMedlem extends javax.swing.JFrame {

    /**
     * Creates new form TilføjMedlem
     */
    Member a;
    AllMembers b;
    
    public TilføjMedlem(Member a, AllMembers b) {
        this.a = a;
        this.b = b;
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

        aktivPassivButtonGroup = new javax.swing.ButtonGroup();
        juniorSeniorbuttonGroup = new javax.swing.ButtonGroup();
        motionKSvømmerButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        navnTextField = new javax.swing.JTextField();
        alderTextField = new javax.swing.JTextField();
        aktivRadioButton = new javax.swing.JRadioButton();
        passivRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        juniorRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        seniorRadioButton = new javax.swing.JRadioButton();
        motionistRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        kSvømmerRadioButton = new javax.swing.JRadioButton();
        tilføjMedlemButton = new javax.swing.JButton();
        tilbageButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Label_Id = new javax.swing.JLabel();
        Txt_Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tilføj Medlem");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Tilføj Medlem:");

        navnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navnTextFieldActionPerformed(evt);
            }
        });

        alderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alderTextFieldActionPerformed(evt);
            }
        });

        aktivPassivButtonGroup.add(aktivRadioButton);
        aktivRadioButton.setText("Aktiv");
        aktivRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktivRadioButtonActionPerformed(evt);
            }
        });

        aktivPassivButtonGroup.add(passivRadioButton);
        passivRadioButton.setText("Passiv");

        jLabel2.setText("Eller");

        juniorSeniorbuttonGroup.add(juniorRadioButton);
        juniorRadioButton.setText("Juniorsvømmer");

        jLabel3.setText("Eller");

        juniorSeniorbuttonGroup.add(seniorRadioButton);
        seniorRadioButton.setText("Seniorsvømmer");

        motionKSvømmerButtonGroup.add(motionistRadioButton);
        motionistRadioButton.setText("Motionist");

        jLabel4.setText("Eller");

        motionKSvømmerButtonGroup.add(kSvømmerRadioButton);
        kSvømmerRadioButton.setText("Konkurrencesvømmer");

        tilføjMedlemButton.setText("Tilføj");
        tilføjMedlemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilføjMedlemButtonActionPerformed(evt);
            }
        });

        tilbageButton.setText("Tilbage");
        tilbageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilbageButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Fulde navn");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setText("Alder");

        Label_Id.setText("Id");

        Txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(navnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(alderTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(Txt_Id)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(tilbageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tilføjMedlemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(kSvømmerRadioButton))
                            .addComponent(jLabel4)
                            .addComponent(motionistRadioButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aktivRadioButton)
                            .addComponent(jLabel2)
                            .addComponent(passivRadioButton))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seniorRadioButton)
                            .addComponent(juniorRadioButton)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(104, 104, 104))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(navnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Id))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aktivRadioButton)
                    .addComponent(juniorRadioButton)
                    .addComponent(motionistRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passivRadioButton)
                    .addComponent(seniorRadioButton)
                    .addComponent(kSvømmerRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tilføjMedlemButton)
                    .addComponent(tilbageButton))
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, jLabel6});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tilføjMedlemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilføjMedlemButtonActionPerformed
        String name = navnTextField.getText();

        String getAge = alderTextField.getText();
        int age = Integer.parseInt(getAge);
        
        // convert text to int, to get id
        String getId = Txt_Id.getText();
        int Id = Integer.parseInt(getAge);

        AllMembers c = new AllMembers();
        Member member = c.createMember(name, age, Id);
        c.addMember(member);
        //System.out.println(member);
//            member.addMember(name, age);
    }//GEN-LAST:event_tilføjMedlemButtonActionPerformed

    private void aktivRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktivRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktivRadioButtonActionPerformed

    private void tilbageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilbageButtonActionPerformed
        // TODO add your handling code here:
        
        
        new FormandMenu(a, b).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tilbageButtonActionPerformed

    private void navnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navnTextFieldActionPerformed

    private void jLabel5AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5AncestorMoved

    private void Txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdActionPerformed

    private void alderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alderTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alderTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TilføjMedlem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Id;
    private javax.swing.JTextField Txt_Id;
    private javax.swing.ButtonGroup aktivPassivButtonGroup;
    private javax.swing.JRadioButton aktivRadioButton;
    private javax.swing.JTextField alderTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton juniorRadioButton;
    private javax.swing.ButtonGroup juniorSeniorbuttonGroup;
    private javax.swing.JRadioButton kSvømmerRadioButton;
    private javax.swing.ButtonGroup motionKSvømmerButtonGroup;
    private javax.swing.JRadioButton motionistRadioButton;
    private javax.swing.JTextField navnTextField;
    private javax.swing.JRadioButton passivRadioButton;
    private javax.swing.JRadioButton seniorRadioButton;
    private javax.swing.JButton tilbageButton;
    private javax.swing.JButton tilføjMedlemButton;
    // End of variables declaration//GEN-END:variables
}
