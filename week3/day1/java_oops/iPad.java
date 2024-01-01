package week3.day1.java_oops;

public class iPad extends iOS{
	
	public void watchMovie() {
		
		System.out.println("Watch movie (from iPad class)");

	}

	public static void main(String[] args) {
		
		iPad obj=new iPad();
		obj.startApp();
		obj.watchMovie();
		obj.increaseVolume();
		obj.shutdown();
		
	}

}
