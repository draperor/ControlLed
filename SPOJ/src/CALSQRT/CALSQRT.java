package CALSQRT;

import java.util.Scanner;

public class CALSQRT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int i = 0; i < numTest; i++) {
			System.out.println("#"+(i+1)+" "
		+ (int)Math.sqrt(scanner.nextInt()));
		}
	}
}
