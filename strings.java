
import java.util.Scanner;
public class strings
 {
    public static void main(String[]  args)
    {

        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the string in upper case");
        // String st=sc.next();
        // int a=st.length();

        // String n_st=st.toLowerCase();
        // System.out.println("the lenth of the string is:");
        // System.out.println(a);
        // System.out.println("the lower letters string is:");
        // System.out.println(n_st);
        // String u_st=st.toUpperCase();
        // System.out.println("upper case string is:");
        // System.out.println(u_st);
        //for using trim to ramove spaces
       String b_trim="      adithya  is good";
       String a_trim=b_trim.trim();//removes spaces after or before string
       System.out.println(a_trim);
       String sub=sc.next();
       System.out.println(sub.substring(2,4));//for getting sub string
       System.out.println(sub.substring(1));
       System.out.println(sub.replace('s','j'));
       System.out.println(sub.replace("ss","j"));
       System.out.println(sub.startsWith("vi"));//return true or false
       System.out.println(sub.endsWith("sa"));
       System.out.println(sub.charAt(2));//return char at index
       System.out.println(sub.indexOf('s'));
       char a='c';
       System.out.println(a-'0');
       

  

    }
}
