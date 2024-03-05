import java.util.Scanner;

public class SinhVien {
    public int Tuoi;
    public int MaSinhVien;
    public string HoTen;

    public void Nhaptuoi()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tuoi : ");
        Tuoi = scanner.nextInt();
    }
    public void NhapMaSinhVien()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma Sinh Vien : ");
        MaSinhVien = scanner.nextInt();
    }
    public void NhapHoTen()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho Ten : ");
        string HoTen = scanner.nextLine();
    }
}
