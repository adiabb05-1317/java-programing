// import java.util.*;
// import java.util.Scanner;
// public class goodpair 
// {
//     public static void main(String[] args)
//     {
//         int i,j;
//         int count=0;
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[20];
//         for(i=0;i<n;i++)
//         {
//              arr[i]=sc.nextInt();
//         }
//         for(i=0;i<n;i++)
//         {
//             for(j=i+1;j<n;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
        
//     }
    
// }
import java.util.*;
public class goodpair{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i,j,count=0;
        int n = sc.nextInt();
        int arr[]= new int[20];
        int max=0;
        for(i=0;i<n;i++){
            int h = sc.nextInt();
            if(h >= max){
                max = h;
            }
            arr[h] =+1;
        }
        System.out.println(max);
        for(j=0;j<=max;j++){
            if(arr[j]>= 2){
                if(arr[j] % 2 != 0){arr[j] =- 1;
                }
                
               count = (((n-1)*(n))/2) + count;
                
            }
        }
        System.out.println(count);
    

    }
}