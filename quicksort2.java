import java.util.Arrays;

public class quicksort2 
{
      public static int partition(int arr[],int low,int high)
      {
          int pivot=arr[high];
          int i=low-1,j;
          int n=arr.length;
          for(j=low;j<high;j++)
          {
             if(arr[j]<pivot)
             {
                   
               i++;
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
                   
             }
          }  
          i++;
          int temp=arr[i];
           arr[i]=pivot;

          arr[high]=temp;
          System.out.println(arr[i]+" ");
          return i;

      } 
      public static void quickSort(int arr[],int low,int high)
      {
             if(low<high)
             {
                     
                int pivot=partition(arr,low,high);
                quickSort(arr,low,pivot-1);
                quickSort(arr,pivot+1,high);
             }
      }
      public static void main(String[] args) {
        
        int arr[]={45,214,7,89,90,2,3};
        int n=arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
      } 
}

