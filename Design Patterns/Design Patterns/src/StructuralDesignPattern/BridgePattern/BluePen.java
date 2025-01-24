package StructuralDesignPattern.BridgePattern;

// ConcreteImplementor 1
public class BluePen implements DrawingAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle with Blue Pen at (" + x + ", " + y + ") with radius " + radius);
    }
}

