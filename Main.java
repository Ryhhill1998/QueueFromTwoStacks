import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 1; i <= 20; i++) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(i);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop() + " ");;
        }
    }
}