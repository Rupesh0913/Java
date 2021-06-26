import java.util.*;

class constructer {
    double radius;
    constructer()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius of the ciecle: ");
        radius=obj.nextDouble();

    }
    void area(){
        double area=2*Math.PI * radius;
        System.out.println("The value is: "+area);
    }
}
class Main{
    public static void main(String [] args) {
        constructer c1= new constructer();
        c1.area();
    }    
}