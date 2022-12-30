import java.util.Scanner;
public class percentage 
{
    public static void main(String[] args)
    {
       double total;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter marks of all subjects:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int d=sc.nextInt();
       int e=sc.nextInt();
       if(a>100||b>100||c>100||d>100)
       {
        System.out.println("wrong input ");
        
       }
       else{
       total=((a+b+c+d+e)/500.0)*100;
       System.out.println(total);
       }
       
      
      

    }
}
