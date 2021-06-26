import java.util.*;

class Airthmatic {
    void add(int x , int y)
    {
        int z;
        z=x+y;
        System.out.println("Sum of the two values are: "+z);
    }
}
public class Project3{
    public static void main(String args[])
    {
        int x,y;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        x= obj.nextInt();
        System.out.print("Enter secont Number: ");
        y= obj.nextInt();
        Airthmatic obj1 = new Airthmatic();
        obj1.add(x,y);
    }
}