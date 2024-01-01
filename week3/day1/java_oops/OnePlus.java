package week3.day1.java_oops;

public class OnePlus extends AndroidTV {

	public void playVideo() {
		
		System.out.println("Play Video");
		
	}
	public static void main(String[] args) {
		
		OnePlus obj=new OnePlus();
		obj.openApp();
		obj.playVideo();
		
	}

}
