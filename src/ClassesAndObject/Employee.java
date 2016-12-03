package ClassesAndObject;

public class Employee {
	public String name;
	public String address;
	public int salary;
	public int hours;
	
	Employee(){}
	
	Employee(String n, int s, int h){
		name=n;
		salary=s;
		hours=h;
	}
	Employee(String n, String a){
		name=n;
		address=a;
	}
	
	void method(int s, int h){
		int totalSalary=s*h;
		System.out.println("Total salary is "+totalSalary );
	}

	

}
