class Circle {
    private static final double PI = 3.14159;
    private static int count = 0;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        System.out.println("Circle 1 Area: " + circle1.calculateArea());
        System.out.println("Circle 2 Area: " + circle2.calculateArea());

        int circleCount = Circle.getCount();
        System.out.println("Total Circles: " + circleCount);
    }
}

