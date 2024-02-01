import java.util.Scanner;

public class Bai10_Slide_96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi khong qua 80 ky tu : ");
        String inputString = scanner.nextLine();
        System.out.print("Nhap vao mot chuoi ky tu bat ky : ");
        char character = scanner.next().charAt(0);
        
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) 
        {
            if (inputString.charAt(i) == character)
             {
                count++;
             }
        }
        
        System.out.println("So lan xuat hien cua ky tu " + character + " trong chuoi la : " + count);
    }
}