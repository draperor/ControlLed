package SLTKNGHT;

import java.util.Scanner;

public class SLTKNGHT {
	static final int MA = -1;
	static final int TOT = -1;
	static final int KAN = 2;
	static final int[] pos_row = {-1,-2,-2,-1,+1,+2,+2,+1};
	static final int[] pos_col = {-2,-1,+1,+2,+2,+1,-1,-2};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			int[][] N = new int[n][n];
			int[][] K = new int[k][2];
			int[]	num = new int[k];
			
			for (int i = 0; i< k; i++) {
				K[i][0] = sc.nextInt();
				K[i][1]	= sc.nextInt();	
				N[K[i][0]][K[i][1]] = MA;
			}
			for (int i = 0; i< m; i++) {
				N[sc.nextInt()][sc.nextInt()] = TOT;
			}
			for (int i = 0; i< d; i++) {
				N[sc.nextInt()][sc.nextInt()] = KAN;
			}
			
			int max =0;
			for (int i = 0; i<k; i++) {
				int count =0;
				for (int j = 0; j < 8; j++) {
					int x = K[i][0] + pos_row[j];
					int y = K[i][1] + + pos_col[j];
					if (x < n && x >=0
							&& y < n && y >=0 
							&& N[x][y] == -1 ) {
						count++;
					}
				}
				num[i] = count;
				if (count > max ) max = count;
			}
			
			
			int index = -1;
			for (int i = 0; i< k; i++) {
				if(num[i] == max) {
					index = i;
					break;
				}
			}
			for (int i =0; i< n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(N[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("#"+(test+1)+" "+K[index][0]+" "+ K[index][1]+" "+max);
			
		}
	}
}
