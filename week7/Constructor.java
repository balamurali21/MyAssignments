package week7;

public class Constructor {
	int x;
	String name;
	public Constructor() {
		System.out.println("Default Constructor");
	}
	public Constructor (int x, String name) {
		System.out.println("Parameterized Constructor");
		System.out.println("Interger value is "+x);
		System.out.println("String value is "+name);
	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(7,"Bala");
		System.out.println(obj.x);
		System.out.println(obj.name);
		System.out.println(obj1.name);

	}

}
