package NUMPER;

import java.util.Scanner;

public class NUMPER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int i = 0; i < numTest; i++) {
			int count = 0;
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.print("#"+(i+1));
			for (int j = num1; j <= num2; j++) {
				if (isNumper(j)) {
					System.out.print(" "+j);
					count++;
				}
			}
			if (count==0) {
				System.out.print("NO NUMBER");
			}
		}
	}
	public static boolean isNumper(int a) {
		boolean numper = false;
		if (a!=0) {
			int sqr = (int)Math.sqrt(a);
			if (sqr*sqr==a) {
				numper = true;
			}
		}
		return numper;
	}

}
