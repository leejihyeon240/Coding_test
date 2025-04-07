import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {

		String input = "Java,Python,C++,JavaScript,Ruby";

		StringTokenizer tokenizer = new StringTokenizer(input, ",");

		
		
		StringBuilder sb = new StringBuilder();

//		while (tokenizer.hasMoreTokens()) {
//			String token = tokenizer.nextToken();
//
//			sb.append(token).append(" 언어 ");
//		}

		int n = 5;
		for (int i = 1; i <= n; i++) {
			String token = tokenizer.nextToken();
			sb.append(token).append(" 언어\n");
		}

		System.out.println(sb.toString().trim());

	}

}
