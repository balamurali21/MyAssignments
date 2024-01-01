package week7;

public class Employee {
	int id;
	String name;
	public Employee() {
		this(21, "Bala");
		System.out.println("This is Default Constructor");
	}
	public Employee(int id) {
		this();
		this.id=id;
		System.out.println("This is one Parameterized Constructor");
		System.out.println("Emplyoee block no. is" + id);
	}
	public Employee(int id, String name) {
		
		System.out.println("This is two Parameterized Constructor");
		System.out.println("Emplyoee ID is " + id +" and Employee name is " + name);
		
	}
	public static void main(String[] args) {
		Employee obj=new Employee(10);
		System.out.println(obj.id);
		
	}

}
