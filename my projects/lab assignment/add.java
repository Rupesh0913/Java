 import java.util.Scanner;
class Dual_class{
	void add(int x,int y){
		int z=x+y;
		System.out.println("The sum is =" +z);
	}
}
class Second_class{
	

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the first no: ");
		int x= obj.nextInt();
		System.out.println("Enter the second no: ");
		int y= obj.nextInt();
		Dual_class obj1=new Dual_class();
		obj1.add(x,y);
	}
}