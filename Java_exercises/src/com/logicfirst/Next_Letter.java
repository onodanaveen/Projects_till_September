package com.logicfirst;

import java.util.stream.IntStream;

public class Next_Letter {
	public static void main(String[] args) {
		String s = "Naveen";
		
		int length = s.length();	
		String temp = "";
		
		for (int i = 0; i < length; i++) {
			
			char value = s.charAt(i); 
			
			if (value == 'a' || value =='A') {
				System.out.print("b");
			} else if (value == 'b' || value == 'B') {
				System.out.print("c");
			} else if (value == 'c' || value == 'C') {
				System.out.print("d");
			} else if (value == 'd' || value == 'D') {
				System.out.print("e");
			} else if (value == 'e' || value == 'E') {
				System.out.print("f");
			} else if (value == 'f' || value == 'F') {
				System.out.print("g");
			} else if (value == 'g' || value == 'G') {
				System.out.print("h");
			} else if (value == 'h' || value == 'H') {
				System.out.print("i");
			} else if (value == 'i' || value == 'I') {
				System.out.print("j");
			} else if (value == 'j' || value == 'J') {
				System.out.print("k");
			} else if (value == 'k' || value == 'K') {
				System.out.print("l");
			} else if (value == 'l' || value == 'L') {
				System.out.print("m");
			} else if (value == 'm' || value == 'M') {
				System.out.print("n");
			} else if (value == 'n' || value == 'N') {
				System.out.print("o");
			} else if (value == 'o' || value == 'O') {
				System.out.print("p");
			} else if (value == 'p' || value == 'P') {
				System.out.print("q");
			} else if (value == 'q' || value == 'Q') {
				System.out.print("r");
			} else if (value == 'r' || value == 'R') {
				System.out.print("s");
			} else if (value == 's' || value == 'S') {
				System.out.print("t");
			} else if (value == 't' || value == 'T') {
				System.out.print("u");
			} else if (value == 'u' || value == 'U') {
				System.out.print("v");
			} else if (value == 'v' || value == 'V') {
				System.out.print("w");
			} else if (value == 'w' || value == 'W') {
				System.out.print("x");
			} else if (value == 'x' || value == 'X') {
				System.out.print("y");
			} else if (value == 'y' || value == 'Y') {
				System.out.print("z");
			} else if (value == 'z' || value == 'Z') {
				System.out.print("a");
			}
			
			
			
		//	System.out.println(value);
			
		}
	}

}
