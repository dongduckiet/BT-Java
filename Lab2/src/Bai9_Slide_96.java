import java.util.Scanner;

public class Bai9_Slide_96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi bat ky: ");
        String inputString = scanner.nextLine();
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        
        for (int i = 0; i < inputString.length(); i++) 
        {
            char ch = inputString.charAt(i);
            if (Character.isUpperCase(ch)) 
            {
                uppercaseCount++;
            } 
            else if (Character.isLowerCase(ch)) 
            {
                lowercaseCount++;
            } 
            else if (Character.isDigit(ch)) 
            {
                digitCount++;
            }
        }
        
        System.out.println("So ky tu hoa trong chuoi : " + uppercaseCount);
        System.out.println("So ky tu thuong trong chuoi : " + lowercaseCount);
        System.out.println("So chu so trong chuoi : " + digitCount);
    }
}