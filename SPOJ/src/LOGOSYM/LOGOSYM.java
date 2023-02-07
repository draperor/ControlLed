package LOGOSYM;

import java.util.Scanner;

public class LOGOSYM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test++) {
			boolean isSym = true;
			int N = sc.nextInt();
			int[][] A = new int[N][N];
			int n = N%2==0 ? N/2 : N/2+1;
			int [] M1 = new int[n*n];
			int [] M2 = new int[n*n];
			int [] M3 = new int[n*n];
			int [] M4 = new int[n*n];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					M1[n*i+j] = A[i][j] ;
				}
			}
			for (int i =0; i <n; i++) {
				for (int j =0; j<n;j++) {
					M2[n*i+j] = A[i][N-1-j];
				}
			}

			for (int i =0; i < n; i++) {
				for (int j = 0; j<n; j++) {
					M3[n*i+j] = A[N-1-i][N-1-j];
				}
			}
			for (int i =0; i < n; i++) {
				for (int j = 0; j<n; j++) {
					M4[n*i+j] = A[N-1-i][j];
				}
			}
			for (int i =0 ; i < n*n ; i++) {
				if (M1[i]!= M2[i] ||
						M2[i]!= M3[i] ||
						M3[i]!= M4[i] ||
						M4[i]!= M1[i]) {
					isSym = false;
				}
			}
			if (isSym) {
				System.out.println("#"+(test+1) + " YES");
			} else System.out.println("#"+(test+1)+" NO");
		}
	}

}
