/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

/**
 *
 * @author Mads Egevang Jensen
 */
public class TilføjMedlem extends javax.swing.JFrame {

    /**
     * Creates new form TilføjMedlem
     */
    public TilføjMedlem() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Tilføj Medlem:");

        jTextField1.setText("Fulde Navn");

        jTextField2.setText("Alder i år");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tilbageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tilføjMedlemButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aktivRadioButton)
                            .addComponent(jLabel2)
                            .addComponent(passivRadioButton))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seniorRadioButton)
                            .addComponent(juniorRadioButton)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(kSvømmerRadioButton))
                    .addComponent(jLabel4)
                    .addComponent(motionistRadioButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tilføjMedlemButton)
                    .addComponent(tilbageButton))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tilføjMedlemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilføjMedlemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tilføjMedlemButtonActionPerformed

    private void aktivRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktivRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktivRadioButtonActionPerformed

    private void tilbageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilbageButtonActionPerformed
        // TODO add your handling code here:
        FormandMenu fm = new FormandMenu();
        
        fm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tilbageButtonActionPerformed

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
                new TilføjMedlem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup aktivPassivButtonGroup;
    private javax.swing.JRadioButton aktivRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton juniorRadioButton;
    private javax.swing.ButtonGroup juniorSeniorbuttonGroup;
    private javax.swing.JRadioButton kSvømmerRadioButton;
    private javax.swing.ButtonGroup motionKSvømmerButtonGroup;
    private javax.swing.JRadioButton motionistRadioButton;
    private javax.swing.JRadioButton passivRadioButton;
    private javax.swing.JRadioButton seniorRadioButton;
    private javax.swing.JButton tilbageButton;
    private javax.swing.JButton tilføjMedlemButton;
    // End of variables declaration//GEN-END:variables
}
