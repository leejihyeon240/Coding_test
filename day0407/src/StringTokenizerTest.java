import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("Algorithm is awesome");
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}

}
