package Daywise;
class student
{
	String name;
	int marks;
	void disp()
	{
		System.out.println("Student name :" +name);
		System.out.println("Marks: "+ marks);
	}
}

public class oops {

	public static void main(String[] args) {
		student s=new student();
		s.name="Vishnu";
		s.marks=452;
		s.disp();
		

	}

}
