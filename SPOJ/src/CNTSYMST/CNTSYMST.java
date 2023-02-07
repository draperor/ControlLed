package CNTSYMST;

import java.util.Scanner;

public class CNTSYMST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int test = 0; test < numTest; test++) {
			String s = sc.next();
			int max =1;
			for (int i = 0; i <s.length(); i++) {
				for (int j =0; j<s.length()-i;j++) {
					String str = s.substring(j,j+1+i);
					if (isSym(str) && i+1>max) max =i+1 ;	
				}
			}
			System.out.println("#"+(test+1)+" "+max);	
		}
	}
	public static boolean isSym(String s) {
		
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt((s.length()-1)-i))
				return false;
		}
		return true;
	}

}
