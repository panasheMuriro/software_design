package StructuralDesignPattern.BridgePattern;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 20, 5, new RedPen());
        Shape blueCircle = new Circle(30, 40, 10, new BluePen());

        redCircle.draw();
        blueCircle.draw();
    }
}
