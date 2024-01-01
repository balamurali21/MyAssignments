package week3.day1;

public abstract class MultipleLangauge implements TestTool, Language{

	public void python() {
		System.out.println("Python");
	}
	
	public abstract void ruby();
	
}
