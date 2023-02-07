package PROB02;

import java.util.Scanner;

public class PROB02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTest = scanner.nextInt();
		

		for (int test = 0 ; test < numTest; test++) {
			int typeA=0,typeB=0,typeC=0,typeD=0,typeE=0;
			int M = scanner.nextInt();
			int N = scanner.nextInt();
			int m = 5*M+1;
			int n = 5*N+1;
			char [][] A = new char[m][n];
			
			for (int i = 0; i < m ; i ++) {
				String string = scanner.next();
				for (int j = 0 ; j< n; j++) {
					A[i][j] = string.charAt(j);
				}
			}
			
			for (int i = 0 ; i < M ; i++) {
				for (int j = 0; j < N; j++) {
					int count = 0;
					for (int k = 1; k<=4; k++) {
						if ( A[(5*i+k)][(5*j+1)] == '*'  ){
							count++;
						}
					}
					switch (count) {
					case 0:
						typeA++;
						break;
					case 1:
						typeB++;
						break;
					case 2: 
						typeC++;
						break;
					case 3:
						typeD++;
						break;
					case 4: 
						typeE++;
						break;
					default:
						break;
					}
				}
			}
			
			System.out.println("#"+(test+1)+
					" "+typeA+
					" "+typeB+
					" "+typeC+
					" "+typeD+
					" "+typeE);
			
		}
	}

}
