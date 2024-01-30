import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        
        while (true) 
        {
            System.out.print("Nhap mot so nguyen: ");
            int soNguyen = scanner.nextInt();
            tong += soNguyen;
            
            if (tong > 100) 
            {
                System.out.println("Tong cac so nguyen vua nhap la : " + tong);
                break;
            }
        }
    }
}
