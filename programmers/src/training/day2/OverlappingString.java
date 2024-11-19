package training.day2;

public class OverlappingString {

	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		// return answer;

		/*
		 * 치환 함수? StringBuilder --> replace()
		 */

		StringBuilder builder = new StringBuilder(my_string);
		builder.replace(s, s + overwrite_string.length(), overwrite_string);
		return builder.toString();
	}

}
