/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import model.TaiKhoan;
import repository.TaiKhoanRepository;

/**
 *
 * @author acer
 */
public class TaiKhoanServices {
    private TaiKhoanRepository taiKhoanRepository;
    
    public TaiKhoanServices() {
        taiKhoanRepository = new TaiKhoanRepository();
    }
    public List<TaiKhoan> layTatCaTaiKhoan() {
        return this.taiKhoanRepository.layHetTaiKhoan();
    }
    public void suaTaiKhoan(TaiKhoan tk) {
         this.taiKhoanRepository.thayDoiTaiKhoan(tk);
    }
}
