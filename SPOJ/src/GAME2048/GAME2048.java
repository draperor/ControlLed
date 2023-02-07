package GAME2048;

import java.util.Scanner;

public class GAME2048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int tc =0; tc < numTest;tc++) {
			int N = sc.nextInt();
			int [] A = new int[N];
			for (int i =0; i< N; i++) {
				A[i] = sc.nextInt();
			}
			int max =0;
			int[] B = leftShift(A);
			for (int i =0; i< B.length; i++) {
				if (max < B[i]) max =B[i];
			}
			System.out.println("#"+(tc+1)+" "+max);


		}
	}
	public static int[] leftShift(int A[]) {
		int N = A.length;
		int k =N;
		for (int i = 0; i< N-1; i++) {
			if (A[i] == A[i+1]) {
				A[i] = 2*A[i];
				for (int j=i+1; j< N-1; j++) {
					A[j] = A[j+1];
				}
				k--;
				break;
			}
		}
		int B[] = new int[k];
		for (int i =0 ; i< k; i++) {
			B[i] = A[i];
		}
		if (A.length == B.length) {
			return B;
		} else {
			return leftShift(B);
		}
	}
}
