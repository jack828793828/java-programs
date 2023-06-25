import java.util.Scanner;

public class QueueMenuDriven {
    private static int MAX_SIZE = 5;
    private static int[] queue = new int[MAX_SIZE];
    private static int front = -1;
    private static int rear = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    enqueue(element);
                    break;
                case 2:
                    int dequeuedElement = dequeue();
                    if (dequeuedElement != Integer.MIN_VALUE) {
                        System.out.println("Dequeued element: " + dequeuedElement);
                    }
                    break;
                case 3:
                    displayQueue();
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

    public static void enqueue(int element) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full. Cannot enqueue element.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
            System.out.println("Enqueued element: " + element);
        }
    }

    public static int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return Integer.MIN_VALUE;
        } else {
            int dequeuedElement = queue[front];
            front++;
            return dequeuedElement;
        }
    }

    public static void displayQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

