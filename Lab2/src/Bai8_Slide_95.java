import java.util.Scanner;

public class Bai8_Slide_95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen n : ");
        int n = scanner.nextInt();
        int Tong = 0;
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Nhap so nguyen thu " + (i + 1) + " : ");
            int num = scanner.nextInt();
            Tong += num;
        }
        double TB = (double) Tong / n;
        System.out.println("Trung binh cong cua" + n + " so nguyen da nhap la : " + TB);
    }
}