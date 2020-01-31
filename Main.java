class Main {
  public static void main(String[] args) {
    Shape myRectangle = new Rectangle(15, 30);
    System.out.println("Rectangle perimeter = " + myRectangle.getPerimeter());
    System.out.println("Rectangle area = " + myRectangle.getArea());
    System.out.println();

    Shape myCircle = new Circle(20);
    System.out.println("Circle perimeter = " + myCircle.getPerimeter());
    System.out.println("Circle area = " + myCircle.getArea());
    System.out.println();

    Shape mySquare = new Square(6);
    System.out.println("Square perimeter = " + mySquare.getPerimeter());
    System.out.println("Square area = " + mySquare.getArea());
    System.out.println();
  }
}
