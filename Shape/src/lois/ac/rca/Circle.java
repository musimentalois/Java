package lois.ac.rca;
public class Circle extends Shape {
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    float radius;

    public void sayName() {
        System.out.println("I'm child class Circle");
    }
    public void mySpecificName() {
        System.out.println("I'm specifically a circle ");
    }

    
}
