package Daywise;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nu1 :");
		int n1=sc.nextInt();
		System.out.println("Enter num2 :");
		int n2=sc.nextInt();
		
		System.out.println("Enter operator((+,-,*,/) :");
		char c=sc.next().charAt(0);
		switch(c)
		{
		case '+':
			System.out.println("res: "+(n1+n2));
			break;
		case '-':
			System.out.println("res :"+(n1-n2));
			break;
		case '*':
			System.out.println("res :"+(n1*n2));
			break;
		case'/':
			System.out.println("res :"+(n1/n2));
			break;
		default:
			System.out.println("Invalid operator ");
		}
		

	}

}
