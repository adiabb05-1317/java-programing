import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue <String> q=new Linkedllist<>();
       q.offer("adi");
       q.offer("codechef");
       q.offer("adiii");
       System.out.println(q);
       System.out.println(q.peek());
       while(!q.isEmpty())
       {
        System.out.println(q.poll());
       }
    //    //priotrity queueu
    //    PriorityQueue<Integer> pq=new PriorityQueue<>();
    //    pq.offer(4);
    //    pq.offer(3);
    //    pq.offer(2);
    //    pq.offer(1);//min heap increaing order pq
    //    System.out.println(pq);
       PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
       pq.offer(40);
       pq.offer(3);
       pq.offer(2);
       pq.offer(1);//max heapdecreaing order
       int val=pq.poll();
       System.out.println(val);
       System.out.println(pq);
       //deque an insert first and back delete end and back
       //offerlast,first,polllast,pollfirst
       ArrayDeque<Integer> dq=new ArrayDeque<>();
       dq.offerFirst(1);
       dq.offerLast(12);
       dq.offerFirst(20);
       System.out.println(dq);
       System.out.println(dq.peekLast());
       System.out.println(dq.peekFirst());
       System.out.println(dq.pollLast());
       System.out.println(dq.size());
       System.out.println(dq.isEmpty());
       
    
    }
}
