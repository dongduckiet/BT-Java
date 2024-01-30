import java.util.Scanner;

public class Slide40 {

     public static void main(String[] args) {
        date();
     }
     public static void date(){
        Scanner scanner = new Scanner(System.in);
           int n;
           System.out.println("Moi nhap so Ngay : ");
           n =scanner.nextInt();
           
           if (n<1||n>8)
            {
             System.out.println("Moi nhap lai ");
            }
           else
            {
                if (n == 1)
                {
                   System.out.println("Hom nay la thu Hai");
                }
                if (n == 2)
                {
                   System.out.println("Hom nay la thu Ba");
                }
                if (n == 3) 
                {
                  System.out.println("Hom nay la thu Tu ");      
                }
                if (n == 4) 
                {
                  System.out.println("Hom nay la thu Nam ");      
                }
                if (n == 5)
                {
                   System.out.println("Hom nay la thu Sau");
                }
                if (n == 6)
                {
                   System.out.println("Hom nay la thu Bay");
                }
                if (n == 7) 
                {
                  System.out.println("Hom nay la SunDay ");      
                }

            }  
        }
}
