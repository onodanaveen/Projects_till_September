package stringfunctions;

public class String_Functions {
	
	private static void string_Uppercase() {
		
		String s = "naveen";
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

	}
	private static void index_Uppercase() {
		String s = "naveen";
		String[] split = s.split("");
		String upperCase = split[0].toUpperCase();
		System.out.print(upperCase);
		for (int i = 1; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
	}
	
	private static void index_Uppercase1() {
		String s = "name is naveen";
		int length = s.length();
		System.out.println(length);
		
		
		String temp = "";
	//	String[] sp = s.split("");
		
		for (int i = 0; i < length; i++) {
			
			if (i==0 || s.charAt(i-1) == ' ') {
				 temp = temp + Character.toUpperCase(s.charAt(i));		
			}
			else {
				temp = temp + s.charAt(i);
			}
			
		}
		System.out.println(temp);
		}
	private static void finalTry() {
		String s = "name";
		int length = s.length();
		String temp = " ";
		
		for (int i = 0; i < length; i++) {
			
			if (i== 0) {
				char c = s.charAt(i);
				char upperCase = Character.toUpperCase(c);
				temp = temp + upperCase;
			}
			else {
				char c = s.charAt(i);
				char lowerCase = Character.toLowerCase(c);
				temp = temp + lowerCase;
			}
			
		}
		
		System.out.println(temp);
	//	char c = 'n';
		
		
	//	char upperCase = Character.toUpperCase(c);
	//	System.out.println(upperCase);
		
//		byte uppercaseLetter = Character.UPPERCASE_LETTER;
//		System.out.println(uppercaseLetter);
	}
	
	private static void naveen() {
		String s = "my name is naveen";
		String temp = " ";
		
		String[] words = s.split(" ");
		
		for (String word : words) {
			
			for (int i = 0; i < word.length(); i++) {
				
				if (i == 0 ) {
					
					char c = word.charAt(i);
					char upperCase = Character.toUpperCase(c);
					temp = temp + upperCase;	
				}
				else {
					char c = word.charAt(i);
					char lowerCase = Character.toLowerCase(c);
					temp = temp + lowerCase;
				}
			//	System.out.println(" ");
				
			}
			//System.out.print(" ");
			
			
		}
//		System.out.println(" ");
		System.out.println(temp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void myNameIsBilla() {
		String s = "my name is billa";
		
		String[] words = s.split(" ");
		
		for (String word : words) {
			
			String[] ch = word.split("");
			String upperCase = ch[0].toUpperCase();
			System.out.print(upperCase);
			for (int i = 1; i < ch.length; i++) {
				System.out.print(ch[i] );
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void myName() {
		String s = "my name is naveen";
		
		String[] words = s.split(" ");
		
			String[] letters = words[0].split("");
			String upperCase = letters[0].toUpperCase();
			System.out.print(upperCase);
			for (int j = 1; j < letters.length; j++) {
				System.out.print(letters[j]);
			}
			System.out.print(" ");
			
			String[] letters1 = words[1].split("");
			String upperCase1 = letters1[0].toUpperCase();
			System.out.print(upperCase1);
			for (int j = 1; j < letters1.length; j++) {
				System.out.print(letters1[j]);
			}
			System.out.print(" ");

			String[] letters2 = words[2].split("");
			String upperCase2 = letters2[0].toUpperCase();
			System.out.print(upperCase2);
			for (int j = 1; j < letters2.length; j++) {
				System.out.print(letters2[j]);
			}
			System.out.print(" ");

			String[] letters3 = words[3].split("");
			String upperCase3 = letters3[0].toUpperCase();
			System.out.print(upperCase3);
			for (int j = 1; j < letters3.length; j++) {
				System.out.print(letters3[j]);
			}
			
			
		
		
	}
	public static void main(String[] args) {
	//	string_Uppercase();
		index_Uppercase1();
	//	myNameIsBilla();
	//	myName();
	//	finalTry();
		naveen();
	}

}


























