package QKPE;

import java.util.Scanner;

public class QKPE {
	public static final int UNSAFE = 1;
	public static final int SAFE = -1;
	public static final int QKP = 2;
	public static final int KSTEP[][] = 
		{{-1,-2},{-2,-1},{-2,1},{-1,2},{1,-2},{2,-1},{2,1},{1,2}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		int test = 0;
		while (flag == 1) {
			test++;
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0 && M == 0) break;
			
			int[][] A = new int[N][M];
			for (int i =0; i < N; i++) {
				for (int j=0; j<M; j++) {
					A[i][j] = SAFE;
				}
			}
			int numQ = sc.nextInt();
			int[][] Q = new int[numQ][2];
			if (numQ != 0) {
				for (int i = 0; i < numQ; i++) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					Q[i][0] = x-1;
					Q[i][1] = y-1;
					A[Q[i][0]][Q[i][1]] = QKP;
				}
			}
			
			int numK = sc.nextInt();
			int[][] K = new int[numK][2];
			if (numK !=0) {
				for (int i = 0; i < numK; i++) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					K[i][0] = x-1;
					K[i][1] = y-1;
					A[K[i][0]][K[i][1]] = QKP;
				}
				
			}
			
			int numP = sc.nextInt();
			if (numP !=0) {
				for (int i=0; i < numP;i++) {
					int x =sc.nextInt();
					int y = sc.nextInt();
					A[x-1][y-1] = QKP;
				}
			}
			for (int i = 0; i < numQ; i++) {
				checkQ(Q[i][0], Q[i][1], A, N, M);
			}
			
			for (int i = 0; i < numK; i++) {
				for (int j =0; j < 8;j++) {
					if ((K[i][0]+KSTEP[j][0]) >= 0 
							&& (K[i][0]+KSTEP[j][0] < N
							&& (K[i][1]+KSTEP[j][1] >= 0 
							&& (K[i][1]+KSTEP[j][1] < M)))) {
						A[K[i][0]+KSTEP[j][0]][K[i][1]+KSTEP[j][1]] = UNSAFE;
					}
				}
			}
			int count =0;
			for (int i =0; i < N; i++) {
				for (int j =0; j < M; j++) {
					if (A[i][j] == SAFE) count++;
				}
			}
			System.out.println("Board "+test+" has "+count+" safe squares");
		}
	}
	public static void checkQ(int x, int y,int A[][],int n, int m) {
		int flag = 0;
		int i=1;
		while (flag ==0) {
			if(x-i >= 0 && y-i >= 0 && A[x-i][y-i] !=2) {
				A[x-i][y-i] = UNSAFE;
				i++;
			} else break;
		}
		i =1;
		while (flag ==0) {
			if (x-i >= 0 && A[x-i][y] != 2) {
				A[x-i][y] = UNSAFE;
				i++;
			}else break;
		}
		i=1;
		while (flag == 0) {
			if (x-i >= 0 && y+i < m && A[x-i][y+i] != 2) {
				A[x-i][y+i] = UNSAFE;
				i++;
			} else break;
		}
		i=1;
		while (flag == 0) {
			if (y+i < m && A[x][y+i] != 2) {
				A[x][y+i] = UNSAFE;
				i++;
			} else break;
		}
		i=1;
		while (flag == 0) {
			if (x+i<n && y+i < m && A[x+i][y+i] != 2) {
				A[x+i][y+i] = UNSAFE;
				i++;
			} else break;
		}
		i=1;
		while (flag == 0) {
			if (x+i < n && A[x+i][y] != 2) {
				A[x+i][y] =UNSAFE;
				i++;
			} else break;
		}
		i=1;
		while (flag == 0) {
			if (x+i<n && y-i>=0 && A[x+i][y-i] != 2) {
				A[x+i][y-i] = UNSAFE;
				i++;
			} else break;
		}
		i=1;
		while (flag == 0) {
			if (y-i>=0 && A[x][y-i] != 2) {
				A[x][y-i] = UNSAFE;
				i++;
			} else break;
		}	
	}
}
