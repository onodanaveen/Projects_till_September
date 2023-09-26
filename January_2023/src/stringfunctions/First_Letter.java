package stringfunctions;

public class First_Letter {
	
	private static void upperCased() {
		
		String s = "my name is naveen";
		
		String temp = "";
		
		int length = s.length();
		
		for (int i = 0; i < length; i++) {
			
			if (i == 0) {
				
				char c = s.charAt(i);
				char upperCase = Character.toUpperCase(c);
				temp = temp + upperCase;
				
			}else if (s.charAt(i-1) == ' ') {
				
				char c = s.charAt(i);
				char upperCase = Character.toUpperCase(c);
				temp = temp + upperCase;
				
			}else {
				
				char c = s.charAt(i);
				char lowerCase = Character.toLowerCase(c);
				temp = temp + lowerCase;
			}
			
		}
		System.out.println(temp);

	}
	public static void main(String[] args) {
		upperCased();
	}

}
