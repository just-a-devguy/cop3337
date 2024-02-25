/**
 * Adler G Luders
 * COP 3337
 * Assignment 5
 * 22 February 2024
 */

abstract class Shape {
  String name;
  String color;

  public abstract double calculateArea();

  public abstract double calculatePerimeter();

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }
}

/**
 * Resizable
 */
interface Resizable {
  public void resize(int percent);
}

class Circle extends Shape implements Resizable {

  double radius;

  // Constructor
  public Circle(String name, String color, double radius) {
    this.name = name;
    this.color = color;
    this.radius = radius;
  }

  // methods
  public double getRadius() {
    return this.radius;
  }

  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public void resize(int percent) {
    // percent / 100
    double decimal = percent / 100.0;
    // current size * result
    double percTotal = this.radius * decimal;
    // curent size + result & size
    this.radius = this.radius + percTotal;
  }

}

class Rectangle extends Shape implements Resizable {
  double length;
  double width;

  // Constructor
  public Rectangle(String name, String color, double length, double width) {
    this.name = name;
    this.color = color;
    this.length = length;
    this.width = width;
  }

  // methods
  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
  }

  public double calculateArea() {
    return length * width;
  }

  public double calculatePerimeter() {
    return 2.0 * (length + width);
  }

  @Override
  public void resize(int percent) {
    // percent / 100
    double decimal = percent / 100.0;

    // curr vals * dec
    double percLength = this.length * decimal;
    double percWidth = this.width * decimal;

    // update vals
    this.length = this.length + percLength;
    this.width = this.width + percWidth;

  }
}

public class ShapeTest {
  public static void main(String[] args) {
    Circle circle = new Circle("Circle", "Red", 5);
    Rectangle rectangle = new Rectangle("Rectangle", "Blue", 4, 6);

    System.out.println("Circle: ");
    System.out.println("Name: " + circle.getName());
    System.out.println("Color: " + circle.getColor());
    System.out.println("Radius: " + circle.getRadius());
    System.out.println("Area: " + circle.calculateArea());
    System.out.println("Perimeter: " + circle.calculatePerimeter());
    circle.resize(50);
    System.out.println("Resized Circle - Radius: " + circle.getRadius());

    System.out.println("\nRectangle");
    System.out.println("Name: " + rectangle.getName());
    System.out.println("Color: " + rectangle.getColor());
    System.out.println("Length: " + rectangle.getLength());
    System.out.println("Width: " + rectangle.getWidth());
    System.out.println("Area: " + rectangle.calculateArea());
    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    rectangle.resize(50);
    System.out.println("Resized Rectangle - Length: " + rectangle.getLength() + ", Width: " + rectangle.getWidth());
  }
}
