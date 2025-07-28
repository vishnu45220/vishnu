package Daywise;

import java.util.Scanner;

public class Numcheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("The number is posotive");
			
		}
		else if(n<0)
		{
			System.out.println("The number is negitive");
		}
		else
		{
			System.out.println("The number is zero");
		}

	}

}
