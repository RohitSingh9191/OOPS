package Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue priorityQueue=new java.util.PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(101);
        priorityQueue.offer(13);
        priorityQueue.offer(19);
        priorityQueue.offer(2);
        priorityQueue.offer(15);

        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }


    }
}
