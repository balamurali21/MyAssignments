package week3.day1;


public class Students {
	public void getStudentInfo(int ID) {
		System.out.println("The ID is " + ID);

	}
	public void getStudentInfo(int ID, String name) {
		System.out.println("The ID is " + ID + "," + " The name is " + name);	

	}
	public void getStudentInfo(String emailID, long phoneno) {
		System.out.println("The emailID is " + emailID + "," + " The phone no. is " + phoneno);


	}
 
	public static void main(String[] args) {
		
		Students info=new Students();
		info.getStudentInfo(12356);
		info.getStudentInfo(12457, "Harini");
		info.getStudentInfo("abcd123@gmail.com", 9988776655l);
	}

}
