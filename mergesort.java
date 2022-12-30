import java.util.*;
public class mergesort 
{
    public static void mergeSort(int arr[],int first,int last)
    {
            if(first<last)
            {
                int mid=(first+last)/2;
                mergeSort(arr,first,mid);
                mergeSort(arr,mid+1,last);
                merge(arr,first,mid,last);
            }

    }
    public static void merge(int arr[],int first,int mid,int last)
    {
             int s[]=new int[100]; int i=first,j=mid+1,k=first;
             while(i<=first &&j<=last)
             {
                if(arr[i]<arr[j])
                {

                    s[k]=arr[i];
                    k++;
                    i++;
                }
                else if(arr[j]<arr[i]){

                    s[k]=arr[j];
                    j++;
                    k++;

                }
             }
             while(i<=mid){
                s[k]=arr[i];
                k++;
                i++;
             }
             while(j<=last)
             {
                s[k]=arr[j];
                k++;
                j++;
             }
             for(i=0;i<k;i++)
             {
                arr[i]=s[i];
             }


    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i: arr)
        {
            System.out.println(i);
        }

    }

}
