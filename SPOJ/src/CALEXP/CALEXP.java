package CALEXP;

import java.util.Scanner;

public class CALEXP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int i = 0; i < numTest; i++) {
			System.out.println("#"+(i+1)+" "
		+ (int)Math.pow(scanner.nextInt(), scanner.nextInt()));
		}
	}
}
