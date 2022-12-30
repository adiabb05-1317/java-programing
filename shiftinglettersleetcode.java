class Solution {
    
    public String shiftingLetters(String s, int[] shifts) 
    {
        StringBuilder sb=new StringBuilder(s);
         String str="abcdefghijklmnopqrstuvwxyz";
         int  i,j,k;
         
         for(i=0;i<shifts.length;i++)
         {
             for(j=0;j<i+1;j++)
             {
                 int len=shifts[i]+str.indexOf(sb.charAt(j));
                
                 if(len>=26)
                 {
                     len=len%26;
                 }
                 
                 char c=sb.charAt(j)-'a';
                 sb.setCharAt(j,c);
             }
         }
         System.out.println(sb.toString());
         return sb.toString();
    }
}
public String shiftingLetters(String S, int[] shifts) {        
    char[] arr = S.toCharArray();
    int prev = 0;
    int temp;
    for(int i=shifts.length-1; i >= 0; i--){
        temp = (shifts[i] + prev) % 26;
        arr[i] = (char)((((arr[i] + temp)  % 97) % 26 ) + 97);
        prev = temp;
    }     
    return  String.valueOf(arr);
}