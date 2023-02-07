package CreateAStack;

public class StackTest {

	public static void main(String[] args) {
		StackM stack = new StackM();
		for (int i = 0; i < 10; i++) {
			stack.push(i*5);
			System.out.println(i+ " = "+stack.peek()+" " + stack.getTop());
		}
		for (int i =0; i < 10; i++) {
			System.out.println(i+ " = "+stack.pop()+" " + stack.getTop());
		}
//		while (!stack.isEmpty()) {
//			System.out.print(stack.pop()+" ");
//		}
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
	}
}
class StackM {
	public StackM() {}
	
	private int top = 0;
	private int[] A = new int[1000];
	
	public void push(int item) {
		A[top++] = item;
	}
	public int pop() {
		return (A[--top]);
	}
	public int peek() {
		return A[top-1];
	}
	public boolean isEmpty() {
		return (top == 0);
	}
	public int getTop() {
		return top;
	}
	
}
