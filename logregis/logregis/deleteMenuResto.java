/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logregis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class deleteMenuResto extends javax.swing.JFrame {

    /**
     * Creates new form deleteMenuResto
     */
    public deleteMenuResto() {
        initComponents();
        tabelDatabase();
        //tabelMenuDbase();
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
        Tomboldelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUpdateMenu = new javax.swing.JTable();
        fDelMenu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Hapus Menu");

        Tomboldelete.setText("Hapus");
        Tomboldelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomboldeleteActionPerformed(evt);
            }
        });

        tblUpdateMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUpdateMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblUpdateMenuKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblUpdateMenu);

        fDelMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fDelMenuActionPerformed(evt);
            }
        });
        fDelMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fDelMenuKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Menu Yang Ingin Dihapus:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Tomboldelete)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fDelMenu))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fDelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(Tomboldelete)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabelDatabase(){
        Connection dbconn = Logregis.koneksiDB();
        DefaultTableModel rkmod = new DefaultTableModel();
        rkmod.addColumn("No");
        rkmod.addColumn("nama");
        rkmod.addColumn("harga");
        rkmod.addColumn("restoran");
        rkmod.addColumn("deskripsi");
        rkmod.addColumn("rekomendasi");
        
        try{
            int num = 1;
            Statement st = dbconn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from menukwc");
            while(rs.next()){
                rkmod.addRow(new Object[]{num++,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                tblUpdateMenu.setModel(rkmod);
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
    private void TomboldeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomboldeleteActionPerformed
        // TODO add your handling code here:
        try{
            Connection dbconn = Logregis.koneksiDB();
            String sql = "delete from menukwc WHERE nama = ?";
            PreparedStatement ps = dbconn.prepareStatement(sql);
            ps.setString(1, fDelMenu.getText());           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            fDelMenu.setText("");          
            dbconn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//GEN-LAST:event_TomboldeleteActionPerformed

    public void tabelMenuDbase(){
        Connection dbconn = Logregis.koneksiDB();
        DefaultTableModel rkmod = new DefaultTableModel();
        rkmod.addColumn("No");
        rkmod.addColumn("nama");
        rkmod.addColumn("harga");
        rkmod.addColumn("restoran");
        rkmod.addColumn("deskripsi");
        rkmod.addColumn("rekomendasi");
        String c_rst = fDelMenu.getText();
        
        try{
            int num = 1;
            Statement st = dbconn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from menukwc WHERE nama LIKE '%"+c_rst+"%' OR restoran LIKE '%"+c_rst+"%'");
            while(rs.next()){
                rkmod.addRow(new Object[]{num++,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                tblUpdateMenu.setModel(rkmod);
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
    private void tblUpdateMenuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUpdateMenuKeyReleased
        // TODO add your handling code here:       
    }//GEN-LAST:event_tblUpdateMenuKeyReleased

    private void fDelMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fDelMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fDelMenuActionPerformed

    private void fDelMenuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fDelMenuKeyReleased
        // TODO add your handling code here:
        tabelMenuDbase();
    }//GEN-LAST:event_fDelMenuKeyReleased

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
            java.util.logging.Logger.getLogger(deleteMenuResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteMenuResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteMenuResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteMenuResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteMenuResto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tomboldelete;
    private javax.swing.JTextField fDelMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUpdateMenu;
    // End of variables declaration//GEN-END:variables
}
