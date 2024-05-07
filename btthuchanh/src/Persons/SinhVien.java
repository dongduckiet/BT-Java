package Persons;

import java.util.Scanner;

public class SinhVien extends People{
    public float msv;
    public float g;
    public SinhVien()
    {
        HoTen = "Nguyen Van A";
    }

    public void NhapThongTin()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tuoi : ");
        Tuoi = scanner.nextInt();
        System.out.print("HoTen : ");
        HoTen = scanner.nextLine();
        
    }
    public void InThongTin()
    {
        System.out.println("Tuoi : " +Tuoi);
        System.out.println("HoTen : " +HoTen);
    } 
}
