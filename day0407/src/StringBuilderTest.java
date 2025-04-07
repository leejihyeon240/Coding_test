
public class StringBuilderTest {

	public static void main(String[] args) {

		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb); // Hello World
		sb.insert(5, ",");
		System.out.println(sb.toString()); // Hello, World
		sb.delete(5, 6);
		System.out.println(sb.toString()); // Hello World
		sb.reverse();
		System.out.println(sb.toString()); // dlroW olleH
		
		// 문자열 길이 설정
		sb.setLength(5);
		System.out.println(sb); // dlroW
		
	}

}
