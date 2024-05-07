import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public float a;

    public HinhVuong()
    {
        ten = " Hinh Vuong ";
    }
     
    public void NhapCanh()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Canh : ");
        a = scanner.nextInt();
    }

    public void TinhDienTich()
    {
        dt = a * a; 
    }

    public void TinhChuvi()
    {
        cv = (a + a) * 2;
    }
}
