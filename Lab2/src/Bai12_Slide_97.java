import java.util.Scanner;

public class Bai12_Slide_97 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran : ");
        n = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran : ");
        m = scanner.nextInt();
        int A[] [] = new int [n] [m];


        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print("Nhap gia tri cho phan tu tai hang " + (i + 1) + " cot " + (j + 1) + ": ");
                A[i][j] = scanner.nextInt();
            }
        }

        int max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }

        System.out.println("Phan tu co gia tri lon nhat trong ma tran la : " + max);
    }
}