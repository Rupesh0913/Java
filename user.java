import java.util.*;
class AreaOfRectangle {
   public static void main (String args[])
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   int len = scan.nextInt();
	   System.out.println("Enter the width of Rectangle:");
	   int wid = scan.nextInt();
	   double area = len*wid;
	   System.out.println("Area of Rectangle is:"+area);
   }
}