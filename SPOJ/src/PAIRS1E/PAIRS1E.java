package PAIRS1E;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PAIRS1E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		
		for (int test= 0; test < numTest; test ++) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			int[] A = new int[N];
			for (int i = 0; i< N; i++) {
				A[i] = scanner.nextInt();
			}
			int count=0;
			for (int i = 0; i<N; i++) {
				for (int j = i+1; j<N;j++) {
					if (A[i] - A[j] == K ||
						A[j] - A[i] == K) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
