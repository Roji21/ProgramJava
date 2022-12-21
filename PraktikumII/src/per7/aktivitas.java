package modul7;
import java.awt.CardLayout;
public class aktivitas extends javax.swing.JFrame {
    public aktivitas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utama = new javax.swing.JPanel();
        Beranda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Kereta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pesawat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Hotel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        utama.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Panel Beranda");

        javax.swing.GroupLayout BerandaLayout = new javax.swing.GroupLayout(Beranda);
        Beranda.setLayout(BerandaLayout);
        BerandaLayout.setHorizontalGroup(
            BerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BerandaLayout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        BerandaLayout.setVerticalGroup(
            BerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BerandaLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        utama.add(Beranda, "beranda");

        jLabel2.setText("KERETA");

        javax.swing.GroupLayout KeretaLayout = new javax.swing.GroupLayout(Kereta);
        Kereta.setLayout(KeretaLayout);
        KeretaLayout.setHorizontalGroup(
            KeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeretaLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        KeretaLayout.setVerticalGroup(
            KeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeretaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        utama.add(Kereta, "kereta");

        jLabel3.setText("PESAWAT");

        javax.swing.GroupLayout PesawatLayout = new javax.swing.GroupLayout(Pesawat);
        Pesawat.setLayout(PesawatLayout);
        PesawatLayout.setHorizontalGroup(
            PesawatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesawatLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel3)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        PesawatLayout.setVerticalGroup(
            PesawatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesawatLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        utama.add(Pesawat, "pesawat");

        jLabel4.setText("HOTEL");

        javax.swing.GroupLayout HotelLayout = new javax.swing.GroupLayout(Hotel);
        Hotel.setLayout(HotelLayout);
        HotelLayout.setHorizontalGroup(
            HotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel4)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        HotelLayout.setVerticalGroup(
            HotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel4)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        utama.add(Hotel, "hotel");

        jMenu1.setText("Beranda");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pemesanan");

        jMenuItem1.setText("Kereta");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Pesawat");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Hotel");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CardLayout cLayout = (CardLayout) utama.getLayout();
        cLayout.show(utama, "kereta");
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        CardLayout cLayout = (CardLayout) utama.getLayout();
        cLayout.show(utama, "beranda");
    }//GEN-LAST:event_jMenu1MouseClicked
    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked
    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MouseClicked
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CardLayout cLayout = (CardLayout) utama.getLayout();
        cLayout.show(utama, "hotel");
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CardLayout cLayout = (CardLayout) utama.getLayout();
        cLayout.show(utama, "pesawat");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aktivitas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Beranda;
    private javax.swing.JPanel Hotel;
    private javax.swing.JPanel Kereta;
    private javax.swing.JPanel Pesawat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel utama;
    // End of variables declaration//GEN-END:variables
}
