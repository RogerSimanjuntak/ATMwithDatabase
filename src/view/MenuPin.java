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
import javax.swing.JOptionPane;


/**
 *
 * @author Roger Simanjuntak
 */
public class MenuPin extends javax.swing.JFrame {
    

    public static int uangTransfer = 0;
    public static int noRekening;

    

        
    

    /**
     * Creates new form MenuWithdraw
     */
    public MenuPin() {
        initComponents();
    }
    int myNorek;
    public MenuPin(int no_rek) {
        initComponents();
        myNorek = no_rek;
        GetSaldo();
    }
    Connection con = null;
    PreparedStatement pst = null,Pst1=null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null,St1=null;
    int oldSaldo;
    int saldoOrang;
    int norek;
    
    
    private void GetSaldo()
    {
        
    String Query = "select * from accounttable where no_rek='"+myNorek+"'" ;
        try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");  
         St1 = con.createStatement();
         Rs1 = St1.executeQuery(Query);
         if(Rs1.next()){
            oldSaldo = Rs1.getInt(5);
            norek =Rs1.getInt(1);
            
               
         }else
         {
         //   JOptionPane.showMessageDialog(this, "Nomor Rekening atau PIN salah");
         }
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KeluarMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        newPin = new javax.swing.JTextField();
        jLabelUang = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        newPin2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLanjut = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\9631.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Keluar dari Menu Bank ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 230, 20));

        KeluarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/exit_icon-icons.com_7097_10x10-removebg-preview.png"))); // NOI18N
        KeluarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarMenuMouseClicked(evt);
            }
        });
        jPanel1.add(KeluarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/oogha.com_wallpaper.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHANGE PIN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ganti Pin anda dengan benar");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/oogha.com_wallpaper.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 500, 80));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kembali");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/output-onlinegiftools (5).gif"))); // NOI18N
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 70, 40));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ke Menu utama");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, 20));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 80));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 210, 80));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newPin.setBackground(new java.awt.Color(255, 255, 255));
        newPin.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        newPin.setForeground(new java.awt.Color(51, 255, 0));
        newPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPinMouseClicked(evt);
            }
        });
        newPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPinActionPerformed(evt);
            }
        });
        newPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newPinKeyTyped(evt);
            }
        });
        jPanel2.add(newPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, 110));

        jLabelUang.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelUang.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUang.setText("NEW PIN");
        jPanel2.add(jLabelUang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\5570863.jpg")); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 180));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 180));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newPin2.setBackground(new java.awt.Color(255, 255, 255));
        newPin2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        newPin2.setForeground(new java.awt.Color(51, 255, 51));
        newPin2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPin2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newPin2KeyTyped(evt);
            }
        });
        jPanel7.add(newPin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 100));

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("CONFIRM PIN");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\5570863.jpg")); // NOI18N
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 180));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 360, 180));

        jLanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLanjutMouseClicked(evt);
            }
        });
        jLanjut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LANJUTKAN");
        jLanjut.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Change Pin");
        jLanjut.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\Downloads\\ezgif.com-gif-maker (8).gif")); // NOI18N
        jLanjut.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLanjut.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 80));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/green-gae6d3a0c0_1920.jpg"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jLanjut.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 80));

        jPanel6.add(jLanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 230, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Anda Menabung, Kami  Kenyang");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 210, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/9631.png"))); // NOI18N
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, 80));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Percayakan Kepada Kami,");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 190, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1091550.jpg"))); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 820, 510));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    private void add(){
        if(newPin.getText().isEmpty() || newPin2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Masukkan Pin dengan benar");
        }else if(!newPin.getText().equals(newPin2.getText()) ){
            JOptionPane.showMessageDialog(this,"Pin kamu tidak sama");  
        }else{
             try{
            String Query = "Update accounttable set pin1=?  where no_rek=? ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,Integer.valueOf(newPin.getText()));
            ps.setInt(2, myNorek);

   
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Pin Berhasil Terganti");
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
    
    
   
    private void KeluarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_KeluarMenuMouseClicked

    private void newPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPinActionPerformed
    
    }//GEN-LAST:event_newPinActionPerformed

    private void newPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPinMouseClicked
    newPin.setText("");
    }//GEN-LAST:event_newPinMouseClicked

    private void newPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPinKeyTyped
    char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if (newPin.getText().length()>5) {
            evt.consume();
        }
        
    }//GEN-LAST:event_newPinKeyTyped

    private void jLanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLanjutMouseClicked
        
    }//GEN-LAST:event_jLanjutMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
    
    }//GEN-LAST:event_jLabel16MouseClicked

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

    private void newPin2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPin2KeyTyped
             char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        if (newPin2.getText().length()>5) {
        evt.consume();
        }
        
    }//GEN-LAST:event_newPin2KeyTyped
   
   
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
            java.util.logging.Logger.getLogger(MenuPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KeluarMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUang;
    private javax.swing.JPanel jLanjut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField newPin;
    private javax.swing.JTextField newPin2;
    // End of variables declaration//GEN-END:variables
}
