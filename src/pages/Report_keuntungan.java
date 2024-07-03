
package pages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import table.TableCustom;

public class Report_keuntungan extends javax.swing.JPanel {
    private DefaultTableModel modelkeunt;
 
    public Report_keuntungan() throws SQLException {
        initComponents();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        
        modelkeunt =  new DefaultTableModel();
        jTable1.setModel(modelkeunt);
        
        modelkeunt.addColumn("Tanggal");
        modelkeunt.addColumn("Pemasukan");
        modelkeunt.addColumn("Pengeluaran");
        modelkeunt.addColumn("Jumlah");
        
        LaporKeunt();
    }
    
    private void LaporKeunt() throws SQLException {
    modelkeunt.setRowCount(0);

    try {
        Connection connection = Koneksi.getKoneksi();

        // Query untuk mendapatkan data keuntungan dari transaksi dan belanja
        String query = "SELECT t.tanggal, COALESCE(b.total_modal, 0) AS total_modal, SUM(t.total) AS total_penjualan, (SUM(t.total) - COALESCE(b.total_modal, 0)) AS keuntungan " +
            "FROM transaksi t " +
            "LEFT JOIN (SELECT tanggal, SUM(modal) AS total_modal FROM belanja GROUP BY tanggal) b ON t.tanggal = b.tanggal " +
            "GROUP BY t.tanggal";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String tanggal = resultSet.getString("tanggal");
            int totalPenjualan = resultSet.getInt("total_penjualan");
            int totalModal = resultSet.getInt("total_modal");
            int keuntungan = resultSet.getInt("keuntungan");

            modelkeunt.addRow(new Object[]{tanggal, totalPenjualan, totalModal, keuntungan});

            System.out.println("Tanggal: " + tanggal + ", Total Penjualan: " + totalPenjualan + ", Total Modal: " + totalModal + ", Keuntungan: " + keuntungan);
        }

        resultSet.close();
        statement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combobox1 = new combobox.Combobox();
        combobox2 = new combobox.Combobox();
        btnsimpan = new swing.Button();
        panelRound1 = new panelCustom.PanelRound();

        setMinimumSize(new java.awt.Dimension(1630, 900));
        setLayout(new java.awt.CardLayout());

        mainPan.setPreferredSize(new java.awt.Dimension(1670, 920));

        jPanel1.setBackground(new java.awt.Color(166, 104, 68));
        jPanel1.setPreferredSize(new java.awt.Dimension(1670, 920));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 219, -1, -1));
        jPanel1.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 121, 142, -1));
        jPanel1.add(combobox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 121, 141, -1));

        btnsimpan.setBackground(new java.awt.Color(166, 104, 68));
        btnsimpan.setText("Export");
        btnsimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 663, 108, 37));

        panelRound1.setBackground(new java.awt.Color(235, 180, 136));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 560, 640));

        javax.swing.GroupLayout mainPanLayout = new javax.swing.GroupLayout(mainPan);
        mainPan.setLayout(mainPanLayout);
        mainPanLayout.setHorizontalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanLayout.setVerticalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(mainPan, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed

    }//GEN-LAST:event_btnsimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnsimpan;
    private combobox.Combobox combobox1;
    private combobox.Combobox combobox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPan;
    private panelCustom.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
