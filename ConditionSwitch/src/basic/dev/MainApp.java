package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao thang trong nam");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch(n) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("thang co 31 ngay");	
		    break;
		case 4, 6, 9, 11:
			System.out.println("thang co 30 ngay");
		    break;
		case 2:
			System.out.println("thang co 28 ngay");
			break;
		default:
		    System.out.println("thang nhap vao khong dung");
		}
		
		System.out.println("ket thuc chuong trinh");
	}

}
