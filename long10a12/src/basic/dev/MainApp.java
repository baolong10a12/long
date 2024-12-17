package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *1 hay viet chuong trinh nhap 2 canh tinh dien tinh chu vi cua hinh chu nhat
		 *
		 */
       Scanner sc = new Scanner(System.in);
       int dai;
       int rong;
       System.out.println("nhap chieu rong");
       rong = sc.nextInt();
       
       System.out.println("nhap chieu dai");
       dai = sc.nextInt();
       
       int dientich = dai * rong;
       int chuvi = (dai + rong) * 2;
       
       System.out.println("dien tich:" + dientich);
       System.out.println("chu vi:" + dientich);
       
	}

}
