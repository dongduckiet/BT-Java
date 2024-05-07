package Persons;

import java.util.Scanner;

public class NhanVien extends People {
    private String ten ;
    public long luong ;
    public String TOnv;

    public String  getTen()
    {
       return ten;
    }
    public void setTen(String ten)
    {
        if  (ten == null || ten.isEmpty())
        {
            this.ten="Khong Biet";
        }
        else
        { 
           this.ten = ten;
        }
    }
    public void nhanvien()
    {

    }
    public void XuatThongTin()
    {

    }
}