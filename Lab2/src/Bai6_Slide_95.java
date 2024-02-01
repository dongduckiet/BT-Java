import java.util.Scanner;

public class Bai6_Slide_95 {
    public static void main(String[] args) {
        int n, gt = 1, i =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong : ");
        n = scanner.nextInt();
        do
        {
          gt *=i; i++;
        }
        while(i<=n);
        System.out.println("giai thua thu " + n + ": " + gt);
    }
}
