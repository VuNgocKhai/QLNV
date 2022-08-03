
package model;

import java.util.ArrayList;
import java.util.List;
import repository.TaiKhoanRepository;


public class TaiKhoanDao {
    private TaiKhoanRepository taiKhoanRepository = new TaiKhoanRepository();
    
    public List<TaiKhoan> TaiKhoanDao(){
        return this.taiKhoanRepository.layHetTaiKhoan();
    } 
    
    public Boolean checkLogin(String userName, String pass){
        List<TaiKhoan> list = taiKhoanRepository.layHetTaiKhoan();
        for(TaiKhoan us: list){
            if(us.getTaiKhoan().equals(userName)&& us.getMatKhau().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
