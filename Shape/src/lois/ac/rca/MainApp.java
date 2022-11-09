package lois.ac.rca;

import java.awt.Rectangle;

public class MainApp {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.sayName();
        Shape sq = new Square();
        Square sq1 = new Square();
        Rectangle sq2 = new Rectangle();
        sq1.caltulateArea(5);
      
        myRealName(sq);
    }
    public static void myRealName(Shape shape) {
        if(shape instanceof Circle) {
            shape.sayName();
        } else {
            System.out.println("Oh! I'm circle. I'm: " + shape.getClass());
        }
       
    }

}