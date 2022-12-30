
class Student
{
    private int id;
     private String name;

    public Student(String str,int rollno)//constructor
    {
               id=rollno;
               name=str;
    }
    public int adithya()
    {
        return id;
    }

    // public void setId(int n)
    // {
    //     this.id=n;
    // }
    // public int getId()
    // {
    //       return id;
    //     }
    // // public void setName(String str)
    // // {
    // //     this.name=str;
    // // }
    // public String getName()
    // {
    //     return name;
    // }


}
public class constructors 
{
    public static void main(String[] args)
    {
                Student supriya= new Student("adithya",92);
                // supriya.setName("suppu");
                // supriya.setId(25);
                    //    System.out.println(supriya.getName());
                    //    System.out.println(supriya.getId());
                    System.out.println(":"+supriya.adithya());

    }
}
