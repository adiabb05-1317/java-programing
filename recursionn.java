import java.util.*;


public class recursionn 
{
    public  int fac(int num)
    {
    
    if(num==1)
    {
        return 1;
    }
    else
    {
        return num*fac(num-1);
    }
}
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        recursionn res=new recursionn();
       
        System.out.println(res.fac(num));//to access non static method we need a object of that class and 
        //for suppose if a class is static then we can acces it without creting object
        

    }
}
