package basic.dev;

import java.util.Scanner;

public class MainApp6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba số này tạo thành một tam giác.");
        } else {
            System.out.println("Ba số này không tạo thành một tam giác.");
        }
	}

}


