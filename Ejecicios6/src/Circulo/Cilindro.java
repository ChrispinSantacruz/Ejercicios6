package Circulo;

// Cylinder class extending Circle
public class Cilindro extends Circulos {
    // Additional instance variable
    private double height;

    // Constructors
    public Cilindro() {
        super();
        height = 1.0;
    }

    public Cilindro(double radius) {
        super(radius);
        height = 1.0;
    }

    public Cilindro(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cilindro(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cylinder
    public double getVolume() {
        return super.getArea() * height;
    }
}