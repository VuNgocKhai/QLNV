
package model;

import java.util.ArrayList;


public class TaiKhoanDao {
    ArrayList<TaiKhoan> list = new ArrayList<>();
    
    public TaiKhoanDao(){
        list.add(new TaiKhoan("admin","12345","admin@gmail"));
        list.add(new TaiKhoan("abc","12345","abc@gmail"));
        list.add(new TaiKhoan("abcd","12345","abc@gmail"));
    } 
    
    public Boolean checkLogin(String userName, String pass){
        for(TaiKhoan us: list){
            if(us.getTaiKhoan().equals(userName)&& us.getMatKhau().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
