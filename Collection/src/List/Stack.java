package List;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) {
        Deque<Integer> dStack = new ArrayDeque<>();
        dStack.push(10);
        dStack.push(55);
        dStack.push(3);
        dStack.push(2);
        dStack.push(23);
        dStack.push(1);
        dStack.push(99);
        dStack.addFirst(100);
        dStack.addLast(100);
        System.out.println(dStack);
        int topElement = dStack.peek();
        System.out.println("Top Element=" + topElement);


        // Start the thread


        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(12);
        stack.push(2);
        stack.push(8);
        stack.push(5);
        stack.push(13);

        System.out.println(stack);


        System.out.println("Pop one element from stack-" + dStack);
        Thread delayedThread = new Thread(() -> {
            try {
                Thread.sleep(2000);

                dStack.pop();
                System.out.println(dStack);
                int toppElement = dStack.peek();

                System.out.println("Top Element=" + toppElement);


                System.out.println("One element pop for stack-" + stack);
                stack.pop();
                System.out.println(stack);
                int topppElement = stack.peek();
                System.out.println("Top Element=" + topppElement);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        delayedThread.start();
    }
}
