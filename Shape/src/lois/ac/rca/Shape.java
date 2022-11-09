package lois.ac.rca;
public class Shape {
    private float area;

    public void print() {
        System.out.println("Shape");
    }
    public void setArea(float area) {
        this.area = area;
    }
    public void sayName() {
        System.out.println("I'm super class Shape");
    }


    public float getArea() {
        return area;
    }
    
    public void mySpecificName() {
    	System.out.println("I'm specifically a circle");
    }

    
}