/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;
import utility.JDBCHelper;

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
    
    public void thayDoiTaiKhoan(TaiKhoan tk) {
        String taiKhoan = tk.getTaiKhoan();
        String mk = tk.getMatKhau();
        String mail = tk.getGmail();
        
        String sql = "update ACCOUNT set GMAIL = ?, PASS = ?\n" +
"where USERNAME = ?";
        jDBCHelper.executeUpdate(sql, mail, mk, taiKhoan);
    
    }
    
}
