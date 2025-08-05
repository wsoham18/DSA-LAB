public class StackExample1 {
public static final int MAX = 4; 
int top;
int[] arr = new int[MAX];
StackExample() {
top = -1;
}
public void push(int data) {
if (top == MAX - 1) {
System.out.println("Stack Overflow");
return;
}
arr[++top] = data;
System.out.println("Pushed: " + data);
System.out.print("Stack elements now: ");
for (int i = 0; i <= top; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
public int pop() {
if (top < 0) {
System.out.println("Stack Underflow");
return -1;}
int value = arr[top--];
System.out.println("Popped: " + value);
return value;
}
public int peek() {
if (top < 0) {
System.out.println("Stack is empty");
return -1;
}
System.out.println("Top element: " + arr[top]);
return arr[top];
}
public static void main(String[] args) {
StackExample mystack = new StackExample();
for (int i = 1; i <= 5; i++) {
mystack.push(i);
}
mystack.peek();
for (int i = 1; i <= 5; i++) {
mystack.pop();
}
}}
