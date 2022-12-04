package MoutainWalking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static int N;
	static int[][] A,visit;
	static int[] xMove = {-1, 0, 1, 0};
	static int[] yMove = { 0, 1, 0,-1};
	static Queue queue = new Queue();
	static int hMax, hMin;
	static int left,right,mid,ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("src/MoutainWalking/input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc =new Scanner(System.in);
		int numTest = sc.nextInt();
		for (int tc = 1; tc <= numTest; tc++) {
			N = sc.nextInt();
			A = new int[N+1][N+1];
			hMax = 0;
			hMin = 110;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N;j++) {
					A[i][j] = sc.nextInt();
					if (A[i][j] > hMax) hMax = A[i][j];
					if (A[i][j] < hMin) hMin = A[i][j];
				}
			}
			left = 0;
			right = hMax - hMin;
			ans = 0;
			while (left <= right) {
				mid = (right+left)/2;
				if (BFS(mid)) {
					ans = mid;
					right = mid -1;
				} else left = mid + 1;
			}
			
			
		}
	}
	static boolean BFS(int m) {
		visit = new int[N+1][N+1];
		queue.reset();
		queue.add(new Point(1,1));
		visit[1][1] = 1;
		int min = 0;
		int max = m;
		while (!queue.isEmpty()) {
			Point p = queue.poll();
			for (int i = 0; i < 4; i++) {
				int xNext = p.x + xMove[i];
				int yNext = p.y + yMove[i];
				
				
			}
		}
		
		
		
		
	}
}
class Point {
	int x,y;
	public Point() {}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
class Queue {
	Point[] point = new Point[10001];
	public Queue() {}
	int rear = 0;
	int front = 0;
	boolean isEmpty() {
		return (rear == front);
	}
	Point poll() {
		return point[front++];
	}
	void add(Point p) {
		point[rear++] = p;
	}
	void reset() {
		rear = 0;
		front =0;
	}
}
