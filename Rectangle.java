public class Rectangle implements Shape {
    private double width; 
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {
        double perimeter;

        perimeter = 2 * (width + length);
        return perimeter;
    }

    public double getArea() {
        double area;

        area = width * length;
        return area;
    }
}
