package Daywise;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		char grade=sc.next().charAt(0);
		double marks=sc.nextDouble();
		
		
		System.out.println("Student id:"+id);
		System.out.println("Name :"+name);
		System.out.println("Grade :"+grade);
		System.out.println("Marks :"+marks);

	}

}
