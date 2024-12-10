package basic.dev;

public class MainApp2 {

	public static void main(String[] args) {
        int i = 1;
        int tong = 0;
//      i++;
        tong +=i; // tong = tong + i
        while (i <= 100) {
            i++;
            tong += i; //tong = tong + i
            System.out.print(i);
        }

        System.out.println("tong: " + tong );
	}

}