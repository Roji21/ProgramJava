/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class LoginBiasa extends javax.swing.JFrame {

    /**
     * Creates new form LoginBiasa
     */
    public LoginBiasa() {
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

        tfpass = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dosen = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        maha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        ftpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfpass.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 111, 33));
        jLabel6.setText("JAMASTI");

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel2.setText("Email");

        tfemail.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        tfemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfemailMouseClicked(evt);
            }
        });
        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel3.setText("Password");

        jPanel4.setBackground(new java.awt.Color(242, 111, 33));
        jPanel4.setForeground(new java.awt.Color(242, 111, 33));

        dosen.setBackground(new java.awt.Color(242, 111, 33));
        dosen.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        dosen.setForeground(new java.awt.Color(255, 255, 255));
        dosen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dosen.setText("Dosen");
        dosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dosen, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dosen, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(242, 111, 33));
        jPanel5.setForeground(new java.awt.Color(242, 111, 33));

        maha.setBackground(new java.awt.Color(242, 111, 33));
        maha.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        maha.setForeground(new java.awt.Color(255, 255, 255));
        maha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maha.setText("Mahasiswa");
        maha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mahaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maha, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maha, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hehe.png"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(242, 111, 33));
        jPanel6.setForeground(new java.awt.Color(242, 111, 33));

        back.setBackground(new java.awt.Color(242, 111, 33));
        back.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("Kembali");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jCheckBox1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCheckBox1.setText("Show password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        ftpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tfpassLayout = new javax.swing.GroupLayout(tfpass);
        tfpass.setLayout(tfpassLayout);
        tfpassLayout.setHorizontalGroup(
            tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfpassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(373, 373, 373))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfpassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfpassLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfpassLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(355, 355, 355))))
            .addGroup(tfpassLayout.createSequentialGroup()
                .addGroup(tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tfpassLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(tfpassLayout.createSequentialGroup()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1)))
                            .addGroup(tfpassLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel8))
                            .addComponent(ftpass, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tfpassLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1))
                    .addGroup(tfpassLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        tfpassLayout.setVerticalGroup(
            tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfpassLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftpass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(tfpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfemailActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        new Pilihlog().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void tfemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfemailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfemailMouseClicked

    private void mahaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahaMouseClicked
        // TODO add your handling code here:
        String c = tfemail.getText();
        String b = ftpass.getText();
        if (c.length() == 0 && b.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Tidak Boleh Kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (c.length() != 0 && b.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Passwordnya Kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (c.length() == 0 && b.length() != 0) {
            JOptionPane.showMessageDialog(rootPane, "Emailnya Kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "SELECT * FROM mahasiswa WHERE email = '" + tfemail.getText()
                        + "' AND password_mhs = '" + ftpass.getText() + "'";
                java.sql.Connection con = (Connection) Koneksi.configDB();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (tfemail.getText().equals(rs.getString("email"))
                            && ftpass.getText().equals(rs.getString("password_mhs")));
                    String nidn = rs.getString("nrp");
                    mahjadwal a = new mahjadwal(nidn);
                    a.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Username atau Password salah , Silahkan Check Lagi");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Login Gagal kesalahan sistem, Silahkan Hubungi Admin" + e.getMessage());
            }
        }
    }//GEN-LAST:event_mahaMouseClicked

    private void dosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosenMouseClicked
        // TODO add your handling code here:
        String c = tfemail.getText();
        String b = ftpass.getText();
        if (c.length() == 0 && b.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Tidak Boleh Kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (c.length() != 0 && b.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Passwordnya Kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (c.length() == 0 && b.length() != 0) {
            JOptionPane.showMessageDialog(rootPane, "Emailnya Kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "SELECT * FROM dosen WHERE email = '" + tfemail.getText()
                        + "' AND password_dosen = '" + ftpass.getText() + "'";
                java.sql.Connection con = (Connection) Koneksi.configDB();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (tfemail.getText().equals(rs.getString("email"))
                            && ftpass.getText().equals(rs.getString("password_dosen"))) {
                        String nip = rs.getString("nip_dosen");
                        dosjadwal a = new dosjadwal(nip);
                        a.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Username atau Password salah , Silahkan Check Lagi");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Login Gagal kesalahan sistem, Silahkan Hubungi Admin" + e.getMessage());
            }
        }
    }//GEN-LAST:event_dosenMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            ftpass.setEchoChar((char)0);
        }else{
            ftpass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void ftpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftpassActionPerformed

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
            java.util.logging.Logger.getLogger(LoginBiasa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginBiasa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginBiasa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginBiasa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBiasa().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel dosen;
    private javax.swing.JPasswordField ftpass;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel maha;
    private javax.swing.JTextField tfemail;
    private javax.swing.JPanel tfpass;
    // End of variables declaration//GEN-END:variables
}