package MULMATRX;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class MULMATRX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test <numTest;test++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int p = sc.nextInt();
			
			int[][] A = new int[m][n];
			int[][] B = new int[n][p];
			double[][] OUT = new double[m][p];
			
			int[] H = new int[n];
			int[] C = new int[n];
			
			for (int i =0; i < m; i++) {
				for (int j =0; j < n; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			for (int i=0; i< n; i++) {
				for (int j =0; j<p; j++) {
					B[i][j] = sc.nextInt();
				}
			}
			
			
			System.out.println("#"+(test+1));
			
			for (int i=0; i< m; i++) {
				for (int j=0; j< p; j++) {
					getH(H,A,n,i);
					getC(C, B, n, j);
					OUT[i][j] = tich(H,C,n);
					System.out.print(OUT[i][j]+" ");
				}
				System.out.println();
			}
			

			
		}
	}
	static void getH(int H[],int A[][], int n, int hang) {
		for (int i = 0; i< n; i++) {
			H[i] = A[hang][i];
		}
	}
	static void getC(int C[], int B[][], int n, int cot) {
		for (int i=0; i< n; i++) {
			C[i] = B[i][cot];
		}
	}
	
	
	static double tich(int A1[], int B1[], int n) {
		double t=0;
		for (int i=0;i<n;i++) {
			t += A1[i]*B1[i];
		}
		return t;
	}

}
