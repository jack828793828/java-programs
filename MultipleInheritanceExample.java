interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}

