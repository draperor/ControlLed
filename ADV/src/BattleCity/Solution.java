package BattleCity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Solution {
	static int N,M,ans;
	static boolean flag;
	static int sRow,sCol;
	static int eRow,eCol;
	static int[][] A;
	static int[][] visit;
	static Queue queue = new Queue();
	static final int[] xMove= { 0, -1, 0, 1 };
	static final int[] yMove = { -1, 0, 1, 0 };
	
	public static void main(String[] args) {

		try {
			System.setIn(new FileInputStream("src/BattleCity/input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		
		for (int tc = 1; tc <= numTest;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			A = new int[N][M];
			visit = new int[N][M];
			for (int i =0; i < N; i++) {
				String str = sc.next();
				for (int j =0; j < M; j++) {
					if(str.charAt(j) == 'Y') {
						sRow = i;
						sCol = j;
						A[i][j] = 1;
					} else if (str.charAt(j) == 'T') {
						eRow = i;
						eCol = j;
						A[i][j] = 1;
					} else if (str.charAt(j) == 'B') {
						A[i][j] = 2;
					} else if (str.charAt(j) == 'E') {
						A[i][j] = 1;
					} else if (str.charAt(j) == 'R') {
						A[i][j] = -1;
					} else if (str.charAt(j) == 'S') {
						A[i][j] = -1;
					}
//					System.out.print(A[i][j] + " ");
				}
//				System.out.println();
			}
			BFS();
			ans = visit[eRow][eCol];
			System.out.println("Case #"+tc);
            if (ans != 0) {
				System.out.println(ans - 1);
			} else System.out.println(-1);
			
		}
	}
	static void BFS() {
		queue.reset();
		queue.add(new Point(sRow,sCol));
		visit[sRow][sCol] = 1;
		
		while (!queue.isEmpty()) {
			Point p = queue.poll();
			for (int i =0; i < 4; i++) {
				Point temp = new Point(p.x + xMove[i], p.y+ yMove[i]);
				if (temp.x >= 0 && temp.x < N && temp.y >=0 && temp.y < M
						&& A[temp.x][temp.y] != -1) {
					int tmp = visit[p.x][p.y] + A[temp.x][temp.y];
					if ( (visit[temp.x][temp.y] == 0 || visit[temp.x][temp.y]  > tmp)) {
						queue.add(temp);
						visit[temp.x][temp.y] = tmp;
					}
				}
			}	
		}
	}
}
class Point {
	int x,y;
	Point(){}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Queue {
	Point[] point = new Point[1000000];
	int rear = 0;
	int front = 0;
	
	void add(Point p) {
		point[rear++] = p;
	}
	Point poll() {
		return point[front++];
	}
	Point getPoint(int pos) {
		return point[pos];
	}
	void setPoint(int pos, Point p) {
		point[pos].x = p.x;
		point[pos].y = p.y;
	}
	
	boolean isEmpty() {
		return (front == rear);
	}
	int size() {
		return (rear - front);
	}
	
	void reset() {
		rear = 0;
		front = 0;
	}	
}