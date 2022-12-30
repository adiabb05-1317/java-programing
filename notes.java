import java.util.*;
public class notes 
{
    
    public static void main(String[] args)
    {
        int arr[]=new int[]{2000,500,200,100,50,20,10,5,2,1};
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0,sum=0;
        int i;
       
       for(i=0;i<9;i++)
       {
         if(num>=arr[i])
         {
            
            while(num>=arr[i]  )
            {
                count++;
                num=num-arr[i];
             
               
            }
         }
         
       }
       System.out.println(count);
    }
}
