/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connect.koneksibos;
import java.awt.HeadlessException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Roger Simanjuntak
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    //user variable nya guys
 
    public static String namaPanjang;
    public static String namaPanggilan;
    public static String Pin;
  

    
    
   

    
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    private void clear()
    {
     jnorek.setText("");
     jNamaL.setText("");
     jNamaP.setText("");
     jPinReg.setText("");
    }
    private void add() {
        
        //katanya buat declare variable nya guys
        String no_rekening = jnorek.getText();
        String namaL = jNamaL.getText();
        String namaP = jNamaP.getText();
        String PIN1 = String.valueOf(jPinReg.getPassword());
        if(jPinReg.getText().isEmpty()|| jNamaP.getText().isEmpty()||jNamaL.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Jangan Kosong ygy");
        }
        else
        {
            try
                    {      
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");
                        PreparedStatement Add = con.prepareStatement("insert into accounttable values (?,?,?,?,?)");
                        Add.setInt(1, Integer.valueOf(no_rekening));
                        Add.setString(2, namaL);
                        Add.setString(3, namaP);
                        Add.setInt(4, Integer.valueOf(PIN1));
                        Add.setInt(5,0);
                        int row = Add.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Akun Tersimpan");
                        con.close();
                        clear();
                        new Login().setVisible(true);
                        this.dispose();
                        
                        
                    }catch (Exception e ){
                        JOptionPane.showMessageDialog(this, e);
                    }
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jNamaP = new javax.swing.JTextField();
        jnorek = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jNamaL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtondaftar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPinReg = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        KeluarMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 204, 51));
        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Daftarkan diri dengan Hati-hati!!!");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nomor Rekening   :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, -1));

        jNamaP.setBackground(new java.awt.Color(255, 255, 255));
        jNamaP.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jNamaP.setForeground(new java.awt.Color(0, 0, 0));
        jNamaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamaPActionPerformed(evt);
            }
        });
        jPanel5.add(jNamaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 170, -1));

        jnorek.setBackground(new java.awt.Color(255, 255, 255));
        jnorek.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jnorek.setForeground(new java.awt.Color(0, 0, 0));
        jnorek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnorekActionPerformed(evt);
            }
        });
        jnorek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jnorekKeyTyped(evt);
            }
        });
        jPanel5.add(jnorek, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 170, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nama Lengkap      :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, 20));

        jNamaL.setBackground(new java.awt.Color(255, 255, 255));
        jNamaL.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jNamaL.setForeground(new java.awt.Color(0, 0, 0));
        jNamaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamaLActionPerformed(evt);
            }
        });
        jPanel5.add(jNamaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 170, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nama Panggilan    :");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 140, -1));

        jButtondaftar.setBackground(new java.awt.Color(51, 255, 0));
        jButtondaftar.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButtondaftar.setForeground(new java.awt.Color(0, 0, 0));
        jButtondaftar.setText("DAFTAR");
        jButtondaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondaftarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtondaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PIN                          :");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Maks Angka Sampai 6");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 20));

        jPinReg.setBackground(new java.awt.Color(255, 255, 255));
        jPinReg.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jPinReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPinRegActionPerformed(evt);
            }
        });
        jPinReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPinRegKeyTyped(evt);
            }
        });
        jPanel5.add(jPinReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 170, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Percayakan Kepada Kami,");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 190, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Anda Menabung, Kami  Kenyang");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 210, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/9631.png"))); // NOI18N
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, 80));

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 280, 330, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1091550.jpg"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Keluar dari Menu Bank ?");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 230, 20));

        KeluarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/exit_icon-icons.com_7097_10x10-removebg-preview.png"))); // NOI18N
        KeluarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarMenuMouseClicked(evt);
            }
        });
        jPanel4.add(KeluarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\9631.png")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/oogha.com_wallpaper.jpg"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeluarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_KeluarMenuMouseClicked

    private void jNamaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamaLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamaLActionPerformed

    private void jButtondaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondaftarActionPerformed
        add();    
    }//GEN-LAST:event_jButtondaftarActionPerformed

    private void jPinRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPinRegKeyTyped
    char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if (jPinReg.getText().length()>5) {
            evt.consume();
        }
    }//GEN-LAST:event_jPinRegKeyTyped

    private void jPinRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPinRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPinRegActionPerformed

    private void jNamaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamaPActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowActivated

    private void jnorekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnorekActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jnorekActionPerformed

    private void jnorekKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnorekKeyTyped
     char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if (jnorek.getText().length()>2) {
            evt.consume();
        }

    }//GEN-LAST:event_jnorekKeyTyped

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KeluarMenu;
    private javax.swing.JButton jButtondaftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNamaL;
    private javax.swing.JTextField jNamaP;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPinReg;
    private javax.swing.JTextField jnorek;
    // End of variables declaration//GEN-END:variables
}
