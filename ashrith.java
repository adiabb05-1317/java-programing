public class ashrith
 {

    public  int print(int n)
    {
        System.out.println("non static"+n);
        return n+1;
    }
    public static void main(String[] args)
    {
             ashrith obj=new ashrith();
           obj.print(18);
    }
}
