package FNDSTR;

import java.util.Scanner;

public class FNDSTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int tc = 0; tc < 10; tc ++) {
			int numTest = sc.nextInt();
			String str1 = sc.next();
			sc.nextLine();
			String str2 = sc.nextLine();
			int len1 = str1.length();
			int len2 = str2.length();
			int count = 0;
			for (int i = 0; i < len2-len1+1; i++) {
				if (str1.equals(str2.substring(i,i+len1))) count++;
			}
			System.out.println("#"+numTest+" "+count);
		}
	}

}
