import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class factor 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,sum=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
              sum+=i;
            }
        }
        if(sum==num)
        {
            System.out.println("Perfect Number");
        }
        else if(sum<num)
        {
            System.out.println("Deficient Number");
        }
        else{
            System.out.println("Abundant Number");

        }
    }
}
