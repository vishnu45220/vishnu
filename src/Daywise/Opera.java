package Daywise;

import java.util.Scanner;

public class Opera {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first num :");
		int n1=sc.nextInt();
		System.out.print("Enter sec num :");
		int n2=sc.nextInt();
		
		System.out.println("addition :"+(n1+n2));
		System.out.println("Greater num :"+(n1>n2?n1:n2));
		System.out.println("Are both positive :"+(n1>0 && n2>0));
		

	}

}
