package Queue;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {

        java.util.Deque<Integer> dStack = new ArrayDeque<>();
        dStack.push(10);
        dStack.push(55);
        dStack.push(3);
        dStack.push(2);
        dStack.push(23);
        dStack.push(1);
        dStack.push(99);
        dStack.addFirst(100);
        dStack.addLast(100);
        dStack.offerFirst(51);
        dStack.offerLast(51);
        System.out.println(dStack);
        int topElement = dStack.peek();
        System.out.println("Top Element=" + topElement);

        Thread delayedThread = new Thread(() -> {
            try {
                Thread.sleep(2000);

                dStack.pop();
                System.out.println(dStack);
                int toppElement = dStack.peek();
                System.out.println("Top Element=" + toppElement);
                System.out.println("poll First-"+dStack.pollFirst());
                System.out.println(dStack);
                System.out.println("poll Last-"+dStack.pollLast());
                System.out.println(dStack);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        delayedThread.start();

    }
}
