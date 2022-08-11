
package model;


public class TaiKhoan {
    private String TaiKhoan;
    private String matKhau;
    private String gmail;

    public TaiKhoan() {
    }

    public TaiKhoan(String TaiKhoan, String matKhau, String gmail) {
        this.TaiKhoan = TaiKhoan;
        this.matKhau = matKhau;
        this.gmail = gmail;
    }


    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    
    

    

    
   
    
}
