import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float h;

    public HinhTru()
    {
      ten = "Hinh Tru";
    }

    public void NhapChieuCao()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chieu Cao : ");
        h = scanner.nextInt();
    }

    public void TinhTheTich()
    {
        tt = ( PI * r * r )* h;
    }
}
