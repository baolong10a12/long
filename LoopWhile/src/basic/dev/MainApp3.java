package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số tự nhiên n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i < n) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Tổng các số chia hết cho 3 và bé hơn " + n + " là: " + sum);
	}

}
