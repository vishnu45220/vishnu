package Daywise;

import java.util.Scanner;

public class chcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		System.out.println("enter char to count");
		char ch=sc.next().charAt(0);
		
		int cou=0;
		for(char c:str.toCharArray())
			
		{
			if(c==ch)
			{
				cou++;
			}
		}
		System.out.println("character "+" "+ch+" "+"appears"+" "+cou+" "+"times");
		

	}

}
