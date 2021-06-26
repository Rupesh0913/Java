import java.util.Scanner;

class bank 
{
    void display()
    {
        System.out.println("Account Balance:- 00.00");
    }
    void withdraw()
    {

    }
    void deposit()
    {

    }
    public static void main(String arg[]) 
    {  
        Scanner sc = new Scanner(System.in);
        String name;
        int id,amount;

        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println( "Enter id:" );
        id = sc.nextInt();
        System.out.println( "Enter Amount:" );
        amount = sc.nextInt();
    }
    
}
