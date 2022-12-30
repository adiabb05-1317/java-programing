import java.util.*;



public class lonngestpalindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int i,j;
       int k=0;
        String s=sc.next();
      
        StringBuilder sb1=new StringBuilder();
        ArrayList<String> arr=new ArrayList<>();
        for(i=0;i<s.length();i++)
        {

            for(j=i;j<s.length();j++)
            {
                String str=s.substring(i,j+1);
                StringBuilder sb=new StringBuilder();
              sb.append(str);
             
            
              if(sb.reverse().toString().equals(str))
              {
               arr.add(sb.toString());
              

              }
            }
        }
        int max=Integer.MIN_VALUE;
       
        int index=0;
       for(String res:arr)
       {  
             k++;
        if(res.length()>max)
        {   index=k;
            max=res.length();
        }
       }
       
        System.out.println(arr.get(index-1));
       
     
    }
}
private String bruteForce(String s){
    int n = s.length();
    int maxLen = Integer.MIN_VALUE;
    String result = "";
    // Check for Every Substring
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            String temp = s.substring(i,j+1);
            if(isPalindrome(temp)){
                if(maxLen < temp.length()){
                    maxLen = temp.length();
                    result = temp;
                }
            }
        }
    }
    return result;
}

private boolean isPalindrome(String s){
    int n = s.length();
    int i,j;
    i = 0;
    j = n-1;
    while(i<=j){
        if(s.charAt(i) != s.charAt(j))
            return false;
        i++;
        j--;
    }
    return true;
}
}
