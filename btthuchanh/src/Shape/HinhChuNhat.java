import java.util.Scanner;

public class HinhChuNhat extends  HinhHoc{
    public float a, b;

    public HinhChuNhat()
    {
      ten = "Hinh Chu Nhat";
    }

    public void NhapChieuDai()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chieu Dai : ");
        a = scanner.nextInt();
    }

    public void NhapChieuRong()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chieu Rong : ");
        b = scanner.nextInt();
    }

    public void TinhChuVi()
    {
        cv = (a + b ) * 2;
    }

    public void TinhDienTich()
    {
        dt = a * b;
    }
}
