package SUMPROE;

import java.util.Scanner;

public class SUMPROE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int i = 0 ; i < numTest ; i++) {
			int a = scanner.nextInt();
			long sum = 0;
			for (int j = 1; j <= a; j ++) {
				sum = sum + a/j*j;
			}
			System.out.println(sum%1000000007);
		}		
	}
}
