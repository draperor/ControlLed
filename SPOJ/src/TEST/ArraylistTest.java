package TEST;

import java.util.ArrayList;

public class ArraylistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		
		
		for (int i =0; i < 10; i++) {
			a.add(i);
		}
		for (int i =0; i< a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		
		
	}

}
