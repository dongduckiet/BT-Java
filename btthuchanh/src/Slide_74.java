import java.util.Scanner;

public class Slide_74 {
    public static void main(String[] args) 
    {
      int n;
      Scanner scanner =new Scanner(System.in);
      do
      {
        System.out.println("Nhap vao so phan tu cua mang : ");
        n = scanner.nextInt();
      }
      while ( n<0 );
         int A[] = new int [n];
         System.out.println("Nhap cac phan tu cho mang : ");
         for( int i=0; i< n; i++)
         {
           System.out.println("Nhap phan tu thu" +i + " : ");
           A[i] = scanner.nextInt(); 
         }  
      double Tong =0;
      for(int i=0; i<n; i++)
      {
        if ( A[i] %2 ==0)
        {
            Tong+= A[i];
        }
      }
       System.out.println("Tong : " +Tong);
    }
}
