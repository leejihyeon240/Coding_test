// 오름차순으로 정렬 --> 정렬 알고리즘 
// N의 최대 범위가 1000으로 매우 작기 때문에 O(n2) 시간 복잡도 알고리즘으로 풀 수 있음
// 버블 정렬의 시간 복잡도가 O(n2)이므로 버블 정렬 알고리즘을 이용 

package sort_number;

import java.util.Scanner;

public class baekjoon2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		// 버블 정렬을 구현하는 영역
		for (int i = 0; i < N - 1; i++) { // loop
			// N - 1 - i --> loop가 한 번 돌수록 정렬된 데이터 부분이 생김
			// loop가 돈 만큼 i의 값을 빼주면서 적게 탐색하는 것을 컨트롤 해주는 것
			for (int j = 0; j < N - 1 - i; j++) {
				// 인접한 두 수 비교
				// swap 연산
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
		// 정렬이 끝난 후 실제 정렬된 배열 A를 그대로 출력 
		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}
	}

}