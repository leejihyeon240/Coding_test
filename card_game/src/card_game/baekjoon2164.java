// 큐의 선입선출 

package card_game;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		// 카드의 개수 받기 
		int N = sc.nextInt();
		// 큐에 저장 
		// 카드가 1부터 있으니까 i=1 
		for (int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		
		// 카드가 한 장 남을 때까지 반복하기 
		while(myQueue.size()>1) {
			// poll --> 버린다 
			myQueue.poll();
			
			int temp = myQueue.poll();
			myQueue.add(temp);
			// 또는 myQueue.add(myQueue.poll());
		}
		
		System.out.println(myQueue.poll());
	}

}
