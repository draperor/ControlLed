package SMPDIV;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		
		for (int i = 0; i< numTest; i++) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			for (int j = x; j <n;j++) {
				if (j % x == 0 && j % y != 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}