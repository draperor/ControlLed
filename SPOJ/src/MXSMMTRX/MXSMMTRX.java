package MXSMMTRX;

import java.util.Scanner;

public class MXSMMTRX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test++) {
			int N = sc.nextInt();
			int[][] A = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j =0; j<N; j++) {
					A[i][j] = sc.nextInt();
				}	
			}
			int[][] sum = new int[2][N+1];
			
			for (int i =0; i< N; i++) {
				for (int j =0; j<N; j++) {
					sum[0][i] += A[i][j];
					sum[1][j] += A[i][j];
					if (i==j)sum[0][N] += A[i][j];
					if (i+j==N-1) sum[1][N] += A[i][j]; 
				}
			}
			int max =0;
			for (int i =0; i < 2;i++) {
				for (int j =0; j<N+1; j++) {
					if (max < sum[i][j]) max =sum[i][j];
				};
			}
			System.out.println("#"+(test+1)+" "+max);
		}
	}
}
