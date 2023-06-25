class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (MyCustomException e) {
            System.out.println("Caught MyCustomException: " + e.getMessage());
        } finally {
            System.out.println("Inside the finally block");
        }
    }

    public static void throwCustomException() throws MyCustomException {
        try {
            throw new MyCustomException("Custom exception occurred");
        } catch (MyCustomException e) {
            System.out.println("Caught MyCustomException within throwCustomException(): " + e.getMessage());
            throw e;
        }
    }
}

