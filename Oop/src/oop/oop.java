
package oop;
public class oop{
	
	public static void main(String[] args) {
		
		try{
		
		Vehicle vehicle1 = new Vehicle();
		System.out.println(vehicle1.name);
		vehicle1.setName("city");
		System.out.println(vehicle1.name);
		Vehicle vehicle2 = new Vehicle("volv","black","2012","honda");
		System.out.println(vehicle2.color); 
		}
		
		
		catch(Exception e) {
			System.out.println("exception");
		}
		
		}
		 
	}


