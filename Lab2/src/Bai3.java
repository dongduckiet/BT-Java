import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban : ");
        String ten = scanner.nextLine();
        
        System.out.print("Nhap nam sinh cua ban : ");
        int namSinh = scanner.nextInt();
        
        int namHienTai = 2024;
        int tuoi = namHienTai - namSinh;
         
            if (tuoi < 16) 
            {
                System.out.println("ban " + ten + " o do tuoi vi thanh nien");
            } 
            else if (tuoi >= 16 && tuoi < 18) 
            {
                System.out.println("ban " + ten + " o do tuoi truong thanh");
            } 
            else 
            {
                System.out.println("ban " + ten + " da gia");
            }
       
    }
}
