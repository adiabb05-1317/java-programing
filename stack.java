import java.util.*;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math;


// public class stack
//  {
//     public static void main(String[] args)
//     {
//         Stack<Integer> stk=new Stack<Integer>();
//         stk.push(67);
//         stk.push(78);
//         stk.push(90);
//         stk.push(45);
//         System.out.println(stk);
//         System.out.println(stk.pop());

//     }
// }
public class stack{
    public static void main(String[] args)
    {
       int i,j,k;
       String str;
       int sum;
       int n;
       Stack<String> stk=new Stack<String>();
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       str=sc.next();
    //    String [] s=str.split(",");
       for(i =0;i<str.length();i++)
       {
        if(str.isDigit())
        {
            System.out.println("good");
        }
       }


    }
}
