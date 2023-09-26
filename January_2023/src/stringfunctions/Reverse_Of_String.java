package stringfunctions;

public class Reverse_Of_String {

	private static void wordReverse() {

		String s = "reverse of a string";

		String[] sp = s.split(" ");

		for (int i = sp.length - 1; i >= 0; i--) {
			System.out.print(sp[i] + " ");

		}
		System.out.println();
	}

	private static void characterReverse() {
		String s = " reverse of a string";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));

		}
		System.out.println();
	}

	private static void reverseUsingStringBuffer() {
		StringBuffer sb = new StringBuffer("Reverse");
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}

	private static void palindrome() {
		String s = "madam";

		String temp = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);

		}
		if (temp.equals(s)) {
			System.out.println(s + " is palindrome");

		} else {
			System.out.println(s + " is not a palindrome");
		}
	}

	private static void alternativeForLengthMethod() {
		String s = "Naveen";
		int count = 0;

		char[] charArray = s.toCharArray();

		for (char c : charArray) {
			count++;

		}
		System.out.println("The length of the String is " + count);
	}

	static void alternativeForLengthMethod(String s) {

		String[] split = s.split("");
		int count = 0;
		for (String string : split) {
			count++;

		}
		System.out.println("The length of the String is " + count);

	}

	public static void main(String[] args) {
		// wordReverse();
		// characterReverse();
		// reverseUsingStringBuffer();
		// palindrome();
		alternativeForLengthMethod();
		alternativeForLengthMethod("Ronaldo");
	}

}
