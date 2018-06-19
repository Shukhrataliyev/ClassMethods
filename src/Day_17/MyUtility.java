package Day_17;

import java.util.Arrays;

public class MyUtility {
	
	String name;
	
	public void displayUtility() {
		System.out.println("Name:" + name);
	}

	public int getAsciNumber(char ch){
		
		int asc = (int) ch;
		return asc;
	}
	
	public void displayEachAsciiNumber(String str) {
		char[] letters = str.toCharArray();
		
		for(int i = 0; i<letters.length; i++) {
			System.out.print((int)(letters[i])+",");
		}
		System.out.println();
	}
	
	public char getChar(int num) {
	
		char mychar = (char) num;
		System.out.println("mychar: "+mychar);
		
		return mychar;
	}
	
}
