package PROB01;

import java.util.Scanner;

public class PROB01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int i = 0; i < numTest; i++) {
			int b = scanner.nextInt();
			int c = 0;
			while (b != 0) {
				c = c +  b%10;
				b = b/10;
				if (c>=10) {
					c = c/10+c%10;
				}
			}
			System.out.println("#"+(i+1)+" "+c);
		}
		
		
	}

}
