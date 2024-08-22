// 슬라이딩 윈도우 알고리즘 : 2개의 포인터로 범위를 지정한 다음 범위를 유지한 채로 이동하며 문제를 해결한다. 

package dna_password;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon12891 {

	// 다른 함수에서도 사용할
	static int myArr[];
	static int checkArr[];
	static int checkSecret;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		// 문자열의 크기
		int S = Integer.parseInt(st.nextToken());
		// 부분 문자열의 크기
		int P = Integer.parseInt(st.nextToken());
		// 정답 값
		int Result = 0;
		// 비밀번호 체크 배열
		checkArr = new int[4];
		// 현재 배열
		myArr = new int[4];
		// 전체 문자열
		char A[] = new char[S];
		// 현재 몇개가 비밀번호 요건에 만족합니까?의 개수
		checkSecret = 0;

		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) { // 0이라는 것은 이미 만족했다는 것 --> checkSecret++;
				checkSecret++;
			}
		}

		for (int i = 0; i < P; i++) { // 부분 문자열 처음 받을 때 세팅
			Add(A[i]); // 하나씩 넣어주는 함수
		}

		if (checkSecret == 4)
			Result++;

		// 슬라이딩 윈도우
		// i가 오른쪽으로 한칸
		for (int i = P; i < S; i++) {
			int j = i - P;
			Add(A[i]);
			Remove(A[j]);
			if (checkSecret == 4)
				Result++;
		}

		System.out.println(Result);
		bf.close();
	}

	private static void Remove(char c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0]) {
				checkSecret--;
				myArr[0]++;
			}
			break;
		case 'C':
			if (myArr[1] == checkArr[1]) {
				checkSecret--;
				myArr[1]++;
			}
			break;
		case 'G':
			if (myArr[2] == checkArr[2]) {
				checkSecret--;
				myArr[2]++;
			}
			break;
		case 'T':
			if (myArr[3] == checkArr[3]) {
				checkSecret--;
				myArr[3]++;
			}
			break;
		}
	}

	private static void Add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0]) {
				checkSecret++;
			}
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1]) {
				checkSecret++;
			}
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2]) {
				checkSecret++;
			}
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3]) {
				checkSecret++;
			}
			break;
		}
	}

}
