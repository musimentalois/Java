package lois.ac.rca;

public class Square extends Shape {
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	 public float caltulateArea(float side1) {
	    	float area = side1*4;
	    	System.out.println("The area is" + area);
	    	return area;
	    }  
}
