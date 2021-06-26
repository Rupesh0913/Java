import java.util.*;
class Constructor_overloading{
	Constructor_overloading(int x, int y){
		int floor_area = x*y;
		System.out.println("The floor area is : " +floor_area);
	}
	Constructor_overloading(int x,int y,int z){
		int room_vol = x*y*z;
		System.out.println("The vloume of the room is: "+room_vol);
	}
	public static void main(String[] args) {
		int x,y,z;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the first no: ");
		x = ob.nextInt();

        System.out.println("Enter the second no: ");
		y = ob.nextInt();
		System.out.println("Enter the third no: ");
		z = ob.nextInt();
		Constructor_overloading ob1 = new Constructor_overloading(x,y);
		Constructor_overloading ob2 = new Constructor_overloading(x,y,z);
		
	}
}