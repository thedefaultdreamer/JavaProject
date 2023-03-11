package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.Name = "Sweta";
		emp1.EmpId = 1000;
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		emp2.Name = "Palash";
		emp2.EmpId = 1001;
		emp2.DisplayName();
		
		Employee emp3 = new Employee("JOhn", 1002);
		emp3.DisplayName();

	}

}
