import java.util.Scanner;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

  
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = capacity - 1;
        size = 0;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public boolean isFull() {
        return size == capacity;
    }

   
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            System.out.println(value + " enqueued to queue");
        }
    }

    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println(queue[front] + " dequeued from queue");
            front = (front + 1) % capacity;
            size--;
        }
    }

  
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            for (int count = 0; count < size; count++) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % capacity;
            }
            System.out.println("\nFront index: " + front + ", Rear index: " + rear);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        CircularQueue q = new CircularQueue(size);

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
