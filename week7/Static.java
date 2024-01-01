package week7;

public class Static {
	static int x;
	String name;
    
	public static void print() {
		System.out.println("I am printed");

	}
	public void save() {
	System.out.println("I am saved");	

	}
	public static void main(String[] args) {
		Static obj=new Static();
		System.out.println(obj.x);
		System.out.println(obj.name);
		obj.save();
		print();
	}

}
