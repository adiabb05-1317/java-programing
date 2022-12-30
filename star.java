
// import java.util.Scanner;
// public class star  
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number:");
//         int num=sc.nextInt();
//         int fac=1;
//         while(num>0)
//         {
//                  fac =fac*(num);
//                  num--;
//         }
//         System.out.println(fac);
//     }
// }
// import java.util.Scanner;
// public class star{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number for pattern:");
//         int num=sc.nextInt();
//         int i,j;
//         for(i=0;i<num;i++)
//         {
//             for(j=num;j>i;j--)
//             {
//                 System.out.print("* ");
//             }
//            System.out.print("\n");
//         }
//     }
// }
//program 3
// import java.util.Scanner;
// public class star{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt(),i,sum=0;
//         for(i=0;i<n;i++)
//         {
//                sum=sum+2*i;
            
//         }
//         System.out.println(sum);
//     }
// }
import java.util.Scanner;
public class star{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=10;i>=1;i--)
        {
            System.out.printf("%d * %d=%d",n,i,n*i);
            System.out.print("\n");
        }

    }
}