import java.util.Scanner;

class largest_no {
    public static void main(String [] args)
    {
        Scanner obj= new Scanner(System.in);
        int first,second,third;
        System.out.println("Enter the First number: ");
        first=obj.nextInt();
        System.out.println("Enter the Second number: ");
        second=obj.nextInt();
        System.out.println("Enter the Third number: ");
        third=obj.nextInt();
        if(first>second  &&  first>third)
            System.out.println("The first number is Greatest");
        else if(second>third)
            System.out.println("The second number is Greatest");
        else
            System.out.println("The third number is Greatest");    
    }
    
}
