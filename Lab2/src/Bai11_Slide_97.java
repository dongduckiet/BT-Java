import java.util.Scanner;

public class Bai11_Slide_97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu mang: ");
        int n = scanner.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    int a = A[i];
                    A[i] = A[j];
                    A[j] = a;
                }
            }
        }

        System.out.print("Mang so ban dau : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Mang da sap sep : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}