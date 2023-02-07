package CHKSDK;

import java.util.Scanner;

public class CHKSDK {
	static final int N = 9;
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		int [][] A = new int[N][N];	
		for (int test = 0; test < numTest; test++) {
			boolean isSDK = true;	
			for (int i = 0; i < N; i++) {
				String s = sc.next();
				for (int j = 0; j < N; j++) {
					int a = s.charAt(j) - '0';
					A[i][j] = a;
				}
			}
			// Check row
			for (int i = 0; i < N; i++) {
				if(isSDK == false) break;
				int[] C = new int[N];
				for (int j = 0; j < N; j++) {
					C[j] = A[i][j];
				}
				isSDK = check(C);
			}
			
			//Check column
			for (int i = 0; i < N; i++) {
				if(isSDK == false) break;
				int[] C = new int[N];
				for (int j = 0; j < N; j++) {
					C[j] = A[j][i];
				}
				isSDK = check(C);
			}
			
			// Check matrix 3x3
			for (int i = 0; i<3;i++) {
				if(isSDK == false) break;
				for (int j = 0; j < 3; j++) {
					int[] C = new int[N];
					for (int n = 0; n<3; n++) {
						for (int m =0; m <3; m++) {
							C[3*n+m]=A[3*i+n][3*j+m];
						}
					}
					isSDK = check(C);
					if(isSDK == false) break;
				}
			}
			int t = isSDK ? 1 : 0;
			System.out.println("#"+(test+1)+" "+t);
		}
	}
	public static boolean check(int[] A) {
		int[] B = new int[10];
		for (int i = 0; i < A.length; i++) {
			if(A[i]>0) {
				B[A[i]]++;
			}
		}
		for (int i = 0; i <B.length; i++) {
			if (B[i] > 1) {
				return false;
			}
		}
		return true;
	}
}
