package jumong_command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		// StringTokenizer 문자열 쪼개기
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		// 오름차순 정렬
		Arrays.sort(A);
		int count = 0;

		// 투 포인터, 양쪽 끝에 위치
		int i = 0; // A[0] --> Min
		int j = N - 1; // A[N-1] --> Max

		while (i < j) {
			if (A[i] + A[j] < M)
				i++;
			else if (A[i] + A[j] > M)
				j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
	}

}
