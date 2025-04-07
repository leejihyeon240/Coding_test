import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
//		System.out.println("ScannerTest");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next(); // next(), nextInt(), nextDouble()은 whiteSpace 기준으로 문자열, 정수, 실수를 읽어 들임
		String str2 = scan.nextLine(); // nextLine()은 줄바꿈 포함 문자열 입력 받기
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		scan.close();
	}
}
