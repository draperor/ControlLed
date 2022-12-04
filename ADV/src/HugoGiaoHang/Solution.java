package HugoGiaoHang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static int sX,sY,eX,eY;
	static int N, min;
	static int[][] A;
	static int[][] B;
	static int[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("src/HugoGiaoHang/input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		
		for (int tc = 1; tc <= numTest; tc++) {
			sX = sc.nextInt();
			sY = sc.nextInt();
			eX = sc.nextInt();
			eY = sc.nextInt();
			N = sc.nextInt();
			A = new int[N+2][2];
			B = new int[N+2][N+2];
			A[0][0] = sX;
			A[0][1] = sY;
			A[N+1][0] = eX;
			A[N+1][1] = eY;
			for (int i =1; i <= N; i++) {
				A[i][0] = sc.nextInt();
				A[i][1] = sc.nextInt();
			}
			for (int i = 0; i <= N; i++) {
				for (int j = i; j <= N; j++) {
					int kc = khoangcach(A[i][0],A[i][1],A[j][0],A[j][1]);
					B[i][j] = kc;
					B[j][i] = kc;
				}
			}
			for (int i = 1; i <= N; i++) {
				int kc = khoangcach(A[N+1][0],A[N+1][1],A[i][0],A[i][1]);
				B[N+1][i] = kc;
				B[i][N+1] = kc;
				
			}
			visit = new int[N+1];
			min = Integer.MAX_VALUE;
			
			visit[0] = 1;
			for (int i =1; i <= N; i++) {
				backtrack(i,B[i][0]);
			}
			System.out.println("Case #"+tc+" "+min);
			
						
		}
	}
	static void backtrack(int pos,int tong) {
		if (isFull()) {
			tong += B[pos][N+1];
			if (tong < min) min = tong;
			return;
		}
		if (tong > min) return;
		for (int i =1 ; i <= N; i++) {
			if (visit[i] == 0) {
				visit[i] = 1;
				backtrack(i,tong + B[pos][i]);
				visit[i] = 0;
			}
		}
		
	}
	static boolean isFull() {
		for (int i=0; i<= N; i++) {
			if (visit[i] == 0) return false;
		}
		return true;
	}
	
	static int khoangcach(int x1,int y1,int x2,int y2) {
		return (Math.abs(x1-x2)+Math.abs(y1-y2));
	}

}
