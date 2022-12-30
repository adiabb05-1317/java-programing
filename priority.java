
import java.util.*;
public class priority {
    

    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        //min heap in java
        int piles[]={5,4,9};
        for(i=0;i<piles.length;i++)
        {
            pq.add(piles[i]);
            


        }
        int k=sc.nextInt();
        for(i=0;i<k;i++)
        {
            int curr=pq.remove();
            int a=curr-(int)Math.floor(curr/2);
            pq.add(a);
            System.out.println(pq);
        }
        System.out.println(pq);
    }
}
