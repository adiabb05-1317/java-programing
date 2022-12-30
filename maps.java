import java.util.*;

public class maps 
{
    public static void main(String[] args) {
        {
            //dictionaries like in python
            Map<String,Integer> m=new HashMap<>();
             m.put("one",1);
             m.put("Two",2);
             m.put("Three",3);
             System.out.println(m);
             System.out.println(m.keySet()); 
             System.out.println(m.values());
             System.out.println(m.containsKey("Two"));
             System.out.println(m.containsValue(3));
             m.remove("Two");
             System.out.println(m);
        }
    }
}
