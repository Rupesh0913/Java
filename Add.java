//import java.lang.*;
//lang=language package(default package)writing this package is optional
//*=import all the class of language package
import java.util.*;

class Airthmatic
{
	public static void main(String args[])
	{
	// int a=10;
	// int b=10;
	// int c,d,e,f;
	int n=10;
	 int [] array= new int[10];
	 System.out.println("Number:");
	 Scanner sc=new Scanner(System.in);
	/*  c=a+b;
	 d=a-b;
	 e=a*b;
	 f=a/b;
	 System.out.println("The sum is " +c); 
	 System.out.println("The sub is " +d); 
	 System.out.println("The sub is " +e); 
	 System.out.println("The sub is " +f);  */
	 for(int i=0;i<array.length;i++)
	 	array[i]=sc.nextInt();
	for(int i=0;i<array.length;i++)		 
	 System.out.println("The Array is "+array[i]);		 
	}
}