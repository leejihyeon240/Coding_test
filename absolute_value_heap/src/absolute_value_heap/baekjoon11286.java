// 절대값 힙은 여기서 새로 정의한 자료구조
// 절대값이 같을 수 있다 --> 음수 우선 출력

// 데이터가 새로 삽입될 때마다 절대값과 관련된 정렬이 필요하므로 우선순위 큐로 문제를 쉽게 해결할 수 있음

// PriorityQueue = 기본형: 우선순위가 낮은 숫자가 먼저 나옴 (작은 숫자)

package absolute_value_heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baekjoon11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 우선순위 큐
		// 비교할 객체 2
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
			int first_abs = Math.abs(o1);
			int second_abd = Math.abs(o2);
			// 절대값이 같은 경우 음수 우선
			if (first_abs == second_abd) {
				return o1 > o2 ? 1 : -1;
			}
			// 절대값 작은 데이터 우선
			// 첫번째 절대값이 크면 양수 리턴, 두번째 절대값이 크면 음수 리턴
			return first_abs - second_abd;

		});

		for (int i = 0; i < N; i++) {
			int request = Integer.parseInt(br.readLine());
			if (request == 0) {
				if (myQueue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(myQueue.poll());
				}
			} else {
				myQueue.add(request);
			}
		}
	}

}
