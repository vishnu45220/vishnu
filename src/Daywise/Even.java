package Daywise;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter N:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(2*i+" ");
		}

	}

}
