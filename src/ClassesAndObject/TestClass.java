package ClassesAndObject;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1= new Employee();
		Employee employee2= new Employee("Sachin", 40, 100);
		Employee employee3= new Employee("David", 40, 80);
		Employee employee4= new Employee("Max", "Brooklyn");
		
		System.out.println(employee1.name);
		System.out.println(employee2.name);
		System.out.println(employee2.hours);
		System.out.println(employee2.salary);
		System.out.println(employee3.name);
		employee3.method(40, 80);
		employee2.method(40,100);
		employee1.method(40,100);
		employee4.method(40,100);
		

	
	}
}
