import java.util.*;
public class collectionsframe 
{
    public static void main(String[] args)
     {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        arr.add("adi");
        arr.add("bhannnu");
        arr.add("beenu");
        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("Ram");
        arr2.add("sar");
        arr.add(3,"hoo");
        arr.addAll(arr2);
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.remove(2));
        System.out.println(arr.size());
        //remove by value
        arr.remove(String.valueOf("Rohan"));
        arr.set(3,"good");
        System.out.println(arr);
        System.out.println(arr.contains("Codechef"));
        Collections.sort(arr);
        Collections.reverse(arr);    
        System.out.println(arr);
        for( String s: arr)
        {
            System.out.println(s);
        }
        
    }
}
