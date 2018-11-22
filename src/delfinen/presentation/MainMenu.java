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
public class MainMenu extends javax.swing.JFrame {

    

    /**
     * Creates new form MainMenu
     */
    Member a;
    AllMembers b;
    
    public MainMenu(Member a, AllMembers b) {
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
        formandButton = new javax.swing.JButton();
        kassererButton = new javax.swing.JButton();
        trænerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hovedmenu");
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Vælg venligst, hvem du er:");

        formandButton.setText("Formand");
        formandButton.setMaximumSize(new java.awt.Dimension(83, 32));
        formandButton.setMinimumSize(new java.awt.Dimension(83, 32));
        formandButton.setPreferredSize(new java.awt.Dimension(83, 32));
        formandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formandButtonActionPerformed(evt);
            }
        });

        kassererButton.setText("Kasserer");
        kassererButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kassererButtonActionPerformed(evt);
            }
        });

        trænerButton.setText("Træner");
        trænerButton.setMaximumSize(new java.awt.Dimension(83, 32));
        trænerButton.setMinimumSize(new java.awt.Dimension(83, 32));
        trænerButton.setPreferredSize(new java.awt.Dimension(83, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kassererButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(trænerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(formandButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(kassererButton)
                .addGap(47, 47, 47)
                .addComponent(trænerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(394, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formandButtonActionPerformed
        // TODO add your handling code here:
        

        new FormandMenu(a, b).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formandButtonActionPerformed

    private void kassererButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kassererButtonActionPerformed
        new KassererMenu(a, b).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kassererButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new MainMenu(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton formandButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kassererButton;
    private javax.swing.JButton trænerButton;
    // End of variables declaration//GEN-END:variables
}
