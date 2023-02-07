package BLDTWR;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BLDTWR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		for (int test = 0; test < numTest; test ++) {
			int N = scanner.nextInt();
			int M1= scanner.nextInt();
			int M2 = scanner.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];			
			for (int i = 0; i < N; i++) {
				A[i] = scanner.nextInt();
			}
			
			for (int i = 0; i < M1; i ++) {
				B[i] = i+1;
			}
			for (int i = 0; i < M2; i++) {
				B[M1+i] = i+1;
			}
			Arrays.sort(A);
			Arrays.sort(B);
			int tong = 0;
			for (int i = 0; i<N; i++) {
				tong += A[i]*B[N-i-1];
			}
			System.out.println("#"+(test+1)+" "+tong );	
		}
	}

}
