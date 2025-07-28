package Daywise;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :" );
		int n=sc.nextInt();
		int[] ar=new int[n];
		
		int sum=0;
		System.out.println("enter numbers ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		System.out.println("Average :"+(sum/(ar.length)));
	}

}
