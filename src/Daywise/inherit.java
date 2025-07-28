package Daywise;
class Employee
{
	String name;
	double salary;
}
class manager extends Employee
{
	String dept;
	
	void disp()
	{
		System.out.println("Name :"+name);
		System.out.println("salary: "+salary);
		System.out.println("dept :"+dept);
	}
}
public class inherit {

	public static void main(String[] args) {
		manager m=new manager();
		m.name="Raj";
		m.salary=12000;
		m.dept="sales";
		m.disp();

	}

}
