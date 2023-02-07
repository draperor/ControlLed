package FNDMTX;

import java.util.Scanner;

public class FNDMTX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			int[][] A = new int[N][N];
			int childN = N-M+1;
			int[][] B = new int[childN][childN];
			for (int i = 0; i < N; i++) {
				for (int j=0; j<N;j++) {
					A[i][j] = sc.nextInt();
				}
			}
			
			int flag = 0;
			int minPos = K,minNe = K;
			int xPos =0, yPos=0;
			int xNe =0, yNe =0;
			int x=0,y=0;
			
			
			for (int i = 0; i < childN; i++) {
				for (int j = 0; j< childN;j++) {
					int c=0;
					for (int n =0; n <M; n++) {
						for (int m =0; m < M; m++ ) {
							c += A[i+n][j+m];
						}
					}
					B[i][j] = K-c;
					if (B[i][j] == 0) {
						flag++;
						x=i;
						y=j;
					}
				}
			}
			
			if (flag ==0) {
				for (int i= 0; i < childN; i++) {
					for (int j =0; j < childN; j++) {
						if (B[i][j] >= 0 && B[i][j] < minPos) {
							minPos = B[i][j];
							xPos = i;
							yPos = j;
							
						} else if (B[i][j] < 0 && (0-B[i][j]) < minNe) {
							minNe = B[i][j];
							xNe = i;
							yNe = j;
						}	
					}
				}
				if (minPos < minNe ) {
					x = xPos;
					y = yPos;
				} else if (minPos > minNe) {
					x=yNe;
					y=yNe;
				} else if (xPos < xNe) {
					x=xPos;
					y=yPos;
				} else if (xPos > xNe) {
					x = xNe;
					y = yNe;
				} else if (yPos < xNe) {
					x = xPos;
					y = yPos;
				} else if (yPos > yNe) {
					x=xNe;
					y=yNe;
				}
			}
			System.out.println("#"+(test+1)+" "+ x +" "+ y);		
		}
	}
}
