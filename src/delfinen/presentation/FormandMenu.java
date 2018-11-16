/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

import logic.AllMembers;
import logic.Member;
import logic.Members;

/**
 *
 * @author Mads Egevang Jensen
 */
public class FormandMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormandMenu
     */
    Member a;
    AllMembers b;
    
    public FormandMenu(Member a, AllMembers b) {
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

        jLabel1 = new javax.swing.JLabel();
        tilføjMedlemButton = new javax.swing.JButton();
        sletMedlemButton = new javax.swing.JButton();
        visMedlemslisteButton = new javax.swing.JButton();
        tilbageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formands Menu");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Vælg hvordan du ønsker at administrere:");

        tilføjMedlemButton.setText("Tilføj Medlem");
        tilføjMedlemButton.setMaximumSize(new java.awt.Dimension(127, 32));
        tilføjMedlemButton.setMinimumSize(new java.awt.Dimension(127, 32));
        tilføjMedlemButton.setPreferredSize(new java.awt.Dimension(127, 32));
        tilføjMedlemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilføjMedlemButtonActionPerformed(evt);
            }
        });

        sletMedlemButton.setText("Slet Medlem");
        sletMedlemButton.setMaximumSize(new java.awt.Dimension(127, 32));
        sletMedlemButton.setMinimumSize(new java.awt.Dimension(127, 32));
        sletMedlemButton.setPreferredSize(new java.awt.Dimension(127, 32));
        sletMedlemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sletMedlemButtonActionPerformed(evt);
            }
        });

        visMedlemslisteButton.setText("Vis Medlemsliste");
        visMedlemslisteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visMedlemslisteButtonActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sletMedlemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tilføjMedlemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visMedlemslisteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tilbageButton)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(tilføjMedlemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sletMedlemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(visMedlemslisteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(tilbageButton)
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tilføjMedlemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilføjMedlemButtonActionPerformed
        // TODO add your handling code here:
        
        new TilføjMedlem(a, b).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_tilføjMedlemButtonActionPerformed

    private void sletMedlemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sletMedlemButtonActionPerformed
        // TODO add your handling code here:
        
        new SletMedlem(a, b).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sletMedlemButtonActionPerformed

    private void visMedlemslisteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visMedlemslisteButtonActionPerformed
        // TODO add your handling code here:
        
        new Medlemsliste(a, b).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_visMedlemslisteButtonActionPerformed

    private void tilbageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilbageButtonActionPerformed
        // TODO add your handling code here:
        
        new MainMenu(a, b).setVisible(true);
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
            java.util.logging.Logger.getLogger(FormandMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormandMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormandMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormandMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new FormandMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sletMedlemButton;
    private javax.swing.JButton tilbageButton;
    private javax.swing.JButton tilføjMedlemButton;
    private javax.swing.JButton visMedlemslisteButton;
    // End of variables declaration//GEN-END:variables
}
