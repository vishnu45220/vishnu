package Daywise;

import java.util.Scanner;

public class Enum {

	 enum Day{
			MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
		}
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter day");
		 Day day=Day.valueOf(sc.next().toUpperCase());
		 
		 switch(day)
		 {
		 case MONDAY:
			 System.out.println("Start of the week");
			 break;
		 case FRIDAY:
			 System.out.println("weekend");
			 break;
		 case SUNDAY:
			 System.out.println("holiday");
			 break;
		 default:
			 System.out.println("workday");
		 }
		 
		 
		

	}

}
