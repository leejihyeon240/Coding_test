package training.day2;

import java.util.Scanner;

public class SpinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		/* 문자열 담아서 for문으로 하나씩 출력? */
		for (int i = 0; i < a.length(); i++) {
			// 원하는 위치의 문자 가져오기
			System.out.println(a.charAt(i));
		}
	}
}
