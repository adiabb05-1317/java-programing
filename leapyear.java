import java.util.Scanner;

public class leapyear 
{
  public static void main(String[] arg)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a year:");
    int year=sc.nextInt();
    boolean leap=false;
    if(year%4==0)
    {

      if(year%100==0)
      {
        if(year%400==0)
        leap=true;
        else
        leap=false;
      
     }
      
      else
      {
        leap=true;
      }
               
    
    }
    else{
        leap=false;
    }
         
  
  if(leap)
  {
    System.out.printf(" %d is a leap year",year);
  }
  else{
    System.out.printf("%d is a not a leap year",year);
  }
}
   
}
