package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        if(a > 5) {
        	System.out.println("A Lon hon 5");
            System.out.println("Hien thi trong cau lenh if");
        }else {
        	System.out.println("A khong lon hon 5");
     	}
        
        System.out.println("Ket thuc chuong trinh");
	}

}


