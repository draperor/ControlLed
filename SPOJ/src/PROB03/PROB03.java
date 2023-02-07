package PROB03;

import java.util.Iterator;
import java.util.Scanner;

public class PROB03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int test = 0; test < numTest; test++) {
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			int M = scanner.nextInt();
			int N = scanner.nextInt();
			int [][] A = new int[M][N];
			for (int i = 0; i <M; i++) {
				for (int j=0; j < N; j++) {
					A[i][j] = scanner.nextInt();
				}
			}
			int max = 0;
			for (int i = 0; i <= (M-H); i++) {
				for (int j = 0; j <= (N-W); j++) {
					int tong =0;
					for (int k = 0; k < W-1; k++) {
						if (A[i][j+k] % 2 == 0) {
							tong += A[i][j+k];
						}
						if (A[i+H-1][j+W-1-k] % 2 == 0) {
							tong += A[i+H-1][j+W-1-k];
						}
					}
					for (int k = 0; k < H-1; k++) {
						if (A[i+k][j+W-1] % 2 == 0) {
							tong += A[i+k][j+W-1];
						}
						if (A[i+H-1-k][j] % 2 == 0) {
							tong += A[i+H-1-k][j];
						}
					}
					if (tong >= max) {
						max = tong;
					}
				}
			}
		System.out.println("#"+(test+1) +" "+max);
		}
	}

}
