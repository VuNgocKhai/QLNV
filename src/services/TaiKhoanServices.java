package services;

import java.util.List;
import model.TaiKhoan;
import repository.TaiKhoanRepository;

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
