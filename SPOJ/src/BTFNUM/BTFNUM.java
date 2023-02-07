package BTFNUM;

import java.util.Scanner;

public class BTFNUM {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test++) {
			int [] Num = new int[10];
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i =0; i < n; i++) {
				Num[sc.nextInt()] =1;
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int count =0;
			
			for(int i = x;i<=y;i++) {
				 String s = String.valueOf(i)+"";
				 int temp =0;
				 for (int j = 0; j< s.length(); j++) {
					 int a = s.charAt(j) -'0' ;
					 System.out.println(a);
					 if(Num[a] == 1) temp++;
				 }
				 if (temp >= m) count++;
			}
		System.out.println("#"+(test+1)+" "+count);
		}
	}
}
