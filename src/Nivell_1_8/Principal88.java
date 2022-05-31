package Nivell_1_8;

import java.util.Scanner;

public class Principal88 {
	
	@FunctionalInterface
	public interface ReverseString {
		
		public String reverse(String string);
	}

	public static void main(String[] args) {
		
		ReverseString l = string -> new StringBuffer(string).reverse().toString();

		System.out.println(l.reverse(requireString("Introdueix un string i el mostraré al reves.")));	
	}
	
	public static String requireString(String message) {
		
		Scanner sc=new Scanner(System.in);
		String string;
		
		System.out.println(message);
		string=sc.nextLine();
		
		return string;
	}
}
