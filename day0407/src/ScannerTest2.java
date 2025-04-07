import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) throws Exception{
//		System.setIn(new FileInputStream("input.txt"));
//		 변경된 코드에 대하여 빠른 테스트를 할 수 있게 해준다
//		 단, 사이트에 제출 시에는 주석을 해주어 실쟁되지 않게 해주어야 함
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next(); 
		String str2 = scan.next();
		int su = scan.nextInt(); 
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("su+7 = " + (su+7));
		
		scan.close();
	}
}
