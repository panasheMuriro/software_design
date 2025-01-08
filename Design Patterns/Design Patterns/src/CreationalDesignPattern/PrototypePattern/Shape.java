package CreationalDesignPattern.PrototypePattern;

public interface Shape extends Cloneable {
    Shape clone(); // Method to clone the object
    void draw();   // Method to display the shape
}
