import java.util.*;
public class bob 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int i;int sum=0;int j=0;
       int num=0;
       for(i=0;i<str.length();i++)
       {  char ch=str.charAt(i);
             if(Character.isDigit(ch))
             {   j=i;
                 
                while(Character.isDigit(str.charAt(j)))
                {  
                  num=num*10+str.charAt(j)-'0';
                  j++;
                  if(j>=str.length())
                  {break;}
                
                }
                
                sum+=num;
                num=0;
                i=j;
             }
       }
       System.out.println("sum of numbers in string is"+sum);
       
    }
}
