package oops;

public class Employee {

	public String Name;
	public int EmpId;
	private int Salary;
	
	public Employee() {
		System.out.println("Default constructor");
	}
	
	public Employee(String var1, int var2) {
		System.out.println("Parameteized constructor");
		String Name = var1;
		int EmpId = var2;
	}
	
	public void DisplayName() {
		System.out.println("Name of the Employee is" + Name);
	}
}
