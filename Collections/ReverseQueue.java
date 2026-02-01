import java.util.*;

public class ReverseQueue {
    
    // Function to reverse the queue
    public static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) return;

        int front = q.remove();     
        reverseQueue(q);              
        q.add(front);             
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
