import java.util.Scanner;

public class HinhTron extends HinhHoc {
  public float r;

  public HinhTron()
  {
    ten = "Hinh Tron";
  }

  public void NhapBanKinh()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("r = ");
    r = scanner.nextFloat(); 
  }

  public void TinhChuvi()
  {
    cv = 2 * PI * r; 
  }

  public void TinhDientich()
  {
    dt = PI * r * r;
  } 

}

