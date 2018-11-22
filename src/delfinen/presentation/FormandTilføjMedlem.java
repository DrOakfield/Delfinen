/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

import javax.swing.JOptionPane;
import logic.AllMembers;
import logic.Member;

/**
 *
 * @author Mads Egevang Jensen
 */
public class FormandTilføjMedlem extends javax.swing.JFrame {

    /**
     * Creates new form TilføjMedlem
     */
    Member mem;
    AllMembers aMem;
    
    public FormandTilføjMedlem(Member a, AllMembers b) {
        this.mem = a;
        this.aMem = b;
        initComponents();
    }
    
    public void reset() {
        buttonGroup1.clearSelection();
        buttonGroup3.clearSelection();
        navnTextField.setText(null);
        alderTextField.setText(null);
        Txt_Id.setText(null);

        aktivRadioButton.setSelected(false);
        passivRadioButton.setSelected(false);
        motionistRadioButton.setSelected(false);
        kSvømmerRadioButton.setSelected(false);
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        navnTextField = new javax.swing.JTextField();
        alderTextField = new javax.swing.JTextField();
        aktivRadioButton = new javax.swing.JRadioButton();
        passivRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
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

        buttonGroup1.add(aktivRadioButton);
        aktivRadioButton.setText("Aktiv");
        aktivRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktivRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(passivRadioButton);
        passivRadioButton.setText("Passiv");

        jLabel2.setText("Eller");

        buttonGroup3.add(motionistRadioButton);
        motionistRadioButton.setText("Motionist");

        jLabel4.setText("Eller");

        buttonGroup3.add(kSvømmerRadioButton);
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(navnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(alderTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(Txt_Id)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tilbageButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tilføjMedlemButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(motionistRadioButton)
                                    .addComponent(aktivRadioButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passivRadioButton)
                            .addComponent(kSvømmerRadioButton))))
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aktivRadioButton)
                    .addComponent(jLabel2)
                    .addComponent(passivRadioButton))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kSvømmerRadioButton)
                    .addComponent(jLabel4)
                    .addComponent(motionistRadioButton))
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
        try {
            boolean aktiv = false;
            String aktivTekst = "Nej";
            String jES = "Junior";
            String konSvøm = "";
            
            String name = navnTextField.getText();

            String getAge = alderTextField.getText();
            int age = Integer.parseInt(getAge);

            // convert text to int, to get id
            String getId = Txt_Id.getText();
            int Id = Integer.parseInt(getId);

            if (aktivRadioButton.isSelected()) {
                aktiv = true;
                aktivTekst = "Ja";
                
            }
            if (age > 17) {
                jES = "Senior";
            }
            if (kSvømmerRadioButton.isSelected()) {
                konSvøm = "Ja";
            }
            if (motionistRadioButton.isSelected()) {
                konSvøm = "Nej";
            }
             String text = navnTextField.getText();
            if (text.matches(".*\\d+.*" )) {
                reset();
                JOptionPane.showMessageDialog(null, "Du kan ikke skrive tal i navnefeltet");
            } else {
                AllMembers c = new AllMembers();
                Member member = c.createMember(name, age, Id, aktivTekst, jES, konSvøm);
                c.addMember(member);
                reset();
                JOptionPane.showMessageDialog(null, "Medlem er nu tilføjet!");
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Alder/ID kan kun indeholde tal");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Alder/ID kan kun indeholde positive tal");
        }

    }//GEN-LAST:event_tilføjMedlemButtonActionPerformed

    private void aktivRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktivRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktivRadioButtonActionPerformed

    private void tilbageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilbageButtonActionPerformed
        // TODO add your handling code here:
        
        
        new FormandMenu(mem, aMem).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tilbageButtonActionPerformed

    private void navnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navnTextFieldActionPerformed

 
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
            java.util.logging.Logger.getLogger(FormandTilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormandTilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormandTilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormandTilføjMedlem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.ButtonGroup juniorSeniorbuttonGroup;
    private javax.swing.JRadioButton kSvømmerRadioButton;
    private javax.swing.ButtonGroup motionKSvømmerButtonGroup;
    private javax.swing.JRadioButton motionistRadioButton;
    private javax.swing.JTextField navnTextField;
    private javax.swing.JRadioButton passivRadioButton;
    private javax.swing.JButton tilbageButton;
    private javax.swing.JButton tilføjMedlemButton;
    // End of variables declaration//GEN-END:variables
}
