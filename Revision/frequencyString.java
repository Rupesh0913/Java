import java.util.*;
class frequencyString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s= sc.nextLine();
        s=s.toLowerCase();

       for(char ch='a';ch<='z';ch++){
           int c=0;
           for(int i=0;i<s.length();i++){
               if(ch==s.charAt(i))
               c++;
           }
           if(c!=0)
           System.out.println(ch+""+c);
       }
       
    }
}