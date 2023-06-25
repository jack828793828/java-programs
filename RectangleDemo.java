class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        // Create objects of Rectangle class
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(7.5, 4.2);

        // Calculate area and perimeter using objects
        double area1 = rectangle1.calculateArea();
        double perimeter1 = rectangle1.calculatePerimeter();

        double area2 = rectangle2.calculateArea();
        double perimeter2 = rectangle2.calculatePerimeter();

        // Display the results
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + area1);
        System.out.println("Perimeter: " + perimeter1);

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Area: " + area2);
        System.out.println("Perimeter: " + perimeter2);
    }
}

