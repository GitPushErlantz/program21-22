/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import static pkg.Model.terminoakInprimatu;

/**
 *
 * @author garate.erlantz
 */
public class View extends javax.swing.JFrame {

      /**
       * Creates new form View
       */
      public View() {
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelEus = new javax.swing.JLabel();
        jLabelEsp = new javax.swing.JLabel();
        jButtonTxertatu = new javax.swing.JButton();
        jTextFieldEus = new javax.swing.JTextField();
        jTextFieldEsp = new javax.swing.JTextField();
        jButtonAldatu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(109, 179, 238));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        jLabel1.setText("Hitz berria");

        jLabelEus.setText("Euskaraz: ");

        jLabelEsp.setText("Gazteleraz:");

        jButtonTxertatu.setText("Txertatu");
        jButtonTxertatu.setActionCommand("TXERTATU");
        jButtonTxertatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTxertatuActionPerformed(evt);
            }
        });

        jTextFieldEus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEusActionPerformed(evt);
            }
        });

        jTextFieldEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEspActionPerformed(evt);
            }
        });

        jButtonAldatu.setText("Aldatu");
        jButtonAldatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAldatuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEus)
                            .addComponent(jLabelEsp)
                            .addComponent(jButtonAldatu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jButtonTxertatu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldEus, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(jTextFieldEsp)))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEus)
                    .addComponent(jTextFieldEus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEsp)
                    .addComponent(jTextFieldEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTxertatu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAldatu))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void jTextFieldEusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEusActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextFieldEusActionPerformed

      private void jTextFieldEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEspActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextFieldEspActionPerformed

    private void jButtonTxertatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTxertatuActionPerformed
        terminoakInprimatu();
    }//GEN-LAST:event_jButtonTxertatuActionPerformed

    private void jButtonAldatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAldatuActionPerformed
        
    }//GEN-LAST:event_jButtonAldatuActionPerformed

      /**
       * @param args the command line arguments
       */
      /*public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form 
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new View().setVisible(true);
                  }
            });
      }*/
      public static View viewaSortuBistaratu(){
            View v = new View();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v.setVisible(true);
            }
        });
        return v;
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAldatu;
    javax.swing.JButton jButtonTxertatu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEsp;
    private javax.swing.JLabel jLabelEus;
    javax.swing.JTextField jTextFieldEsp;
    javax.swing.JTextField jTextFieldEus;
    // End of variables declaration//GEN-END:variables
}