import java.util.*;
public class stringcapital {
    
    static boolean  check(String str)
    {
         int i,j=0,sum=0;
         for(i=0;i<str.length();i++)
         {
            if(Character.isUpperCase(str.charAt(i)))
            {
                j++;
            }
            else if(j>=1 &&sum!=0 || j==0){
                
                sum++;
            }
         }
         if((sum==0 && j==1)||sum==str.length()||j==str.length())
         {
           return true;
         }
         return false;
     
    }
    
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          String str=sc.next();
          System.out.println(check(str));
    }
}
