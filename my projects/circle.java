import java.util.Scanner;

class circle {
    public static void main(String [] args)
    {
        float area,perimeter,radius;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius of the ciecle: ");
        radius=obj.nextFloat();
        if(radius>0)
        {
            area=2*(float)Math.PI * radius;
            perimeter=(float)Math.PI*radius*radius;
            System.out.println("The area of the Circle is: "+area);
            System.out.println("The Permeter of the Circle is: "+perimeter); 
        }
        else
        System.out.println("Wrong input");
    }
    
}
