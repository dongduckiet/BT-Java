import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        float a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a : ");
        a =scanner.nextFloat();
        System.out.println("Nhap b : ");
        b =scanner.nextFloat();
        nn(a , b);

    }
    public static void nn(float a, float b)
    {
        if ( a > b)
         {
            System.out.println("So nho nhat trong hai so la : " + b );
         }
         else
         {
            System.out.println("So nho nhat trong hai so1 la : " + a );
         }
    }
}
