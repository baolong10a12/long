package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập một số nguyên: ");
	        int number = scanner.nextInt();

	        if (number > 0) {
	            System.out.println("Số nguyên dương.");
	        } else if (number < 0) {
	            System.out.println("Số nguyên âm.");
	        } else {
	            System.out.println("Số bằng 0.");
	        }
	}

}


