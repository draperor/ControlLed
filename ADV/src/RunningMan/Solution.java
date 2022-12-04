package RunningMan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static final int N = 5;
	static int M,D, min;
	static int[] thoigian,nangluong;
	static int[] visit;
	static int[][] visit_cc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("src/RunningMan/input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int tc = 1; tc <= numTest; tc++) {
			M = sc.nextInt();
			D = sc.nextInt();
			thoigian = new int[N];
			nangluong = new int[N];
			visit = new int[N];
			visit_cc = new int[N][D];
			int min_nl = Integer.MAX_VALUE;
			int tg = Integer.MAX_VALUE;
			int nl = 0;
			for (int i =0; i < N; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				thoigian[i] = a*60 +b;
				nangluong[i] = sc.nextInt();
				if (thoigian[i] < tg) {
					tg = thoigian[i]; 
					nl = nangluong[i];
				}
				if (nangluong[i] < min_nl) min_nl = nangluong[i];
			}
			sort();
//			for (int i = 0; i < N;i++) {
//				System.out.print(thoigian[i]+" ");
//			}
//			System.out.println();
			min = Integer.MAX_VALUE;	
			System.out.println("Case #"+tc);
			boolean cothedi = M - min_nl*D > 0;
			boolean nhanhnhanh = M - nl*D > 0;
			if (cothedi && nhanhnhanh) {
				min = tg*D;
				System.out.println(min/60 +" "+ min%60);
			}
			else if (cothedi && !nhanhnhanh) {
				backtrack(0,0,0);
				System.out.println(min/60 +" "+ min%60);
			} else System.out.println(-1);
		}
	}
	static boolean backtrack(int pos, int tongnangluong, int tongthoigian) {
		if (pos >= D) {
			if (tongthoigian < min) min = tongthoigian;
			return true;
		}
		if (tongnangluong > M) return false;
		if (tongnangluong > min) return false;
		for (int i =0; i < N; i++) {
			if (visit_cc[i][pos] == 0) {
				visit_cc[i][pos] = 1;
				if (backtrack(pos+1,tongnangluong + nangluong[i], tongthoigian + thoigian[i]))
					return true;
				visit_cc[i][pos] = 0;
			}
		}
		return false;
	}
	static void sort() {
		for (int i =0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (thoigian[i] > thoigian[j]) {
					int temp = thoigian[i];
					thoigian[i] = thoigian[j];
					thoigian[j] = temp;
					temp = nangluong[i];
					nangluong[i] = nangluong[j];
					nangluong[j] = temp;
				}
			}
		}
	}
}
