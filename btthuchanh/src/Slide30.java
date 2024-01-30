import java.util.Scanner;

public class Slide30 {

    public static void main(String[] args) {
 int n, soDu, tong = 0;
 Scanner scanner = new Scanner(System.in);
 System.out.println("nhap vao 1 so nguyen bat ky: ");
  n = scanner.nextInt();
    while (n > 0) {
         soDu = n % 10;
        n = n / 10;
        tong += soDu;
    }
 System.out.println("tong cac chu so = " + tong);
  }
}