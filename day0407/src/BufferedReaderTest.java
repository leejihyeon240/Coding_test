import java.util.Scanner;
import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); // 라인 단위 입력 
//		String str1 = scan.next(); // next(), nextInt(), nextDouble()은 whiteSpace 기준으로 문자열, 정수, 실수를 읽어 들임
//		String str2 = scan.nextLine(); // nextLine()은 줄바꿈 포함 문자열 입력 받기
		System.out.println("str1 = " + str1);
		br.close(); // 입출력 객체에 대한 자원 반환 
	}
}
