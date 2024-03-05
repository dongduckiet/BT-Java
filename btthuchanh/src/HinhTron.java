import java.util.Scanner;

public class HinhTron {
  public float r;
  public float cv;
  public float dt;
  public final float PI = 3.14f;


  public void NhapBanKinh()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("r = ");
    r = scanner.nextFloat(); 
  }

  public void Chuvi()
  {
    cv = 2 * PI * r; 
  }

  public void Dientich()
  {
    dt = PI * r * r;
  }

}

