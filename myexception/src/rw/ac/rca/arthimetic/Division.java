package rw.ac.rca.arthimetic;

public class Division {
	public static void main(String[] args) {
	myMethod();
	}
	
	static void myMethod() {
		try {
			int x = 8/0;
		}
	
		catch(Exception e){
			System.err.println(e.toString());
			System.err. println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("inside finally");
		}
		

	}

	

}
