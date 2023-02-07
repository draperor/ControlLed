package ADDREV;

import java.util.Scanner;

public class ADDREV {

	public static void main(String[] args) {

 		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println((int)
					getRevere(getRevere(scanner.nextInt())
					+getRevere(scanner.nextInt())));
		}
		
	}
	public static int getRevere(int a) {
		String str = String.valueOf(a);
		String newString = "";
		Character character;
		for (int i = 0; i<str.length();i++) {
			character = str.charAt(i);
			newString = character + newString;
		}
		return Integer.parseInt(newString);
	}
}



