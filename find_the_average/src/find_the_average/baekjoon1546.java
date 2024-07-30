package find_the_average;

import java.util.Scanner;

public class baekjoon1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
//		int A[] = new int[N];
//		
//		for(int i=0; i<N; i++) {
//			A[i] = sc.nextInt();
//		}

		long sum = 0;
		long max = 0;
		
		for(int i=0; i<N; i++) {
			// 바로 입력 받아서 하는 방법
			int temp = sc.nextInt();
			if(temp>max) max=temp;
			sum = sum + temp;
			
//			if(A[i]>max) max = A[i];
//			sum = sum + A[i];
		}
		
		System.out.println(sum*100.0/max/N);
	}

}
