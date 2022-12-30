
import java.util.Scanner;
public class array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // int marks[]={90,35,29,13,87};
        // System.out.println(marks.length);

        // System.out.println(marks[2]);
        // String str[]={"adithya","beenu","bhannu","ahir"};
        // System.out.println(str.length);
        int arr[]=new int[100];
        int n=5;
        int temp;
        temp=0;
        int i,sum=0;
        int l=Math.floorDiv(n,2);
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
      for(i=0;i<l;i++)
      {
        temp=arr[i];
        arr[i]=arr[n-i-1];//for reversing an array
        arr[n-i-1]=temp;


      }
     for(i=0;i<n;i++)
     {
        System.out.println(arr[i]);
     }
     

    }
    
}
