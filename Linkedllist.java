import java.util.*;
public class Linkedllist {

    public Node head;
    public Node tail;
    public int size;
    public Linkedllist()
    {

        this.size=0;
    }
    public  void insertFirst(int val)
    {
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
            
        }
        size+=1;
    }
    public void insertLast(int val)
    {
        Node node=new Node(val);
        if(tail==null||head==null)
        {
            head=node;
            tail=node;
            tail.next=null;
            
        }
        else
        {
           tail.next=node;
           tail=node;
           tail.next=null;
        }
        size++;
       

    }
    public void insertAtPosition(int val,int index)
    {
       Node temp=head;
       
       int i=0;
     while(i<index-2){
        temp=temp.next;
        i++;
     }
     Node node =new Node(val,temp.next);
     temp.next=node;


    }
    public void deleteFirst()
    {
        head=head.next;
        if(head==null)
      {
            tail=null;
      }
      size--;
    }
    public  void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
public   class Node{
    public int val;
    public Node next;
    public Node(int val)
    {
        this.val=val;
    }
    public  Node(int val,Node next)
    {
        this.val=val;
        this.next=next;
    }

   }
    



    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       
        Linkedllist  ll=new Linkedllist();
        int n;
        while(1>0)
        {
            n=sc.nextInt();
            switch(n)
            {
                case 1:ll.insertFirst(sc.nextInt());
                break;
                case 2:ll.insertLast(sc.nextInt());
                break;
                case 3:ll.insertAtPosition(sc.nextInt(),sc.nextInt());
                break;
                case 4:ll.deleteFirst();
                break;
                case 5:ll.display();
                break;
                
            }
        
        }

        
    }
}
