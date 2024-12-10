package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       System.out.print("nhap truong trinh 100 so fibonacci ");
       long a = 0, b = 1;
       int i = 0;
       
       while (i <= 100 ) {
    	   System.out.print(a + " ");
    	   long temp = a + b;
    	   a = b;
    	   b = temp;
    	   
    	   i++;
       }
       System.out.print("finish");
	}

}
