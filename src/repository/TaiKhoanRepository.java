/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;
import utility.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class TaiKhoanRepository {
    private List<TaiKhoan> listTaiKhoans;
    private JDBCHelper jDBCHelper;

    public TaiKhoanRepository() {
        this.listTaiKhoans = new ArrayList<>();
        this.jDBCHelper = new JDBCHelper();
    }
    
    
    public List<TaiKhoan> layHetTaiKhoan() {
        String sql = "select * from ACCOUNT";
        ResultSet rs = this.jDBCHelper.executeQuery(sql);
        try {
            while(rs.next()) {
                String user = rs.getString("USERNAME");
                String pass = rs.getString("PASSWORD");
                String mail = rs.getString("MAIL");
                
                listTaiKhoans.add(new TaiKhoan(user, pass, mail));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listTaiKhoans;
    }
    
    public void thayDoiTaiKhoan(TaiKhoan tk) {
        String taiKhoan = tk.getTaiKhoan();
        String mk = tk.getMatKhau();
        String mail = tk.getGmail();
        Integer row;
        
        String sql = "update ACCOUNT set PASSWORD = ?\n" +
"where USERNAME = ? and PASSWORD = ?";
        jDBCHelper.executeUpdate(sql, mail,taiKhoan , mk);
    
    }
    
    public Integer themTaiKhoan(TaiKhoan tk) {
            String sql = "insert into ACCOUNT values(?, ?, ?)";
            Integer row = jDBCHelper.executeUpdate(sql, tk.getTaiKhoan(), tk.getMatKhau(), tk.getGmail());
            return row;
        }
    
    
    
}
