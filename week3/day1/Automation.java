package week3.day1;

public class Automation extends MultipleLangauge {

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		
		System.out.println("Java");	
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}
	public static void main(String[] args) {
		Automation auto =new Automation();
		auto.python();
		auto.ruby();
		auto.Java();
		auto.Selenium();
	}



	
	}

	

