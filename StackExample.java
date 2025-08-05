import java.util.Scanner;
public class StackExample {
int max = 5;
int[] stack = new int[max];
int top = -1;
Scanner sc = new Scanner(System.in);
public void push() {
if (top == max - 1) {
System.out.println("Overflow! Stack is full.");
} else {
System.out.print("Enter value to push: ");
int x = sc.nextInt();
stack[++top] = x;
System.out.println("Pushed: " + x);
for(int i=0;i<=max-1;i++){
System.out.println("array" + stack[i]);
}
}}
public void pop() {
if (top == -1) {
System.out.println("Underflow! Stack is empty.");
} else {
System.out.println("Popped: " + stack[top--]);
}}
public void peek() {
if (top == -1) {
System.out.println("Stack is empty.");
} else {
System.out.println("Top element is: " + stack[top]);
}
}
public void printStack() {
if (top == -1) {
System.out.println("Stack is empty.");
} else {
System.out.print("Current Stack (top to bottom): ");
for (int i = top; i >= 0; i--) {
System.out.print(stack[i] + " ");
}
System.out.println();
}
}
public void menu() {
while (true) {
System.out.println("\nChoose an operation:");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Peek");System.out.println("4. Print Stack");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();
switch (choice) {
case 1:
push();
break;
case 2:
pop();
break;
case 3:
peek();
break;
case 4:
printStack();
break;
case 5:
System.out.println("Exiting... Thank you!");
return;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}public static void main(String[] args) {
StackExample s = new StackExample();
s.menu();
}
}
