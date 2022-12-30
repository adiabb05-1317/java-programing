import java.util.*;
public class insertion 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[11];
     
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter key:");
        int key=sc.nextInt();
        System.out.println("enter pos");
        int pos=sc.nextInt();
      for(i=n-1;i>=pos;i--)
      {
        arr[i+1]=arr[i];
      }
      arr[pos]=key;
      for(i=0;i<n+1;i++)
      {
        System.out.println(arr[i]);
      }

    }
}
