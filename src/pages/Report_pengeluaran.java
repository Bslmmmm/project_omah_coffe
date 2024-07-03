
package pages;

import table.*;
import koneksi.Koneksi;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Report_pengeluaran extends javax.swing.JPanel {
    private DefaultTableModel modelpenge;

    public Report_pengeluaran() {
        initComponents();
        TableCustom.apply(jScrollPane2, TableCustom.TableType.DEFAULT);
        
        modelpenge = new DefaultTableModel();
        jTable2.setModel(modelpenge);

        // Tambahkan kolom ke model
        modelpenge.addColumn("Tanggal");
        modelpenge.addColumn("Pengeluaran");
        modelpenge.addColumn("Keterangan");
        
        laporPenge();

    }

    private void laporPenge() {
    modelpenge.setRowCount(0); // Mengosongkan data tabel sebelum menampilkan yang baru

    try {
        Connection connection = Koneksi.getKoneksi();

        String query = "SELECT tanggal, modal, keterangan FROM belanja";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Bersihkan model sebelum menambahkan data baru
        modelpenge.setRowCount(0);

        // Iterate melalui hasil dan tambahkan baris baru ke model
        while (resultSet.next()) {
        String tanggal = resultSet.getString("tanggal");
        int modal = resultSet.getInt("modal");
        String keterangan = resultSet.getString("keterangan");
        
        // Tambahkan data ke model
        modelpenge.addRow(new Object[]{tanggal, modal, keterangan});

        // Tambahkan pernyataan pencetakan untuk melacak nilai "pengeluaran"
        System.out.println("Tanggal: " + tanggal + ", Pengeluaran: " + modal + ", Keterangan: " + keterangan);
    }
    }catch (SQLException e) {
    e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuUtama = new javax.swing.JPanel();
        pengeluaranpage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        combobox2 = new combobox.Combobox();
        btnsimpan = new swing.Button();
        combobox1 = new combobox.Combobox();
        panelRound1 = new panelCustom.PanelRound();

        setLayout(new java.awt.CardLayout());

        menuUtama.setPreferredSize(new java.awt.Dimension(1670, 920));

        pengeluaranpage.setBackground(new java.awt.Color(166, 104, 68));
        pengeluaranpage.setEnabled(false);
        pengeluaranpage.setPreferredSize(new java.awt.Dimension(1670, 920));
        pengeluaranpage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        pengeluaranpage.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 110, 889, -1));
        pengeluaranpage.add(combobox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 54, 178, -1));

        btnsimpan.setBackground(new java.awt.Color(166, 104, 68));
        btnsimpan.setText("Export");
        btnsimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        pengeluaranpage.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 108, 37));
        pengeluaranpage.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 54, 177, -1));

        panelRound1.setBackground(new java.awt.Color(235, 180, 136));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        pengeluaranpage.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 930, 570));

        javax.swing.GroupLayout menuUtamaLayout = new javax.swing.GroupLayout(menuUtama);
        menuUtama.setLayout(menuUtamaLayout);
        menuUtamaLayout.setHorizontalGroup(
            menuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaLayout.createSequentialGroup()
                .addComponent(pengeluaranpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuUtamaLayout.setVerticalGroup(
            menuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaLayout.createSequentialGroup()
                .addComponent(pengeluaranpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(menuUtama, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed

    }//GEN-LAST:event_btnsimpanActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnsimpan;
    private combobox.Combobox combobox1;
    private combobox.Combobox combobox2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel menuUtama;
    private panelCustom.PanelRound panelRound1;
    private javax.swing.JPanel pengeluaranpage;
    // End of variables declaration//GEN-END:variables
}
