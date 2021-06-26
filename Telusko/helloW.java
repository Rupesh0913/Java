import java.lang.*;
import java.util.*;

class firstHello{
  public String ReplaceChar(String str){
      String replaceString="";
      int i=0;
      while(i<str.length()){
          if(str.charAt(i)=='a'|str.charAt(i)=='e'|str.charAt(i)=='i'|str.charAt(i)=='o'|str.charAt(i)=='u')
            replaceString+='x';
          else
            replaceString+=str.charAt(i);
      }
      return replaceString;
  }
  public static void main(String args[]){
    String s="java is fun";
    String replaceString= new firstHello().ReplaceChar(s);
    System.out.println(replaceString);
  }
} 
