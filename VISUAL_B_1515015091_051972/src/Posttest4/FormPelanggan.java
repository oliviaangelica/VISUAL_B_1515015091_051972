/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest4;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author OLIVIA
 */
public class FormPelanggan extends javax.swing.JFrame {
    public int Beratt;
    
    public FormPelanggan() {
        initComponents();
        
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtberat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        diskon = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nilaidiskon = new javax.swing.JLabel();
        reg = new javax.swing.JRadioButton();
        expr = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        proses = new javax.swing.JButton();
        ulangi = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel1.setText("> FORM PELANGGAN <");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel6KeyTyped(evt);
            }
        });

        jLabel2.setText("Nama");

        txtnama.setText("jTextField1");
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnamaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnamaKeyTyped(evt);
            }
        });

        jLabel3.setText("No.Telepon");

        txtno.setText("jTextField2");
        txtno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnoMouseClicked(evt);
            }
        });
        txtno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnoKeyTyped(evt);
            }
        });

        jLabel4.setText("Berat Barang");

        txtberat.setText("     0");
        txtberat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtberatMouseClicked(evt);
            }
        });
        txtberat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtberatKeyTyped(evt);
            }
        });

        jLabel5.setText("Kg");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnama)
                    .addComponent(txtno)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(0, 156, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        diskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                diskonStateChanged(evt);
            }
        });

        jLabel6.setText("Atur Diskon");

        jLabel8.setText("Jenis Jasa");

        nilaidiskon.setText("50");

        buttonGroup1.add(reg);
        reg.setText("Reguler");

        buttonGroup1.add(expr);
        expr.setText("Express");

        jLabel9.setText("Total Harga");

        txtharga.setText("jTextField4");

        jLabel7.setText("%");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nilaidiskon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expr))
                            .addComponent(jLabel9)
                            .addComponent(txtharga))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diskon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nilaidiskon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg)
                    .addComponent(expr))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        proses.setText("Proses");
        proses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prosesMouseEntered(evt);
            }
        });
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        ulangi.setText("Ulangi");
        ulangi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ulangiMouseClicked(evt);
            }
        });
        ulangi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulangiActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(204, 0, 51));
        keluar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("X");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(keluar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(proses)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ulangi)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proses)
                    .addComponent(ulangi))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cek() {
    try{
   Beratt = Integer.parseInt(txtberat.getText());}
    catch (NumberFormatException e) {
               txtberat.setText("0");
       }
     if (txtnama.getText().equals("")||txtno.getText().equals("") || Beratt<=0 || txtberat.getText().equals("")){
       proses.setEnabled(false); }
     else { proses.setEnabled(true);} 
}  
    
    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
         System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtnama.setText("");
        txtno.setText("");
        txtharga.setText("");
        nilaidiskon.setText(""+diskon.getValue());
        diskon.setValue(50);
        txtharga.setEditable(false);
        proses.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
           txtno.requestFocus();
           txtno.setText("+628");
       }
    }//GEN-LAST:event_txtnamaKeyPressed

    private void txtnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoKeyPressed
       if(evt.getKeyCode()==evt.VK_ENTER){
           txtberat.requestFocus();
           txtberat.setText("");
       }
    }//GEN-LAST:event_txtnoKeyPressed

    private void diskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_diskonStateChanged

       nilaidiskon.setText(""+diskon.getValue());
       
    }//GEN-LAST:event_diskonStateChanged

    private void ulangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulangiActionPerformed
        txtnama.setText("");
        txtno.setText("");
        txtberat.setText("0");
        txtharga.setText("");
        nilaidiskon.setText(""+diskon.getValue());
        diskon.setValue(50);
        buttonGroup1.clearSelection();
        proses.setEnabled(false);
    }//GEN-LAST:event_ulangiActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
         try{
        Beratt = Integer.parseInt(txtberat.getText());
               } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(this, "isi dulu / \nMasukkan Data yang valid","konfirmasi",JOptionPane.INFORMATION_MESSAGE);
            return;
       }
         int regu=0,exp=0;
        int Berat = Integer.parseInt(txtberat.getText());
        double Diskon =(double)diskon.getValue()/100;
        regu=(11500*Berat);
        exp=(int) (regu*1.5);
        if (reg.isSelected()==true){
            double total = regu-(regu*Diskon);
            txtharga.setText(String.valueOf(total));
        }
        if (expr.isSelected()==true){
            double total = exp-(exp*Diskon);
            txtharga.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_prosesActionPerformed

    private void txtnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoKeyTyped
     
    }//GEN-LAST:event_txtnoKeyTyped

    private void ulangiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulangiMouseClicked
   
    }//GEN-LAST:event_ulangiMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel6KeyTyped
       
    }//GEN-LAST:event_jPanel6KeyTyped

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
     this.cek();
    }//GEN-LAST:event_jPanel6MouseEntered

    private void prosesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prosesMouseEntered
     this.cek();
    }//GEN-LAST:event_prosesMouseEntered

    private void txtnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyTyped
         
    }//GEN-LAST:event_txtnamaKeyTyped

    private void txtberatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtberatKeyTyped
 
    }//GEN-LAST:event_txtberatKeyTyped

    private void txtnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnoMouseClicked
        txtno.setText("+628");
    }//GEN-LAST:event_txtnoMouseClicked

    private void txtberatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtberatMouseClicked
        txtberat.setText("");
    }//GEN-LAST:event_txtberatMouseClicked

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
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSlider diskon;
    private javax.swing.JRadioButton expr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton keluar;
    private javax.swing.JLabel nilaidiskon;
    private javax.swing.JButton proses;
    private javax.swing.JRadioButton reg;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JButton ulangi;
    // End of variables declaration//GEN-END:variables
        }
