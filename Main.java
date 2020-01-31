class Main {
  public static void main(String[] args) {
    Shape myRectangle = new Rectangle(15, 30);
    System.out.println(myRectangle.getPerimeter());
    System.out.println(myRectangle.getArea());

    Shape myCircle = new Circle(20);
    System.out.println(myCircle.getPerimeter());
    System.out.println(myCircle.getArea());

    Shape mySquare = new Square(6);
    System.out.println(mySquare.getPerimeter());
    System.out.println(mySquare.getArea());
  }
}