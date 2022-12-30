class A{
    int n;
    boolean b=false;
synchronized int get()
{
  
     try{
        wait();

     }
     catch(Exception e)
     {
        System.out.println(e);
     }
     System.out.println("got "+n);
     b=false;
     notify();
     return n;

}
synchronized void put(int n)
{
    this.n=n;
    try
 {
    wait();
 }
 catch(Exception e){
   System.out.println(e);
 }
 b=true;
 System.out.println("put "+n);
 notify();


}


}
class producer implements Runnable
{
   A a1;
   Thread t1;
   producer(A a1)
   {
       this.a1=a1; 
       t1=new Thread(this);
       t1.start();
   }


public void run() {
    // TODO Auto-generated method stub
    int i=0;
    for(i=1;i<=10;i++)
    {
        a1.put(i);
    }
    
}
}
class consumer implements Runnable
{
    A a1;
    Thread t1;
    consumer(A a1)
    {
        this.a1=a1;
        t1=new Thread(this);
        t1.start();
    }
    

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int j=1;j<=10;j++)
        {
           a1.get();
        }
        
    }
}

public class exceptionhandling 
{
    public static void main(String[] args) {
        
        A a1=new A();
        producer p=new producer(a1);
        consumer c=new consumer(a1);
    }


}
