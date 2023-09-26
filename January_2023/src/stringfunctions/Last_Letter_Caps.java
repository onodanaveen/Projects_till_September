package stringfunctions;

public class Last_Letter_Caps {
	private static void Upper() {
		
		String s = "naveen";
		String temp = "";
		for (int i = 0; i < s.length()-1; i++) {
	//		System.out.print(s.charAt(i));
			char c = s.charAt(i);
			temp = temp +c;
			
		}
	
		
		char ch = s.charAt(s.length()-1);
		char c = Character.toUpperCase(ch);
		temp = temp + c + " ";
		
		System.out.println(temp);
	}
	private static void Words() {
		String  s = " my name is naveen";
		String temp = "";
		String[] split = s.split(" ");
		
		for (String words : split) {
			
			for (int i = 0; i < words.length(); i++) {
				if (i== words.length()-1) {
					char c = s.charAt(i);
					char d = Character.toUpperCase(c);
					temp = temp + d + " ";
				}else {
				char ch = words.charAt(i);
				temp = temp + ch;}
			}
	//		char c = words.charAt(words.length()-1);
	//		temp = temp + c + " ";
			
		}
		
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
	//	Upper();
		Words();
	}

}
