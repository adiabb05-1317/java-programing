 import java.util.Scanner;
 class Employee
{
    int id;
    int salary;
    String name;//attributes
    public void printDetails()//creating a  method
    {
        System.out.println("my id is :"+id);
        System.out.println("my name is :"+name);
       
        System.out.println("\n");
    }
    public int getSalary()
    {
            return salary;
    }

}
public class customclass 
{
    public static void main(String[] args)
    {
                  System.out.println("This is our custom class");
                  Employee adithya=new Employee();//intsantiating new class object where object is adithya and class is employee
                  //setting attributes or setting properties
                  //setting atributes for adithya
                  adithya.id=92;
                  adithya.salary=30000;
                  adithya.name="javaclass";
                //   System.out.println(adithya.name);
                //   System.out.println(adithya.id);
                    adithya.printDetails();//calling method in employee class using adithya as a object
                    Employee harry=new Employee();//creating another object harry of employee class
                    //setting attributes for harry
                    harry.id=87;
                    harry.salary=56000;
                    harry.name="code with harry";
                    harry.printDetails();
                    int sal=adithya.getSalary();
                    System.out.println(" adithya's salary is :"+sal);
                    
    }
}
