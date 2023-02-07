package QUE1E;

import java.util.Arrays;
import java.util.Scanner;

public class QUE1E {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test++) {
			int n = sc.nextInt();
			int[] A = new int[n];
			for (int i = 0; i < n; i++) {
				A[i] = sc.nextInt();
			}
			
			int max = A[0];
			for (int i = 1; i< n; i++) {
				if (A[i] > max) max = A[i];
			}
			int[] B = new int[max+1];
			for (int i = 0; i < n; i++) {
				B[A[i]] = sc.nextInt();
			}
			Arrays.sort(A);

			int[] C = new int[n];
			for (int i = 0; i <n; i++) {
				C[i] = -1;
			}
			for (int i = 0; i < n; i++) {
				int j =0;
				while (B[A[i]]>=0) {
					if (B[A[i]] == 0 && C[j] == -1) {
						C[j] = A[i];
						break;
					} else if (B[A[i]] == 0 && C[j] != -1) {
						j++;
					} else if (B[A[i]] > 0 && C[j] == -1) {
						j++;
						B[A[i]]--;
					} else if (B[A[i]] > 0 && C[j] != -1) {
						j++;
					}			
				}
			}
			for (int i = 0; i< n; i++) {
				System.out.print(C[i]+" ");
			}
			System.out.println();
		}
	}
}
