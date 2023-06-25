import java.util.Scanner;

public class StackMenuDriven {
    private static int MAX_SIZE = 5;
    private static int[] stack = new int[MAX_SIZE];
    private static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    push(element);
                    break;
                case 2:
                    int poppedElement = pop();
                    if (poppedElement != Integer.MIN_VALUE) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    displayStack();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    public static void push(int element) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stack[top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return Integer.MIN_VALUE;
        } else {
            int poppedElement = stack[top];
            top--;
            return poppedElement;
        }
    }

    public static void displayStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

