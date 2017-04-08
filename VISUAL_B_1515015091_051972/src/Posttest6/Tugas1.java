/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest6;

/**
 *
 * @author OLIVIA
 */

// Mengimport kelas
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Tugas1 extends javax.swing.JFrame {

private DefaultTableModel model; // Untuk membuat model pada tabel
private Connection con = koneksi.getConnection(); //Untuk mengambil koneksi
private Statement stt; // Untuk eksekusi query database
private ResultSet rss; // Untuk penampung data dari database
int id; // Mendeklarasikan variable id bertipe data integer

    public Tugas1() {
        initComponents();
    }
    
     private void InitTable(){
        model = new DefaultTableModel();
        model.addColumn("JUDUL"); // Menambah kolom bernama JUDUL
        model.addColumn("PENULIS"); // Menambah kolom bernama PENULIS
        model.addColumn("HARGA"); // Menambah kolom bernama HARGA
        model.addColumn("ID"); // Menambah kolom bernama ID yang nantinya digunakan
        //untuk mengubah dan menghapus (berguna pada proses hapus dan ubah)
        
        jTable1.setModel(model);
        
        //sintaks getColumn("ID") dibawah ini bertujuan untuk mengecilkan kolom ID
        // agar tidak terlihat pada saat program dijalankan
        jTable1.getColumn("ID").setPreferredWidth(0);
        jTable1.getColumn("ID").setMinWidth(0);
        jTable1.getColumn("ID").setWidth(0);
        jTable1.getColumn("ID").setMaxWidth(0);
        
    }
    
    private void TampilData(){ // Merupakan method bernama TampilData yang berfungsi 
        // untuk menampilkan data di tabel buku pada database yang telah terkoneksi
        //yaitu database praktikum_visual
        
        try{
            String sql = "SELECT * FROM buku"; // Query sql yang berfungsi untuk
            // menampilkan semua data di tabel buku pada database praktikum_visual
           
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            // Sintaks diatas bertujuan untuk mengeksekusi query yang telah
            // dideklarasikan sebelumnya, dan juga menampung data dari database
            // yang telah terkoneksi
            
            while(rss.next()){ // Melakukan perulangan ResulSet dari variabel rss
            //dan akan berhenti jika tidak terpenuhi lagi
            
              // Menampilkan data sesuai array
              Object[] o = new Object[4];
              o[0] = rss.getString("judul"); // Data pada kolom judul di tabel buku dimasukkan kedalam object o
              o[1] = rss.getString("penulis"); // Data pada kolom penulis di tabel buku dimasukkan kedalam object o
              o[2] = rss.getInt("harga"); // Data pada kolom harga di tabel buku dimasukkan kedalam object o
              o[3] = rss.getInt("id"); // Data pada kolom id di tabel buku dimasukkan kedalam object o
              model.addRow(o); //Kemudian data-data tadi di masukkan kedalam model pada tabel jTable1
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
         // Sintaks diatas berfungsi menangkap (catch) kesalahan jika terjadi
        }
        
    }
    
    private void TambahData(){ // Method bernama TambahData yang berfungsi untuk
        // menambah data ke tabel buku pada database yang telah terkoneksi yaitu
        // database praktikum_visual
        
        String judul = txtjudul.getText(); // Mendeklarasikan variabel judul dengan
        // tipe data string kemudian mengambil values yang telah diisi pada jTextfield
        //bernama txtjudul
        String penulis = combopenulis.getSelectedItem().toString(); // Mendeklarasikan
        // variabel penulis dengan tipe data string kemudian mengambil values yang 
        // telah dipilih pada JComboBox bernama combopenulis
        int harga = Integer.parseInt(txtharga.getText()); // Mendeklarasikan variabel
        // harga yang bertipe data integer kemudian mengambil values yang telah diisi
        // pada jTextfield bernama txtharga
        
        try{
            String sql = "INSERT INTO buku VALUES(NULL,'"+judul+"','"+penulis+"',"+harga+")"; 
            // Mendeklarasikan sql bertipe data string, Query sql diatas digunakan
            // untuk memasukan nilai ke tabel buku dengan urutan id=NULL, judul, penulis dan harga
            
            stt = con.createStatement();
            stt.executeUpdate(sql); 
            // Sintaks diatas berfungsi untuk mengeksekusi query yang telah dideklarasikan
            
            model.addRow(new Object[]{judul,penulis,harga}); // Kemudian nilai pada kolom judul,
            //penulis dan harga dimasukkan kedalam model pada tabel jTable1
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
         // Sintaks diatas berfungsi untuk menangkap(catch) kesalahan jika terjadi
        }
    }
    
    private void UpdateData(){ //Method dengan nama UpdateData yang berfungsi
    //untuk mengubah data atau mengupdate data
        
        String judul = txtjudul.getText(); // Mendeklarasikan judul dengan tipe data
        // string dan mengambil values yang telah diisi dari jTextfield  txtjudul
        String penulis = combopenulis.getSelectedItem().toString(); // Mendeklarasikan
        // variabel penulis dengan tipe data string kemudian mengambil values yang
        // telah dipilih dari JComboBox bernama combopenulis
        int harga = Integer.parseInt(txtharga.getText()); // Mendeklarasikan variabel 
        // harga bertipe data integer dan mengambil values dari jTextfield txtharga 
        int idno = Integer.parseInt(no_id.getText()); // Mendeklarasikan variabel idno
        //betipe data integer dan mengambil values dari jLabel bernama no_id
        
        try{
            String sql = "UPDATE buku SET judul='"+judul+"', penulis='"+penulis+"', harga='"+harga+"'WHERE id='"+idno+"'";
            //Query sql diatas berfungsi untuk mengupdate data judulm penulis dan harga pada tabel buku dimana
            // nilai id pada tabel buku = nilai variabel id_no
            
            stt = con.createStatement();
            stt.executeUpdate(sql);
            // Sintaks diatas berfungsi untuk mengeksekusi query yang telah dideklarasikan
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
            // Sintaks diatas berfungsi untuk menangkap(catch) kesalahan jika terjadi
        }
    }
    
    private void HapusData(){ // Method bernama HapusData yang berfungsi untuk
        // menghapus data dari tabel buku pada database praktikum_visual
        
        String judul = txtjudul.getText(); // Mendeklarasikan judul dengan tipe data
        // string dan mengambil values yang telah diisi dari jTextfield  txtjudul
        String penulis = combopenulis.getSelectedItem().toString(); // Mendeklarasikan
        // variabel penulis dengan tipe data string kemudian mengambil values yang
        // telah dipilih dari JComboBox bernama combopenulis
        int harga = Integer.parseInt(txtharga.getText()); // Mendeklarasikan variabel 
        // harga bertipe data integer dan mengambil values dari jTextfield txtharga
        int idno = Integer.parseInt(no_id.getText()); // Mendeklarasikan variabel idno
        //betipe data integer dan mengambil values dari jLabel bernama no_id
        
        try{
            String sql = "DELETE FROM buku WHERE id='"+idno+"'";
            // Query sql diatas berfungsi menghapus data pada tabel buku sesuai dengan
            // id yang ditentukan, dimana id = idno, id_no berisi id penulis, judul dan harga
            
            stt = con.createStatement();
            stt.executeUpdate(sql);
            // Sintaks diatas berfungsi untuk mengeksekusi query yang telah dideklarasikan
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
            // Sintaks diatas berfungsi untuk menangkap(catch) kesalahan jika terjadi
        }
        
        
    }
    
    private void CariData(){ //Method bernama CariData berfungsi untuk mencari
        // data dari tabel buku pada database praktikum_visual
        
        String searchby = by.getSelectedItem().toString(); // Mendekarasikan variabel
        // searchby bertipe data string dan mengambil values yang telah dipilih
        // pada jComboBox bernama by
        
        try{
            String sql = "SELECT * FROM buku WHERE "+searchby+" LIKE '%"+txtsearch.getText()+"%'";
            // Query sql yang digunakan untuk menampilkan semua data pada tabel buku
            // dengan kondisi nilai variabel searchby sama dengan nilai yang ditulis
            // pada jTextField bernama txtsearch
            
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            ResultSet rss=stt.executeQuery(sql);
            // Sintaks diatas bertujuan untuk mengeksekusi query yang telah
            // dideklarasikan sebelumnya, dan juga menampung data dari database
            // yang telah terkoneksi
            
            while(rss.next()){ // Melakukan perulangan ResulSet dari variabel rss
            // dan akan berhenti jika tidak terpenuhi lagi
            
              // Menampilkan data sesuai array
              Object[] o=new Object[4];
              o[0] = rss.getString("judul"); // Data hasil eksekusi pada kolom judul di tabel buku dimasukkan kedalam object o
              o[1] = rss.getString("penulis"); // Data hasil eksekusi pada kolom penulis di tabel buku dimasukkan kedalam object o
              o[2] = rss.getInt("harga"); // Data hasil eksekusi pada kolom harga di tabel buku dimasukkan kedalam object o
              o[3] = rss.getInt("id"); // Data hasil eksekusi pada kolom id di tabel buku dimasukkan kedalam object o
              model.addRow(o); // Kemudian data tersebut dimasukkan kedalam jTable, data tersebut adalah
              // data yang telah dicari pada jTextfield txtsearch
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());}
            // Sintaks diatas berfungsi untuk menangkap(catch) kesalahan jika terjadi
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtjudul = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        combopenulis = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        no_id = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        by = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel1.setText("FORM DATA BUKU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setText("Judul");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("Penulis");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("Harga");

        txtjudul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjudulKeyPressed(evt);
            }
        });

        txtharga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthargaMouseClicked(evt);
            }
        });

        combopenulis.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        combopenulis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Olivia Angelica", "Tere Liye", "W.S. Rendra", "Felix Siauw", "Asma Nadia", "Dewi Lestari" }));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel7.setText("Rp.");

        no_id.setForeground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtjudul)
                    .addComponent(combopenulis, 0, 206, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtharga)))
                .addGap(30, 30, 30)
                .addComponent(no_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(no_id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combopenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new java.awt.GridLayout());

        btnsimpan.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel5.add(btnsimpan);

        btnubah.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });
        jPanel5.add(btnubah);

        btnhapus.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel5.add(btnhapus);

        btnkeluar.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel5.add(btnkeluar);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        jLabel5.setText("Search :");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel6.setText("By :");

        by.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Judul", "Penulis", "Harga" }));

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(by, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjudulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjudulKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            txtharga.requestFocus();
        //Sintaks diatas berfungsi jika kursor berada pada jTextfield txtjudul, kemudian ditekan tombol Enter pada keyboard
        // maka kursor akan berpindah ke jTextfield txtharga
        }
    }//GEN-LAST:event_txtjudulKeyPressed

    private void txthargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthargaMouseClicked

    }//GEN-LAST:event_txthargaMouseClicked

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // Jika penekanan keyboard pada jTextfield txtsearch dilepas, maka akan
        model.getDataVector().removeAllElements(); // Mendeklarasikan model yang
        // mengambil data vector dan menghapus semua element
        model.fireTableDataChanged(); // Mendeklarasikan model yang ada di fireTableDataChanged
        CariData(); // Memanggil method CariData dan menjalankan fungsinya
    }//GEN-LAST:event_txtsearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Jika jTable1 di klik maka akan mengaktifkan jButton btnubah dan btnhapus
        btnubah.setEnabled(true);
        btnhapus.setEnabled(true);
        
        // Jika jTable1 diklik maka akan mengambil values pada jTable1
        int baris = jTable1.getSelectedRow(); // Mendeklarasikan variabel baris bertipe data integer, kemudian mengambil baris yang dipilih
        String judul=jTable1.getValueAt(baris, 0).toString(); // Mendeklarasikan variabel judul bertipe data string, kemudian mengambil valuenya di jTable1 pada baris array ke 0
        String penulis=jTable1.getValueAt(baris, 1).toString(); // Mendeklarasikan variabel penulis bertipe data string, kemudian mengambil valuenya di jTable1 pada baris array ke 1
        String harga=jTable1.getValueAt(baris, 2).toString(); // Mendeklarasikan variabel harga bertipe data string, kemudian mengambil valuenya di jTable1 pada baris array ke 3
        String idno = jTable1.getValueAt(baris, 3).toString(); // // Mendeklarasikan variabel idno bertipe data string, kemudian mengambil valuenya di jTable1 pada baris array ke 4

        no_id.setText(idno); // Menyetting jTexfield no_id dengan value pada variabel idno
        txtjudul.setText(judul); // Menyetting jTexfield txtjudul dengan value pada variabel judul
        combopenulis.setSelectedItem(penulis); // Menyetting JComboBox com dengan value pada variabel penulis
        txtharga.setText(harga); // Menyetting jTexfield txtharga dengan value pada variabel harga
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered

    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
        // Jika penekanan tombol keyboard pada jTable1 dilepas maka menjalankan fungsi
        // sintaks dibawah, dan penjelasan dari sintaks dibawah sama dengan sebelumnya
        // pada private void jTable1MouseClicked, jadi saya tidak perlu menjelaskannya lagi
        
        int baris = jTable1.getSelectedRow();
        String judul = jTable1.getValueAt(baris, 0).toString();
        String penulis = jTable1.getValueAt(baris, 1).toString();
        String harga = jTable1.getValueAt(baris, 2).toString();
        String idno = jTable1.getValueAt(baris, 3).toString();

        no_id.setText(idno);
        txtjudul.setText(judul);
        combopenulis.setSelectedItem(penulis);
        txtharga.setText(harga);
    }//GEN-LAST:event_jTable1KeyReleased

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(0); // Jika event aksi terjadi pada jButton btnkeluar maka
        //akan menghentikan dan menutup program secara normal 
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        //Jika event aksi terjadi pada jButton btnhapus, maka
        HapusData(); // memanggil method HapusData dan menjalankan fungsinya
        model.getDataVector().removeAllElements(); // Mendeklarasikan model yang
        // mengambil data vector dan menghapus semua element
        model.fireTableDataChanged(); // Mendeklarasikan model yang ada di fireTableDataChanged

        TampilData(); // Memannggil method TampilData dan menjalankan fungsinya
        txtjudul.setText(""); // Menyeting text kosong ("") pada jTextfield txtjudul
        txtharga.setText(""); // Menyeting text kosong ("") pada jTextfield txtharga
        btnubah.setEnabled(false); // Me-non aktifkan jButton btnubah
        btnhapus.setEnabled(false); // Me-non aktifkan jButton btnhapus
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        //Jika event aksi terjadi pada jButton btnubah maka akan 
        model.getDataVector().removeAllElements(); // Mendeklarasikan model yang
        // mengambil data vector dan menghapus semua element
        model.fireTableDataChanged(); // Mendeklarasikan model yang ada di fireTableDataChanged
        
        UpdateData(); // Memannggil method UpdateData dan menjalankan fungsinya
        TampilData(); // Memannggil method TampilData dan menjalankan fungsinya
        txtjudul.setText(""); // Menyeting text kosong ("") pada jTextfield txtjudul 
        txtharga.setText(""); // Menyeting text kosong ("") pada jTextfield txtharga
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // Jika event aksi terjadi pada jButton btnsimpan maka akan
        TambahData(); // Memannggil method TambahData dan menjalankan fungsinya
       
        model.getDataVector().removeAllElements(); // Mendeklarasikan model yang
        // mengambil data vector dan menghapus semua element
        model.fireTableDataChanged(); // Mendeklarasikan model yang ada di fireTableDataChanged
        
        TampilData(); // Memannggil method TampilData dan menjalankan fungsinya
        txtjudul.setText(""); // Menyeting text kosong ("") pada jTextfield txtjudul 
        txtharga.setText(""); // Menyeting text kosong ("") pada jTextfield txtharga
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Jika komponen pada form tertampil maka akan
        InitTable(); // Memannggil method InitTable dan menjalankan fungsinya
        TampilData(); // Memannggil method TampilData dan menjalankan fungsinya
    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Jika Form window telah terbuka maka akan
        btnubah.setEnabled(false); // Me-non aktifkan jButton btnubah
        btnhapus.setEnabled(false); // Me-non aktifkan jButton btnhapus
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Jika Form window sedang ditutup maka akan menjalankan fungsi dibawah, yaitu
        // menyeting default close operation untuk tidak bisa menutup form window
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JComboBox<String> by;
    private javax.swing.JComboBox<String> combopenulis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel no_id;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
