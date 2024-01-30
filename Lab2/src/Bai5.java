import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        
        while (tong <= 100) {
            System.out.print("Nhap vao Mot so nguyen: ");
            int so = scanner.nextInt();
            tong += so;
        }
        
        System.out.println("Tong cua cac chu so da nhap la: " + tong);
    }
}