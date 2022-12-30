import java.util.*;
public class insertionsort
 {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int arr[]={5,4,10,1,6,2};
            int n=5;
            int i,j,key,temp;
            for(i=1;i<6;i++)
            {
                temp=arr[i];
                 j=i-1;
                while(j>=0 && arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;

            }
            for(int k:arr)
            {
                System.out.println(k);
            }
        }
    }
}
