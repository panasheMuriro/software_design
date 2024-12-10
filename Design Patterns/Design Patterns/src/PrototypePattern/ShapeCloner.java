package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class ShapeCloner {
    public static void main(String[] args) {
        // Create some original shapes
        Shape rectangle = new Rectangle(10, 20, "Red");
        Shape circle = new Circle(15, "Blue");

        // Draw original shapes
        System.out.println("Original Shapes:");
        rectangle.draw();
        circle.draw();

        // Clone shapes
        Shape clonedRectangle = rectangle.clone();
        Shape clonedCircle = circle.clone();

        // Change properties of clones to demonstrate independence
        System.out.println("\nCloned Shapes (Independent):");
        clonedRectangle.draw();
        clonedCircle.draw();
    }
}
