package PROB06;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.Spliterator.OfPrimitive;

public class PROB06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		char [][] A;
		for (int test = 0; test < numTest; test++) {
			int M = scanner.nextInt();
			int N = scanner.nextInt();
			A = new char[M][N];
			char [][] B = new char[M+6][N+6];
			
			for(int i = 0; i < M; i++) {
				String str = scanner.next();
				for (int j = 0; j<N;j++) {
					A[i][j] = str.charAt(j);
				}
			}	
			for (int i =0; i< M; i++) {
				for (int j = 0; j < N; j++) {
					chChar(B, i, j, A[i][j]);
				}
			}

			int  count =0;
			for (int i = 0; i< M+3; i++) {
				for (int j = 0; j < N+3; j++) {
					if (B[i][j] == 'H') {
						count++;
					}
				}
			}
			System.out.println("#"+(test+1)+" "+count);
		}
	}	
	public static void chChar(char[][] B, int i, int j, char ch) {
		int n = 0;
		if (ch == 'A') {
			n=1;
		} else if (ch == 'B') {
			n =2;
		} else if (ch == 'C') {
			n =3;
		} else if (ch =='H') {
			n = -1;			
		}

		if (n>0) {
			for (int k = 0; k < 2*n+1; k++) {
				B[i+3][j+3-n+k] ='X';
			}
			for (int k = 0; k <2*n+1; k++) {
				B[i+3-n+k][j+3] = 'X';
			}
		} else if (n<0 && B[i+3][j+3] != 'X') { 
			B[i+3][j+3] = 'H';
		}
	}
	
}
