package model;


import java.io.Serializable;

public class NhanVien implements Serializable {

    private String masv, name, email, phone, address, image;
    private boolean gender;
    private String Luong;

    public NhanVien() {
    }

    public NhanVien(String masv, String name, String email, String phone, String address, String image, boolean gender, String Luong) {
        this.masv = masv;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.image = image;
        this.gender = gender;
        this.Luong = Luong;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    public String getMasv() {
        return masv;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
