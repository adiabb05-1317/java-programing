import java.util.*;
public class quicksort 
{
    public static int partition(int arr[],int low,int high)
    {
          int pivot=arr[high];
          int i=low-1;
          for(int j=low;j<high;j++)
          {
             if(arr[j]<pivot)
             {
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
          }
          i++;
          int temp=arr[i];
          arr[i]=pivot;
          arr[high]=temp;
          return i;
    }
   public static void quickSort(int arr[],int low,int high)
   {
         if(low<high)
         {
            int pi_index=partition(arr,low,high);
            quickSort(arr,low,pi_index-1);
            quickSort(arr,pi_index+1,high);
         }
   }
    public static void main(String[] args) 
    {
        int i,j;
        int arr[]={6,3,9,5,2,8};
       
        int n=arr.length;
        quickSort(arr,0,n-1);
        for( i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
