package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
    System.out.println("15 inches");
	}
	public static void main(String[] args) {
		Desktop comp=new Desktop ();
		comp.computerModel();
		comp.desktopSize();
	}

}
