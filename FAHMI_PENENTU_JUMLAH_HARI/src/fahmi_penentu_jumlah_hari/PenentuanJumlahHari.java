/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahmi_penentu_jumlah_hari;

import static fahmi_penentu_jumlah_hari.Filter.digitFilter;
import static fahmi_penentu_jumlah_hari.SimpanTxt.Simpan;
import javax.swing.JOptionPane;

/**
 *
 * @author fahmi
 */
public class PenentuanJumlahHari extends javax.swing.JFrame {

    /**
     * Creates new form PenentuanJumlahHari
     */
    public PenentuanJumlahHari() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxBulan = new javax.swing.JComboBox<>();
        TextTahun = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelHasil = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonHitung = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penentu Jumlah Hari");

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setText("Tahun");

        jLabel4.setText("Bulan");

        jComboBoxBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bulan", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        TextTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTahunKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabelHasil.setText("Jumlah Hari Adalah ...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHasil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabelHasil)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jButtonHitung.setText("Hitung");
        jButtonHitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonHitungMouseReleased(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonHapusMouseReleased(evt);
            }
        });

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSimpanMouseReleased(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonExitMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jButtonHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHitung)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("New Project");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Open Project");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Keluar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHitungMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHitungMouseReleased
        // TODO add your handling code here:
        if(TextTahun.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error : Tahun Belum DiIsi!",
                    "Error: Masukan Tahun!", JOptionPane.WARNING_MESSAGE);
        }else if(jComboBoxBulan.getSelectedItem().equals("Pilih Bulan")) {
                JOptionPane.showMessageDialog(null, "Error : Bulan Belum Dipilih!",
                    "Error: Pilih Bulan!", JOptionPane.WARNING_MESSAGE);
        }else{
            long tahun = Integer.parseInt(TextTahun.getText());
            //long tahun = 2001;
            int jumlahHari;
            if(jComboBoxBulan.getSelectedItem().equals("Februari")){
                if(((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0 ))
                    jumlahHari = 29;
                else jumlahHari = 28;
            }else if(jComboBoxBulan.getSelectedItem().equals("April") ||
                    jComboBoxBulan.getSelectedItem().equals("Juni") ||
                    jComboBoxBulan.getSelectedItem().equals("September") ||
                    jComboBoxBulan.getSelectedItem().equals("November")){
                jumlahHari = 30;
            }else{
                jumlahHari = 31;
            }
            jLabelHasil.setText("Jumlah hari pada bulan " +
                    jComboBoxBulan.getSelectedItem() +
                    " tahun " + tahun + " adalah " + jumlahHari);
        }
    }//GEN-LAST:event_jButtonHitungMouseReleased

    private void jButtonHapusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHapusMouseReleased
        // TODO add your handling code here:
        jLabelHasil.setText("Jumlah Hari Adalah ...");
        TextTahun.setText("");
        jComboBoxBulan.setSelectedItem("Pilih Bulan");
    }//GEN-LAST:event_jButtonHapusMouseReleased

    private void TextTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTahunKeyTyped
        // TODO add your handling code here:
        digitFilter(evt);
    }//GEN-LAST:event_TextTahunKeyTyped

    private void jButtonExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMouseReleased

    private void jButtonSimpanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSimpanMouseReleased
        // TODO add your handling code here:
        String h = jLabelHasil.getText();
        Simpan(h);
    }//GEN-LAST:event_jButtonSimpanMouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this,
            "Konfirmasi Keluar Aplikasi",
            "Yakin untuk keluar dari program",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(PenentuanJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenentuanJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenentuanJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenentuanJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenentuanJumlahHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextTahun;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonHitung;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JComboBox<String> jComboBoxBulan;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHasil;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
