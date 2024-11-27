package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên a và b
        System.out.print("10 ");
        int a = scanner.nextInt();
        System.out.print("5 ");
        int b = scanner.nextInt();

        // Tính tổng, hiệu, tích, thương
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = 0;
        if (b != 0) {
            thuong = a / b;
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        // Khai báo biến c
        boolean c;
        
        // So sánh a và b
        c = a > b;
        System.out.println("a > b: " + c);
        
        c = a < b;
        System.out.println("a < b: " + c);
        
        c = a >= b;
        System.out.println("a >= b: " + c);
        
        c = a <= b;
        System.out.println("a <= b: " + c);
        
        c = a == b;
        System.out.println("a == b: " + c);
        
        c = a != b;
        System.out.println("a != b: " + c);

      
        
	}

}
