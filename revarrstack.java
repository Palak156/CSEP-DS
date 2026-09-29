public class revarrstack {
    static class Stack {
        int[] arr;
        int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        void push(int value) {
            top++;
            arr[top] = value;
        }

        int pop() {
            int value = arr[top];
            top--;
            return value;
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Stack stack = new Stack(arr.length);

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
