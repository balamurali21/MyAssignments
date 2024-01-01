package week3.day1.java_oops;

public class Samsung extends AndroidTV {

	public void playVideo() {
		
		System.out.println("Play Video");
		
	}
	public static void main(String[] args) {
		
		Samsung obj=new Samsung();
		obj.openApp();
		obj.playVideo();
		
	}

}
