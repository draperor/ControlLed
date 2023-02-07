package OVCOBS;

import java.util.Scanner;

public class OVCOBS {
	
	static final int [] pos_row = {-1,-1,-1,0,0,1,1,1};
	static final int [] pos_col = {-1,0,1,-1,1,-1,0,1};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		
		for (int test = 0; test < numTest; test++) {
			int N = scanner.nextInt();
			int[][] A = new int[N][N];
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++){
					A[i][j] = scanner.nextInt();
				}; 
			}	
			System.out.println("#"+(test+1)+" "+getCount(A, N, x, y));
		}
	}
	public static int getCount(int[][] A, int n, int x, int y) {
		int count = 0;
		int temp;
		do {
			temp =0;
			int min = 999;
			for (int i = 0; i< 8; i++) {
				if (x + pos_row[i] < n && x + pos_row[i] >=0
						&& y + pos_col[i] < n && y + pos_col[i] >=0) {
					int num1 = A[x+pos_row[i]][y+pos_col[i]];
					
					if(num1 > A[x][y] && num1 - A[x][y] < min ) {
						min = num1 - A[x][y];
						temp = i;
					}
				}
			}
			if (temp != 0) {
				x = x+pos_row[temp];
				y = y+pos_col[temp];
				count++;
			}
			
			
			if (min == 999) {
				temp = 8;
			}
		} while (temp != 8);
		return count;
	}	
}
