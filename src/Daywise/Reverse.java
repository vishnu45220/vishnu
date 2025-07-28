package Daywise;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input :");
		String input=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(input);
	    System.out.println("Original :"+input);
	    System.out.println("reversed :"+sb.reverse());

	}

}
