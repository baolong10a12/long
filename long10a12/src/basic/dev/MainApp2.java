package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        /**
         * 2 viet chuong trinh nhap so nguyen duong n, thong baora manhinh n la so chan hay so le
         * 
         */
		int n;
		System.out.println("nhap n");
		n =sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("so chan");
		}else {
			System.out.println("so le");
		}
	}

}
