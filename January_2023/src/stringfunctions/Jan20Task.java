package stringfunctions;

public class Jan20Task {
	
	static String s = "my name is naveen";
	
	static String temp = "";
	
	private static void lastLetter() {
		for (int i = 0; i < s.length() ; i++) {
			
			if (i == 0 || s.charAt(i-1) == ' ') {
				char c = s.charAt(i);
				char upperCase = Character.toUpperCase(c);
				temp = temp + upperCase;
				
			}
			
		}
		System.out.println(temp);
	}
	
	private static void singleWord() {
		String s = "velpaari";
		
		String temp = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (i == s.length()-1) {
				char c = s.charAt(i);
				char upperCase = Character.toUpperCase(c);
				temp = temp + upperCase;
			}
			else {
				temp = temp + s.charAt(i);
				
			}
			
		}
		
		System.out.println(temp);
	}
	
	
	public static void main(String[] args) {
	//	lastLetter();
		singleWord();
	}

}
