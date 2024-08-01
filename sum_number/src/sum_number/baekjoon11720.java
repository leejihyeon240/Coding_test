package sum_number;

import java.util.Scanner;

public class baekjoon11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		
		for(int i=0; i<cNum.length;i++) {
			// 문자 '1'은 아스키코드가 49, '1' - 48 = 1.
			// sum += cNum[i] - 48;
			sum += cNum[i] - '0'; // cNum에 있는 char 값을 출력해서 아스키코드로 바꿔줌 
		}
		
		System.out.println(sum);
	}

}

