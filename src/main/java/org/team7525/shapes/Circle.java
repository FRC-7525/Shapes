package org.team7525.shapes;

public class Circle implements Shape {
    private double radius;
    private double pi;

    public Circle(double myRadius) {
        this.radius = myRadius;
        this.pi = 3.14;
    }
    public double getPerimeter() {
        double perimeter;

        perimeter = 2 * pi * radius;
        return perimeter;
    }
    public double getArea() {
        double area;

        area = pi * radius * radius;
        return area;
    }
}
