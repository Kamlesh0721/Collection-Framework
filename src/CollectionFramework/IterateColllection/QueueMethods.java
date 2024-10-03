package CollectionFramework.GenericMethod.IterateColllection;

import java.util.PriorityQueue;

public class QueueMethods {
    public static void main(String[] args) {
        PriorityQueue queue=new PriorityQueue();
        queue.offer(10);
        queue.offer(2);
        queue.offer(4);
        queue.offer(45);
        queue.offer(1);
        System.out.println(queue);
    }
}
