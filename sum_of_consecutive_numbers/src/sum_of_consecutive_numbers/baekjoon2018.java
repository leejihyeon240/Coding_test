// count=1 --> 자기 자신 (미리 저장)

package sum_of_consecutive_numbers;

import java.util.Scanner;

public class baekjoon2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;

		while (end_index != N) {
			if (sum == N) {
				count++;
				end_index++;
				sum = sum + end_index;
			} else if (sum > N) {
				sum = sum - start_index;
				start_index++;
			} else { // sum < N
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(count);
	}

}
