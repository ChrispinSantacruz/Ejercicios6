package Circulo;


public class Circulos {

    private double radius;
    private String color;

    public Circulos() {
        radius = 1.0;
        color = "red";
    }

    public Circulos(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circulos(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // ToString method to represent the Circle object as a string
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

