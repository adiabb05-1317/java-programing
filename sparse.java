
import java.util.*;
public class sparse
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[][]{
            {0,0,3,0,4},{0,0,5,7,0},{0,0,0,0,0},{0,2,6,0,0}
        };
        int i,j;
        int row,col;
        int n=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]!=0)
                {
                   n++;
                  
                }
            }
        }
        int sMatrix[][]=new int[3][n];
        int k=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]!=0)
                {
                    sMatrix[0][k]=i;
                    sMatrix[1][k]=j;
                    sMatrix[2][k]=arr[i][j];
                 k++;

                 }
            }
        }
        System.out.println(Arrays.deepToString(sMatrix));
        for(i=0;i<3;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+sMatrix[i][j]);
            }
            System.out.println();
            
        }
    }
}

