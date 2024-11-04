package training.day1;

import java.util.Scanner;

public class ChangeUpperAndLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);

			if (Character.isUpperCase(b)) {
				result.append(Character.toLowerCase(b));

			} else {
				result.append(Character.toUpperCase(b));

			}
		}

		System.out.println(result.toString());
	}

}
