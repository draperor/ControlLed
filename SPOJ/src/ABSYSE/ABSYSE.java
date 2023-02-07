package ABSYSE;

import java.util.Scanner;

public class ABSYSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test ++ ) {
			sc.nextLine();
			String[] str = new String[5];
			for (int i =0; i < 5; i++) {
				str[i] = sc.next();
			}
			int[] A = new int[3];
			int pos = 3;
			try {
				A[0] = Integer.parseInt(str[0]);
			} catch (NumberFormatException e)
			{
				pos = 0;
			}
			try {
				A[1] = Integer.parseInt(str[2]);
			} catch (NumberFormatException e) {
				pos = 1;
			}
			try {
				A[2] = Integer.parseInt(str[4]);
			} catch (NumberFormatException e) {
				pos = 2;
			}
			
			switch (pos) {
			case 0: 
				System.out.println((A[2]-A[1])+" + "+A[1]+" = "+A[2]);
				break;
			case 1: 
				System.out.println(A[0]+" + "+(A[2]-A[0]) +" = "+A[2]);
				break;
			case 2: 
				System.out.println(A[0]+" + "+A[1]+" = "+(A[0]+A[1]));
				break;
			case 3: 
				System.out.println(A[0]+" + "+A[1]+" = "+A[2]);
				break;
			}
		}
	}

}
