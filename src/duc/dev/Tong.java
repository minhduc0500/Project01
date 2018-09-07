package duc.dev;

import java.util.Scanner;

public class Tong {
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.printf("nhap so nguyen n = ");
		 int n = scanner.nextInt();
		 int tong = 0;
		 for (int i=1 ; i<=n; i++) {
			    tong = tong + i;
		 }
		  System.out.printf(" tong la "+tong);
	 }

}

