class Circle {
    private final double PI = 3.14159;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final double calculateArea() {
        return PI * radius * radius;
    }
}

final class Square {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public final int calculateArea() {
        return side * side;
    }
}

// Error: Cannot inherit from final class 'Square'
// class CustomSquare extends Square { }

public class FinalKeywordExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.calculateArea());
    }
}

