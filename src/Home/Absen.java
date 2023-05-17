package Home;

import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Absen extends javax.swing.JFrame {

private void autoid(){
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmahasiswa","root","");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM absen_pagi ORDER BY id_absen DESC");
        if (rs.next()){
            String id = rs.getString("id_absen").substring(1);
            String AN = ""+(Integer.parseInt(id) + 0);
            String nol = "";
            
            if (AN.length()==1){
                nol = "00";
            }else if (AN.length()==2){
                nol = "0";
            }else if (AN.length()==3){
                nol = "";
            }
            txid.setText(nol + AN);
            
        } else {
            txid.setText("001");
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "S");
    }
}   

private void autoid1(){
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmahasiswa","root","");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM absen_malam ORDER BY id_absen_malam DESC");
        if (rs.next()){
            String id = rs.getString("id_absen_malam").substring(1);
            String AN = ""+(Integer.parseInt(id) + 1);
            String nol = "";
            
            if (AN.length()==1){
                nol = "000";
            }else if (AN.length()==2){
                nol = "00";
            }else if (AN.length()==3){
                nol = "0";
            }
            txid.setText(nol + AN);
            
        } else {
            txid.setText("0001");
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "S");
    }
}   

    CardLayout cardLayout;
    public Absen() {
        initComponents();
        show_combo();
        show_combo1();
        show_combo2();
        show_combo3();
        show_combo4();
        show_combo5();
        autoid();
        autoid1();
        show_data();
        show_data2();
        show_data4();
    
        
        cardLayout = (CardLayout)(jPanel2.getLayout());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        card2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        penghuni = new javax.swing.JComboBox<>();
        lantai = new javax.swing.JComboBox<>();
        sbmt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txid = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        card4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        penghuni2 = new javax.swing.JComboBox<>();
        lantai2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMonth1 = new com.toedter.calendar.JMonthChooser();
        card5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        lantai3 = new javax.swing.JComboBox<>();
        penghuni3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        sbmt1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 184, 39));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 288));

        jPanel3.setBackground(new java.awt.Color(253, 184, 39));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/Logo Universitas Negeri Semarang (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(253, 184, 39));

        jButton6.setBackground(new java.awt.Color(252, 213, 129));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/icons8_home_45px_2.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(253, 184, 39));

        jButton7.setBackground(java.awt.Color.orange);
        jButton7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/icons8_copybook_45px_1.png"))); // NOI18N
        jButton7.setText("Presensi Pagi");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(253, 184, 39));

        jButton8.setBackground(java.awt.Color.orange);
        jButton8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/icons8_copybook_45px_1.png"))); // NOI18N
        jButton8.setText("Presensi Malam");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(253, 184, 39));

        jButton9.setBackground(java.awt.Color.orange);
        jButton9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/icons8_copybook_45px_1.png"))); // NOI18N
        jButton9.setText("Rekap Presensi");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(253, 184, 39));

        jButton10.setBackground(java.awt.Color.orange);
        jButton10.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/icons8_copybook_45px_1.png"))); // NOI18N
        jButton10.setText("Admin");
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(253, 184, 39));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4, 4, 4)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(316, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(172, 172, 172)))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(58, 71, 80));
        jPanel2.setLayout(new java.awt.CardLayout());

        card1.setBackground(new java.awt.Color(58, 71, 80));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/Universitas Negeri Semarang.png"))); // NOI18N

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        card1Layout.setVerticalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.add(card1, "card1");
        card1.getAccessibleContext().setAccessibleName("card1");

        card2.setBackground(new java.awt.Color(58, 71, 80));

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

        penghuni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-" }));
        penghuni.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                penghuniItemStateChanged(evt);
            }
        });
        penghuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penghuniActionPerformed(evt);
            }
        });

        lantai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "1", "2" }));
        lantai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lantaiActionPerformed(evt);
            }
        });

        sbmt.setText("SUBMIT");
        sbmt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sbmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Lantai");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nama");

        txid.setEnabled(false);
        txid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb1);
        rb1.setForeground(new java.awt.Color(242, 242, 242));
        rb1.setText("Hadir");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setForeground(new java.awt.Color(242, 242, 242));
        rb2.setText("Izin");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb3);
        rb3.setForeground(new java.awt.Color(242, 242, 242));
        rb3.setText("Tanpa Keterangan");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card2Layout = new javax.swing.GroupLayout(card2);
        card2.setLayout(card2Layout);
        card2Layout.setHorizontalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card2Layout.createSequentialGroup()
                        .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card2Layout.createSequentialGroup()
                        .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(card2Layout.createSequentialGroup()
                                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(card2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lantai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rb1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(card2Layout.createSequentialGroup()
                                        .addComponent(rb2)
                                        .addGap(90, 90, 90)
                                        .addComponent(rb3))
                                    .addGroup(card2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(penghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card2Layout.createSequentialGroup()
                        .addComponent(sbmt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))))
        );
        card2Layout.setVerticalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lantai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3))
                .addGap(33, 33, 33)
                .addComponent(sbmt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        txid.getAccessibleContext().setAccessibleName("txid");

        jPanel2.add(card2, "card2");
        card2.getAccessibleContext().setAccessibleName("card2");

        card4.setBackground(new java.awt.Color(58, 71, 80));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        penghuni2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-" }));
        penghuni2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                penghuni2ItemStateChanged(evt);
            }
        });
        penghuni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penghuni2ActionPerformed(evt);
            }
        });

        lantai2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Pagi", "Malam" }));

        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PER - BULAN");

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nama");

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Matkul");

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Pertemuan");

        javax.swing.GroupLayout card4Layout = new javax.swing.GroupLayout(card4);
        card4.setLayout(card4Layout);
        card4Layout.setHorizontalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addGroup(card4Layout.createSequentialGroup()
                        .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(penghuni2, 0, 130, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lantai2, 0, 130, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card4Layout.createSequentialGroup()
                                .addComponent(jMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        card4Layout.setVerticalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(penghuni2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lantai2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        jPanel2.add(card4, "card4");
        card4.getAccessibleContext().setAccessibleName("card4");

        card5.setBackground(new java.awt.Color(58, 71, 80));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable6);

        lantai3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "1", "2" }));
        lantai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lantai3ActionPerformed(evt);
            }
        });

        penghuni3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-" }));

        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Lantai");

        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Nama");

        buttonGroup2.add(rb4);
        rb4.setForeground(new java.awt.Color(242, 242, 242));
        rb4.setText("Hadir");

        buttonGroup2.add(rb5);
        rb5.setForeground(new java.awt.Color(242, 242, 242));
        rb5.setText("Izin");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb6);
        rb6.setForeground(new java.awt.Color(242, 242, 242));
        rb6.setText("Tanpa Keterangan");
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });

        sbmt1.setText("Submit");
        sbmt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card5Layout = new javax.swing.GroupLayout(card5);
        card5.setLayout(card5Layout);
        card5Layout.setHorizontalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card5Layout.createSequentialGroup()
                        .addComponent(rb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb5)
                        .addGap(86, 86, 86)
                        .addComponent(rb6))
                    .addGroup(card5Layout.createSequentialGroup()
                        .addComponent(lantai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penghuni3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
            .addGroup(card5Layout.createSequentialGroup()
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card5Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(sbmt1))
                    .addGroup(card5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        card5Layout.setVerticalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card5Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lantai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penghuni3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb4)
                    .addComponent(rb5)
                    .addComponent(rb6))
                .addGap(51, 51, 51)
                .addComponent(sbmt1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.add(card5, "card3");

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void show_combo(){
        try {
            String sql = "SELECT * FROM penghuni";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                penghuni.addItem(rs.getString("nama"));
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        }
    }

    private void show_combo1(){
        try {
            String sql = "SELECT * FROM";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
               lantai.addItem(rs.getString("lantai"));
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        }
    }    

    private void show_combo2(){
        try {
            String sql = "SELECT * FROM penghuni";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                penghuni2.addItem(rs.getString("nama"));
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        }
    }    
    
    private void show_combo3(){
        try {
            String sql = "SELECT * FROM";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                
               lantai2.addItem(rs.getString("lantai"));
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        }
    }
    
    private void show_combo4(){
        try {
            String sql = "SELECT * FROM penghuni";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                penghuni3.addItem(rs.getString("nama"));
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        }
    }    
    
    private void show_combo5(){
        try {
            String sql = "SELECT * FROM";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                
               lantai3.addItem(rs.getString("lantai"));
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        }
    }
        
    
    public String chooseid(JComboBox a){
        String hsl = "";
        try {
            String sql = "SELECT * FROM penghuni WHERE nama='"+a.getSelectedItem()+"'";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                String result = rs.getString(3);
                hsl = result;
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        } 
    return hsl;
    }
    
    public String chooseid1(JComboBox a){
        String hsl = "";
        try {
            String sql = "SELECT * FROM lantai WHERE lantai='"+a.getSelectedItem()+"'";
            java.sql.Connection con= (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                String result = rs.getString(1);
                hsl = result;
                
            }
            rs.last();
            int data = rs.getRow();
            rs.first();
            
        }catch(Exception e){
            
        } 
    return hsl;
    }

    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cardLayout.show(jPanel2, "card2");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        setColorLeft(jPanel5);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        resetColorLeft(jPanel5);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        setColorLeft(jPanel4);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        resetColorLeft(jPanel4);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        setColorLeft(jPanel7);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        resetColorLeft(jPanel7);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        setColorLeft(jPanel8);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        resetColorLeft(jPanel8);
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cardLayout.show(jPanel2, "card1");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cardLayout.show(jPanel2, "card3");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cardLayout.show(jPanel2, "card4");
    }//GEN-LAST:event_jButton9ActionPerformed
    
    public void show_data(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Kamar");
        tabel.addColumn("Nama");
        tabel.addColumn("Lantai");
        tabel.addColumn("Keterangan");
        tabel.addColumn("Waktu Presensi");
        try {
            java.sql.Connection con = (java.sql.Connection)Home.Koneksi.getKoneksi();
            String sql = "SELECT penghuni.kode_kamar, penghuni.nama, lantai.lantai, absen_pagi.keterangan, absen_pagi.Waktu FROM absen_pagi LEFT JOIN penghuni ON absen_pagi.kode_kamar = penghuni.kode_kamar LEFT JOIN lantai ON absen_pagi.id_lantai = lantai.id_lantai";
            java.sql.PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs =stm.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)});
                }
            jTable1.setModel(tabel);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error");
                System.out.println(e.getMessage());
            }
    }
    
    public void show_data4(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Kamar");
        tabel.addColumn("Nama");
        tabel.addColumn("Lantai");
        tabel.addColumn("Keterangan");
        tabel.addColumn("Waktu Presensi");
        try {
            java.sql.Connection con = (java.sql.Connection)Home.Koneksi.getKoneksi();
            String sql = "SELECT penghuni.kode_kamar, penghuni.nama, lantai.lantai, absen_malam.keterangan, absen_malam.Waktu FROM absen_malam LEFT JOIN penghuni ON absen_malam.kode_kamar = penghuni.kode_kamar LEFT JOIN lantai ON absen_malam.id_lantai = lantai.id_lantai";
            java.sql.PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs =stm.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)});
                }
            jTable6.setModel(tabel);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error");
                System.out.println(e.getMessage());
            }
    }
    

    
    public String tgl_between(JComboBox a) {
	String myString = a.getSelectedItem().toString();
        String[] splitString = myString.split(" - ");
        String st1 = splitString[0];
        String st2 = splitString[1];
        String hsl = st1+"'"+" AND "+"'"+st2;
    return hsl;
    }
    
    
    
    public void scndtable1(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Kamar");
        tabel.addColumn("Nama");
        tabel.addColumn("Hadir");
        tabel.addColumn("Izin");
        tabel.addColumn("Tanpa Keterangan");
        try {
            java.sql.Connection con = (java.sql.Connection)Home.Koneksi.getKoneksi();
            String sql = "SELECT penghuni.kode_kamar, penghuni.nama, SUM(absen_pagi.keterangan = 'Hadir' AND absen_pagi.id_absen = '"+chooseid1(lantai2)+"', SUM(absen_pagi.keterangan = 'Izin' AND absen_pagi.id_absen = '"+chooseid1(lantai2)+"'), SUM(absen_pagi.keterangan = 'Tanpa Keterangan' AND absen_pagi.id_absen = '"+chooseid1(lantai2)+"') FROM penghuni JOIN absen_pagi ON penghuni.kode_kamar = absen_pagi.kode_kamar JOIN ON absen_pagi.id_absen =.id_absen GROUP BY penghuni.kode_kamar;";
            System.out.println(sql);
            java.sql.PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs =stm.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)});
            }
            jTable5.setModel(tabel);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error bro");
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    public void show_data2(){
        if (penghuni2.getSelectedItem() == "-SELECT-" && lantai2.getSelectedItem() == "-SELECT-"){
            String sql = "";
            DefaultTableModel tabel = new DefaultTableModel();
            tabel.addColumn("Keterangan");
            tabel.addColumn("Jumlah Total");
            try {
                java.sql.Connection con = (java.sql.Connection)Home.Koneksi.getKoneksi();
                sql = "SELECT absen_pagi.keterangan, COUNT(*) FROM penghuni JOIN absen_pagi ON penghuni.kode_kamar = absen_pagi.kode_kamar JOIN lantai ON absen_pagi.id_lantai = lantai.id_lantai GROUP BY absen_pagi.keterangan;";
                System.out.println(sql);
                java.sql.PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs =stm.executeQuery(sql);
                while (rs.next()) {
                    tabel.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2)});
                    }
                jTable4.setModel(tabel);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error bro");
                    System.out.println(e.getMessage());
                }
        } else if (penghuni2.getSelectedItem() == "-SELECT-" && lantai2.getSelectedItem() != "-SELECT-") {
            String sql = "";
            DefaultTableModel tabel = new DefaultTableModel();
            tabel.addColumn("Keterangan");
            tabel.addColumn("Jumlah Total");
            try {
                java.sql.Connection con = (java.sql.Connection)Home.Koneksi.getKoneksi();
                sql = "SELECT absen_pagi.keterangan, COUNT(*) FROM penghuni JOIN absen_pagi ON penghuni.kode_kamar = absen_pagi.kode_kamar GROUP BY absen_pagi.keterangan;";
                System.out.println(sql);
                java.sql.PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs =stm.executeQuery(sql);
                while (rs.next()) {
                    tabel.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2)});
                    }
                scndtable1();
                jTable4.setModel(tabel);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error bro");
                    System.out.println(e.getMessage());
                }
            
        } else {
            DefaultTableModel tabel = new DefaultTableModel();
            tabel.addColumn("Kode Kamar");
            tabel.addColumn("Nama");
            tabel.addColumn("Hadir");
            tabel.addColumn("Izin");
            tabel.addColumn("Tanpa Keterangan");
            try {
                java.sql.Connection con = (java.sql.Connection)Home.Koneksi.getKoneksi();
                String sql = "SELECT penghuni.kode_kamar, penghuni.nama, SUM(absen_pagi.keterangan = 'Hadir' AND absen_pagi.kode_kamar = '"+chooseid(penghuni2)+"', SUM(absen_pagi.keterangan = 'Izin' AND absen_pagi.kode_kamar = '"+chooseid(penghuni2)+"', SUM(absen_pagi.keterangan = 'Tanpa Keterangan' AND absen_pagi.kode_kamar = '"+chooseid(penghuni2)+"'FROM penghuni JOIN absen_pagi ON penghuni.kode_kamar = absen_pagi.kode_kamar JOIN lantai ON absen_pagi.id_lantai = lantai.id_lantai WHERE absen_pagi.kode_kamar = '"+chooseid(penghuni2)+"' GROUP BY penghuni.kode_kamar;";
                System.out.println(sql);
                java.sql.PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs =stm.executeQuery(sql);
                while (rs.next()) {
                    tabel.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)});
                    }
                scndtable1();
                jTable4.setModel(tabel);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error bro");
                    System.out.println(e.getMessage());
                }
        }
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        show_data2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void penghuni2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_penghuni2ItemStateChanged
        show_data2();
    }//GEN-LAST:event_penghuni2ItemStateChanged

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        setColorLeft(jPanel9);
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        resetColorLeft(jPanel9);
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
        Admin a = new Admin();
        a.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        keterangan = "Tanpa Keterangan";
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        keterangan = "Izin";
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        keterangan = "Hadir";
    }//GEN-LAST:event_rb1ActionPerformed

    private void txidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidActionPerformed

    private void sbmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtActionPerformed
        String keterangan = null;
        SimpleDateFormat formatWaktu = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (rb1.isSelected()){
            keterangan = "Hadir";
        }
        else if (rb2.isSelected()){
            keterangan = "Izin";
        }
        else if (rb3.isSelected()){
            keterangan = "Tanpa Keterangan";
        }
        try {
            String sql = "INSERT INTO absen_pagi VALUES ('"
            +txid.getText()+"','"
            +chooseid(penghuni)+"','"
            +chooseid1(lantai)+"','"
            +keterangan+"','"
            + (java.time.LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))) + "');";
            java.sql.Connection con = (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement stmnt = con.prepareStatement(sql);
            stmnt.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            autoid();
            show_data();

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_sbmtActionPerformed

    private void lantaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lantaiActionPerformed

    }//GEN-LAST:event_lantaiActionPerformed

    private void penghuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penghuniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penghuniActionPerformed

    private void penghuniItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_penghuniItemStateChanged
        show_data();
        show_combo1();
    }//GEN-LAST:event_penghuniItemStateChanged

    private void lantai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lantai3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lantai3ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb5ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb6ActionPerformed

    private void sbmt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmt1ActionPerformed
        String keterangan = null;
        SimpleDateFormat formatWaktu = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (rb4.isSelected()){
            keterangan = "Hadir";
        }
        else if (rb5.isSelected()){
            keterangan = "Izin";
        }
        else if (rb6.isSelected()){
            keterangan = "Tanpa Keterangan";
        }
        try {
            String sql = "INSERT INTO absen_malam VALUES ('"
            +txid.getText()+"','"
            +chooseid(penghuni3)+"','"
            +chooseid1(lantai3)+"','"
            +keterangan+"','"
            + (java.time.LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))) + "');";
            java.sql.Connection con = (java.sql.Connection) Home.Koneksi.getKoneksi();
            java.sql.PreparedStatement stmnt = con.prepareStatement(sql);
            stmnt.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            autoid1();
            show_data4();

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_sbmt1ActionPerformed

    private void penghuni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penghuni2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penghuni2ActionPerformed
    public void setColor(JPanel p) {
        p.setBackground(new Color(124,146,160));
    }
    public void setColorLeft(JPanel p) {
        p.setBackground(new Color(252,213,129));
    }
    public void setColorRed(JPanel p) {
        p.setBackground(new Color(255,0,0));
    }
    public void resetColor(JPanel p1) {
        p1.setBackground(new Color(58,71,80));
    }
    public void resetColorLeft(JPanel p1) {
        p1.setBackground(new Color(253,184,39));
    }
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
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Absen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card4;
    private javax.swing.JPanel card5;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JMonthChooser jMonth1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JComboBox<String> lantai;
    private javax.swing.JComboBox<String> lantai2;
    private javax.swing.JComboBox<String> lantai3;
    private javax.swing.JComboBox<String> penghuni;
    private javax.swing.JComboBox<String> penghuni2;
    private javax.swing.JComboBox<String> penghuni3;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JButton sbmt;
    private javax.swing.JButton sbmt1;
    private javax.swing.JTextField txid;
    // End of variables declaration//GEN-END:variables
private String keterangan;
}
