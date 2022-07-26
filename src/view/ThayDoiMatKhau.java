package view;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ThayDoiMatKhau extends javax.swing.JFrame {

    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://DESKTOP-J1UDNQI:1433;databaseName=DANGNHAP";
    String user = "sa";
    String password = "sa";
    Statement st;
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    ResultSet rs3;

    public ThayDoiMatKhau() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        BtnDoiMatKhau = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        pwfPW = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        pwfNewPW = new javax.swing.JPasswordField();
        pwfNewPW2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("THAY ĐỔI THÔNG TIN");

        jLabel2.setText("Tài khoản");

        jLabel3.setText("Mật khẩu");

        jLabel4.setText("Mật khẩu mới");

        jLabel5.setText("Nhập lại mật khẩu");

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/User-Interface-Login-icon.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        BtnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/change-password-icon.png"))); // NOI18N
        BtnDoiMatKhau.setText("Thay đổi");
        BtnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDoiMatKhauActionPerformed(evt);
            }
        });

        jLabel6.setText("Gmail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnDangNhap))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pwfPW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtGmail)
                                .addComponent(pwfNewPW, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pwfNewPW2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(BtnDoiMatKhau)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwfPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwfNewPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pwfNewPW2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(BtnDoiMatKhau))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        new DangNhapView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void BtnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-J1UDNQI\\MSSQLSERVER01:"
                    + "1433;databaseName=DANGNHAP;"
                    + "user=sa;password=sa;encrypt=true;trustServerCertificate=true;");
            String sql = "select * from account where USERNAME=? and PASS=?";
            String sql1 = "select * from tkAdmin where taikhoan=? and matkhau=?";
            PreparedStatement ps = conn.prepareCall(sql);
            PreparedStatement ps1 = conn.prepareCall(sql1);
            ps.setString(1, txtUser.getText());
            ps.setString(2, pwfPW.getText());
            ps1.setString(1, txtUser.getText());
            ps1.setString(2, pwfPW.getText());
            rs = ps.executeQuery();
            rs1 = ps1.executeQuery();
            if (txtUser.getText().equals("") | pwfPW.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập user hoặc pass");

            } else if (rs1.next()) {
                if (pwfNewPW.getText().isBlank() | pwfNewPW2.getText().isBlank()) {
                    JOptionPane.showMessageDialog(this, "Chưa nhập mật khẩu mới");
                    return;
                } else {
                    String sql2 = "update tkAdmin set matkhau=? where taikhoan = ?";
                    PreparedStatement ps2 = conn.prepareCall(sql2);
                    ps2.setString(2, txtUser.getText());
                    ps2.setString(1, pwfNewPW.getText());
                    rs2 = ps2.executeQuery();
                    JOptionPane.showMessageDialog(this, "Thay đổi mật khẩu thành công");
                }
            } else if (rs.next()) {
                if (pwfNewPW.getText().isBlank() | pwfNewPW2.getText().isBlank()) {
                    JOptionPane.showMessageDialog(this, "Chưa nhập mật khẩu mới");
                    return;
                } else {
                    String sql3 = "update account set PASS=? confirm=? where USERNAME = ?";
                    PreparedStatement ps3 = conn.prepareCall(sql3);
                    ps3.setString(3, txtUser.getText());
                    ps3.setString(2, pwfNewPW.getText());
                    ps3.setString(1, pwfNewPW.getText());
                    rs3 = ps3.executeQuery();
                    JOptionPane.showMessageDialog(this, "Thay đổi mật khẩu thành công");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Thay đổi mật khẩu thành công");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnDoiMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThayDoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDoiMatKhau;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pwfNewPW;
    private javax.swing.JPasswordField pwfNewPW2;
    private javax.swing.JPasswordField pwfPW;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
