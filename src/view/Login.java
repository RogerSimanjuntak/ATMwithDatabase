/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Roger Simanjuntak
 */
public class Login extends javax.swing.JFrame {
public static String myNama;

    
    /**
     * Creates new form NewJFrame
     */
    public Login() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JNorek = new javax.swing.JTextField();
        JPin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        ButtonMasuk = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Selamat Datang di Bank Emas");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/9631.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 88, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/oogha.com_wallpaper.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/oogha.com_wallpaper.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 800, 120));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Silahkan Akses Menggunakan Nomor Rekening dan PIN anda");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pastikan PIN Anda Terjaga Dengan Aman");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 336, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PIN                           :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nomor Rekening     :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        JNorek.setBackground(new java.awt.Color(255, 153, 51));
        JNorek.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        JNorek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JNorekKeyTyped(evt);
            }
        });
        jPanel4.add(JNorek, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 280, 40));

        JPin.setBackground(new java.awt.Color(255, 153, 51));
        JPin.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        JPin.setForeground(new java.awt.Color(255, 255, 255));
        JPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPinActionPerformed(evt);
            }
        });
        JPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JPinKeyTyped(evt);
            }
        });
        jPanel4.add(JPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 280, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Daftar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        ButtonMasuk.setBackground(new java.awt.Color(51, 255, 51));
        ButtonMasuk.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        ButtonMasuk.setForeground(new java.awt.Color(51, 51, 51));
        ButtonMasuk.setText("Masuk");
        ButtonMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMasukActionPerformed(evt);
            }
        });
        jPanel4.add(ButtonMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 280, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/5570863.jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 360));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPinActionPerformed
 
    }//GEN-LAST:event_JPinActionPerformed
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;

    private void add(){
        if(JNorek.getText().isEmpty()|| JPin.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Msukkan Nomor Rekening dan PIN");
        }else{
            
            
        String Query = "select * from accounttable where no_rek='"+JNorek.getText()+"' and  pin1="+JPin.getText()+"";
        try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");  
         St = con.createStatement();
         Rs = St.executeQuery(Query);
         if(Rs.next()){
             myNama = Rs.getString("nama_lengkap");
             new Main(Rs.getInt(1)).setVisible(true);
             
             this.dispose();   
         }else
         {
            JOptionPane.showMessageDialog(this, "Nomor Rekening atau PIN salah");
         }
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }}
    }
    private void ButtonMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMasukActionPerformed
        add();
    }//GEN-LAST:event_ButtonMasukActionPerformed
    
    private void JPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPinKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if (JPin.getText().length()>5) {
            evt.consume();
        }
    }//GEN-LAST:event_JPinKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Register rg =new Register ();
        rg.setVisible(true);
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JNorekKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JNorekKeyTyped
    char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if (JNorek.getText().length()>2) {
            evt.consume();
        }
    }//GEN-LAST:event_JNorekKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonMasuk;
    private javax.swing.JTextField JNorek;
    private javax.swing.JPasswordField JPin;
    private javax.swing.JButton jButton1;
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
    // End of variables declaration//GEN-END:variables
}
