/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Roger Simanjuntak
 */
public class MenuWithdraw extends javax.swing.JFrame {
   public MenuWithdraw() {
        initComponents();
        
    }
    //==========================================
    //MENYMPAN DATA HISTORY 
    //==========================================
    String myDate;
    public void GetDate()
    {
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
    myDate = s.format(d);
    }
    //===========================================
    //MENGAMBIL DATA NOMOR REKENING SEBELUMNYA
    //===========================================
    int myNorek;
    public MenuWithdraw(int no_rek) {
        initComponents();
        myNorek = no_rek;
        GetSaldo();
    }
    //=========================================
    //KONEKSI KE DATABASE
    //=========================================
    Connection con = null;
    PreparedStatement pst = null,Pst1=null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null,St1=null;
    //=========================================
    //UNTUK MEMANGGIL SALDO YANG TERSIMPAN
    //=========================================
    int oldSaldo;
    private void GetSaldo()
    {
    String Query = "select * from accounttable where no_rek='"+myNorek+"'";
        try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");  
         St1 = con.createStatement();
         Rs1 = St1.executeQuery(Query);
         if(Rs1.next()){
            oldSaldo = Rs1.getInt(5);
            Saldo.setText(""+oldSaldo);           
         }else
         {
         //   JOptionPane.showMessageDialog(this, "Nomor Rekening atau PIN salah");
         }
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void WIthdrawUang()
    {
        try
            
                    {      
                        GetDate();
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");
                        PreparedStatement Add = con.prepareStatement("insert into transactiontbl values (?,?,?,?) ");
                        Add.setInt(1, myNorek);
                        Add.setString(2, "Withdraw");
                        Add.setString(3,myDate );
                        Add.setString(4,jIsiUangWithdraw.getText());
                        int row = Add.executeUpdate();
                      //  JOptionPane.showMessageDialog(this, "Akun Tersimpan");
                        con.close();
                      //  clear();
                        
                    }catch (Exception e ){
                        JOptionPane.showMessageDialog(this, e);
                    }
    }
    private void add() {

     if( jIsiUangWithdraw.getText().isEmpty()|| jIsiUangWithdraw.getText().equals(0))
     {
        JOptionPane.showMessageDialog(null, "Saldo Gagal Masuk");   
     }else if(oldSaldo > Integer.valueOf(jIsiUangWithdraw.getText())){
         try{
            String Query = "Update accounttable set saldo=? where no_rek=? ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1, oldSaldo-Integer.valueOf(jIsiUangWithdraw.getText()));
            ps.setInt(2, myNorek);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "SALDO BERHASIL DITARIK");
               WIthdrawUang();
                new Login().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Ada Kesalahan Tolong diulangi lagi"); 
            }
            
            
            
         }catch (Exception e){
             JOptionPane.showMessageDialog(this, e);
             
         }
         
     }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KeluarMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jIsiUangWithdraw = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\9631.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Keluar dari Menu Bank ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 230, 20));

        KeluarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/exit_icon-icons.com_7097_10x10-removebg-preview.png"))); // NOI18N
        KeluarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarMenuMouseClicked(evt);
            }
        });
        jPanel1.add(KeluarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/oogha.com_wallpaper.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jumlah uang");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 30));

        jIsiUangWithdraw.setBackground(new java.awt.Color(255, 255, 255));
        jIsiUangWithdraw.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jIsiUangWithdraw.setForeground(new java.awt.Color(51, 255, 0));
        jIsiUangWithdraw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jIsiUangWithdraw.setText("0");
        jIsiUangWithdraw.setAlignmentX(0.0F);
        jIsiUangWithdraw.setAlignmentY(0.0F);
        jIsiUangWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIsiUangWithdrawActionPerformed(evt);
            }
        });
        jIsiUangWithdraw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIsiUangWithdrawKeyTyped(evt);
            }
        });
        jPanel2.add(jIsiUangWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 350, 80));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Withdraw");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LANJUTKAN");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 90, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ezgif.com-gif-maker (8).gif"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 70));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 40, 30));

        Saldo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Saldo.setForeground(new java.awt.Color(0, 0, 0));
        Saldo.setText("0");
        jPanel2.add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 190, 40));

        JLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(0, 0, 0));
        JLabel1.setText("Saldo Kamu  :");
        jPanel2.add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 40));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 210, 70));

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("WITHDRAW");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Menaruh Uang Secukupnya");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/background-g6c7845e9f_1920.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 410, 80));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Percayakan Kepada Kami,");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 190, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Anda Menabung, Kami  Kenyang");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 210, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/9631.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, 80));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/output-onlinegiftools (5).gif"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 70, 40));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kembali");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 60, 20));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ke Menu Utama");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 100, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 200, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\5570863.jpg")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 770, 170));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1091550.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIsiUangWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIsiUangWithdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIsiUangWithdrawActionPerformed

    private void KeluarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarMenuMouseClicked
     System.exit(0);
    }//GEN-LAST:event_KeluarMenuMouseClicked
    
    private void jIsiUangWithdrawKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIsiUangWithdrawKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jIsiUangWithdrawKeyTyped

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
     setResizable(false);
    }//GEN-LAST:event_formComponentResized

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new Main(myNorek).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    add();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuWithdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel KeluarMenu;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jIsiUangWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
