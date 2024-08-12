// 합 배열 공식 S[i]=S[i-1]+A[i]
// 5 4 3 2 1 = 5 9 12 14 15

// 구간 합 공식 
// 구간 합 출력하기 S[J]-S[i-1]

package range_sum_query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11659 {

	// throws IOException 추
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader =
				new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자의 개수 읽어오기 
		StringTokenizer stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());
		
		// **첫 번째 줄 
		// 숫자의 개수 
		// nextToken이 String 값이라서 Integer.parseInt 해줘야 함 
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		// 질의의 개수 
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		// ** 두 번째 줄 
		// 숫자나 데이터 받을 때는 습관적으로 long형으로 배열을 선언하는 것이 좋음 
		// 합 배열 선언
		long[]S = new long[suNo + 1]; // 0번째 인덱스 무시하려고 +1도 해줌 
		
		// 합 배열 저장 
		// 긴 suNo만큼의 데이터를 한 줄로 쭉 받아오기 위해 stringTokenizer 사용 
		stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());
		
		for(int i=1; i<=suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int q=0; q<quizNo; q++) {
			stringTokenizer =
					new StringTokenizer(bufferedReader.readLine());
			
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j]-S[i-1]);
		}
	}
}
