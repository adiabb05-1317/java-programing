import java.util.*';
class Solution {
    public boolean isPalindrome(String s) {toLowerCase(s);
        // String arr[] = new String[s.length()];
        // for(int i=s.length(),int j=0;i>0,j<s.length();i--,j++)
        // {
        //   arr[j]=s.charAt(i);
        // }
        Stack<String> main = new Stack<String>();
        Stack<String> rev = new Stack<String>();
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='a'||s.charAt(i)=='b'||s.charAt(i)=='c'||s.charAt(i)=='d'||s.charAt(i)=='e'||s.charAt(i)=='f'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i'||s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l'||s.charAt(i)=='m'||s.charAt(i)=='n'||s.charAt(i)=='o'||s.charAt(i)=='p'||s.charAt(i)=='q'||s.charAt(i)=='r'||s.charAt(i)=='s'||s.charAt(i)=='t'||s.charAt(i)=='u'||s.charAt(i)=='v'||s.charAt(i)=='w'||s.charAt(i)=='x'||s.charAt(i)=='y'||s.charAt(i)=='z')
          {
            main.push(s.charAt(i));
           }
        }
        for(int i=s.length();i>0;i--)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='b'||s.charAt(i)=='c'||s.charAt(i)=='d'||s.charAt(i)=='e'||s.charAt(i)=='f'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i'||s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l'||s.charAt(i)=='m'||s.charAt(i)=='n'||s.charAt(i)=='o'||s.charAt(i)=='p'||s.charAt(i)=='q'||s.charAt(i)=='r'||s.charAt(i)=='s'||s.charAt(i)=='t'||s.charAt(i)=='u'||s.charAt(i)=='v'||s.charAt(i)=='w'||s.charAt(i)=='x'||s.charAt(i)=='y'||s.charAt(i)=='z')
            {
            rev.push(s.charAt(i));
            }
        }
            boolean flag = true;
        while (main.empty() == false)
    {
        // If the top elements of both stacks
        // are same
        if (main.peek() == rev.peek())
        {
            main.pop();
            rev.pop();
        }
        else
        {
            flag = false;
            break;
        }
    }
 if(flag==true)
 {
     System.out.println("true");
 }
else if(falg==false)
{
    System.out.println("false");
}
   

    }
}

