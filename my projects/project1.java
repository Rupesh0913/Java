//import java.lang.*;
import java.util.Scanner;

class project1{
    public static void main(String args[]){
   

    project1 ob=new project1();
    ob.add();
    ob.sub();
    }
    void add(){
        Scanner obj= new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter the number: ");
        x=obj.nextInt();
        System.out.print("Enter another number: ");
        y=obj.nextInt();
        z=x+y;
        System.out.println("Sum of the two numbers are: "+z);
    }
    void sub(){
        Scanner obj1= new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter the number: ");
        x=obj1.nextInt();
        System.out.print("Enter another number: ");
        y=obj1.nextInt();
        z=x-y;
        System.out.print("Sum of the two numbers are: "+z);

    }
}