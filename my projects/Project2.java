//import java.lang.*;
import java.util.*;

class Project2 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int x,y;
       
        System.out.print("Enter the first number: ");
         x = obj.nextInt();
        System.out.print("Enter the second number: ");
         y = obj.nextInt();
         Project2 ob= new Project2();

        int n;
        System.out.println("Enter 1 to add \n Enter 2 to subtract \n Enter 3 to multiplply \n Enter 4 to Divide ");
        n= obj.nextInt();
        switch(n){
            case 1:
            ob.add(x,y);
            break;
            case 2:
            ob.sub(x,y);
            break;
            case 3:
            ob.multi(x,y);
            break;
            case 4:
            ob.div(x,y);
            break;
            default:
            System.out.println("Wrong Input");
        }    
    }
    void add(int x , int y)
    {
        int z;
        z=x+y;
        System.out.println("sum of two numbers are: "+z);
    }
    void sub(int x , int y)
    {
        int z;
        z=x-y;
        System.out.println("subtracted value of two numbers are: "+z);
    }
    void multi(int x , int y)
    {
        int z;
        z=x*y;
        System.out.println("Multiplied value of two numbers are: "+z);
    }
    void div(int x , int y)
    {
        int z;
        z=x/y;
        System.out.print("Divided of two numbers are: "+z);
    }
    
}
