/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logregis;

/**
 *
 * @author lenovo
 */
public class tambahInfo extends javax.swing.JFrame {

    /**
     * Creates new form tambahInfo
     */
    public tambahInfo() {
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

        LabelInfo = new javax.swing.JLabel();
        addMenu = new javax.swing.JButton();
        AddInfo = new javax.swing.JButton();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelInfo.setText("Tambah Informasi");

        addMenu.setText("Tambah Menu Restoran");
        addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuActionPerformed(evt);
            }
        });

        AddInfo.setText("Tambah Informasi Restoran");
        AddInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInfoActionPerformed(evt);
            }
        });

        kembali.setText("Back");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelInfo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(113, 113, 113))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(kembali)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelInfo)
                .addGap(54, 54, 54)
                .addComponent(AddInfo)
                .addGap(46, 46, 46)
                .addComponent(addMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(kembali)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        homepage hp = new homepage();
        hp.setVisible(true);
        hp.pack();
        hp.setLocationRelativeTo(null);
        hp.setDefaultCloseOperation(regis.EXIT_ON_CLOSE);
    }//GEN-LAST:event_kembaliActionPerformed

    private void AddInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInfoActionPerformed
        // TODO add your handling code here:
        restoinfo r_info = new restoinfo();
        r_info.setVisible(true);
        r_info.pack();
        r_info.setLocationRelativeTo(null);
        r_info.setDefaultCloseOperation(regis.EXIT_ON_CLOSE);
    }//GEN-LAST:event_AddInfoActionPerformed

    private void addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuActionPerformed
        // TODO add your handling code here:
        restomenu r_menu = new restomenu();
        r_menu.setVisible(true);
        r_menu.pack();
        r_menu.setLocationRelativeTo(null);
        r_menu.setDefaultCloseOperation(regis.EXIT_ON_CLOSE);
    }//GEN-LAST:event_addMenuActionPerformed

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
            java.util.logging.Logger.getLogger(tambahInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambahInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambahInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambahInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambahInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddInfo;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JButton addMenu;
    private javax.swing.JButton kembali;
    // End of variables declaration//GEN-END:variables
}