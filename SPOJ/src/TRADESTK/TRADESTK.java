package TRADESTK;

import java.util.Scanner;

public class TRADESTK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test =0; test < numTest; test++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N+2];
		

			for (int i =1; i<= N;i++) {
				A[i] = sc.nextInt();
			}
			int cp = 0;
			int condu = M;
			
			for (int i =1; i<= N;i++) {
				if (A[i] < A[i-1] && A[i] <= A[i+1] &&A[i+1] !=0)
				{
					cp = condu/A[i];
					condu = condu%A[i];
				} else if (A[i] >= A[i-1] && A[i] > A[i+1] && A[i+1] != 0) {
					condu += cp*A[i];
					cp = 0;
				} else {
					cp += condu/A[i];
					condu = condu % A[i];
					}
				int tong = cp*A[i] + condu;
				System.out.println(tong);
				}
			int lai = cp*A[N]+condu - M;
			System.out.println("#"+(test+1)+" "+lai);	
		}
	}
}
