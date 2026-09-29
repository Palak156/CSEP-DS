// class Stack {
//     int arr[];
//     int top;
//     int size;

//     Stack(int size) {
//         this.size = size;
//         arr = new int[size];
//         top = -1;
//     }

//     // Push
//     void push(int value) {
//         if (top == size - 1) {
//             System.out.println("Stack Overflow");
//             return;
//         }

//         top++;
//         arr[top] = value;
//     }

//     // Pop
//     int pop() {
//         if (top == -1) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }

//         return arr[top--];
//     }

//     // Peek
//     int peek() {
//         if (top == -1) {
//             System.out.println("Stack is Empty");
//             return -1;
//         }

//         return arr[top];
//     }

//     // Display
//     void display() {
//         if (top == -1) {
//             System.out.println("Stack is Empty");
//             return;
//         }

//         for (int i = top; i >= 0; i--) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// public class stack{
//     public static void main(String[] args) {

//         Stack s = new Stack(5);

//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         System.out.println("Stack:");
//         s.display();

//         System.out.println("Popped: " + s.pop());

//         System.out.println("Top element: " + s.peek());

//         System.out.println("Stack after pop:");
//         s.display();
//     }

// }


//reverse array using stack
import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("Reversed Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}








