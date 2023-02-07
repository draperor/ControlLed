package TOANDFRO;

import java.util.Scanner;

public class TOANDFRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flag = -1;
		while(flag != 0) {
			flag = sc.nextInt();
			if (flag == 0) break;
			String str = sc.next();
			int nRow = str.length()/flag;
			char[][] A = new char[nRow][flag];
			
			int n = 0;
			for (int i = 0; i < nRow; i++) {
				if (i%2==0) {
					for (int j = 0; j < flag; j++) {
						A[i][j] = str.charAt(n);
						n++;
					}
				} else {
					for (int j = flag-1; j>= 0; j--) {
						A[i][j] = str.charAt(n);
						n++;
					}
				}
			}
			
			for (int j = 0; j < flag; j++) {
				for (int i = 0; i < nRow; i++) {
					System.out.print(A[i][j]);
				}
			}
			System.out.println();
		}
			
	}
		
}
