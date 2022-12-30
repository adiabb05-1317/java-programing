import java.util.*;
public class hashset 
{
    public static void main(String[] args) {
        {
            Set<Integer> s=new HashSet<>();
            s.add(4);
            s.add(1);
            s.add(3);
            s.add(2);
            s.add(1);
            System.out.println(s);
      //hash set is any order
      //tree set is sorted order
      Set<Integer> tree=new TreeSet<>();
           
        tree.add(4);
        tree.add(1);
        tree.add(3);
        tree.add(2);
        tree.add(1);
        System.out.println(tree.contains(1));
        System.out.println(tree);
        }
    }
}
