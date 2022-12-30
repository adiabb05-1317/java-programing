import java.util.*;
public class arraylist
 {
    public static void main(String[] args)
    {
          ArrayList<Integer> arr=new ArrayList<>();
          ArrayList<Integer> l1=new ArrayList<>(10);
          //methods of arr list
          arr.add(6);
          arr.add(7);
          arr.add(7);
          arr.add(89);
          arr.add(90);
          //to add an elemnet at specified index
          arr.add(1,97);
        //   System.out.println(arr);
        //   //in arraylist we will have size and not length
        //   for(int i=0;i<arr.size();i++)
        //   {
        //     System.out.println(arr.get(i));//to access elements in the arraylist
        //   }
          l1.add(67);
          l1.add(78);
          l1.add(9);
          l1.add(56);
          l1.add(13);
          arr.addAll(0,l1);
        //   arr.clear(); clears the whole array
          System.out.println(arr);
          System.out.println(arr.contains(67));//returns whwether elemnt is there in a arraylist or not 
          System.out.println(arr.indexOf(78));//returns index of the elemnt in the list
        //   System.out.println(arr.remove(78));
          arr.set(2,700);//sets an elemnt at particular index
          System.out.println(arr);


    }

}
