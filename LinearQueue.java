import java.util.Scanner;

public class LinearQueue {
    private int[] queue;
    private int front, rear, capacity;

    // Constructor
    public LinearQueue(int size) {
        capacity = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Add element to queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
            System.out.println(value + " enqueued to queue");
        }
    }

    // Remove element from queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println(queue[front] + " dequeued from queue");
            if (front == rear) {
                front = rear = -1; // Reset queue when last element is removed
            } else {
                front++;
            }
        }
    }

    // Display elements of queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println("\nFront index: " + front + ", Rear index: " + rear);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        LinearQueue q = new LinearQueue(size);

        int choice;
        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Check if Queue is Full");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Queue is " + (q.isEmpty() ? "empty" : "not empty"));
                    break;
                case 5:
                    System.out.println("Queue is " + (q.isFull() ? "full" : "not full"));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
