package FSTDUP;

import java.util.Scanner;

public class FSTDUP {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int test = 0; test < numTest; test++) {
			int num = scanner.nextInt();
			int[] A = new int[num];
			for (int i = 0; i< num; i++) {
				A[i] = scanner.nextInt();
			}
			int max = A[0];
			for (int i= 1; i < num ; i++) {
				if (A[i] > max) max = A[i];
			}
			int[] B = new int[max + 1];
			int i = 0;
			for (i = 0; i< num; i++) {
				B[A[i]]++;
				if (B[A[i]] == 2 ) {
					System.out.print("#"+(test+1)+" "+A[i]);
					break;
				}
			}
			if(i==num) System.out.print("#"+(test+1)+" -1");
		}
	}
}
