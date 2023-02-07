package PRIME1E;

import java.util.Scanner;

public class PRIME1E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int i = 0; i < numTest ; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			for ( int j = num1; j <= num2; j++) {
				if (isPrime(j)) {
					System.out.println(j);
				}
			}
			System.out.println();
		}
	}
	public static boolean isPrime(int a) {
		boolean prime = false;
		if (a>=2) {
			int count = 0;
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				prime = true;
			}
		}
		return prime;		
	}
}
