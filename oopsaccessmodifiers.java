class Student
{
    private int id;
    private String name;

    public void setId(int n)
    {
            this.id=n;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String str)
    {
        this.name=str;
    }
    public String getName()
    {
        return name;
    }


}
public class oopsaccessmodifiers 
{
    public static void main(String[] args)
    {
                //here we cannot acess or insert data through object in id,and name in student class
                //so we use getters and setter method to set values for private avess modifiers
                //adithya.id>>>> throws an error bcz of private
                Student adithya=new Student();
                adithya.setId(92);
                adithya.setName("adi");
                System.out.println("my id is:"+adithya.getId());
                System.out.println("my name is` :"+adithya.getName());

    }
}
