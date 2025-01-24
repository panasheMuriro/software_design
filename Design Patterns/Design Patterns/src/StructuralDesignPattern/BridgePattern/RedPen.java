package StructuralDesignPattern.BridgePattern;

// ConcreteImplementor 2
public class RedPen implements DrawingAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle with Red Pen at (" + x + ", " + y + ") with radius " + radius);
    }
}
